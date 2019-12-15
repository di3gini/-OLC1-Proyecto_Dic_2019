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
public class DoWhile extends Instruccion{
        
    Expresion valor;
    Expresion resultado;
    Bloque bloque;
    
    public DoWhile(Expresion a, Bloque b) {
        this.valor=a;
        this.bloque=b;
    }
    
    @Override
    public Object ejecutar(Entorno ent) {
        resultado = valor.getValor(ent);
        if (this.resultado.tipo.tipo.equals(Tipo.EnumTipo.booleano)) {

            do{
                Entorno nuevoentorno = new Entorno(ent);
                bloque.ejecutar(nuevoentorno);
                resultado=valor.getValor(ent);
            } while (Boolean.parseBoolean(this.resultado.valor.toString()) == true);
        }
        return null;
    }
    
}
