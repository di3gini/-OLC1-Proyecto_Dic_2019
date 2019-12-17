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
    public Boolean Default = false;
    public Object regresar;
    
    public Caso(Bloque bloque, int linea, int columna){
       
        this.bloque = bloque;
        this.linea = linea;
        this.columna = columna;
        this.Default = true;
        
    }
    
    public Caso(Expresion comparar,Bloque b,int linea, int columna){
        this.comparar = comparar;
        this.bloque = bloque;
        this.linea = linea;
        this.columna = columna;
    }
    
    @Override
    public Instruccion ejecutar(Entorno ent){
        
        regresar = bloque.ejecutar(ent);
        
        return null;
    }
}
