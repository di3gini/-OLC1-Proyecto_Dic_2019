/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.entorno;

/**
 *
 * @author di3go
 */
public class Tipo {
    public EnumTipo tipo; //Tipo Primitivo
    public String tr; //Tipo referencia, cuando tenga un objeto.
    
    public Tipo(EnumTipo tipo){
        this.tipo = tipo;
        
        this.tr ="";
    }
    public Tipo(EnumTipo tipo, String tr){
        this.tipo = tipo;
        
        this.tr =tr;
    }    
    
    public enum EnumTipo{
        entero, caracter, booleano, doble, cadena, nulo, error;
    }
}
