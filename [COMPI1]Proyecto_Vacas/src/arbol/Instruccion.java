/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;
import arbol.entorno.Entorno;
/**
 *
 * @author di3go
 */
public abstract class Instruccion extends nodo{
    public abstract Object ejecutar(Entorno ent);
}
