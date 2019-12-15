/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;

/**
 *
 * @author di3go
 */
public class GrafDot extends Instruccion{
    Expresion hijo1, hijo2;
    
    public GrafDot(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    public Object ejecutar(Entorno e){
        Expresion val1 = hijo1.getValor(e);
        Expresion val2 = hijo2.getValor(e);
        
        switch(val1.tipo.tipo){
            case cadena:
                switch(val2.tipo.tipo){
                    case cadena:
                        System.out.println("Graficar Dot");
                }
        }
        
        return null;
    }
    
}
