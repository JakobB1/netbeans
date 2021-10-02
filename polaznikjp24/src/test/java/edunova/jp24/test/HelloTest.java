/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.test;


import edunova.jp24.model.Smjer;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author dell
 */
public class HelloTest {
    
    // koraci: google traženje koje me krivo odvelo
    // nakon čitanja shvatili ono što je dobro:
    // https://javarevisited.blogspot.com/2013/03/how-to-write-unit-test-in-java-eclipse-netbeans-example-run.html#axzz787UyKWIR
    // https://examples.javacodegeeks.com/core-java/junit/junit-netbeans-example/
    
    //šire čitanje
    //https://www.toptal.com/java/getting-started-with-junit
    // https://www.partech.nl/nl/publicaties/2020/03/10-unit-testing-best-practices#
    
    
    private Smjer smjer;
 
    public HelloTest() {
        smjer= new Smjer();
        smjer.setNaziv("Programiranje");
    }

    @Test
    public void nazivSmjera() {
        assertEquals("Naziv smjera nije dobar","Programiranje",smjer.getNaziv());
        
    }
    @Test
    public void duzinaSmjera(){
        assertTrue("Dužina mora biti manja od 20 znakova", smjer.getNaziv().length()<20);
    } 
}