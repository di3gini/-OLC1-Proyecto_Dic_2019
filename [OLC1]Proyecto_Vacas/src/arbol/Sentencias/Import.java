/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.*;
import arbol.AST;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import GUI.EditorController;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Text;


/**
 *
 * @author di3go
 */
public class Import extends Instruccion{
    Entorno entorno;
    Expresion ruta;
    
    public Import(int linea, Expresion ruta){
        this.ruta = ruta;
        this.linea = linea;
    }
    
    @Override
    public Instruccion ejecutar(Entorno ent){
        System.out.print("porque putas!");
        if(ruta.tipo.tipo == Tipo.EnumTipo.cadena){
            try{
                analizadores.Sintactico pars;
                entorno = new Entorno(ent, "import");
                AST nuevo = null;
                
                AST.lista_entornos.add(entorno);
                String ubicacion = ruta.valor.toString();
  
            
                
                Reader targetReader = new StringReader(new String(Files.readAllBytes(Paths.get(ubicacion)), "UTF-8"));
                analizadores.Lexico scan = new analizadores.Lexico(targetReader);
                pars = new analizadores.Sintactico(scan);
                pars.parse();
                nuevo = pars.AST;
                
                nuevo.Ejecutar(entorno);
                
                AST.tablaGlobal.tabla.putAll(entorno.tabla);
                


                
            }
                            
            catch(Exception e){
                Text texto = new Text("No se puede importar el archivo: " + ruta.valor.toString() + ". Error en fila: "+ linea);
                EditorController.imprimir(texto);
                System.out.println(e.toString());
            }
        }
        
        return null;
    }
    

}
