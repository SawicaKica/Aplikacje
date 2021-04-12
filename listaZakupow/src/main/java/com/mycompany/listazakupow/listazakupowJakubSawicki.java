/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.Scanner;




/**
 *
 * @author sawic
 */
public class listazakupowJakubSawicki extends javax.swing.JFrame {

    /**
     * Creates new form listazakupow
     */
    public listazakupowJakubSawicki() {
        initComponents();
        addKeyListenertoCoKupiles();
        addKeyToListenerToWartosc();
        addKeyListenerData();
        addKeyListenerWydatki();
        addToolTipElements();
        wczytaj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneListaZakupow = new javax.swing.JTabbedPane();
        jPanelLZ = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanelWP = new javax.swing.JPanel();
        jLabelWpisz = new javax.swing.JLabel();
        jTextFieldWpisz = new javax.swing.JTextField();
        jLabelWpisz1 = new javax.swing.JLabel();
        jTextFieldWpisz1 = new javax.swing.JTextField();
        jLabelWpisz2 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jLabelWpisz3 = new javax.swing.JLabel();
        jTextFieldWpisz3 = new javax.swing.JTextField();
        jLabelWpisz4 = new javax.swing.JLabel();
        jTextFieldWpisz2 = new javax.swing.JTextField();
        jLabelWpisz5 = new javax.swing.JLabel();
        jTextFieldWpisz4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDzisiejszeZakupy = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Twoje zakupy:");

        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanelLZLayout = new javax.swing.GroupLayout(jPanelLZ);
        jPanelLZ.setLayout(jPanelLZLayout);
        jPanelLZLayout.setHorizontalGroup(
            jPanelLZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLZLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelLZLayout.setVerticalGroup(
            jPanelLZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLZLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneListaZakupow.addTab("Lista zakupów", jPanelLZ);

        jLabelWpisz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz.setText("Wpisz co kupiłeś:");

        jLabelWpisz1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz1.setText("Typ zakupionego towaru:");

        jLabelWpisz2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz2.setText("Data zakupu:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "spożywczy", "elektronika", "meblarski" }));

        jLabelWpisz3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz3.setText("Podaj wartość:");

        jLabelWpisz4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz4.setText("Wydatki z tygodnia:");

        jTextFieldWpisz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWpisz2ActionPerformed(evt);
            }
        });

        jLabelWpisz5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelWpisz5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWpisz5.setText("Wydatki z dzisiaj:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPaneDzisiejszeZakupy);

        javax.swing.GroupLayout jPanelWPLayout = new javax.swing.GroupLayout(jPanelWP);
        jPanelWP.setLayout(jPanelWPLayout);
        jPanelWPLayout.setHorizontalGroup(
            jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWPLayout.createSequentialGroup()
                .addGroup(jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWPLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelWPLayout.createSequentialGroup()
                        .addGroup(jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelWPLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelWPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelWpisz3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jLabelWpisz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelWPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWpisz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldWpisz1)
                            .addGroup(jPanelWPLayout.createSequentialGroup()
                                .addComponent(jLabelWpisz1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldWpisz3)
                            .addComponent(jLabelWpisz4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldWpisz2)
                            .addComponent(jLabelWpisz5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldWpisz4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWPLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldWpisz, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanelWPLayout.setVerticalGroup(
            jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWPLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanelWPLayout.createSequentialGroup()
                        .addComponent(jLabelWpisz, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWpisz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWpisz3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWpisz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWpisz1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWpisz2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWpisz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWpisz5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWpisz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelWpisz4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWpisz4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        jTabbedPaneListaZakupow.addTab("Wprowadź zakupy", jPanelWP);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneListaZakupow)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPaneListaZakupow, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldWpisz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWpisz2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWpisz2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileUtils stf = new FileUtils();
        String text = jTextFieldWpisz.getText()+";"+jTextFieldWpisz1.getText()
                +";"+jComboBox.getSelectedItem()+";"+jTextFieldWpisz2.getText();
        stf.saveToFile(text);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(listazakupowJakubSawicki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listazakupowJakubSawicki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listazakupowJakubSawicki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listazakupowJakubSawicki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listazakupowJakubSawicki().setVisible(true);
            }
        });
    }
    private void addKeyListenertoCoKupiles(){
        jTextFieldWpisz.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            //System.out.print("Key Typed"+e.getKeyChar());
               char ch = e.getKeyChar();
               if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122 || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE){
                jTextFieldWpisz.setEditable(true);
               }else {
                jTextFieldWpisz.setEditable(false);
               }
            }
            @Override
            public void keyPressed(KeyEvent e) {
            //System.out.print("Key Pressed"+e.getKeyChar()); 
            }

            @Override
            public void keyReleased(KeyEvent e) {
            
            }
        });
    }
    
    private void addKeyToListenerToWartosc(){
    jTextFieldWpisz1.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            char ch = e.getKeyChar();
            if(ch >= '0' && ch <= '9' || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE){
                jTextFieldWpisz1.setEditable(true);
                System.out.print("NACISNIETO LICZBE"+ch);
            }else{
                jTextFieldWpisz1.setEditable(false);
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });   
    }
    
    private void addKeyListenerData(){
      jTextFieldWpisz2.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldWpisz2.getText();
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE) &&
                        (temp.length() < 10 || ch==KeyEvent.VK_BACK_SPACE)){
                    jTextFieldWpisz2.setEditable(true);
                    if((temp.length() == 4 || temp.length() == 7) && ch != KeyEvent.VK_BACK_SPACE){
                        jTextFieldWpisz2.setText(temp+"-");
                    }
                }else{
                    jTextFieldWpisz2.setEditable(false);
                }
            }
            

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });   
    }
    private void addKeyListenerWydatki(){
      jTextFieldWpisz3.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTextFieldWpisz3.getText();
                char ch = e.getKeyChar();   
                if((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE) &&
                        (temp.length() < 5 || ch==KeyEvent.VK_BACK_SPACE)){
                    jTextFieldWpisz3.setEditable(true);
                    if((temp.length() == 3) && ch != KeyEvent.VK_BACK_SPACE){
                        jTextFieldWpisz3.setText(temp+".");
                    }
                }else{
                    jTextFieldWpisz3.setEditable(false);
                }
            }
            
        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });   
    }
    private void addToolTipElements(){
        jTextFieldWpisz.setToolTipText("<html>"
                +"<h3>Wprowadz tekst</h3>"
                +"<p>Nie uzywaj polskich znakow</p>"
                +"</html>");
       jTextFieldWpisz1.setToolTipText("<html>"
                +"<h3>Wprowadz wartosc podanego produktu</h3>"
                +"<p>Nie uzywaj polskich znakow</p>"
                +"</html>");
       jTextFieldWpisz3.setToolTipText("<html>"
                +"<h3>Wprowadz wydatki z dzisiaj</h3>"
                +"<p>Nie uzywaj polskich znakow</p>"
                +"</html>");
       jTextFieldWpisz2.setToolTipText("<html>"
                +"<h3>Wprowadz date</h3>"
                +"<p>Nie uzywaj polskich znakow</p>"
                +"</html>");
       jTextFieldWpisz4.setToolTipText("<html>"
                +"<h3>Wprowadz wydatki z tygodnia</h3>"
                +"<p>Nie uzywaj polskich znakow</p>"
                +"</html>");
       jComboBox.setToolTipText("<html>"
                +"<h3>Wybierz typ zakupów</h3>"
                +"<p>Wybierz</p>"
                +"</html>");
       jButton1.setToolTipText("<html>"
                +"<h3>Zapisz działanie</h3>"
                +"<p>Zapis</p>"
                +"</html>");
       jTextPaneDzisiejszeZakupy.setToolTipText("<html>"
                +"<h3>Twoje produkty</h3>"
                +"<p>produkty</p>"
                +"</html>");
    }

    private void wczytaj(){
        File f = new File("produkty.txt");
        jComboBox.removeAllItems(); 
        try {
            Scanner sc = new Scanner(f);         
            while(sc.hasNext()){
                String item = sc.nextLine();
                System.out.print(item);
                jComboBox.addItem(item);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelWpisz;
    private javax.swing.JLabel jLabelWpisz1;
    private javax.swing.JLabel jLabelWpisz2;
    private javax.swing.JLabel jLabelWpisz3;
    private javax.swing.JLabel jLabelWpisz4;
    private javax.swing.JLabel jLabelWpisz5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelLZ;
    private javax.swing.JPanel jPanelWP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneListaZakupow;
    private javax.swing.JTextField jTextFieldWpisz;
    private javax.swing.JTextField jTextFieldWpisz1;
    private javax.swing.JTextField jTextFieldWpisz2;
    private javax.swing.JTextField jTextFieldWpisz3;
    private javax.swing.JTextField jTextFieldWpisz4;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPaneDzisiejszeZakupy;
    // End of variables declaration//GEN-END:variables
}
