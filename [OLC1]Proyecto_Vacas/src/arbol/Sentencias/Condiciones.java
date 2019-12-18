/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import arbol.instrucciones.Bloque;

/**
 *
 * @author di3go
 */
public class Condiciones extends Instruccion{
    
    Expresion valor;
    Expresion resultado;
    Bloque bloque;
    boolean ejecutado;
    
    

    public Condiciones(Expresion a, Bloque b) {
        this.valor = a;
        this.bloque = b;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        this.ejecutado=false;
        resultado = valor.getValor(ent);

        if (this.resultado.tipo.tipo.equals(Tipo.EnumTipo.booleano)) {
            if (Boolean.parseBoolean(this.resultado.valor.toString()) == true) {
                this.ejecutado = true;
                Entorno nuevoentorno = new Entorno(ent, "Condicion");
                bloque.ejecutar(nuevoentorno);
            }

        }

        return null;
    }
    
}
