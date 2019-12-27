/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.aritmetica;

import arbol.Expresion;
import arbol.entorno.Entorno;
import arbol.entorno.Simbolo;
import arbol.entorno.Tipo;
import arbol.expresiones.Literal;

/**
 *
 * @author di3go
 */
public class incremento extends Expresion {
    String operacion;
    String id;
    
    public incremento(int linea, int columna, String id){
        this.operacion = "++";
        this.linea = linea;
        this.columna = columna;
        this.id = id;
        
    }
    
    
    @Override
    public Expresion getValor(Entorno ent){
        
        Simbolo sim=ent.buscar(id, linea, columna, "la variable");
        if (sim != null) { //Si la variable existe
            Object temporal = null;
            Expresion regresar = null;
            switch(sim.tipo.tipo){
                case entero:
                    temporal =  (int) sim.valor;
                    sim.valor = (int) temporal + 1;
                    sim.tipo.tipo = Tipo.EnumTipo.entero;
                    regresar.valor = temporal;
                    regresar.tipo.tipo = Tipo.EnumTipo.entero;
                    //return new Literal(new Tipo(Tipo.EnumTipo.entero),(double) (int) temporal);
                    return regresar;
                   
                case doble:
                    temporal = (double) sim.valor;
                    regresar.valor = temporal;
                    regresar.tipo.tipo = Tipo.EnumTipo.doble;
                    sim.valor = (double) sim.valor + 1;
                    sim.tipo.tipo = Tipo.EnumTipo.doble;
                    //return new Literal(new Tipo(Tipo.EnumTipo.doble),(double) temporal);
                    return regresar;
            }
            
        }
        
            System.out.println("La variable '" + id + "' no existe. Línea: " + linea + " Columna: " + columna);    
        return null;
    }
}
