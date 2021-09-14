/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.pcshopmvc.vjezbanjemapiranje.zadVNJ;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author jalep
 */
@Entity
public class GrupaZad {
    
    @Id
    private Long id;
    
    private String naziv;
    private Date datumPocetka;
    
    @ManyToOne
    private PredavacZad predavacZad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }

    public PredavacZad getPredavacZad() {
        return predavacZad;
    }

    public void setPredavacZad(PredavacZad predavacZad) {
        this.predavacZad = predavacZad;
    }
    
    
}
