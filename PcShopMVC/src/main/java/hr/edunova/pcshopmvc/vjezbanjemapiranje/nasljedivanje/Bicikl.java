/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.vjezbanjemapiranje.nasljedivanje;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity(name = "bike")
public class Bicikl extends Vozilo{
    
    @Column( columnDefinition = "char(11)")
    private String vozacOib;

    public String getVozacOib() {
        return vozacOib;
    }

    public void setVozacOib(String vozacOib) {
        this.vozacOib = vozacOib;
    }
    
    
    
}
