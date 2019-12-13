/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Expresion;
import arbol.*;
import arbol.entorno.*;

/**
 *
 * @author di3go
 */
public class Declaracion extends Instruccion {
    Tipo tipo;
    String id;
    public Expresion valor;
    
    public Declaracion(Tipo tipo, String id, Expresion valor, int linea, int columna){
        this.tipo = tipo;
        this.id = id;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
    }
    
    public Declaracion(Tipo tipo, String id, int linea, int columna){
        this.tipo = tipo;
        this.id = id;
        this.valor = null;
        this.linea = linea;
        this.columna = columna;
    }    
    
    @Override
    public Object ejecutar(Entorno ent) {
        if (valor != null) { //Si se le asignó valor a la variable
            Expresion resultado = valor.getValor(ent);

            Simbolo simbolo;
            switch (tipo.tipo) { //Tipo de la variable
                case entero:
                    switch (resultado.tipo.tipo) {
                        case entero:
                            simbolo = new Simbolo(tipo, resultado.valor);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                        case caracter:
                            int ascii = (int) resultado.valor.toString().charAt(0);
                            simbolo = new Simbolo(tipo, ascii);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                    }
                    break;
                case doble:
                    switch (resultado.tipo.tipo) {
                        case caracter:
                            int ascii = (int) resultado.valor.toString().charAt(0);
                            simbolo = new Simbolo(tipo, ascii);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                        case entero:
                        case doble:
                            simbolo = new Simbolo(tipo, resultado.valor);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                    }
                    break;
                case caracter:
                    switch (resultado.tipo.tipo) {
                        case caracter:
                            simbolo = new Simbolo(tipo, resultado.valor);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                    }
                    break;
                case booleano:
                    switch (resultado.tipo.tipo) {
                        case booleano:
                            simbolo = new Simbolo(tipo, resultado.valor);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                    }
                    break;
                case cadena:
                    switch (resultado.tipo.tipo) {
                        case cadena:
                            simbolo = new Simbolo(tipo, resultado.valor);
                            ent.insertar(id, simbolo, linea, columna, "La variable");
                            return null;
                    }
                    break;

            }

            //Si llega aquí es porque hubo error de tipos
//            proyecto1.Interfaz.lista_errores.add(new CError("Semántico", "El tipo de dato que se le quiere asignar a la variable '" + id + "' es incorrecto. " + tipo.tipo + " = " + resultado.tipo.tipo, linea, columna));
            System.out.println("Error Semántico: " + "El tipo de dato que se le quiere asignar a la variable '" + id + "' es incorrecto. " + tipo.tipo + " = " + resultado.tipo.tipo + ". Línea: " + linea + " Columna: " + columna);
        } else { //Si no se le asignó valor a la variable le pongo uno por defecto
            switch (tipo.tipo) {
                case entero:
                    ent.insertar(id, new Simbolo(tipo, 0), linea, columna, "La variable");
                    break;
                case caracter:
                    ent.insertar(id, new Simbolo(tipo, '\0'), linea, columna, "La variable");
                    break;
                case booleano:
                    ent.insertar(id, new Simbolo(tipo, false), linea, columna, "La variable");
                    break;
                case doble:
                    ent.insertar(id, new Simbolo(tipo, 0.0), linea, columna, "La variable");
                    break;
                case cadena:
                    ent.insertar(id, new Simbolo(tipo, ""), linea, columna, "La variable");
                    break;

            }
        }
        return null;
    }
    
}
