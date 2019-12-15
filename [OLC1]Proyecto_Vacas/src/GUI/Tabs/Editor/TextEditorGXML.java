package GUI.Tabs.Editor;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.concurrent.Task;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.reactfx.Subscription;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextEditorGXML extends AnchorPane {

    List<Integer> checkPoints = new ArrayList<>();
    Property<Integer> currentStep;
    public ExecutorService executor;
    CodeArea codeArea;
    public Subscription cleanUpWhenDone;

    private String[] KEYWORDS = new String[] {
            "int", "double", "char", "boolean", "String",
            "class", "extends", "void","println","print","printtabla",
            "if", "else", "while","break","continue","for","do","switch",
            "case","default","void","return","new","public","protected",
            "private","abstract","static","final","str","toDouble","toInt",
            "this","null","import","Graficar_dot","Graficar_entornos"
    };

    private String KEYWORD_PATTERN = "\\b(" + String.join("|", KEYWORDS) + ")\\b";
    private String BRACE_PATTERN = "\\<|\\>";
    private String BRACKET_PATTERN = "\\[|\\]";
    private String IDENTIFIER_PATTERN = "[A-Za-z_][A-Za-z0-9_]*";
    private String STRING_PATTERN = "\"([^\"\\\\]|\\\\.)*\"|\'([^\'\\\\]|\\\\.)*\'";
    private String NUMBER_PATTERN = "[0-9]+(.[0-9]+)?";
    private String COMMENT_PATTERN = "##[^\n]*" + "|" + "#$(.|\\R)*?$#";

    private Pattern PATTERN = Pattern.compile(
            "(?<KEYWORD>" + KEYWORD_PATTERN + ")"
                    + "|(?<BRACE>" + BRACE_PATTERN + ")"
                    + "|(?<NUMBER>" + NUMBER_PATTERN + ")"
                    + "|(?<BRACKET>" + BRACKET_PATTERN + ")"
                    + "|(?<STRING>" + STRING_PATTERN + ")"
                    + "|(?<COMMENT>" + COMMENT_PATTERN + ")"
                    + "|(?<IDENTIFIER>"+ IDENTIFIER_PATTERN+")"
    );



    public TextEditorGXML()
    {
        //richTextFx
        codeArea = new CodeArea();
        executor = Executors.newSingleThreadExecutor();
        //Para hacer el highlight
        cleanUpWhenDone = codeArea.multiPlainChanges()
                .successionEnds(Duration.ofMillis(500))
                .supplyTask(this::computeHighlightingAsync)
                .awaitLatest(codeArea.multiPlainChanges())
                .filterMap(t -> {
                    if(t.isSuccess()) {
                        return Optional.of(t.get());
                    } else {
                        t.getFailure().printStackTrace();
                        return Optional.empty();
                    }
                })
                .subscribe(this::applyHighlighting);


        //Property current (para ir modificando la línea actual
        currentStep = new SimpleObjectProperty<>(-1);


        IntFunction<Node> numberFactory = LineNumberFactory.get(codeArea);
        IntFunction<Node> arrowFactory = new ArrowFactory(currentStep);

        IntFunction<Node> graphicFactory = line -> {

            Circle circle = new Circle(5);
            circle.setFill(Color.RED);
            circle.setCenterX(2.5);
            circle.setVisible(false);

            HBox hbox = new HBox(
                    numberFactory.apply(line),
                    circle,
                    arrowFactory.apply(line)
            );

            hbox.addEventHandler(MouseEvent.MOUSE_PRESSED, (event)->{

                if(checkPoints.contains(line)){
                    hbox.getChildren().get(1).setVisible(false);
                    checkPoints.remove(Integer.valueOf(line));
                    checkPoints.sort(Comparator.naturalOrder());
                }else{
                    hbox.getChildren().get(1).setVisible(true);
                    checkPoints.add(line);
                    checkPoints.sort(Comparator.naturalOrder());
                }
            });

            hbox.setAlignment(Pos.CENTER_LEFT);
            return hbox;
        };
        StackPane stackPane = new StackPane(new VirtualizedScrollPane<>(codeArea));
        AnchorPane.setRightAnchor(stackPane,0.0);
        AnchorPane.setLeftAnchor(stackPane,0.0);
        AnchorPane.setTopAnchor(stackPane,0.0);
        AnchorPane.setBottomAnchor(stackPane,0.0);
        codeArea.setParagraphGraphicFactory(graphicFactory);
        codeArea.moveTo(0, 0);
        this.getStylesheets().add(TextEditorGXML.class.getResource("java-keywords.css").toExternalForm());
        this.getChildren().add(stackPane);
    }

    public void resetExecution(String text){
        checkPoints.clear();
        currentStep.setValue(-1);
        codeArea.replaceText(0, 0, text);
    }

    private Task<StyleSpans<Collection<String>>> computeHighlightingAsync() {
        String text = codeArea.getText();
        Task<StyleSpans<Collection<String>>> task = new Task<StyleSpans<Collection<String>>>() {
            @Override
            protected StyleSpans<Collection<String>> call() throws Exception {
                return computeHighlighting(text);
            }
        };
        executor.execute(task);
        return task;
    }

    private void applyHighlighting(StyleSpans<Collection<String>> highlighting) {
        codeArea.setStyleSpans(0, highlighting);
    }

    private StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = PATTERN.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder
                = new StyleSpansBuilder<>();
        while(matcher.find()) {
            String styleClass =
                    matcher.group("KEYWORD") != null ? "keyword" :
                        matcher.group("NUMBER") != null ? "number" :
                                    matcher.group("BRACE") != null ? "brace" :
                                            matcher.group("BRACKET") != null ? "bracket" :
                                                            matcher.group("IDENTIFIER") != null ? "identifier" :
                                                                    matcher.group("STRING") != null ? "string" :
                                                                            matcher.group("COMMENT") != null ? "comment" :
                                                                                    null; /* never happens */ assert styleClass != null;
            spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
            spansBuilder.add(Collections.singleton(styleClass), matcher.end() - matcher.start());
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    public String getInformation(){
        return codeArea.getText();
    }
}
