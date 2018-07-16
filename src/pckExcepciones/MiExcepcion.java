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
public class MiExcepcion extends Exception{
    public MiExcepcion(){};
    
    public String mensajeExcepcion(){
        return "Error provocado";
    }
    
    public String mensajeExcepcion2(){
        return "Error provocado 2";
    }
}
