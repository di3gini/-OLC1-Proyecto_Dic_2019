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
public class OpOr extends Expresion{
    
    Expresion hijo1, hijo2;
    
    public OpOr(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.linea = linea;
        this.columna = columna;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    
    @Override
    public Expresion getValor(Entorno ent){
        Expresion valor1 = hijo1.getValor(ent);
        Expresion valor2 = hijo2.getValor(ent);
        
        switch(valor1.tipo.tipo){
            case booleano:
                switch(valor2.tipo.tipo){
                    case booleano:
                        if(Boolean.parseBoolean(valor1.valor.toString()) || Boolean.parseBoolean(valor2.valor.toString())){
                            return new Literal(new Tipo(Tipo.EnumTipo.booleano),true);
                        }
                        else {
                            return new Literal(new Tipo(Tipo.EnumTipo.booleano),false);
                        }
                }
        }
        return null;
    }
}
