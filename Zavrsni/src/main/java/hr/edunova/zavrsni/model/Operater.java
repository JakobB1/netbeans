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
public class Operater extends Entitet{
       
    private String naziv;
    private String brojugovora;
    private Boolean certifikat;
    private String oib;
    private String email;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBrojugovora() {
        return brojugovora;
    }

    public void setBrojugovora(String brojugovora) {
        this.brojugovora = brojugovora;
    }

    public Boolean getCertifikat() {
        return certifikat;
    }

    public void setCertifikat(Boolean certifikat) {
        this.certifikat = certifikat;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}
