/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Instruccion;
import arbol.entorno.Entorno;

/**
 *
 * @author di3go
 */
public class GrafEntornos extends Instruccion{
    public GrafEntornos(){
        
    }
    
    @Override
    public Object ejecutar(Entorno e){
        System.out.println("Ejecutar Entornos");
        return null;
    }
}
