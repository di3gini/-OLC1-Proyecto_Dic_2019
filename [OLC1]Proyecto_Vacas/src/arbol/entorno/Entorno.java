/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.entorno;


import java.util.*;
import olc1.proyecto_vacas.*;

/**
 *
 * @author di3go
 */
public class Entorno {
    public Entorno anterior;
    public HashMap<String, Simbolo> tabla;
    
    public Entorno(Entorno anterior){
        this.anterior = anterior;
        this.tabla = new HashMap<>();
    }
    
    public void insertar(String nombre, Simbolo sim, int linea, int columna, String cadenaerror){
        if (tabla.containsKey(nombre)){
            olc1.proyecto_vacas.OLC1Proyecto_Vacas.lista_errores.add(new CError("Semantico", cadenaerror,linea,columna));
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
        System.out.println("Error Semántico: " + cadena + " '" + nombre + "' Linea: " + linea + " Columna: " + columna);
        return null;
    }
    
}
