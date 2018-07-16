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
public class PrimerCaso {
    public static void main(String[] args) {
        try {
            int[] edades = {1,2,3,4};
            System.out.println(edades[4]);
        } catch (Exception e) {
            System.out.println("Estoy en la execepcion : " + e);
        }
    }
}
