/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Instruccion;

/**
 *
 * @author di3go
 */
public class Casos {

    Caso caso;

    
    public Casos(Caso b) {
         this.caso=b;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
    
}
