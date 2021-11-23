/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsnieng;

import hr.edunova.zavrsnieng.util.HibernateUtil;

/**
 *
 * @author jalep
 */
public class Start {
    public static void main(String[] args) {
        HibernateUtil.getSession();
    }
}
