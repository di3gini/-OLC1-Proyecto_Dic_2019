package GUI;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class EditorUI extends Application {


    public static void Main(String[] args) {
        launch(args);
    }


    private TabPane tpane;
    public static int tabID = 0;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("NM Script (FS)");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(EditorUI.class.getResource("Editor.fxml"));
        try {
            final VBox root = fxmlLoader.load();
            tpane = (TabPane)root.lookup("#tabEditorContainer");
            primaryStage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {

        for (Tab ctab: tpane.getTabs()) {
            EventHandler<Event> handler = ctab.getOnClosed();
            if (null != handler) {
                handler.handle(null);
            } else {
                ctab.getTabPane().getTabs().remove(ctab);
            }
        }
        super.stop();
    }
}