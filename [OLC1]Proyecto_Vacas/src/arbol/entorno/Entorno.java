/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.entorno;


import java.util.*;
import javafx.scene.text.Text;
import olc1.proyecto_vacas.*;
import GUI.EditorController;

/**
 *
 * @author di3go
 */
public class Entorno {
    public Entorno anterior;
    public HashMap<String, Simbolo> tabla;
    public String nombre;
    
    public Entorno(Entorno anterior, String nombre){
        this.anterior = anterior;
        this.tabla = new HashMap<>();
        this.nombre = nombre;
    }
    
    public void insertar(String nombre, Simbolo sim, int linea, int columna, String cadenaerror){
        if (tabla.containsKey(nombre)){
            EditorController.lista_errores.add(new CError("Semantico", cadenaerror,linea,columna));
            
            Text texto = new Text("Error Semántico: " + cadenaerror + " '" + nombre +"' ya existe. Línea: " + linea + ", Columna: " + columna);
            EditorController.imprimir(texto);
            
            System.out.println("Error Semántico: " + cadenaerror + " '" + nombre +"' ya existe. Línea: " + linea + ", Columna: " + columna);
            return;
        }
        tabla.put(nombre, sim);
    }
    
    public Simbolo buscar(String nombre, int linea, int columna, String cadena){
        for (Entorno e = this; e != null; e = e.anterior){
            if(e.tabla.containsKey(nombre)){
                Simbolo sim = e.tabla.get(nombre);
                return sim;
            }
        }
        EditorController.lista_errores.add(new CError("Semantico", "saber",linea,columna));
        Text texto = new Text("Error Semántico: " + cadena + " '" + nombre + "' Linea: " + linea + " Columna: " + columna);
        EditorController.imprimir(texto);
        System.out.println("Error Semántico: " + cadena + " '" + nombre + "' Linea: " + linea + " Columna: " + columna);
        return null;
    }
    
}
