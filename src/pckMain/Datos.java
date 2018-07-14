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
public class Datos {

    //tipos de datos primitivos(byte,short,int,long,float,double),ya tienen valor inicializados por defecto,ocupan menos memoria
    //tipos de datos wrapper son objetos propios de java,contienene mas propiedades que extraer.se caracterizan por llevar la mayuscula
    int cantidadAlumnosPrimitivo;
    Integer cantidadAlumnosWrapper;
    
    public static void main(String[] args) {
        
        //boxin
        Integer valorEnteroWraper = 3;
        
        //unboxing
        int valorPrimitivo = new Integer(3);
    }
}
