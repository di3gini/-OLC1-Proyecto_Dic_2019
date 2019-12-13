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
            Object temporal;

            switch(sim.tipo.tipo){
                case entero:
                    temporal = sim.valor;
                    sim.valor = (Integer) (Integer.parseInt(sim.valor.toString()) + 1);
                    return new Literal(new Tipo(Tipo.EnumTipo.entero),Integer.parseInt(temporal.toString()));
                case doble:
                    temporal = sim.valor;
                    sim.valor = Double.parseDouble(sim.valor.toString())+ 1;
                    return new Literal(new Tipo(Tipo.EnumTipo.doble),Integer.parseInt(temporal.toString()));
            }
            System.out.println("La variable '" + id + "' no existe. Línea: " + linea + " Columna: " + columna);
        }
        
                
        return null;
    }
}
