/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.view;

import hr.edunova.zavrsni.controller.ObradaKorisnik;
import hr.edunova.zavrsni.controller.ObradaOperater;
import hr.edunova.zavrsni.controller.ObradaProizvod;
import hr.edunova.zavrsni.controller.ObradaRacun;
import hr.edunova.zavrsni.model.Racun;
import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.model.Korisnik;
import hr.edunova.zavrsni.model.Proizvod;
import hr.edunova.zavrsni.util.Aplikacija;
import hr.edunova.zavrsni.util.EdunovaException;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author jalep
 */
public class ProzorRacun extends javax.swing.JFrame implements ProzorSucelje{

    private ObradaRacun obrada;
    private ObradaProizvod obradaProizvod;
    
    /**
     * Creates new form ProzorRacun
     */
    public ProzorRacun() {
        initComponents();
        obrada = new ObradaRacun();
        obradaProizvod = new ObradaProizvod();
        postavke();
        ucitaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtBrojRacuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbOperater = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbKorisnik = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstProizvodiNaRacunu = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProizvodiUBazi = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        btnDodajNaRacun = new javax.swing.JButton();
        btnObrisiSaRacuna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Broj Racuna");

        jLabel2.setText("Operater");

        jLabel3.setText("Korisnik");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        jLabel4.setText("Proizvodi na racunu");

        jScrollPane2.setViewportView(lstProizvodiNaRacunu);

        jScrollPane3.setViewportView(lstProizvodiUBazi);

        jLabel5.setText("Proizvodi u bazi");

        btnTrazi.setText("Trazi");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnDodajNaRacun.setText("<<");
        btnDodajNaRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNaRacunActionPerformed(evt);
            }
        });

        btnObrisiSaRacuna.setText(">>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(txtBrojRacuna)
                                .addComponent(jLabel2)
                                .addComponent(cmbOperater, 0, 101, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(cmbKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodajNaRacun)
                                    .addComponent(btnObrisiSaRacuna))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTrazi))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(2, 2, 2)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbOperater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbKorisnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(btnDodajNaRacun)))
                        .addGap(41, 41, 41)
                        .addComponent(btnObrisiSaRacuna)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUvjet)
                            .addComponent(btnTrazi))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnObrisi)
                    .addComponent(btnPromjeni))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()== null){
            return;
        }
        
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var r = obrada.getEntitet();
        
        txtBrojRacuna.setText(r.getBrojRacuna());
        // postaviti operatera u cmb
        // u modelu klasa operater generirao sam equals i hashCode metode - ne bih koristio
        cmbOperater.setSelectedItem(r.getOperater());
         System.out.println(r.getOperater().hashCode());
         
        // oznacavanje korisnika "rucno"
        DefaultComboBoxModel<Korisnik> k = (DefaultComboBoxModel<Korisnik>) cmbKorisnik.getModel();
        for(int i=0;i<k.getSize();i++){
            if(k.getElementAt(i).getId().equals(r.getKorisnik().getId())){
                cmbKorisnik.setSelectedIndex(i);
                break;
            }
        }
         
        DefaultListModel<Proizvod> p = new DefaultListModel<>();
        
        
        
        r.getProizvodi().forEach(pr->{p.addElement(pr);});
        lstProizvodiNaRacunu.setModel(p);
        
        
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Racun());
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Proizvod> m = new DefaultListModel<>();
        obradaProizvod.read(txtUvjet.getText()).forEach(p->{m.addElement(p);});
        lstProizvodiUBazi.setModel(m);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajNaRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNaRacunActionPerformed
        
    }//GEN-LAST:event_btnDodajNaRacunActionPerformed

    
    
    
    @Override
    public void postaviVrijednostiUEntitet() {
        var r = obrada.getEntitet();
        r.setBrojRacuna(txtBrojRacuna.getText());
        r.setOperater((Operater)cmbOperater.getSelectedItem());
        r.setKorisnik((Korisnik)cmbKorisnik.getSelectedItem());
        
    }

    @Override
    public void postavke() {
        setTitle(Aplikacija.getNaslov("Racuni"));
        
        
        DefaultComboBoxModel<Operater> mo = new DefaultComboBoxModel<>();
        Operater op = new Operater();
        op.setId(Long.valueOf(0));
        op.setNaziv("Nije odabrano");
        mo.addElement(op);
        new ObradaOperater().read().forEach(o->{
            System.out.println(o.hashCode());
            mo.addElement(o);});
        cmbOperater.setModel(mo);
        
        DefaultComboBoxModel<Korisnik> mk = new DefaultComboBoxModel<>();
        Korisnik k = new Korisnik();
        k.setId(Long.valueOf(0));
        k.setIme("Nije");
        k.setPrezime("odabrano");
        mk.addElement(k);
        new ObradaKorisnik().read().forEach(ko->{mk.addElement(ko);});
        cmbKorisnik.setModel(mk);
        
        
    }

    @Override
    public void ucitaj() {
        DefaultListModel<Racun> mr = new DefaultListModel<>();
        obrada.read().forEach(r->{mr.addElement(r);});
        lstEntiteti.setModel(mr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajNaRacun;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisiSaRacuna;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Korisnik> cmbKorisnik;
    private javax.swing.JComboBox<Operater> cmbOperater;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Racun> lstEntiteti;
    private javax.swing.JList<Proizvod> lstProizvodiNaRacunu;
    private javax.swing.JList<Proizvod> lstProizvodiUBazi;
    private javax.swing.JTextField txtBrojRacuna;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

}
