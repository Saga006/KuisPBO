/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class BiodataProgrammer extends javax.swing.JFrame {

    /**
     * Creates new form BiodataProgrammer
     */
    public BiodataProgrammer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fnama = new javax.swing.JTextField();
        Fasal = new javax.swing.JTextField();
        Fipk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Fdebug = new javax.swing.JTextField();
        Fcode = new javax.swing.JTextField();
        Fknow = new javax.swing.JTextField();
        CekProg = new javax.swing.JButton();
        ToPosisi = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seleksi Programmer");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Biodata Calok Pegawai");

        jLabel3.setText("Nama");

        jLabel4.setText("Asal Kampus");

        jLabel5.setText("IPK");

        Fasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FasalActionPerformed(evt);
            }
        });

        jLabel6.setText("Debugging");

        jLabel7.setText("Clean Code");

        jLabel8.setText("Knowledge");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Form Penilaian (1-100)");

        Fcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FcodeActionPerformed(evt);
            }
        });

        CekProg.setText("Cek Nilai");
        CekProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CekProgActionPerformed(evt);
            }
        });

        ToPosisi.setText("Kembalil");
        ToPosisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToPosisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fnama)
                    .addComponent(Fasal)
                    .addComponent(Fipk)
                    .addComponent(Fknow)
                    .addComponent(Fcode, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fdebug))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(CekProg)
                .addGap(39, 39, 39)
                .addComponent(ToPosisi)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Fnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Fasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Fknow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fdebug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToPosisi)
                    .addComponent(CekProg))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FasalActionPerformed

    private void FcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FcodeActionPerformed

    private void CekProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CekProgActionPerformed
        // TODO add your handling code here:
        HasilSeleksiProgrammer hasil = new HasilSeleksiProgrammer();
        String nama, asal, ket;
        boolean cek = true; 
        int know, code,debug;
        double ipk, total;
        
        try{
            nama = Fnama.getText();
            asal = Fasal.getText();
            ipk = Double.parseDouble(Fipk.getText());
            know = Integer.parseInt(Fknow.getText());
            code = Integer.parseInt(Fcode.getText());
            debug = Integer.parseInt(Fdebug.getText());
            if(ipk > 4)
            {
                cek = false;
            }
            if(ipk < 0)
            {
                cek = false;
            }
            if(know < 0){
                cek = false;
            }
            if(know > 100){
                cek = false;
            }
            if(code < 0){
                cek = false;
            }
            if(code > 100){
                cek = false;
            }
            if(debug < 0){
                cek = false;
            }
            if(debug > 100){
                cek = false;
            }

            hasil.Lnama.setText(nama);
            hasil.Lasal.setText(asal);
            hasil.Lipk.setText(String.valueOf(ipk));

            total = (know*0.6) + (code*0.15) + (debug*0.25);
            if(total >=85){
                ket = "DITERIMA";
            }
            else
            {
                ket = "DITOLAK";
            }
            hasil.Lakhir.setText(String.valueOf(total));
            hasil.Lket.setText(ket);
            if(cek == true)
            {
                hasil.setVisible(true);
                this.dispose(); 
            }
            if(cek == false)
            {
                JOptionPane.showMessageDialog(null,"INPUT SALAH");
            }
        }
        catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, getMessage());
        }
    }//GEN-LAST:event_CekProgActionPerformed

    private void ToPosisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToPosisiActionPerformed
        PosisiLowongan posisi = new PosisiLowongan();
        posisi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ToPosisiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BiodataProgrammer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiodataProgrammer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiodataProgrammer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiodataProgrammer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiodataProgrammer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CekProg;
    public javax.swing.JTextField Fasal;
    public javax.swing.JTextField Fcode;
    public javax.swing.JTextField Fdebug;
    public javax.swing.JTextField Fipk;
    public javax.swing.JTextField Fknow;
    public javax.swing.JTextField Fnama;
    public javax.swing.JButton ToPosisi;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
