/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.vjezbanjemapiranje.zadVNJ;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity
public class PredavacZad {
    
    @Id
    private Long id;
    
    private int osoba;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOsoba() {
        return osoba;
    }

    public void setOsoba(int osoba) {
        this.osoba = osoba;
    }
    
    
}
