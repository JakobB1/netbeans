/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Proizvod extends Entitet{
    
    private String naziv;
    private BigDecimal cijena;
    private Date garancija;
    private Boolean certifikat;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

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

    public Boolean getCertifikat() {
        return certifikat;
    }

    public void setCertifikat(Boolean certifikat) {
        this.certifikat = certifikat;
    }

    
}
