/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compi.prueba_flex;

/**
 *
 * @author di3go
 */
public class CError {
    public String tipo;
    public String error;
    public int linea;
    public int columna;
    
    public CError(String tipo, String error, int linea, int columna){
        this.tipo = tipo;
        this.error = error;
        this.linea = linea;
        this.columna = columna;
    }
}
