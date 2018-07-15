/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckPolimorfismo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cgsan
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Medico oMedico = new Medico();
        Abogado oAbogado=  new Abogado();
        Ingeniero oIngeniero = new Ingeniero();
        
        //La capacidad de un objeto de comportarse como otros
        //iterando todos los objetos
        
        List<EsProfesional> listaProfesionales = new ArrayList<>();
        
        listaProfesionales.add(oMedico);
        listaProfesionales.add(oAbogado);
        listaProfesionales.add(oIngeniero);
        
        for (Iterator oIterator = listaProfesionales.iterator();oIterator.hasNext();) {
            EsProfesional oEsProfesional = (EsProfesional) oIterator.next();
            oEsProfesional.mostrarProfesion();
        }
    }
}
