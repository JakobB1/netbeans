/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author jalep
 */
@Entity
public class Clan extends Entitet{
    
    @ManyToOne
    private Grupa grupa;
    
    @ManyToOne
    private Polaznik polaznik;
    
    private int kalorije;

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }

    public int getKalorije() {
        return kalorije;
    }

    public void setKalorije(int kalorije) {
        this.kalorije = kalorije;
    }

    @Override
    public String toString() {
        return polaznik.toString();
    }
}