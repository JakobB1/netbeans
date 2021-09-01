/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.nasljedivanje;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */

@Entity(name = "bike")
public class Bicikl extends Vozilo{
    
    @Column(columnDefinition = "char(11)")
    private String vozacOiB;

    public String getVozacOiB() {
        return vozacOiB;
    }

    public void setVozacOiB(String vozacOiB) {
        this.vozacOiB = vozacOiB;
    }
    
    
}
