/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author jalep
 */
@Entity
public class Grupa {
    
    private String naziv;
    @ManyToOne
    private Smjer smjer;
    @ManyToOne
    private Predavac predavac;
    
    private Date datumPocetka;
    
    @ManyToMany
    private List<Polaznik> polaznici;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
            
    
}
