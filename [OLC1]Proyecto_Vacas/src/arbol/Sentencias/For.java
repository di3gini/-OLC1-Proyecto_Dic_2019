/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Sentencias;

import GUI.EditorController;
import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;
import arbol.instrucciones.Bloque;

/**
 *
 * @author di3go
 */
public class For extends Instruccion{

    Instruccion inicio;
    Expresion comparativo;
    Expresion resultado;
    Instruccion aumento;
    Bloque bloque;
    int tip;
    Object retorno;

    public For(Instruccion a, Expresion b, Instruccion c, Bloque d, int i) {
        this.inicio = a;
        this.comparativo = b;
        this.aumento = c;
        this.bloque = d;
        this.tip = i;
    }

    @Override
    public Object ejecutar(Entorno ent) {
        EditorController.pilaCiclo.push("FOR");
        inicio.ejecutar(ent);
        resultado = comparativo.getValor(ent);

        if (this.resultado.tipo.tipo.equals(Tipo.EnumTipo.booleano)) {
            while (Boolean.parseBoolean(this.resultado.valor.toString()) == true) {

                Entorno nuevoentorno = new Entorno(ent,"FOR");
                retorno = bloque.ejecutar(nuevoentorno);
                aumento.ejecutar(nuevoentorno);
                resultado = comparativo.getValor(ent);
                if (retorno != null) {
                    EditorController.pilaCiclo.pop();
                    return null;

                }
            }

        }

        return null;
    }

}


