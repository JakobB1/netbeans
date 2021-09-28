/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp24.view;

import edunova.jp24.controller.ObradaGrupa;
import edunova.jp24.controller.ObradaPredavac;
import edunova.jp24.controller.ObradaSmjer;
import edunova.jp24.util.Aplikacija;
import edunova.jp24.model.Grupa;
import edunova.jp24.model.Predavac;
import edunova.jp24.model.Smjer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author jalep
 */
public class ProzorGrupa extends javax.swing.JFrame implements ProzorSucelje{

    private ObradaGrupa obrada;
    /**
     * Creates new form ProzorGrupa
     */
    public ProzorGrupa() {
        initComponents();
        obrada = new ObradaGrupa();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        jLabel2.setText("Smjer");

        jLabel3.setText("Predavac");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbPredavac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSmjer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPredavac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()==null){
            return;
        }
        
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var e = obrada.getEntitet();
        
        txtNaziv.setText(e.getNaziv());
        //postaviti smjer u cmb
        // u modelu klasa Smjer generirao sam equals i hashCode metode - ne bih koristio
        cmbSmjer.setSelectedItem(e.getSmjer());
        
        // označavanje predavača "ručno - nema potrebe za equals i hashcode metode generiranje
        DefaultComboBoxModel<Predavac> m = (DefaultComboBoxModel<Predavac>) cmbPredavac.getModel();
        for(int i=0;i<m.getSize();i++){
            if(m.getElementAt(i).getId().equals(e.getPredavac().getId())){
                cmbPredavac.setSelectedIndex(i);
                break;
            }
        }
    }//GEN-LAST:event_lstEntitetiValueChanged

    @Override
    public void postaviVrijedostiUEntitet() {
        
    }

    @Override
    public void postavke() {
        setTitle(Aplikacija.getNaslov("Grupe"));
        DefaultComboBoxModel<Smjer> m = new DefaultComboBoxModel<>();
        Smjer sm = new Smjer();
        sm.setId(Long.valueOf(0));
        sm.setNaziv("Nije odabrano");
        m.addElement(sm);
        new ObradaSmjer().read().forEach(s->{m.addElement(s);});
        cmbSmjer.setModel(m);
        
        DefaultComboBoxModel<Predavac> mp = new DefaultComboBoxModel<>();
        Predavac p = new Predavac();
        p.setId(Long.valueOf(0));
        p.setIme("Nije");
        p.setPrezime("odabran");
        mp.addElement(p);
        new ObradaPredavac().read().forEach(pr->{mp.addElement(pr);});
        cmbPredavac.setModel(mp);
    }

    @Override
    public void ucitaj() {
        DefaultListModel<Grupa> m = new DefaultListModel<>();
        obrada.read().forEach(g->{m.addElement(g);});
        lstEntiteti.setModel(m);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Predavac> cmbPredavac;
    private javax.swing.JComboBox<Smjer> cmbSmjer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Grupa> lstEntiteti;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
