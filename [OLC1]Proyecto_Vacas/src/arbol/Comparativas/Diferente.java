/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Comparativas;

import arbol.Expresion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import arbol.expresiones.Literal;

/**
 *
 * @author di3go
 */
public class Diferente extends Expresion{
        Expresion hijo1, hijo2;
    
    public Diferente(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.linea = linea;
        this.columna = columna;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    @Override
    public Expresion getValor(Entorno ent){
        Expresion valor1 = hijo1.getValor(ent);
        Expresion valor2 = hijo2.getValor(ent);
        
        switch (valor1.tipo.tipo){
            case entero:
                switch (valor2.tipo.tipo){
                    case entero:
                        if(Integer.parseInt(valor1.valor.toString()) != Integer.parseInt(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case doble:
                        if(Double.parseDouble(valor1.valor.toString()) != Double.parseDouble(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case caracter:
                        if((double)valor1.valor!= (double) valor2.valor.toString().charAt(0)){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                        
                }
            case doble:
                switch (valor2.tipo.tipo){
                    case entero:
                        if(Double.parseDouble(valor1.valor.toString()) != Double.parseDouble(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case doble:
                        if(Double.parseDouble(valor1.valor.toString()) != Double.parseDouble(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case caracter:
                        if(Double.parseDouble(valor1.valor.toString()) != (double) valor2.valor.toString().charAt(0)){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }    
                }
            case caracter:
                switch (valor2.tipo.tipo){
                    case entero:
                        if((int) valor1.valor.toString().charAt(0) != Integer.parseInt(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case doble:
                        if((double) valor1.valor.toString().charAt(0) != Double.parseDouble(valor2.valor.toString())){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                    case caracter:
                        if((double) valor1.valor.toString().charAt(0) != (double) valor2.valor.toString().charAt(0)){
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), true);
                        }
                        else{
                            
                            return new  Literal(new Tipo(Tipo.EnumTipo.booleano), false);
                        }
                }
            case cadena:
                switch(valor2.tipo.tipo){
                    case cadena:
                        if(valor1.valor.toString() != valor2.valor.toString()){
                            return new Literal(new Tipo(Tipo.EnumTipo.booleano),true);
                        }
                        else{
                            return new Literal(new Tipo(Tipo.EnumTipo.booleano),false);
                        }
                }
        }
        return null;
    }
    
}
