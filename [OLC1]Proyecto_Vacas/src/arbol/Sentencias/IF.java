/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.instrucciones.Bloque;
import java.util.LinkedList;

/**
 *
 * @author di3go
 */
public class IF extends Instruccion{
    LinkedList<Condiciones> listacondi;
    Bloque bloqueelse;

    public IF(LinkedList<Condiciones> a, Bloque b) {
        this.listacondi = a;
        this.bloqueelse = b;
    }

    public IF(LinkedList<Condiciones> a) {
        this.listacondi = a;
        this.bloqueelse = null;
    }

    @Override
    public Object ejecutar(Entorno ent) {

        for (Condiciones condicion : listacondi) {
            condicion.ejecutar(ent);

            if (condicion.ejecutado == true) {
                return null;
            }

        }
        if (bloqueelse != null) {
            Entorno nuevo_entorno = new Entorno(ent, "If");
            bloqueelse.ejecutar(nuevo_entorno);

        }
        return null;
    }
    
}
