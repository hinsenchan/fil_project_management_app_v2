/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.src.frugalinnovationlab.view;

import com.src.frugalinnovationlab.Controller.ViewProjectParticipantsController;
import com.src.frugalinnovationlab.Entity.ParticipantDesignation;
import com.src.frugalinnovationlab.Entity.Participants;
import com.src.frugalinnovationlab.Entity.Project;
import com.src.frugalinnovationlab.Entity.ProjectParticipants;
import com.src.frugalinnovationlab.Wrappers.ComboItem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hinsen Chan
 */
public class ViewProjectParticipants extends javax.swing.JPanel {
    ViewProjectParticipantsController viewProjectParticipantsController;
    List<Project> projectList;
    List<ParticipantDesignation> participantDesignationsList;
    List<Participants> participants;
    DefaultTableModel model = new DefaultTableModel();
    ArrayList<ProjectParticipants> participantsList = new ArrayList<ProjectParticipants>();
    Welcome mainApplication;
    private String participantValue;

    /**
     * Creates new form ViewProjectParticipants
     */
    public ViewProjectParticipants(Welcome welcome) {
        mainApplication = welcome;
        viewProjectParticipantsController = new ViewProjectParticipantsController(this);
        projectList = viewProjectParticipantsController.getProjectsFromDatabase();
        participantDesignationsList = viewProjectParticipantsController.getParticipantsDesignationFromDatabase();
        participants = viewProjectParticipantsController.getParticipantsFromDatabase();        
        initComponents();                
        table.getSelectionModel().addListSelectionListener(viewProjectParticipantsController);
        refreshSelectedProject();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainScrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        addNewProjectLabel = new javax.swing.JLabel();
        projectNameLabel = new javax.swing.JLabel();
        participantNameLabel = new javax.swing.JLabel();
        chooseProjectComboBox = new javax.swing.JComboBox();
        roleComboBox = new javax.swing.JComboBox();
        logoLabel2 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        tableScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        addNewProjectLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        addNewProjectLabel.setText("View Project Participants");

        projectNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        projectNameLabel.setText("Project Name");

        participantNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        participantNameLabel.setText("Participant Role");

        chooseProjectComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        chooseProjectComboBox.setForeground(new java.awt.Color(0, 95, 45));
        chooseProjectComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a project..." }));
        for (int i = 0; i < projectList.size(); i++) {
            chooseProjectComboBox.addItem(new ComboItem(projectList.get(i).getName(),
                String.valueOf(projectList.get(i).getId())));
    }
    chooseProjectComboBox.setMaximumSize(new java.awt.Dimension(200, 200));
    chooseProjectComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            chooseProjectComboBoxActionPerformed(evt);
        }
    });

    roleComboBox.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
    roleComboBox.setForeground(new java.awt.Color(0, 95, 45));
    roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Roles" }));
    for (int i = 0; i < participantDesignationsList.size(); i++) {
        roleComboBox.addItem(new ComboItem(participantDesignationsList.get(i).getName(),
            String.valueOf(participantDesignationsList.get(i).getId())));
    }
    roleComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            roleComboBoxActionPerformed(evt);
        }
    });

    logoLabel2.setBackground(new java.awt.Color(255, 255, 255));
    logoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scu-mission.png"))); // NOI18N

    javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
    topPanel.setLayout(topPanelLayout);
    topPanelLayout.setHorizontalGroup(
        topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(topPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addNewProjectLabel)
                .addGroup(topPanelLayout.createSequentialGroup()
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(projectNameLabel)
                        .addComponent(participantNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(49, 49, 49)
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chooseProjectComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roleComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
            .addComponent(logoLabel2)
            .addContainerGap())
    );

    topPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chooseProjectComboBox, roleComboBox});

    topPanelLayout.setVerticalGroup(
        topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(topPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(topPanelLayout.createSequentialGroup()
                    .addComponent(logoLabel2)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(topPanelLayout.createSequentialGroup()
                    .addComponent(addNewProjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(projectNameLabel)
                        .addComponent(chooseProjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(participantNameLabel)
                        .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(75, Short.MAX_VALUE))))
    );

    topPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chooseProjectComboBox, roleComboBox});

    bottomPanel.setBackground(new java.awt.Color(255, 255, 255));

    table.setAutoCreateRowSorter(true);
    table.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Name", "Role"
        }
    ) {
        Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class
        };
        boolean[] canEdit = new boolean [] {
            false, false
        };

        public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
        }

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tableScrollPane.setViewportView(table);

    javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
    bottomPanel.setLayout(bottomPanelLayout);
    bottomPanelLayout.setHorizontalGroup(
        bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(bottomPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGap(261, 261, 261))
    );
    bottomPanelLayout.setVerticalGroup(
        bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(bottomPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGap(65, 65, 65))
    );

    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(mainPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    mainPanelLayout.setVerticalGroup(
        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(mainPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(bottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    mainScrollPane.setViewportView(mainPanel);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(mainScrollPane)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(mainScrollPane)
    );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseProjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseProjectComboBoxActionPerformed
        // TODO add your handling code here:
        Object projectItem = getChooseProjectComboBox().getSelectedItem();
          //System.out.println("object item : " +projectItem);
        
        if (!projectItem.toString().equals("Choose a project...")) {        
            String projectId = String.valueOf(((ComboItem) projectItem).getValue());
            //System.out.println("project id : " + projectId);
        
            if (model.getRowCount() > 0) {
                for (int i = model.getRowCount() - 1; i > -1; i--) {
                    model.removeRow(i);
                }
            }
            List result = viewProjectParticipantsController.fetchParticipantsByProject(projectId);
            participantsList.clear();
            for (int i = 0; i < result.size(); i++) {
                Object[] values = (Object[]) result.get(i);
                participantValue = String.valueOf(values[3]);
                String participantItem = values[0].toString().concat(" ").concat(values[1].toString())
                .concat(" ").concat(values[2].toString());
                String roleValue = values[4].toString();
                String roleItem = values[5].toString();
                ProjectParticipants a = new ProjectParticipants(Integer.parseInt(projectId), Integer.parseInt(getParticipantValue()),
                    Integer.parseInt(roleValue));
                participantsList.add(a);
                //Object[] row = {participantValue, participantItem, roleValue, roleItem};
                Object[] row = {participantItem, roleItem};
                model = (DefaultTableModel) table.getModel();
                model.addRow(row);
            }

            mainApplication.setSelectedProject(chooseProjectComboBox.getSelectedItem().toString());
            mainApplication.getViewGeneralProjectInformation().refreshSelectedProject();
        }
    }//GEN-LAST:event_chooseProjectComboBoxActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        Object projectItem = getChooseProjectComboBox().getSelectedItem();
        //  System.out.println("object item : " +projectItem);
        String projectId = String.valueOf(((ComboItem) projectItem).getValue());
        //  System.out.println("project id : " + projectId);

        Object roleItem = roleComboBox.getSelectedItem();
        //String roleID = String.valueOf(((ComboItem) roleItem).getValue());
        
        if (model.getRowCount() > 0) {
            for (int i = model.getRowCount() - 1; i > -1; i--) {
                model.removeRow(i);
            }
        }
        
        List result = viewProjectParticipantsController.fetchParticipantsByProject(projectId);
        participantsList.clear();
        
        if (roleItem.toString().equals("All Roles")) {
            for (int i = 0; i < result.size(); i++) {
                Object[] values = (Object[]) result.get(i);
                String participantValue = String.valueOf(values[3]);
                String participantItem = values[0].toString().concat(" ").concat(values[1].toString())
                .concat(" ").concat(values[2].toString());
                String roleValue = values[4].toString();
                String role = values[5].toString();

                ProjectParticipants a = new ProjectParticipants(Integer.parseInt(projectId), Integer.parseInt(participantValue),
                    Integer.parseInt(roleValue));
                participantsList.add(a);
                //Object[] row = {participantValue, participantItem, roleValue, roleItem};
                Object[] row = {participantItem, role};
                model = (DefaultTableModel) table.getModel();
                model.addRow(row);
            }            
        }
        else {
            for (int i = 0; i < result.size(); i++) {
                Object[] values = (Object[]) result.get(i);
                String participantValue = String.valueOf(values[3]);
                String participantItem = values[0].toString().concat(" ").concat(values[1].toString())
                .concat(" ").concat(values[2].toString());
                String roleValue = values[4].toString();
                String role = values[5].toString();

                if (role.equals(roleItem.toString())) {
                    ProjectParticipants a = new ProjectParticipants(Integer.parseInt(projectId), Integer.parseInt(participantValue),
                        Integer.parseInt(roleValue));
                    participantsList.add(a);
                    //Object[] row = {participantValue, participantItem, roleValue, roleItem};
                    Object[] row = {participantItem, role};
                    model = (DefaultTableModel) table.getModel();
                    model.addRow(row);
                }            
            }
        }
    }//GEN-LAST:event_roleComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addNewProjectLabel;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JComboBox chooseProjectComboBox;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPane;
    private javax.swing.JLabel participantNameLabel;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
    
    public Welcome getMainApplication() {
        return mainApplication;
    }
    
    public JTable getTable() {
        return table;
    }

    /**
     * @return the participantValue
     */
    public String getParticipantValue() {
        return participantValue;
    }

    /**
     * @return the chooseProjectComboBox
     */
    public javax.swing.JComboBox getChooseProjectComboBox() {
        return chooseProjectComboBox;
    }

    /**
     * @param chooseProjectComboBox the chooseProjectComboBox to set
     */
    public void setChooseProjectComboBox(javax.swing.JComboBox chooseProjectComboBox) {
        this.chooseProjectComboBox = chooseProjectComboBox;
    }
    
    public void refreshSelectedProject() {
        String selectedProject = mainApplication.getSelectedProject();
        if (selectedProject != null) {
            int index = findSelectedProject(selectedProject);
            if (index > -1) {
                getChooseProjectComboBox().setSelectedIndex(index);
            }
        }
    }
    
    public int findSelectedProject(String selectedProject) {
        if (selectedProject != null) {
            for (int i=0; i<chooseProjectComboBox.getItemCount(); i++) {
                if (chooseProjectComboBox.getItemAt(i).toString().equals(selectedProject)) {
                    return i;                    
                }
            }
        }
        return -1;
    }    
}
