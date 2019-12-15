/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.aritmetica;

import arbol.Expresion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import arbol.expresiones.Literal;

/**
 *
 * @author di3go
 */
public class potencia extends Expresion{
    String operacion;
    Expresion hijo1;
    Expresion hijo2;
    
    public potencia(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.operacion = "**";
        this.linea = linea;
        this.columna = columna;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    
    
    @Override
    public Expresion getValor(Entorno ent){
        Expresion res1 = hijo1.getValor(ent);
        Expresion res2 = hijo2.getValor(ent);
        
        switch(res1.tipo.tipo){
            case entero:
                switch(res2.tipo.tipo){
                    case entero:
                        return new  Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()), Double.parseDouble(res2.valor.toString())));
                    case doble:
                        return new  Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()), Double.parseDouble(res2.valor.toString())));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()),(double) res2.valor.toString().charAt(0)));

                }
            case doble:
                switch(res2.tipo.tipo){
                    case entero:
                        return new  Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()), Double.parseDouble(res2.valor.toString())));
                    case doble:
                        return new  Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()), Double.parseDouble(res2.valor.toString())));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble),Math.pow(Double.parseDouble(res1.valor.toString()),(double) res2.valor.toString().charAt(0)));
                }
            case caracter:
                switch(res2.tipo.tipo){
                    case entero:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), Math.pow((double) res1.valor.toString().charAt(0), Double.parseDouble(res2.valor.toString())));
                    case doble:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), Math.pow((double) res1.valor.toString().charAt(0), Double.parseDouble(res2.valor.toString())));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), Math.pow((double) res1.valor.toString().charAt(0), (double) res1.valor.toString().charAt(0)));
                }
        }
        return null;
    }
    
}
