/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Proizvod extends Entitet{
    
    private BigDecimal cijena;
    private Date garancija;
    private String naziv;
    private String opisProizvoda;
    private String kodArtikla;
    private Boolean dostupnost;
    
    
    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Date getGarancija() {
        return garancija;
    }

    public void setGarancija(Date garancija) {
        this.garancija = garancija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public String getKodArtikla() {
        return kodArtikla;
    }

    public void setKodArtikla(String kodArtikla) {
        this.kodArtikla = kodArtikla;
    }

    public Boolean getDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(Boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
}
