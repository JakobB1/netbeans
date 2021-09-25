/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Racun extends Entitet{
    
    private int brojracuna;
    private int kolicina;
    private BigDecimal cijena;
    private BigDecimal iznos;
    private Date datumkupnje;
    private String nacinplacanja;
    private String nazivproizvoda;

    public int getBrojracuna() {
        return brojracuna;
    }

    public void setBrojracuna(int brojracuna) {
        this.brojracuna = brojracuna;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public void setIznos(BigDecimal iznos) {
        this.iznos = iznos;
    }

    public Date getDatumkupnje() {
        return datumkupnje;
    }

    public void setDatumkupnje(Date datumkupnje) {
        this.datumkupnje = datumkupnje;
    }

    public String getNacinplacanja() {
        return nacinplacanja;
    }

    public void setNacinplacanja(String nacinplacanja) {
        this.nacinplacanja = nacinplacanja;
    }

    public String getNazivproizvoda() {
        return nazivproizvoda;
    }

    public void setNazivproizvoda(String nazivproizvoda) {
        this.nazivproizvoda = nazivproizvoda;
    }
    
    
}
