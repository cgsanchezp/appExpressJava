/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckAbstracta;

/**
 *
 * @author cgsan
 */
public abstract class InstrumentoMusical {
    
    private String tipoInstrumento;
    
    public String mostrarTipoInstrumento(){
        return tipoInstrumento;
    }
    
    //public abstract void tocar();
    protected abstract void tocar();
}
