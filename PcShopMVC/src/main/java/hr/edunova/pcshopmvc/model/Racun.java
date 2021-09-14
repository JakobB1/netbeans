/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.model;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Racun extends Entitet{
    
    private Date datumpocetka;
    private int brojRacuna;
    private int korisnik;
    private int djelatnik;

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public int getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(int korisnik) {
        this.korisnik = korisnik;
    }

    public int getDjelatnik() {
        return djelatnik;
    }

    public void setDjelatnik(int djelatnik) {
        this.djelatnik = djelatnik;
    }
    
    
    
}
