/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfservicestation;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Novac_placanje extends javax.swing.JFrame {

    /**
     * Creates new form Novac_placanje
     */
    public Novac_placanje() {
        initComponents();
    }

    public Novac_placanje (String KolicinaNovca_novac, String KolicinaGoriva, String KojeGorivo){
        initComponents();
      
        unesenaKolicina.setText(KolicinaNovca_novac);
        kolicinaGoriva_novac.setText(KolicinaGoriva);
        kojeGorivo.setText(KojeGorivo);
        
        
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unesenaKolicina = new javax.swing.JLabel();
        unesenaKolicina_novac = new javax.swing.JTextField();
        button_potvrdiNovac_uplata = new javax.swing.JButton();
        button_nazad_novac = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kolicinaGoriva_novac = new javax.swing.JLabel();
        kolicinaGoriva_novac1 = new javax.swing.JLabel();
        kojeGorivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("selected payment type - cash");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setText("desired ammount :");

        unesenaKolicina.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        unesenaKolicina.setText("unesenaKolicina");

        unesenaKolicina_novac.setBackground(new java.awt.Color(204, 204, 204));
        unesenaKolicina_novac.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        unesenaKolicina_novac.setForeground(new java.awt.Color(0, 0, 0));
        unesenaKolicina_novac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unesenaKolicina_novac.setText("input your cash here ...");
        unesenaKolicina_novac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        unesenaKolicina_novac.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        unesenaKolicina_novac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unesenaKolicina_novacActionPerformed(evt);
            }
        });
        unesenaKolicina_novac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unesenaKolicina_novacKeyTyped(evt);
            }
        });

        button_potvrdiNovac_uplata.setBackground(new java.awt.Color(153, 153, 153));
        button_potvrdiNovac_uplata.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        button_potvrdiNovac_uplata.setForeground(new java.awt.Color(153, 0, 153));
        button_potvrdiNovac_uplata.setText("confirm payment");
        button_potvrdiNovac_uplata.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        button_potvrdiNovac_uplata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_potvrdiNovac_uplataActionPerformed(evt);
            }
        });

        button_nazad_novac.setBackground(new java.awt.Color(153, 153, 153));
        button_nazad_novac.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        button_nazad_novac.setForeground(new java.awt.Color(153, 0, 153));
        button_nazad_novac.setText("back");
        button_nazad_novac.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        button_nazad_novac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nazad_novacActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("for inputed ammout you will recieve ... ");

        kolicinaGoriva_novac.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        kolicinaGoriva_novac.setForeground(new java.awt.Color(255, 255, 255));
        kolicinaGoriva_novac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kolicinaGoriva_novac.setText("Kolicina");

        kolicinaGoriva_novac1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        kolicinaGoriva_novac1.setForeground(new java.awt.Color(255, 255, 255));
        kolicinaGoriva_novac1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kolicinaGoriva_novac1.setText("Liters");

        kojeGorivo.setForeground(new java.awt.Color(153, 0, 153));
        kojeGorivo.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kolicinaGoriva_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kolicinaGoriva_novac1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(129, 129, 129))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(unesenaKolicina)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_potvrdiNovac_uplata, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(unesenaKolicina_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_nazad_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(kojeGorivo)
                            .addGap(33, 33, 33)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(unesenaKolicina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_potvrdiNovac_uplata, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unesenaKolicina_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_nazad_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kojeGorivo))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolicinaGoriva_novac, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kolicinaGoriva_novac1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unesenaKolicina_novacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unesenaKolicina_novacActionPerformed

    }//GEN-LAST:event_unesenaKolicina_novacActionPerformed

    private void unesenaKolicina_novacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unesenaKolicina_novacKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_unesenaKolicina_novacKeyTyped

    int sumCashPayment = 0;
    
     
    private void button_potvrdiNovac_uplataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_potvrdiNovac_uplataActionPerformed

     
        
        
        int kusur=0;

        int cashPayment = Integer.parseInt(unesenaKolicina_novac.getText());
        int kolicinaNovca = Integer.parseInt(unesenaKolicina.getText());
        double KolicinaGoriva = Double.parseDouble(kolicinaGoriva_novac.getText());
        String KojeGorivo = kojeGorivo.getText();
        
        
        
        try{

            

                sumCashPayment = sumCashPayment + cashPayment;
               

                if(sumCashPayment>=kolicinaNovca){

                    System.out.println("Obrada u toku." +"\n"
                        + "Vas kusur je: "+(kusur = sumCashPayment-kolicinaNovca) + "KM" + "\n"
                        + "Molimo sacekajte vas racun." + "\n");

                    String msg2 = String.valueOf(sumCashPayment);
                    String msg1 = String.valueOf(kolicinaNovca);
                    String msg3 = String.valueOf(kusur);
                    String msg4 = String.valueOf(KolicinaGoriva);
                    String msg5 = String.valueOf(KojeGorivo);
                    
                    

                    close();
                    new Racun(msg2,msg1,msg3,msg4,msg5).setVisible(true);

                }

                else {
                    System.out.println("Unesena kolicina nije dovoljna za obradu! " + "\n"
                        + "Do sada ste uplatili: " + sumCashPayment + "\n"
                        + "Molimo doplatite: "+"\n");

                }

                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"unesena pogresna bla bla", null, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_button_potvrdiNovac_uplataActionPerformed

    private void button_nazad_novacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_nazad_novacActionPerformed
        close();
        PaymentSelection ps = new PaymentSelection();
        ps.setVisible(true);
    }//GEN-LAST:event_button_nazad_novacActionPerformed

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
            java.util.logging.Logger.getLogger(Novac_placanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Novac_placanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Novac_placanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Novac_placanje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Novac_placanje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_nazad_novac;
    private javax.swing.JButton button_potvrdiNovac_uplata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kojeGorivo;
    private javax.swing.JLabel kolicinaGoriva_novac;
    private javax.swing.JLabel kolicinaGoriva_novac1;
    private javax.swing.JLabel unesenaKolicina;
    private javax.swing.JTextField unesenaKolicina_novac;
    // End of variables declaration//GEN-END:variables
}
