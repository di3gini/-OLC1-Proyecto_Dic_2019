/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.*;
import arbol.entorno.Entorno;
import arbol.entorno.Tipo;

/**
 *
 * @author di3go
 */
public class Imprimir extends Instruccion{
    Expresion valor;
    boolean salto;
    
    public Imprimir(Expresion valor, boolean salto){
        this.valor = valor;
        this.salto = salto;
    }
    
    @Override
    public Object ejecutar(Entorno e) {
        Expresion resultado = valor.getValor(e);
        String auxiliar ="";
        
        if(salto){
            auxiliar = "\n";
        }
        
        if (resultado.tipo.tipo != Tipo.EnumTipo.error){
            System.out.print(resultado.valor.toString()+auxiliar);
        }
        return null;
    }
    
    
    
}
