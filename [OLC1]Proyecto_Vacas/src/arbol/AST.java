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
    public static LinkedList<Instruccion> lista_instrucciones; // Lista de instrucciones
    public static Entorno tablaGlobal; //Tabla de simbolos global del archivo;
    public static LinkedList<Entorno> lista_entornos;
    
    public AST(LinkedList<Instruccion> lista_instrucciones){
        this.lista_instrucciones = lista_instrucciones;
        tablaGlobal = new Entorno(null,"Global");
        lista_entornos = new LinkedList<>();
        lista_entornos.add(tablaGlobal);
    }
    
    public void Ejecutar(){
        
        for (Instruccion ins : lista_instrucciones){
            ins.ejecutar(tablaGlobal);
        }
    }
    
    public void Ejecutar(Entorno ent){
        
        for (Instruccion ins : lista_instrucciones){
            ins.ejecutar(ent);
        }
    }
    
    public void agregarIns(Instruccion ins){
        lista_instrucciones.add(ins);
    }
    
    public LinkedList<Instruccion> getIns(){
        return lista_instrucciones;
    }
}
