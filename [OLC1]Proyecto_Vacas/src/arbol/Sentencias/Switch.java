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
import java.util.ArrayList;
import java.util.LinkedList;
import olc1.proyecto_vacas.CError;


/**
 *
 * @author di3go
 */
public class Switch extends Instruccion{
    Expresion valor;
    public Expresion resul;
    LinkedList<Instruccion> listacondi;
    LinkedList<Casos> listacondicas;
    int linea, columna;
    Caso caso;
    Object retorno;
    String tipo;
//    public Switch(Expresion a, LinkedList<Instruccion> b, int aleft, int bleft) {
//        this.valor=a;
//        this.listacondi=b;
//        this.lina=aleft;
//        this.columna=bleft;
//    }

    public Switch(Expresion a, LinkedList<Casos> b, int aleft, int bleft) {
        this.valor = a;
        this.listacondicas = b;
        this.linea = aleft;
        this.columna = bleft;
    }

    @Override
    public Object ejecutar(Entorno ent) {
     
                try {
            for (Casos instrucciones : listacondicas) {
                this.resul = valor.getValor(ent);
                caso = instrucciones.getCaso();

                if (caso.getTipo().equals("Case")) {
                    
                    if (resul.valor.toString().equals(caso.valor.valor)) {
                        EditorController.pilaCiclo.push("CASE");
                        Entorno nuevo = new Entorno(ent,"SWITCH");
                        retorno = caso.bloque.ejecutar(nuevo);
                        if (retorno != null) {
                            return null;
                        }else{
                            EditorController.lista_errores.pop();
                        }
                    }
                } else {
                    if (caso.getTipo().equals("Default")) {
                        Entorno nuevo = new Entorno(ent,"SWITCH");
                        retorno = caso.bloque.ejecutar(nuevo);
                        if (retorno != null) {
                            return null;
                        }
                    }
                }
            }
        } catch (NullPointerException ex) {

        }

        return null;
    
        
    }
}
