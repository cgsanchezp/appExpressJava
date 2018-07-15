/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckInterfaces;

/**
 *
 * @author cgsan
 */
//se puede implementar mas de una inteface,separandolo por comas
public class Circulo implements Figura{

    @Override
    public void calculatArea() {
        System.out.println("PIxRxR");
        //podriamos mostrar la variable de la interface
        System.out.println("" + PI);
    }
    
}
