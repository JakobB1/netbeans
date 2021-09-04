/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.prilagodeno;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;
    
    @Column (name = "classroom",
            columnDefinition = "text")
    
    private int polaznic;
    private int predavaci;
    
    
    // Definirajte 3 svojstva, svkom dodatno definirajte znacajke. Tablica neka se zove
    // classrooom

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public int getPolaznic() {
        return polaznic;
    }

    public void setPolaznic(int polaznic) {
        this.polaznic = polaznic;
    }

    public int getPredavaci() {
        return predavaci;
    }

    public void setPredavaci(int predavaci) {
        this.predavaci = predavaci;
    }
}
