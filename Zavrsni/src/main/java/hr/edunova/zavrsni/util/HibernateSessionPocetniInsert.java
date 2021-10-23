/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.util;

import com.github.javafaker.Faker;
import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.model.Login;
import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.model.Proizvod;
import hr.edunova.zavrsni.model.Racun;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jalep
 */
public class HibernateSessionPocetniInsert {
    
    public static void odradiPosao(){
        Session s = HibernateUtil.getSession();
        
        //prije rada s hibernate zapoceti transakciju
        s.beginTransaction();
        
        
        Login l = new Login();
        l.setIme("Edunova PC");
        l.setPrezime("Operater");
        l.setEmail("operater@edunova.hr");
        l.setLozinka(BCrypt.hashpw("o", BCrypt.gensalt()));
        
        s.save(l);
        
        
        
        
        
        Operater o = new Operater();
        o.setNaziv("Edunova PC Operater");
        o.setEmail("edunova@mail.hr");
        o.setOib("12345678911");
        o.setBrojUgovora("/1");
        o.setCertifikat(true);
        
        s.save(o);
        
        
        
        
        
        Faker faker = new Faker();
        Korisnik korisnik = new Korisnik();
        for (int i = 0; i < 27; i++) {
            korisnik = new Korisnik();
        korisnik.setIme(faker.name().firstName());
        korisnik.setPrezime(faker.name().lastName());
        korisnik.setEmail("email@mail.hr");
        korisnik.setOib(EdunovaUtil.getOIB());
        korisnik.setBrojClasnkeKartice("1");
        
        s.save(korisnik);
        }
        
        
        
        
        
        
        
        
        
        
        // Proizvodi unos 
        
        // Procesori
        
        List<Proizvod> proizvodi = new ArrayList<>();
        
        Proizvod ryzen31200 = new Proizvod();
        ryzen31200.setNaziv("Ryzen 3 1200");
        ryzen31200.setCijena(new BigDecimal(109));
        ryzen31200.setDostupnost(true);
        ryzen31200.setOpisProizvoda("Procesor(1st gen)");
        ryzen31200.setKodArtikla("RZ31200/1");
        ryzen31200.setGarancija(new Date());
        s.save(ryzen31200);
        proizvodi.add(ryzen31200);
        
        Proizvod ryzen51600 = new Proizvod();
        ryzen51600.setNaziv("Ryzen 5 1600");
        ryzen51600.setCijena(new BigDecimal(249));
        ryzen51600.setDostupnost(true);
        ryzen51600.setOpisProizvoda("Procesor(1st gen)");
        ryzen51600.setKodArtikla("RZ51600/1");
        ryzen51600.setGarancija(new Date());
        s.save(ryzen51600);
        proizvodi.add(ryzen51600);
        
        Proizvod ryzen71800x = new Proizvod();
        ryzen71800x.setNaziv("Ryzen 7 1800x");
        ryzen71800x.setCijena(new BigDecimal(499));
        ryzen71800x.setDostupnost(true);
        ryzen71800x.setOpisProizvoda("Procesor(1st gen)");
        ryzen71800x.setKodArtikla("RZ71800X/1");
        ryzen71800x.setGarancija(new Date());
        s.save(ryzen71800x);
        proizvodi.add(ryzen71800x);
        
        Proizvod ryzenthreadripper1950x = new Proizvod();
        ryzenthreadripper1950x.setNaziv("Ryzen Threadripper 1950x");
        ryzenthreadripper1950x.setCijena(new BigDecimal(999));
        ryzenthreadripper1950x.setDostupnost(true);
        ryzenthreadripper1950x.setOpisProizvoda("Procesor(1st gen)");
        ryzenthreadripper1950x.setKodArtikla("RZTR1950x/1");
        ryzenthreadripper1950x.setGarancija(new Date());
        s.save(ryzenthreadripper1950x);
        proizvodi.add(ryzenthreadripper1950x);
        
        Proizvod ryzen32300x = new Proizvod();
        ryzen32300x.setNaziv("Ryzen 3 2300x");
        ryzen32300x.setCijena(new BigDecimal(59));
        ryzen32300x.setDostupnost(true);
        ryzen32300x.setOpisProizvoda("Procesor(2nd gen)");
        ryzen32300x.setKodArtikla("RZ32300x/1");
        ryzen32300x.setGarancija(new Date());
        s.save(ryzen32300x);
        proizvodi.add(ryzen32300x);
        
        Proizvod ryzen52600x = new Proizvod();
        ryzen52600x.setNaziv("Ryzen 5 2600x");
        ryzen52600x.setCijena(new BigDecimal(229));
        ryzen52600x.setDostupnost(true);
        ryzen52600x.setOpisProizvoda("Procesor(2nd gen)");
        ryzen52600x.setKodArtikla("RZ52600x/1");
        ryzen52600x.setGarancija(new Date());
        s.save(ryzen52600x);
        proizvodi.add(ryzen52600x);
        
        Proizvod ryzen72700x = new Proizvod();
        ryzen72700x.setNaziv("Ryzen 7 2700x");
        ryzen72700x.setCijena(new BigDecimal(329));
        ryzen72700x.setDostupnost(true);
        ryzen72700x.setOpisProizvoda("Procesor(2nd gen)");
        ryzen72700x.setKodArtikla("RZ72700x/1");
        ryzen72700x.setGarancija(new Date());
        s.save(ryzen72700x);
        proizvodi.add(ryzen72700x);
        
        Proizvod ryzenthreadripper2990wx = new Proizvod();
        ryzenthreadripper2990wx.setNaziv("Ryzen Threadripper 2990WX");
        ryzenthreadripper2990wx.setCijena(new BigDecimal(1799));
        ryzenthreadripper2990wx.setDostupnost(true);
        ryzenthreadripper2990wx.setOpisProizvoda("Procesor(2nd gen)");
        ryzenthreadripper2990wx.setKodArtikla("RZTR2990wx/1");
        ryzenthreadripper2990wx.setGarancija(new Date());
        s.save(ryzenthreadripper2990wx);
        proizvodi.add(ryzenthreadripper2990wx);
        
        Proizvod ryzen33330x = new Proizvod();
        ryzen33330x.setNaziv("Ryzen 3 3300x");
        ryzen33330x.setCijena(new BigDecimal(99));
        ryzen33330x.setDostupnost(true);
        ryzen33330x.setOpisProizvoda("Procesor(3rd gen)");
        ryzen33330x.setKodArtikla("RZ33300x/1");
        ryzen33330x.setGarancija(new Date());
        s.save(ryzen33330x);
        proizvodi.add(ryzen33330x);
        
        Proizvod ryzen53600xt = new Proizvod();
        ryzen53600xt.setNaziv("Ryzen 5 3600xt");
        ryzen53600xt.setCijena(new BigDecimal(249));
        ryzen53600xt.setDostupnost(true);
        ryzen53600xt.setOpisProizvoda("Procesor(3rd gen)");
        ryzen53600xt.setKodArtikla("RZ53600xt/1");
        ryzen53600xt.setGarancija(new Date());
        s.save(ryzen53600xt);
        proizvodi.add(ryzen53600xt);
        
        Proizvod ryzen73800xt = new Proizvod();
        ryzen73800xt.setNaziv("Ryzen 7 3800xt");
        ryzen73800xt.setCijena(new BigDecimal(399));
        ryzen73800xt.setDostupnost(true);
        ryzen73800xt.setOpisProizvoda("Procesor(3rd gen)");
        ryzen73800xt.setKodArtikla("RZ73800xt/1");
        ryzen73800xt.setGarancija(new Date());
        s.save(ryzen73800xt);
        proizvodi.add(ryzen73800xt);
        
        Proizvod ryzen93950x = new Proizvod();
        ryzen93950x.setNaziv("Ryzen 9 3950x");
        ryzen93950x.setCijena(new BigDecimal(749));
        ryzen93950x.setDostupnost(true);
        ryzen93950x.setOpisProizvoda("Procesor(3rd gen)");
        ryzen93950x.setKodArtikla("RZ93950x/1");
        ryzen93950x.setGarancija(new Date());
        s.save(ryzen93950x);
        proizvodi.add(ryzen93950x);
        
        Proizvod ryzenthreadripper3990x = new Proizvod();
        ryzenthreadripper3990x.setNaziv("Ryzen Threadripper 3990x");
        ryzenthreadripper3990x.setCijena(new BigDecimal(3990));
        ryzenthreadripper3990x.setDostupnost(true);
        ryzenthreadripper3990x.setOpisProizvoda("Procesor(3rd gen)");
        ryzenthreadripper3990x.setKodArtikla("RZTR3990x/1");
        ryzenthreadripper3990x.setGarancija(new Date());
        s.save(ryzenthreadripper2990wx);
        proizvodi.add(ryzenthreadripper2990wx);
        
        Proizvod ryzen55600x = new Proizvod();
        ryzen55600x.setNaziv("Ryzen 5 5600x");
        ryzen55600x.setCijena(new BigDecimal(299));
        ryzen55600x.setDostupnost(true);
        ryzen55600x.setOpisProizvoda("Procesor(4th gen)");
        ryzen55600x.setKodArtikla("RZ55600x/1");
        ryzen55600x.setGarancija(new Date());
        s.save(ryzen55600x);
        proizvodi.add(ryzen55600x);
        
        Proizvod ryzen75800x = new Proizvod();
        ryzen75800x.setNaziv("Ryzen 7 5800x");
        ryzen75800x.setCijena(new BigDecimal(449));
        ryzen75800x.setDostupnost(true);
        ryzen75800x.setOpisProizvoda("Procesor(4th gen)");
        ryzen75800x.setKodArtikla("RZ75800x/1");
        ryzen75800x.setGarancija(new Date());
        s.save(ryzen75800x);
        proizvodi.add(ryzen75800x);
        
        Proizvod ryzen95900 = new Proizvod();
        ryzen95900.setNaziv("Ryzen 9 5900");
        ryzen95900.setCijena(new BigDecimal(549));
        ryzen95900.setDostupnost(true);
        ryzen95900.setOpisProizvoda("Procesor(4th gen)");
        ryzen95900.setKodArtikla("RZ95900/1");
        ryzen95900.setGarancija(new Date());
        s.save(ryzen95900);
        proizvodi.add(ryzen95900);
        
        
        
        
        Racun racun = new Racun();
        racun.setBrojRacuna("1");
        racun.setCijena(BigDecimal.TEN);
        racun.setIznos(BigDecimal.TEN);
        racun.setKolicina("1");
        racun.setNacinPlacanja("Gotovina");
        racun.setOperater(o);
        racun.setKorisnik(korisnik);
        racun.setProizvodi(proizvodi);
        s.save(racun);
        
        
        
        //commit ide na kraju
        s.getTransaction().commit();
    }
    
}
