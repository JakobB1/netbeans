/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author jalep
 */
@Entity
public class Pcshop extends Entitet{
    
    private String naziv;
    private int vlasnik;
    private Boolean certifikat;
    
    @Column(columnDefinition = "char(11)")
    private String oib;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(int vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Boolean getCertifikat() {
        return certifikat;
    }

    public void setCertifikat(Boolean certifikat) {
        this.certifikat = certifikat;
    }

    
    
}
