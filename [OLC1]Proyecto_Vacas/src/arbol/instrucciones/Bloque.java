/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Instruccion;
import arbol.entorno.Entorno;
import java.util.LinkedList;

/**
 *
 * @author di3go
 */
public class Bloque extends Instruccion {
    
    LinkedList<Instruccion> instrucciones;
    Object regresar = null;
    Boolean vacio = true;
    
    public Bloque(){
        
    }
    
    public Bloque(LinkedList<Instruccion> instrucciones){
        this.instrucciones = instrucciones;
        vacio = false;
    }
    
    @Override
    public Object ejecutar(Entorno ent){
        if(!vacio){
            for(Instruccion instrucciones: this.instrucciones){
                regresar=instrucciones.ejecutar(ent);
                return regresar;

            }
        }
        return null;
    }
    
}
