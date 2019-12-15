/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.entorno.Simbolo;
import arbol.entorno.Tipo;
import arbol.expresiones.Literal;

/**
 *
 * @author di3go
 */
public class Incre extends Instruccion {
    String id;
    Expresion valor;

    public Incre(String id, int columna, int linea) {
        this.id = id;
        this.columna=columna;
        this.linea=linea;
    }

    
    
    @Override
    public Object ejecutar(Entorno ent) {
        
        Simbolo sim=ent.buscar(id, linea, columna, "la variable");
        if (sim != null) { //Si la variable existe


            switch(sim.tipo.tipo){
                case entero:
                    sim.valor = (Integer) (Integer.parseInt(sim.valor.toString()) + 1);
                    return null;
                case doble:
                    sim.valor = Double.parseDouble(sim.valor.toString())+ 1;
                    return null;
            }
            System.out.println("La variable '" + id + "' no existe. Línea: " + linea + " Columna: " + columna);
        }
        return null;
        
    }
     
    
}
