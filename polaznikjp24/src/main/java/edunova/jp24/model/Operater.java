/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Operater extends Osoba{
    
    private String lozinka;

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime(){
        return getIme() + " " + getPrezime();
    }
}
