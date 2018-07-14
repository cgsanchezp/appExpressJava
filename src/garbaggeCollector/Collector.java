/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbaggeCollector;

import pckModificadoresAcceso.Perro;

/**
 *
 * @author cgsan
 */
public class Collector {
    public static void main(String[] args) {
        //heap -> espacio de memoria dinamico,que aumenta de tamaño segun sea necesario
        //GC -- aplicacion dentro del la maquina virtual(JVM),liberar memoria
        //desventajas ->consumo adicional de recursos,paradas en la ejecucion
        //ventajas -> liberar espacio de memoria..sugiere al la vm que ejecute en los momentos venideros
        
        Perro oPerro = new Perro(); //posicicion de memoria 3388
        Perro otroPerro = oPerro; //posicicion de memoria 3388
        
        oPerro = new Perro(); //3395
        
        //limpiar con garbage collector
        System.gc();
    }
}
