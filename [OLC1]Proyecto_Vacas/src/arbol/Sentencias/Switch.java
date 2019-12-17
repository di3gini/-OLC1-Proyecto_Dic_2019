/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author di3go
 */
public class Switch extends Instruccion{
    Expresion comparar;
    LinkedList<Caso> lstCasos;
    
    public Switch(Expresion comparar, LinkedList<Caso> lstCasos, int linea, int columna){
        this.linea = linea;
        this.columna = columna;
        this.comparar = comparar;
        this.lstCasos = lstCasos;
    }
    
    
    
    @Override
    public Instruccion ejecutar(Entorno ent){
        
        Caso caso_default = null;
        
        for (Caso item : this.lstCasos) {
            if (item.Default) {
                caso_default = item;
            }
        }
        
        Entorno local = new Entorno(ent);
        Object val_comparar = this.comparar.getValor(local).valor.toString();
        
        boolean tiene_break = true;
        
        for(Caso caso : lstCasos){
            if(!caso.Default){
                Object comparar2 = caso.comparar.getValor(local).valor.toString();
                System.out.println(val_comparar.toString());
                System.out.println(comparar2.toString());
                if(comparar.tipo.tipo.equals(caso.comparar.tipo.tipo)){
                    if(val_comparar.toString().equals(comparar2.toString())){
                        caso.bloque.ejecutar(local);
                        return null;
                    }
                }
                
            }
        }
        
        if(caso_default != null){
            caso_default.bloque.ejecutar(local);
        }
        
        return null;
    }
}
