/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

import java.util.Objects;

/**
 *
 * @author cgsan
 * uso de constructores,equal y metodos hash
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    
    public static void main(String[] args) {
        
        Persona oPersona = new Persona();
        oPersona.setId(1);
        oPersona.setNombre("carlos");
        oPersona.setApellido("escobar");
        
        System.out.println(oPersona.toString());
        
        
        Persona oPersona2 = new Persona();
        oPersona2.setId(1);
        oPersona2.setNombre("carlos");
        oPersona2.setApellido("escobar");
        
        System.out.println(oPersona2.toString());
        
        System.out.println("Estas personas son iguales ? " + oPersona.equals(oPersona2));
        
        System.out.println("Los hashcode son iguales ? " +oPersona.hashCode());
        
    }
    
    //constructor
    public Persona(){
        System.out.println("Inicializando la clase mediante el constructor");
    }
    
    //sobrescribiendo funcionalidades de la clase heredada Object

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public int hashCode() {        
        return  getId() * 2 ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
