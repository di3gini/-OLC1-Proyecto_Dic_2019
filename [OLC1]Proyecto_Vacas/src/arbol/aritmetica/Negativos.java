/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.aritmetica;

import arbol.Expresion;
import arbol.entorno.Entorno;

/**
 *
 * @author di3go
 */
public class Negativos extends Expresion{

    public Expresion exp;
    
    public Negativos(int linea, int columna, Expresion exp){
        this.exp = exp;
        this.linea = linea;
        this.columna = columna;
    }
    
    @Override
    public Expresion getValor(Entorno ent) {
        
            switch(exp.tipo.tipo){
                case entero:
                    
                    exp.valor = (Integer) (Integer.parseInt(exp.valor.toString()) * (-1));
                    return null;
                case doble:
                    exp.valor = Double.parseDouble(exp.valor.toString()) * (-1);   
                    return null;
            }
            
            
            return null;
    }
    
}
