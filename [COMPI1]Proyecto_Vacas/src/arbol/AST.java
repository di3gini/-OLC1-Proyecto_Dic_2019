/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.LinkedList;
import arbol.entorno.*;

/**
 *
 * @author di3go
 */
public class AST {
    LinkedList<Instruccion> lista_instrucciones; // Lista de instrucciones
    Entorno tablaGlobal; //Tabla de simbolos global del archivo;
    
    public AST(LinkedList<Instruccion> lista_instrucciones){
        this.lista_instrucciones = lista_instrucciones;
        tablaGlobal = new Entorno(null);
    }
    
    public void Ejecutar(){
        for (Instruccion ins : lista_instrucciones){
            ins.ejecutar(tablaGlobal);
        }
    }
}
