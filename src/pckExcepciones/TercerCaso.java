/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckExcepciones;

/**
 *
 * @author cgsan
 */
public class TercerCaso {
    public static void main(String[] args) {
        //try : donde puede ocurrir la execpcion
        //catch : se dispara a una exepcion del bloque try
        //finally . bloque de codigo que se ejecuta siempre
        //throw : lanzar una excepcion
        //throws : decirnos que exepeciones pueden lanzar un metodo
        
        try {
            throw new MiExcepcion();
        } catch (MiExcepcion e) {
            System.err.println(e.mensajeExcepcion());
        }
        finally{
            System.err.println("Todo bien");
        }
    }
}
