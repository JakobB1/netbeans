/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.vezavisenapramavise;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Oznaka {
    
    @javax.persistence.Id
    private Long id;
    
    private String naziv;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
            
    
    
}
