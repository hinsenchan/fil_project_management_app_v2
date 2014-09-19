/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.frugalinnovationlab.view;

import com.src.frugalinnovationlab.Controller.EditProjectController;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hinsen Chan
 */
public class EditProjectPanel extends javax.swing.JPanel {
    private Welcome mainApplication;
    private EditProjectController editProjectController;

    //default constructor
    public EditProjectPanel(Welcome welcome) {
        initComponents();
        //set reference to main app class
        this.mainApplication = welcome;
        //set reference to controller for this panel
        editProjectController = new EditProjectController(this);
        //set model for this table
        updateTable();
        //add this panel's controller as observer for this table
        jTable1.getSelectionModel().addListSelectionListener(editProjectController);          
    }

    //update table data from controller
    public void updateTable() {
        jTable1.setModel(editProjectController.getTableModel());        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewAllProjectsLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        logoLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 170, 153), 4));
        setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 600));

        viewAllProjectsLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        viewAllProjectsLabel.setText("Edit Projects");

        tablePanel.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Archive Project");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Activate Project");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoLabel2.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scu-mission.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(viewAllProjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(logoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAllProjectsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String projectName = jTable1.getModel().getValueAt(row, 0).toString();
        boolean success = editProjectController.activateProject(projectName);
        if(success) {
            updateTable();
            mainApplication.getContentPanel().remove(mainApplication.getEditProjectPanel());
            mainApplication.setEditProjectPanel(new EditProjectPanel(mainApplication));
            mainApplication.getContentPanel().add(mainApplication.getEditProjectPanel()); 
            mainApplication.getContentPanel().revalidate();
            mainApplication.getContentPanel().repaint();
            JOptionPane.showMessageDialog(tablePanel, projectName+ " is Activated !!");
        } else {
            JOptionPane.showMessageDialog(tablePanel, projectName+ " is not Activated !!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String projectName = jTable1.getModel().getValueAt(row, 0).toString();
        boolean success = editProjectController.deleteProject(projectName);
        if(success) {
            updateTable();
            mainApplication.getContentPanel().remove(mainApplication.getEditProjectPanel());
            mainApplication.setEditProjectPanel(new EditProjectPanel(mainApplication));
            mainApplication.getContentPanel().add(mainApplication.getEditProjectPanel()); 
            mainApplication.getContentPanel().revalidate();
            mainApplication.getContentPanel().repaint();
            JOptionPane.showMessageDialog(tablePanel, projectName+ " is Archieved !!");
        } else {
            JOptionPane.showMessageDialog(tablePanel, projectName+ " is not Archieved !!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel viewAllProjectsLabel;
    // End of variables declaration//GEN-END:variables
    //return reference to main app class
    public Welcome getMainApplication() {
        return mainApplication;
    }
    //return table in this panel
    public JTable getJTable() {
        return jTable1;
    }
}
