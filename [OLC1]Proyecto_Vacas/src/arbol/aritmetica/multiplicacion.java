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
public class multiplicacion extends Expresion {
    String operacion;
    Expresion hijo1;
    Expresion hijo2;
    
    public multiplicacion (int fila, int columna, Expresion hijo1, Expresion hijo2){
        this.operacion = "*";
        this.linea = fila;
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
                        return new  Literal(new Tipo(Tipo.EnumTipo.entero),Integer.parseInt(res1.valor.toString())*Integer.parseInt(res2.valor.toString()));
                    case doble:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble),Double.parseDouble(res1.valor.toString())*Double.parseDouble(res2.valor.toString()));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.entero),Integer.parseInt(res1.valor.toString())*(int) res2.valor.toString().charAt(0));
                }
            case doble:
                switch(res2.tipo.tipo){
                    case entero:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble),Double.parseDouble(res1.valor.toString())*Double.parseDouble(res2.valor.toString()));
                    case doble:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), Double.parseDouble(res1.valor.toString())*Double.parseDouble(res2.valor.toString()));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), Double.parseDouble(res1.valor.toString())* (double) res2.valor.toString().charAt(0));

                }
            case caracter:
                switch(res2.tipo.tipo){
                    case entero:
                        return new Literal(new Tipo(Tipo.EnumTipo.entero),Integer.parseInt(res1.valor.toString())*Integer.parseInt(res2.valor.toString()));
                    case doble:
                        return new Literal(new Tipo(Tipo.EnumTipo.doble), (double) res1.valor.toString().charAt(0) * Double.parseDouble(res2.valor.toString()));
                    case caracter:
                        return new Literal(new Tipo(Tipo.EnumTipo.entero), (int) res1.valor.toString().charAt(0) * (int) res2.valor.toString().charAt(0));
                }
        }
        
        return null;
    }
}
