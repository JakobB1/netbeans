/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.test;

import com.github.javafaker.Faker;
import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.model.Smjer;
import edunova.jp24.util.EdunovaException;
import java.math.BigDecimal;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author jalep
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestObradaSmjer {
    
    // https://www.baeldung.com/junit-before-beforeclass-beforeeach-beforeall
    // https://rhamedy.medium.com/junit-annotations-every-developer-should-know-eb972a7a26c9
    
   
    private static ObradaSmjer obrada;
    private static Smjer smjer;
    private static Faker faker;

    @BeforeClass
    public static void pripremiPodatke() {
        obrada = new ObradaSmjer();
    faker = new Faker();
      smjer = new Smjer();
      smjer.setNaziv(faker.animal().name());
        System.out.println("Ime u pripremi: " + smjer.getNaziv());
      smjer.setCijena(new BigDecimal(5000));
      smjer.setTrajanje(130);
      smjer.setCertifikat(Boolean.TRUE);
      obrada.setEntitet(smjer);
    }
    
    @Test
    public void test1_kreiraj(){
        try {
            Smjer s = obrada.create();
            System.out.println("Kreirani smjer: " + s.getNaziv());
           assertFalse("Objekt nije pohranjen u bazu", s.getId().equals(Long.valueOf(0)));
        } catch (EdunovaException e) {
            assertFalse(e.getPoruka(), true);
        }catch(Exception e){
            assertFalse(e.getMessage(), true);
        }
    }
    
    @Test
    public void test2_citanje(){
        
        for(Smjer s: obrada.read()){
            System.out.println(s.getNaziv() + " - " + smjer.getNaziv());
            if(s.getNaziv().equals(smjer.getNaziv())){
                assertTrue(true);
                return;
            }
        }
        assertFalse("Kreirani smjer nije moguće učitati iz baze",true);
    }
    
    
     @Test
    public void test3_promjena(){
      
        obrada.getEntitet().setNaziv("Moj novi naziv");
        
         try {
            obrada.update();
           assertTrue("Objekt je promjenjen u bazu", true);
        } catch (EdunovaException e) {
            assertFalse(e.getPoruka(), true);
        }catch(Exception e){
            assertFalse(e.getMessage(), true);
        }
        
      
    }
    
    
     @Test
    public void test4_brisanje(){
      
         try {
            obrada.delete();
           assertTrue("Objekt je obrisan iz baze", true);
        } catch (EdunovaException e) {
            assertFalse(e.getPoruka(), true);
        }catch(Exception e){
            assertFalse(e.getMessage(), true);
        } 
    }
}
