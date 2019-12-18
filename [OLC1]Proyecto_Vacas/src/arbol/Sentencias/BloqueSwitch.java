/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Instruccion;
import arbol.entorno.Entorno;
import java.util.LinkedList;

/**
 *
 * @author di3go
 */
public class BloqueSwitch extends Instruccion{
        LinkedList<Instruccion> a;
    Object retorno = null;

    public BloqueSwitch(LinkedList<Instruccion> a) {
        this.a = a;
    }

    public BloqueSwitch() {
        this.a = null;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        if (a != null) {
            for (Instruccion instrucciones : a) {
                retorno = instrucciones.ejecutar(ent);

                if (retorno != null) {
                    return this;
                }
            }
        }

        return null;
    }


}
