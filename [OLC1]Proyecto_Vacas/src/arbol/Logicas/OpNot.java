/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Logicas;

import arbol.Expresion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import arbol.expresiones.Literal;

/**
 *
 * @author di3go
 */
public class OpNot extends Expresion{
        
    Expresion hijo1, hijo2;
    
    public OpNot(int linea, int columna, Expresion hijo1){
        this.linea = linea;
        this.columna = columna;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    
    @Override
    public Expresion getValor(Entorno ent){
        Expresion valor1 = hijo1.getValor(ent);
        
        
        switch(valor1.tipo.tipo){
            case booleano:
                
                return new Literal(new Tipo(Tipo.EnumTipo.booleano), !Boolean.parseBoolean(hijo1.valor.toString()));
        }
        
        return null;
    }
}
