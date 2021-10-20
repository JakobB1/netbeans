/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jalep
 */
@Entity
public class Grupa extends Entitet{ 
    
    private String naziv;
    
    @ManyToOne
    private Smjer smjer;
    
    @ManyToOne
    private Predavac predavac;
    
    private Date datumPocetka;
    
    @OneToMany(mappedBy = "grupa")
    private List<Clan> polaznici = new ArrayList<>();

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

    public List<Clan> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Clan> polaznici) {
        this.polaznici = polaznici;
    }

    

    @Override
    public String toString() {
        return naziv;
    }
    
    
    
}