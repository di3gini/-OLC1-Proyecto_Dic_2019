/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Expresion;
import arbol.Instruccion;
import arbol.entorno.Entorno;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author di3go
 */
public class GrafDot extends Instruccion{
    Expresion hijo1, hijo2;
    
    public GrafDot(int linea, int columna, Expresion hijo1, Expresion hijo2){
        this.hijo1 = hijo1;
        this.hijo2 = hijo2;
    }
    public Object ejecutar(Entorno e){
        Expresion val1 = hijo1.getValor(e);
        Expresion val2 = hijo2.getValor(e);
        
        switch(val1.tipo.tipo){
            case cadena:
                switch(val2.tipo.tipo){
                    case cadena:
                        FileWriter fichero = null;
                        PrintWriter pw = null;

                        int cont = 0;

                         {
                            try {
                                fichero = new FileWriter("C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[OLC1]Proyecto_Vacas\\src\\Entradas\\Graficos\\archivoDot.txt");
                                pw = new PrintWriter(fichero);
                                pw.println(val2.valor.toString());
                                fichero.close();
                                
                                graficarfichero(val1.valor.toString());
                            } catch (IOException ex) {
                                Logger.getLogger(GrafDot.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                }
        }
        
        return null;
    }

    private void graficarfichero(String toString) {
                    String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = "~/Entradas/Graficos/archivoDot.txt";
            String fileOutputPath = toString;

            String tParam = "-Tjpg";
            String tOParam = "-o";

            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

            Runtime rt = Runtime.getRuntime();
            try{
                rt.exec("dot" + cmd);
                System.out.println("dot"+cmd);
            }
            catch(Exception exc){
                System.out.println(exc);
            }
            
            
    }
    
}
