/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.model;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Korisnik extends Osoba{
    
    private String brojClasnkeKartice;

    public String getBrojClasnkeKartice() {
        return brojClasnkeKartice;
    }

    public void setBrojClasnkeKartice(String brojClasnkeKartice) {
        this.brojClasnkeKartice = brojClasnkeKartice;
    }
    
    
}