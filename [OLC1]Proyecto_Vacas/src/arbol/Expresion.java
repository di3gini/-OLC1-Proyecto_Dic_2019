/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;
import arbol.entorno.*;
/**
 *
 * @author di3go
 */
public abstract class Expresion extends nodo{
    public Tipo tipo;
    public Object valor;
    
    public abstract Expresion getValor(Entorno ent);
}
