/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi.prueba_flex;

import arbol.AST;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.LinkedList;

/**
 *
 * @author di3go
 */
public class COMPIPrueba_Flex {

    public static LinkedList<CError> lista_errores;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lista_errores = new LinkedList<>();
        interpretar("C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[COMPI1]Proyecto_Vacas\\src\\Entradas\\entrada1.txt");
        
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
    
}
