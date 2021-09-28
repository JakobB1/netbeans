/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnihib.util;

import hr.edunova.zavrsnihib.controller.ObradaPcshop;
import hr.edunova.zavrsnihib.model.Pcshop;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalep
 */
public class ConsoleUnosPcshop {
    
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        ObradaPcshop opc = new ObradaPcshop();
        Pcshop p = new Pcshop();
        opc.setEntitet(p);
        while(true){
            System.out.println("Unesi naziv pcshopa:");
            p.setNaziv(ulaz.nextLine());
            try {
                opc.create();
                break;
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
    }
    
}