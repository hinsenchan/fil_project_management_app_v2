/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.frugalinnovationlab.view;

import com.src.frugalinnovationlab.Controller.EditParticipantController;
import com.src.frugalinnovationlab.Entity.Participants;
import java.util.List;
import javax.swing.JOptionPane;
import com.src.frugalinnovationlab.Wrappers.ComboItem;
import com.src.frugalinnovationlab.helper.EmailFormatValidator;
import com.src.frugalinnovationlab.helper.PhoneNumberValidator;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author diptik
 */
public class EditParticipantPanel extends javax.swing.JPanel {

    EditParticipantController editParticipantController;
    List<Participants> participants;

    /**
     * Creates new form AddNewUserPanel
     */
    public EditParticipantPanel() {
        //System.out.println("AddNewParticipantPanel");
        editParticipantController = new EditParticipantController(this);
        participants = editParticipantController.getParticipantsFromDatabase();
        this.sortParticipants();
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

        centerPanel = new javax.swing.JPanel();
        addNewUserTextArea = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        designationLabel = new javax.swing.JLabel();
        designationTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        middlenameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        logoLabel2 = new javax.swing.JLabel();
        designationLabel1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        designationLabel2 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        organizationTextField = new javax.swing.JTextField();
        designationLabel3 = new javax.swing.JLabel();
        firstNameLabel1 = new javax.swing.JLabel();
        chooseParticipantComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 170, 153), 4));

        centerPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        centerPanel.setInheritsPopupMenu(true);
        centerPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        centerPanel.setRequestFocusEnabled(false);

        addNewUserTextArea.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        addNewUserTextArea.setText("Edit Participants");

        firstNameTextField.setColumns(11);
        firstNameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        firstNameTextField.setToolTipText("Enter First Name");
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.setColumns(11);
        lastNameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lastNameTextField.setToolTipText("Enter Last Name");

        firstNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        firstNameLabel.setText("First Name");

        lastNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lastNameLabel.setText("Last Name");

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 95, 45));
        addButton.setText("Submit Modified Details");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        designationLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        designationLabel.setText("Designation");

        designationTextField.setColumns(11);
        designationTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        designationTextField.setToolTipText("Enter Designation");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Middle Name");

        middlenameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        middlenameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Title");

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 95, 45));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a Title", "Mr.", "Mrs.", "Miss.", "Dr." }));

        logoLabel2.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scu-mission.png"))); // NOI18N

        designationLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        designationLabel1.setText("Email");

        emailTextField.setColumns(11);
        emailTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        emailTextField.setToolTipText("Enter Designation");

        designationLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        designationLabel2.setText("Phone");

        phoneTextField.setColumns(11);
        phoneTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        phoneTextField.setToolTipText("Enter Designation");

        organizationTextField.setColumns(11);
        organizationTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        organizationTextField.setToolTipText("Enter Designation");

        designationLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        designationLabel3.setText("Organization");

        firstNameLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        firstNameLabel1.setText("Select Participant");

        chooseParticipantComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        chooseParticipantComboBox.setForeground(new java.awt.Color(0, 95, 45));
        chooseParticipantComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chooseParticipantComboBoxItemStateChanged(evt);
            }
        });
        chooseParticipantComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseParticipantComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNewUserTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(centerPanelLayout.createSequentialGroup()
                                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameLabel)
                                    .addComponent(firstNameLabel)
                                    .addComponent(designationLabel)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(designationLabel1)
                                    .addComponent(designationLabel3)
                                    .addComponent(designationLabel2))
                                .addGap(57, 57, 57)
                                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(designationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(phoneTextField)
                                        .addComponent(organizationTextField)
                                        .addComponent(firstNameTextField)
                                        .addComponent(middlenameTextField))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooseParticipantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(firstNameLabel1)))
                .addGap(18, 18, 18)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(logoLabel2))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(addNewUserTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel1)
                            .addComponent(chooseParticipantComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middlenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designationLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designationLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(organizationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designationLabel3)))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(addButton)))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        chooseParticipantComboBox.removeAllItems();
        chooseParticipantComboBox.addItem(new ComboItem("Select Participant", ""));
        this.sortParticipants();
        for(int i = 0; i < participants.size(); i++){
            String fullName = participants.get(i).getLastname().concat(", "+participants.get(i).getFirstname()).concat(" " +participants.get(i).getNameTitle());
            chooseParticipantComboBox.addItem(new ComboItem(fullName, Integer.toString(participants.get(i).getId())));
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String[] array = new String[9];
        array[0] = jComboBox1.getSelectedItem().toString();
        array[1] = firstNameTextField.getText();
        array[2] = middlenameTextField.getText();
        array[3] = lastNameTextField.getText();
        array[4] = designationTextField.getText();
        array[5] = emailTextField.getText();
        array[6] = phoneTextField.getText();
        array[7] = organizationTextField.getText();
        Object participantItem = chooseParticipantComboBox.getSelectedItem();
        array[8] = ((ComboItem) participantItem).getValue();

        if (chooseParticipantComboBox.getSelectedItem().toString().equals("Select Participant")) {
            JOptionPane.showMessageDialog(this, "Please select a participant first");
        }
        else if (array[1] == null || array[1].equals("") 
                || array[3] == null || array[3].equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter first and last name");
        } 
        else if (array[0] == null || array[0].equals("Choose a Title")) {
            JOptionPane.showMessageDialog(this, "Please choose a title");
        }
        else if (!array[5].isEmpty() && !(new EmailFormatValidator()).validate(array[5])) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address");
        }
        else if (!array[6].isEmpty() && !PhoneNumberValidator.validatePhoneNumber(array[6])) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number");
        } else {
            boolean success = editParticipantController.addParticipant(array);
            if (success) {
                participants = editParticipantController.getParticipantsFromDatabase();
                this.sortParticipants();
                chooseParticipantComboBox.removeAll();
                chooseParticipantComboBox.addItem(new ComboItem("Select Participant", ""));
                for (int i = 0; i < participants.size(); i++) {
                    String fullName = participants.get(i).getNameTitle().concat(" "
                            + participants.get(i).getFirstname()).concat(" " + participants.get(i).getLastname());
                    chooseParticipantComboBox.addItem(new ComboItem(fullName, Integer.toString(participants.get(i).getId())));
                }
                firstNameTextField.setText("");
                middlenameTextField.setText("");
                lastNameTextField.setText("");
                designationTextField.setText("");
                emailTextField.setText("");
                phoneTextField.setText("");
                organizationTextField.setText("");
                jComboBox1.setSelectedIndex(0);
                chooseParticipantComboBox.setSelectedIndex(0);
                JOptionPane.showMessageDialog(centerPanel, "Participant details modified succesfully");

            } else {
                JOptionPane.showMessageDialog(centerPanel, "Participant details could not be modified");
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void middlenameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameTextFieldActionPerformed

    private void chooseParticipantComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chooseParticipantComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseParticipantComboBoxItemStateChanged

    private void chooseParticipantComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseParticipantComboBoxActionPerformed
        // TODO add your handling code here:
        Object participantItem = chooseParticipantComboBox.getSelectedItem();
        String participantValue = ((ComboItem) participantItem).getValue();
        //System.out.println("value : " + participantValue);
        if (!participantValue.equals("")) {
            List participantsList = editParticipantController.fetchParticipantsById(participantValue);
            //System.out.println("size : " + participantsList.size());
            for (int i = 0; i < participantsList.size(); i++) {
                Object[] values = (Object[]) participantsList.get(i);
                //System.out.println(i + " -- " + values[0] + "; " + values[1]);
                firstNameTextField.setText(values[1].toString());
                middlenameTextField.setText(values[4].toString());
                lastNameTextField.setText(values[2].toString());
                designationTextField.setText(values[8].toString());
                emailTextField.setText(values[5].toString());
                phoneTextField.setText(values[6].toString());
                organizationTextField.setText(values[7].toString());
                jComboBox1.setSelectedItem(values[0].toString());
            }
        }


    }//GEN-LAST:event_chooseParticipantComboBoxActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addNewUserTextArea;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JComboBox chooseParticipantComboBox;
    private javax.swing.JLabel designationLabel;
    private javax.swing.JLabel designationLabel1;
    private javax.swing.JLabel designationLabel2;
    private javax.swing.JLabel designationLabel3;
    private javax.swing.JTextField designationTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JTextField middlenameTextField;
    private javax.swing.JTextField organizationTextField;
    private javax.swing.JTextField phoneTextField;
    // End of variables declaration//GEN-END:variables

    public void sortParticipants() {
        if (participants != null) {
            Collections.sort(participants, new ParticipantsComparator());
        }
    }
    
    class ParticipantsComparator implements Comparator<Participants> {
        public int compare(Participants a, Participants b) {
            int retVal = -1;
            retVal = a.getLastname().compareToIgnoreCase(b.getLastname());
            if (retVal != 0) { return retVal; }
            else {
                return a.getFirstname().compareTo(b.getFirstname());
            }
        }
    }
}
