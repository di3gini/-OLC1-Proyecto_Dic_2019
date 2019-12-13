/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.expresiones;
import arbol.*;
import arbol.entorno.*;
/**
 *
 * @author di3go
 */
public class Id extends Expresion {
    
    String id;
    
    public Id(String id, int linea, int columna){
        this.id = id;
        this.linea = linea;
        this.columna = columna;
    }
    
    @Override
    public Expresion getValor(Entorno ent){
        Simbolo sim = ent.buscar(id, linea, columna, "La variable " + id + "no existe");
        if (sim != null){
            Literal retorno = new Literal(sim.tipo, sim.valor);
            return retorno;
        }
        return new Literal(new Tipo(Tipo.EnumTipo.error), "@Error");
    }
}
