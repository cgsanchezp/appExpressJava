/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckExcepciones;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author cgsan
 */
public class SegundoCaso {
    
    public static void main(String[] args) {
            SegundoCaso oSegundoCaso = new SegundoCaso();
            
            try {
            oSegundoCaso.disparandoExecepcion();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
            
    }
    
    private void disparandoExecepcion() throws IOException{
      //al agregar throws ya no es necesario  
      //  try {
            FileInputStream fis = new FileInputStream("c:/text.txt");
        /*} catch (Exception e) {
            System.out.println("Archivo no econtrado");
        }*/
    }
}
