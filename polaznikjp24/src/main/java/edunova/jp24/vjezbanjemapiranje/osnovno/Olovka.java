/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.vjezbanjemapiranje.osnovno;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author jalep
 */
@Entity
public class Olovka {
    
    @Id
    private int sifra;
    private String naziv;
    private String oznaka;
    private BigDecimal cijena;
    private String materijal;
    
    // opisite olovku s 5 svojstava, mapirajte na bazu i izvedite program
    // u bazi mora biti tablica Olovka

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }
}
