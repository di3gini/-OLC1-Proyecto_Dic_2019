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
public class Caso{
Switch val;
    Expresion switchval;
    public Expresion resul;
    Expresion valor;
    BloqueSwitch bloque;
    int linea, columna;
    Object retorno;
    String tipo;
    

    public Caso(Expresion b, BloqueSwitch c, int bleft, int bright) {
        this.valor = b;
        this.bloque = c;
        this.linea = bleft;
        this.columna = bright;
        this.tipo="Case";
    }

    public Caso(BloqueSwitch a, int aleft, int aright) {
        this.bloque = a;
        this.linea = aleft;
        this.columna = aright;
        this.tipo="Default";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Expresion getValor() {
        return valor;
    }

    public void setValor(Expresion valor) {
        this.valor = valor;
    }

    public BloqueSwitch getBloque() {
        return bloque;
    }

    public void setBloque(BloqueSwitch bloque) {
        this.bloque = bloque;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public enum EnumtipoCase{
        Case, Defaul;
    }
}
