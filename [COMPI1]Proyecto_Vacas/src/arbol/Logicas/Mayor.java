/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.Logicas;

import arbol.Expresion;
import arbol.entorno.Entorno;

/**
 *
 * @author di3go
 */
public class Mayor extends Expresion{
    Expresion hijo1, hijo2;
    public Mayor(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.linea = linea;
        this.columna = columna;
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    @Override
    public Expresion getValor(Entorno ent){
        return null;
    }
    
}
