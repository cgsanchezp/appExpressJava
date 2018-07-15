/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckHerencia;

/**
 *
 * @author cgsan
 */
public class Futbolista extends Persona{
    private String equipo;
    private String posicicion;
    
    public static void main(String[] args) {
        Futbolista ofFutbolista = new Futbolista();
        ofFutbolista.setNombre("nombre de futbolista que a fin de cuenta es una persona");
        
        //llamando una funcion heredad
        ofFutbolista.correr();
        
    }
}
