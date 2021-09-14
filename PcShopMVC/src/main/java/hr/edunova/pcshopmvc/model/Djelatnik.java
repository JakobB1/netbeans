/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.model;

import javax.persistence.Entity;

/**
 *
 * @author jalep
 */

@Entity
public class Djelatnik extends Entitet{
    
    private String ime;
    private String prezime;
    private int pcshop;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getPcshop() {
        return pcshop;
    }

    public void setPcshop(int pcshop) {
        this.pcshop = pcshop;
    }
    
    
}
