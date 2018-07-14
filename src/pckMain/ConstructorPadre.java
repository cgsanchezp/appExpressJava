/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

/**
 *
 * @author cgsan
 */
public class ConstructorPadre {
    
    public static void main(String[] args) {
        ConstructorPadre oConstructorPadre = new ConstructorPadre();        
        /*ConstructorPadre oConstructorPadre1 = new ConstructorPadre(1);
        ConstructorPadre oConstructorPadre2 = new ConstructorPadre(1,2);*/
    }
    
    public ConstructorPadre(){
        System.out.println("Hola soy contructor del padre");
    }
    
    /*public ConstructorPadre(int parameter1){
        System.out.println("Hola " + parameter1);
    }
    
    public ConstructorPadre(int parameter1,String parameter2){
        System.out.println("Hola " + parameter1 + " " + parameter2);
    }*/
    
}

class ConstructoresHijo extends ConstructorPadre{    
    public ConstructoresHijo(){       
        System.out.println("Hola soy constructor del hijo");
    }    
}

