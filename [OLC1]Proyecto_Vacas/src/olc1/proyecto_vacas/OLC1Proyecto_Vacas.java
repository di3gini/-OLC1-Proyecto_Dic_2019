/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1.proyecto_vacas;

import arbol.AST;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import GUI.*;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.StageStyle;

/**
 *
 * @author di3go
 */
public class OLC1Proyecto_Vacas extends Application {
    
    public static FXMLLoader fxmlLoader;
    public static Stage stage;
     public static LinkedList<CError> lista_errores;
    @Override
    public void start(Stage primaryStage) {
                        try {
                    fxmlLoader = new FXMLLoader(getClass().getResource("/GUI/Editor.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    stage = new Stage();
                    stage.setScene(new Scene(root1));  
                    stage.show();
                }
                catch(Exception e){
                    
                }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        lista_errores = new LinkedList<>();
        //interpretar("C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[COMPI1]Proyecto_Vacas\\src\\Entradas\\entrada1.txt");
        
        launch(args);
        
    }
    
    
        
        private static void interpretar(String path) {
        analizadores.Sintactico pars;
//        Instruccion bloque;
        AST arbol;
        try {
            Reader targetReader = new StringReader(new String(Files.readAllBytes(Paths.get(path)), "UTF-8"));
            analizadores.Lexico scan = new analizadores.Lexico(targetReader);
            pars = new analizadores.Sintactico(scan);
            pars.parse();
            arbol = pars.AST;

            if (arbol != null) { //Si no existió un error en el análisis
                arbol.Ejecutar();
            } else {
                System.out.println("<----------> Existió un error en el análisis, no se pudo construir el árbol <---------->");
            }

        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error fatal en compilación de entrada.");
        }
        
        
    }
        private void ejecutar(){

        }
}
