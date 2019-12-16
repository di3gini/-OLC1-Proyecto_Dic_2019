/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.instrucciones.Bloque;

/**
 *
 * @author di3go
 */
public class Caso extends Instruccion{
    public Expresion comparar;
    public Bloque bloque;
    public Expresion valor;
    
    public Caso(Expresion comparar, Bloque bloque, Expresion valor){
        this.comparar = comparar;
        this.bloque = bloque;
        this.valor = valor;
    }
    
    @Override
    public Instruccion ejecutar(Entorno ent){
        

        
        return null;
    }
}
