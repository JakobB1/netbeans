/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edunova.jp24.controller.ObradaGrupa;
import edunova.jp24.controller.ObradaPolaznik;
import edunova.jp24.controller.ObradaPredavac;
import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.util.Aplikacija;
import edunova.jp24.model.Grupa;
import edunova.jp24.model.Polaznik;
import edunova.jp24.model.Predavac;
import edunova.jp24.model.Smjer;
import edunova.jp24.util.EdunovaException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author jalep
 */
public class ProzorGrupa extends javax.swing.JFrame implements ProzorSucelje{

    private ObradaGrupa obrada;
    private ObradaPolaznik obradaPolaznik;
    private int odabraniIndex;
    /**
     * Creates new form ProzorGrupa
     */
    public ProzorGrupa() {
        initComponents();
        obrada = new ObradaGrupa();
        obradaPolaznik = new ObradaPolaznik();
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
        cmbSmjer = new javax.swing.JComboBox<>();
        cmbPredavac = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPolazniciUBazi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPolazniciNaGrupi = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnObrisiIzGrupe = new javax.swing.JButton();
        btnDodajUGrupu = new javax.swing.JButton();
        btnExportJSON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        jLabel2.setText("Smjer");

        jLabel3.setText("Predavac");

        jLabel4.setText("Datum pocetka");

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

        btnObrisi.setText("Obrisi");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        jLabel5.setText("Polaznici na grupi");

        jScrollPane2.setViewportView(lstPolazniciUBazi);

        jScrollPane3.setViewportView(lstPolazniciNaGrupi);

        btnTrazi.setText("Trazi");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        jLabel6.setText("Polaznici u bazi... Uvjet ( ime, prezime, OIB)");

        btnObrisiIzGrupe.setText(">>");
        btnObrisiIzGrupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiIzGrupeActionPerformed(evt);
            }
        });

        btnDodajUGrupu.setText("<<");
        btnDodajUGrupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajUGrupuActionPerformed(evt);
            }
        });

        btnExportJSON.setText("To JSON");
        btnExportJSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportJSONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addComponent(txtNaziv)
                            .addComponent(cmbSmjer, 0, 280, Short.MAX_VALUE)
                            .addComponent(cmbPredavac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnExportJSON))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnObrisiIzGrupe, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodajUGrupu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtUvjet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrazi)
                        .addGap(4, 4, 4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportJSON)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPredavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDodaj)
                                    .addComponent(btnPromjeni)
                                    .addComponent(btnObrisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrazi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDodajUGrupu)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisiIzGrupe)
                                .addGap(83, 83, 83)))
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var e = obrada.getEntitet();

        txtNaziv.setText(e.getNaziv());
        //postaviti smjer u cmb
        // u modelu klasa Smjer generirao sam equals i hashCode metode - ne bih koristio
        cmbSmjer.setSelectedItem(e.getSmjer());

        // označavanje predavača "ručno" - nema potrebe za equals i hashcode metode generiranje
        if (e.getPredavac() == null) {
            cmbPredavac.setSelectedIndex(0);
        } else {
            DefaultComboBoxModel<Predavac> m = (DefaultComboBoxModel<Predavac>) cmbPredavac.getModel();
            for (int i = 0; i < m.getSize(); i++) {
                if (m.getElementAt(i).getId().equals(e.getPredavac().getId())) {
                    cmbPredavac.setSelectedIndex(i);
                    break;
                }
            }
        }

        // 3. način jest korištenje LOMBOK https://projectlombok.org/ anotacija - ne radi s NetBeans
        if (e.getDatumPocetka() != null) {
            dpDatumPocetka.setDate(e.getDatumPocetka().toInstant().atZone(ZoneId.systemDefault()).
                    toLocalDate());
        }else{
            dpDatumPocetka.setDate(null);
        }

        DefaultListModel<Polaznik> m = new DefaultListModel<>();

        Collections.sort(e.getPolaznici(), new Comparator<Polaznik>() {
            @Override
            public int compare(Polaznik o1, Polaznik o2) {
                return o1.getPrezime().compareTo(o2.getPrezime());
            }
        });

        e.getPolaznici().forEach(p -> {
            m.addElement(p);
        });
        lstPolazniciNaGrupi.setModel(m);
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Grupa());

        postaviVrijednostiUEntitet();
        try {
            //System.out.println(obrada.getEntitet().getPolaznici().size());
            obrada.create();
            ucitaj();
            pocistiPodatke();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite grupu");
            return;
        }
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            odabraniIndex = lstEntiteti.getSelectedIndex();
            ucitaj();
            lstEntiteti.setSelectedIndex(odabraniIndex);

        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed
         
    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite grupu");
            return;
        }
        boolean brisanje = true;
        if (obrada.getEntitet().getPolaznici().size() > 0) {
            if (JOptionPane.showConfirmDialog(getParent(), "Grupa ima polaznike. Sigurno sve obrisati",
                    "Brisanje grupe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                obrada.getEntitet().setPolaznici(new ArrayList<Polaznik>());
            } else {
                brisanje = false;
            }
        }
        if (brisanje) {
            try {
                obrada.delete();
                ucitaj();
                pocistiPodatke();
            } catch (EdunovaException ex) {
                JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
            }
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void pocistiPodatke() {

        txtNaziv.setText("");
        cmbSmjer.setSelectedIndex(0);
        cmbPredavac.setSelectedIndex(0);
        dpDatumPocetka.setDateToToday();
        lstPolazniciNaGrupi.setModel(new DefaultListModel<>());

    }
    
    private void btnDodajUGrupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajUGrupuActionPerformed
        DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        for (Polaznik p : lstPolazniciUBazi.getSelectedValuesList()) {
            if (!postojiPolaznikUModelu(m, p)) {
                m.addElement(p);
            }
        }
        lstPolazniciNaGrupi.repaint();

    }//GEN-LAST:event_btnDodajUGrupuActionPerformed

    private void btnObrisiIzGrupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiIzGrupeActionPerformed
        List<Polaznik> lista = lstPolazniciNaGrupi.getSelectedValuesList();

        for (Polaznik p : lista) {
            obrisiPolaznikaIzGrupe(p);
        }
        lstPolazniciNaGrupi.repaint();
    }//GEN-LAST:event_btnObrisiIzGrupeActionPerformed

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        obradaPolaznik.read(txtUvjet.getText()).forEach(p -> {
            m.addElement(p);
        });
        lstPolazniciUBazi.setModel(m);
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnExportJSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportJSONActionPerformed
       
        ExclusionStrategy strategija = new ExclusionStrategy(){
            @Override
            public boolean shouldSkipField(FieldAttributes fa) {
               
                if(fa.getDeclaringClass()==Smjer.class && fa.getName().equals("grupe")){
                    return true;
                }
                
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> type) {
                return false;
            }
            
        };
        
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .setExclusionStrategies(strategija)
                .setDateFormat("EEE, dd MMM yyyy HH:mm:ss Z")
                .create();
        
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home") + File.separator + "podaci.json"));
        if(jfc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                BufferedWriter writer = new BufferedWriter(
                new FileWriter(jfc.getSelectedFile(),StandardCharsets.UTF_8)
                );
                writer.write(gson.toJson(obrada.read()));
                writer.close();
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btnExportJSONActionPerformed

    private void obrisiPolaznikaIzGrupe(Polaznik p) {
        DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        for (int i = 0; i < m.getSize(); i++) {
            if (m.get(i).getId().equals(p.getId())) {
                m.removeElementAt(i);
                return;
            }
        }
    }

    private boolean postojiPolaznikUModelu(DefaultListModel<Polaznik> m, Polaznik p) {
        for (int i = 0; i < m.getSize(); i++) {
            if (m.get(i).getId().equals(p.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void postaviVrijednostiUEntitet() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        e.setSmjer((Smjer) cmbSmjer.getSelectedItem());
        e.setPredavac((Predavac) cmbPredavac.getSelectedItem());
        if (dpDatumPocetka.getDate() != null) {
            e.setDatumPocetka(Date.from(
                    dpDatumPocetka.getDate().atStartOfDay()
                            .atZone(ZoneId.systemDefault()).toInstant())
            );
        }
        DefaultListModel<Polaznik> m = (DefaultListModel<Polaznik>) lstPolazniciNaGrupi.getModel();
        List<Polaznik> lista = new ArrayList<>();
        for (int i = 0; i < m.getSize(); i++) {
            lista.add(m.get(i));
        }
        //System.out.println("Lista: " + lista.size());
        e.setPolaznici(lista);
    }

    @Override
    public void postavke() {
        setTitle(Aplikacija.getNaslov("Grupe"));
        DefaultComboBoxModel<Smjer> m = new DefaultComboBoxModel<>();
        Smjer sm = new Smjer();
        sm.setId(Long.valueOf(0));
        sm.setNaziv("Nije odabrano");
        m.addElement(sm);
        new ObradaSmjer().read().forEach(s -> {
            m.addElement(s);
        });
        cmbSmjer.setModel(m);

        DefaultComboBoxModel<Predavac> mp = new DefaultComboBoxModel<>();
        Predavac p = new Predavac();
        p.setId(Long.valueOf(0));
        p.setIme("Nije");
        p.setPrezime("odabran");
        mp.addElement(p);
        new ObradaPredavac().read().forEach(pr -> {
            mp.addElement(pr);
        });
        cmbPredavac.setModel(mp);

        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");

        dpDatumPocetka.setSettings(dps);

        lstPolazniciNaGrupi.setModel(new DefaultListModel<Polaznik>());

    }

    @Override
    public void ucitaj() {
        DefaultListModel<Grupa> m = new DefaultListModel<>();
        obrada.read().forEach(g -> {
            m.addElement(g);
        });
        lstEntiteti.setModel(m);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajUGrupu;
    private javax.swing.JButton btnExportJSON;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisiIzGrupe;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JComboBox<Predavac> cmbPredavac;
    private javax.swing.JComboBox<Smjer> cmbSmjer;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Grupa> lstEntiteti;
    private javax.swing.JList<Polaznik> lstPolazniciNaGrupi;
    private javax.swing.JList<Polaznik> lstPolazniciUBazi;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables
}
