/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol.instrucciones;

import arbol.Instruccion;
import arbol.entorno.Entorno;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author di3go
 */
public class GrafEntornos extends Instruccion{
    public GrafEntornos(){
        
    }
    
    @Override
    public Object ejecutar(Entorno e){
        
        System.out.println("ahora que");
        String cadena = "digraph G{";
        
        Entorno ent = e;
        
        int i = 0;
        
        if(e.anterior != null)
        {
            while(ent.anterior!=null){
                
                cadena = cadena + ent.nombre + i + "->";
                i++;
                ent = ent.anterior;

            }
        }
        cadena = cadena + ent.nombre+";}";
        System.out.println(cadena);
        
        {
                                    FileWriter fichero = null;
                        PrintWriter pw = null;
                            try {
                                fichero = new FileWriter("C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[OLC1]Proyecto_Vacas\\src\\Entradas\\Graficos\\grafEntornos.txt");
                                pw = new PrintWriter(fichero);
                                pw.println(cadena);
                                fichero.close();
                                
                                graficarfichero(); 
                            } catch (IOException ex) {
                                Logger.getLogger(GrafDot.class.getName()).log(Level.SEVERE, null, ex);
                            }
                             try {
                                 

                                
                            } catch (Exception ex) {
                                Logger.getLogger(GrafDot.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
        
        return null;
    }
    private void graficarfichero(){
        String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";

            String fileInputPath = "C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[OLC1]Proyecto_Vacas\\src\\Entradas\\Graficos\\grafEntornos.txt";
            String fileOutputPath = "C:\\Users\\di3go\\Documents\\NetBeansProjects\\-OLC1-Proyecto_Dic_2019\\[OLC1]Proyecto_Vacas\\src\\Entradas\\Graficos\\entornos.jpg";

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
                rt.exec(cmd);
            }
            catch (IOException exc){
                System.out.println(exc);
            }
    }
}
