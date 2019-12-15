package GUI;

import arbol.nodo;
import GUI.Tabs.CTab;
import arbol.AST;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EditorController {

    

    
    public static List<Text> lista_consola = new ArrayList<Text>();
    @FXML
    public TextFlow consoleText;

    @FXML
    public MenuItem openBtn;

    @FXML
    public TextFlow executorMessages;

    @FXML
    public TabPane tabEditorContainer;

    @FXML
    public void openBtnHandler(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Abrir archivo a ejecutar");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("NM Script", "*.NM"));
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {

            StringBuilder str = new StringBuilder();
            try (BufferedReader r = new BufferedReader(new FileReader(selectedFile))) {
                r.lines().forEach(item->str.append(item).append("\n"));
            } catch (Exception e) {
                e.printStackTrace();
            }

            CTab ctab = new CTab(selectedFile.getName(),EditorUI.tabID, selectedFile.getName().contains(".gxml"));
            ctab.reference_path = selectedFile.getParentFile().toString();
            ctab.fromFile = true;
            ctab.full_path = selectedFile.getAbsolutePath();
            EditorUI.tabID++;
            tabEditorContainer.getTabs().add(ctab);
            ctab.setEditorContent(str.toString());
        }
    }

    public void executeHandler(ActionEvent actionEvent) {

        if (tabEditorContainer.getTabs().size() == 0) return;
        
        consoleText.getChildren().clear();
        CTab cTab = (CTab) tabEditorContainer.getSelectionModel().getSelectedItem();
        guardarContenido();
        interpretar(cTab.full_path);
        
        if(!lista_consola.isEmpty()){
            lista_consola.forEach((n)->consoleText.getChildren().add(n));
            lista_consola.clear();
        }
        if (!cTab.isGXML) {
            try {
                /*TreeNode root = FSParserFactory.createParser(str, true);
                Backend backend = BackendFactory.createBackend("execute");
                backend.setConsoles(consoleText, executorMessages);
                SymTabStack symTabStack = new SymTabStack();
                symTabStack.run();
                backend.setReferencePath(cTab.getReferencePath());
                backend.process(root, symTabStack, null, consoleText);*/
            }catch (Exception e) {
                /*executorMessages.getChildren().add(
                        ErrorsFactory.createError("SINTACTICO",
                                e.toString(),
                                null)
                );*/
                e.printStackTrace();
                        }
        } else {
            try {
               /* GXMLTreeNode parserRoot = GXMLParserFactory.parseGXMLProgram(str, true);
                GXMLProgram program = GXMLParserFactory.createBackend(null, true);
                program.setReferencePath(cTab.reference_path);
                program.setConsoles(consoleText, executorMessages);
                String[] fullString = (String[]) program.execute(parserRoot);
                CTab newCTab = new CTab("translated.fs", EditorUI.tabID++);
                tabEditorContainer.getTabs().add(newCTab);
                newCTab.setEditorContent(fullString[0] + fullString[1]);
                newCTab.reference_path = cTab.reference_path;
                System.out.println(fullString[0] + fullString[1]);
                tabEditorContainer.getSelectionModel().select(newCTab);
                executorMessages.getChildren().add(new Text("SE ACABO EL ANALISIS..."));*/
            } catch (Exception e) {
                /*executorMessages.getChildren().add(
                        ErrorsFactory.createError("SINTACTICO",
                                e.toString(),
                                null)
                );*/
                e.printStackTrace();
            }
        }
    }

    public void guardarContenido(){
        CTab tab = (CTab)tabEditorContainer.getSelectionModel().getSelectedItem();
        String body = tab.getEditorContent();
        String ruta = ((CTab)tabEditorContainer.getSelectionModel().getSelectedItem()).full_path;
        File archivo = new File(ruta);
        try {
            executorMessages.getChildren().add(new Text("Guardando el archivo...\n"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivo));
            writer.write(body);
            writer.flush();
            writer.close();
            executorMessages.getChildren().add(new Text("El archivo ha sido guardado\n"));
        }catch (Exception e){
            executorMessages.getChildren().add(new Text("No se guardaron los cambios en el archivo...\n"));
        }
    }
    @FXML public void saveFileTab(ActionEvent event){

        guardarContenido();
    }


    @FXML public void guardarComoTab(ActionEvent event){
        String body = tabEditorContainer.getSelectionModel().getSelectedItem().getText();
        String ruta = "";
        String nombre = "";
        CTab current = ((CTab)tabEditorContainer.getSelectionModel().getSelectedItem());

        try{
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Elegir ruta");
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("NM Script (.NM)", ".NM");
            
                chooser.getExtensionFilters().add(extFilter);


            File file = chooser.showSaveDialog(null);
            if(file == null)
                return;
            ruta= file.getPath();
            nombre = file.getName();


            current.setTitle(nombre);
            current.setFullPath(ruta);
            current.reference_path = file.getParentFile().toString();

            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, false));
            writer.write(body);
            writer.flush();
            writer.close();
            executorMessages.getChildren().add(new Text("Archivo fue guardado exitosamente"));
        }catch (Exception e){
            executorMessages.getChildren().add(new Text("No se guardaron cambios en archivo, no fue encontrado."));
        }
    }
    
        @FXML public void crearNuevo(ActionEvent event){
        String body = tabEditorContainer.getSelectionModel().getSelectedItem().getText();
        String ruta = "";
        String nombre = "";
        CTab current = ((CTab)tabEditorContainer.getSelectionModel().getSelectedItem());
        File file = null;
        try{
            FileChooser chooser = new FileChooser();
            chooser.setTitle("Elegir ruta");
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("NM Script (.NM)", ".NM");
            
                chooser.getExtensionFilters().add(extFilter);


            file = chooser.showSaveDialog(null);
            if(file == null)
                return;
            ruta= file.getPath();
            nombre = file.getName();


            current.setTitle(nombre);
            current.setFullPath(ruta);
            current.reference_path = file.getParentFile().toString();

            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, false));
            writer.append(body);
            writer.close();
            executorMessages.getChildren().add(new Text("Archivo fue guardado exitosamente"));
        }catch (Exception e){
            executorMessages.getChildren().add(new Text("No se guardaron cambios en archivo, no fue encontrado."));
        }
        

            

            try{
                
            
            
            CTab ctab = new CTab(file.getName(),EditorUI.tabID, file.getName().contains(".NM"));
            ctab.reference_path = file.getParentFile().toString();
            ctab.fromFile = true;
            ctab.full_path = file.getAbsolutePath();
            EditorUI.tabID++;
            tabEditorContainer.getTabs().add(ctab);
            ctab.setEditorContent("");
            }
            catch(Exception e){}
    }

    @FXML public void resetAll(ActionEvent event){

    }

    

    
    private void interpretar(String path) {
        analizadores.Sintactico pars;
//        Instruccion bloque;
        AST arbol = null;
        try {
            Reader targetReader = new StringReader(new String(Files.readAllBytes(Paths.get(path)), "UTF-8"));
            analizadores.Lexico scan = new analizadores.Lexico(targetReader);
            pars = new analizadores.Sintactico(scan);
            pars.parse();
            arbol = pars.AST;



        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error fatal en compilación de entrada.");
        }
        if (arbol != null) { //Si no existió un error en el análisis
                arbol.Ejecutar();
            } else {
                System.out.println("<----------> Existió un error en el análisis, no se pudo construir el árbol <---------->");
            }
    }
    public static void imprimir(Text texto){
        lista_consola.add(texto);
    }
}

