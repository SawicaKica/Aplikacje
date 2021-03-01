/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kalkulator;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author sawic
 */
public class Kalkulator extends javax.swing.JFrame {
    double l1, l2;
    double wynik;
    String znak;
    String wprowadzona;
    String str;
    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldWynik = new javax.swing.JTextField();
        jButtonPierw = new javax.swing.JButton();
        jButtonPoteg = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonDziel = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenPlik = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuTools = new javax.swing.JMenu();
        jCheckBoxMenuItemDni = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextFieldWynik.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldWynik.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldWynik.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldWynik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonPierw.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPierw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPierw.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPierw.setText("√");
        jButtonPierw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPierwActionPerformed(evt);
            }
        });

        jButtonPoteg.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPoteg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPoteg.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPoteg.setText("x²");
        jButtonPoteg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotegActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 102, 0));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("C");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonSeven.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSeven.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeven.setText("7");
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });

        jButtonFour.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFour.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFour.setText("4");
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourActionPerformed(evt);
            }
        });

        jButtonOne.setBackground(new java.awt.Color(51, 51, 51));
        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonOne.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOne.setText("1");
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });

        jButtonDziel.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDziel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDziel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDziel.setText("÷");
        jButtonDziel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDzielActionPerformed(evt);
            }
        });

        jButtonEight.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEight.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEight.setText("8");
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });

        jButtonPoint.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPoint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPoint.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPoint.setText(".");
        jButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPointActionPerformed(evt);
            }
        });

        jButtonMultiply.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMultiply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMultiply.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMultiply.setText("x");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });

        jButtonFive.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFive.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFive.setText("5");
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiveActionPerformed(evt);
            }
        });

        jButtonNine.setBackground(new java.awt.Color(51, 51, 51));
        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonNine.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNine.setText("9");
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });

        jButtonMinus.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMinus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonTwo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTwo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTwo.setText("2");
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });

        jButtonThree.setBackground(new java.awt.Color(51, 51, 51));
        jButtonThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonThree.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThree.setText("3");
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });

        jButtonPlus.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPlus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonSix.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSix.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSix.setText("6");
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });

        jButtonZero.setBackground(new java.awt.Color(51, 51, 51));
        jButtonZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonZero.setForeground(new java.awt.Color(255, 255, 255));
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonEquals.setBackground(new java.awt.Color(255, 102, 0));
        jButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEquals.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldWynik, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPierw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPoteg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDziel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextFieldWynik, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPierw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPoteg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDziel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenPlik.setText("Plik");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Zapisz (Tylko dla wygladu)");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenPlik.add(jCheckBoxMenuItem1);

        jMenuItem1.setText("Zamknij");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenPlik.add(jMenuItem1);

        jMenuBar1.add(jMenPlik);

        jMenuTools.setText("Tools");

        jCheckBoxMenuItemDni.setSelected(true);
        jCheckBoxMenuItemDni.setText("Ile dni?");
        jCheckBoxMenuItemDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemDniActionPerformed(evt);
            }
        });
        jMenuTools.add(jCheckBoxMenuItemDni);

        jMenuBar1.add(jMenuTools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPotegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotegActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "^";
    }//GEN-LAST:event_jButtonPotegActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldWynik.setText(" ");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSevenActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonSeven.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonSevenActionPerformed

    private void jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFourActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonFour.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonFourActionPerformed

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOneActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonOne.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonOneActionPerformed

    private void jButtonDzielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDzielActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "/";
    }//GEN-LAST:event_jButtonDzielActionPerformed

    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEightActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonEight.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonEightActionPerformed

    private void jButtonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPointActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonPoint.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonPointActionPerformed

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplyActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "x";
    }//GEN-LAST:event_jButtonMultiplyActionPerformed

    private void jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiveActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonFive.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonFiveActionPerformed

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNineActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonNine.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonNineActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "-";
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonTwo.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonTwoActionPerformed

    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThreeActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonThree.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonThreeActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "+";
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSixActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonSix.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonSixActionPerformed

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        wprowadzona = jTextFieldWynik.getText() + jButtonZero.getText();
        jTextFieldWynik.setText(wprowadzona);
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        Obliczenia();
    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonPierwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPierwActionPerformed
        l1 = Double.parseDouble(jTextFieldWynik.getText());
        jTextFieldWynik.setText(" ");
        znak = "pierw";
    }//GEN-LAST:event_jButtonPierwActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        Zapis();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItemDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemDniActionPerformed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyy");
        String data = JOptionPane.showInputDialog("Wprowadz date: ");
        LocalDate Idnow = LocalDate.now();
        LocalDate Idinput = LocalDate.parse(data, formatter);
        System.out.print(Idnow + " " + Idinput);
    }//GEN-LAST:event_jCheckBoxMenuItemDniActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }
    private void Obliczenia(){
        l2 = Double.parseDouble(jTextFieldWynik.getText());
        if(znak.equals("+")){
            wynik = l1 + l2;
            str = Double.toString(wynik);
            jTextFieldWynik.setText(str);
        }else if(znak.equals("-")){
            wynik = l1 - l2;
            str = Double.toString(wynik);
            jTextFieldWynik.setText(str);          
        }else if(znak.equals("x")){
            wynik = l1 * l2;
            str = Double.toString(wynik);
            jTextFieldWynik.setText(str);
        }else if(znak.equals("/")){
            wynik = l1 / l2;
            if(l2 == 0){
                jTextFieldWynik.setText("Błąd!");;
            }else{
                str = Double.toString(wynik);
                jTextFieldWynik.setText(str);
            }
        }else if(znak.equals("^")){
            wynik = Math.pow(l1, l2);
            str = Double.toString(wynik);
            jTextFieldWynik.setText(str);
        }if(znak.equals("pierw")){
                wynik = Math.sqrt(l1);            
            if(l1 < 0){
                jTextFieldWynik.setText("Błąd!");
            }else{
                str = Double.toString(wynik);
                jTextFieldWynik.setText(str);
            }
        }        
    }
    private void Zapis(){
        File f = new File("zapis.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f,true);
            fw.append(l1 + " + " + l2 + " = " + jTextFieldWynik.getText());
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }      
    }
    File Save = new File("Zapis.txt");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDziel;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPierw;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPoint;
    private javax.swing.JButton jButtonPoteg;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemDni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenPlik;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuTools;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldWynik;
    // End of variables declaration//GEN-END:variables

    private static class jOptionPane {

        private static void showInputDialog(String wprowadz_date_w_formacie_dd_mm_yy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public jOptionPane() {
        }
    }
}
