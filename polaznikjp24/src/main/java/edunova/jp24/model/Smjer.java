/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author jalep
 */
@Entity
public class Smjer extends Entitet{
    
    private String naziv;
    private Integer trajanje;
    private BigDecimal cijena;
    private Boolean certifikat;
    
    @OneToMany(mappedBy = "smjer")
    private List<Grupa> grupe = new ArrayList<>();

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public Boolean getCertifikat() {
        return certifikat;
    }

    public void setCertifikat(Boolean certifikat) {
        this.certifikat = certifikat;
    }

    @Override
    public String toString() {
        return naziv;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.naziv);
        hash = 23 * hash + Objects.hashCode(this.trajanje);
        hash = 23 * hash + Objects.hashCode(this.cijena);
        hash = 23 * hash + Objects.hashCode(this.certifikat);
        hash = 23 * hash + Objects.hashCode(this.grupe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Smjer other = (Smjer) obj;
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.trajanje, other.trajanje)) {
            return false;
        }
        if (!Objects.equals(this.cijena, other.cijena)) {
            return false;
        }
        if (!Objects.equals(this.certifikat, other.certifikat)) {
            return false;
        }
        if (!Objects.equals(this.grupe, other.grupe)) {
            return false;
        }
        return true;
    }
 
    
    
}
