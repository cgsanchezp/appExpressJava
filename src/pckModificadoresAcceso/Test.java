/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckModificadoresAcceso;

/**
 *
 * @author cgsan
 */
public class Test {
    public static void main(String[] args) {
        Perro fido = new Perro();
        
        fido.setNombre("Fido");
        fido.getNombre();
        fido.getRaza();
        //fido.getId(); atributo private
    }
}
