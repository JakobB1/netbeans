/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.zavrsni.view;

import hr.edunova.zavrsni.controller.ObradaOperater;
import hr.edunova.zavrsni.util.Aplikacija;
import hr.edunova.zavrsni.model.Operater;
import hr.edunova.zavrsni.util.EdunovaException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jalep
 */
public class ProzorOperater extends javax.swing.JFrame implements ProzorSucelje{

    private ObradaOperater obrada;
    
    /**
     * Creates new form ProzorOperater
     */
    public ProzorOperater() {
        initComponents();
        obrada = new ObradaOperater();
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
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBrojugovora = new javax.swing.JTextField();
        chbCertifikat = new javax.swing.JCheckBox();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        jLabel2.setText("Email");

        jLabel3.setText("Oib");

        jLabel4.setText("Broj ugovora");

        chbCertifikat.setText("Certificirano");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(3, 3, 3)
                                .addComponent(btnPromjeni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtOib, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtBrojugovora, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chbCertifikat))))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBrojugovora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbCertifikat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Operater());
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(obrada.getEntitet()==null){
           JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite operater");
           return;
       }
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
           JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()==null){
            return;
        }
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var o = obrada.getEntitet();
        txtNaziv.setText(o.getNaziv());
        txtEmail.setText(o.getEmail());
        txtOib.setText(o.getOib());
        txtBrojugovora.setText(o.getBrojUgovora());
        chbCertifikat.setSelected(o.getCertifikat());
    }//GEN-LAST:event_lstEntitetiValueChanged

    public void postaviVrijednostiUEntitet(){
        var o = obrada.getEntitet();
        o.setNaziv(txtNaziv.getText());
        o.setEmail(txtEmail.getText());
        o.setOib(txtOib.getText());
        o.setBrojUgovora(txtBrojugovora.getText());
        o.setCertifikat(chbCertifikat.isSelected());
    }

    public void postavke(){
        setTitle(Aplikacija.getNaslov("Izbornik"));
    }
    
    public void ucitaj(){
        DefaultListModel<Operater> m = new DefaultListModel<>();
        
        obrada.read().forEach(o->{m.addElement(o);});
        
        lstEntiteti.setModel(m);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JCheckBox chbCertifikat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Operater> lstEntiteti;
    private javax.swing.JTextField txtBrojugovora;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtOib;
    // End of variables declaration//GEN-END:variables
}
