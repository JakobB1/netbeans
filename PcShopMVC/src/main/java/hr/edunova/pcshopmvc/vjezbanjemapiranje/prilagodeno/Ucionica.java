/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.vjezbanjemapiranje.prilagodeno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity(name = "class_room")
public class Ucionica {
    
    @Id
    private int sifra;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "students",
            columnDefinition = "text")
    private int polaznici;
    
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher")
    private int predavaci;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(int polaznici) {
        this.polaznici = polaznici;
    }

    public int getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(int predavaci) {
        this.predavaci = predavaci;
    }
    
    
}
