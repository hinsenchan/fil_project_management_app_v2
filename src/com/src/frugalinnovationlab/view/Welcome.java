/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.frugalinnovationlab.view;

import com.src.frugalinnovationlab.Entity.Users;
import com.src.frugalinnovationlab.helper.Constants;
import java.net.URL;
import java.util.prefs.Preferences;
import javax.swing.ImageIcon;
import javax.swing.tree.TreePath;

/**
 *
 * @author diptik
 */
public class Welcome extends javax.swing.JFrame {

    final AddNewUserPanel addNewUserPanel = new AddNewUserPanel();
    final ViewAllUsersPanel viewAllUsersPanel = new ViewAllUsersPanel();
    final AddNewProjectPanel addNewProjectPanel = new AddNewProjectPanel();
    final ViewAllProjectsPanel viewAllProjectsPanel = new ViewAllProjectsPanel();
    final ViewSpecificUserPanel ViewSpecificUserPanel = new ViewSpecificUserPanel();
    final SearchPanel searchPanel = new SearchPanel();
    final AddNewParticipantPanel addNewParticipantPanel = new AddNewParticipantPanel();
    final AdvancedSearchPanel advancedSearchPanel = new AdvancedSearchPanel();
    Users user;
    ManageAccountInfoPanel manageAccountInfoPanel = new ManageAccountInfoPanel();
    EditGeneralProjectInformation editGeneralProjectInformation;
    final EditProjectMultimedia editProjectMultimedia = new EditProjectMultimedia();
    final EditProjectParticipants editProjectParticipants = new EditProjectParticipants();
    ViewGeneralProjectInformation viewGeneralProjectInformation;
    ViewProjectParticipants viewProjectParticipants;
    ViewParticipantDetails viewParticipantDetails;
    Preferences prefs = Preferences.userNodeForPackage(com.src.frugalinnovationlab.Service.LoginService.class);
    String userType = "";
    /**
     * Creates new form Welcome
     */
    static String lastComponent = "";

    public Welcome() {
        //URL iconURL = getClass().getResource("http://icons.iconarchieve.com/icons/artua/mac/512/Setting-icon.png");
// iconURL is null when not found
        //ImageIcon icon = new ImageIcon(iconURL);
        //this.setIconImage(icon.getImage());
        initComponents();
        welcome.setText("Welcome ".concat(prefs.get(Constants.FULL_NAME, "Guest")));
        userType = Constants.USER_TYPE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMainPanel = new javax.swing.JPanel();
        menuTreePanel = new javax.swing.JPanel();
        menuTreeScrollPane = new javax.swing.JScrollPane();
        optionsMenuTree = new javax.swing.JTree();
        contentPanel = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        logoLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        manageAccountButton = new javax.swing.JButton();
        logoLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuTreePanel.setBackground(new java.awt.Color(153, 51, 0));

        optionsMenuTree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 4));
        optionsMenuTree.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Frugal Lab");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Project");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add New Project");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("View All Projects");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add Participant");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Edit Project");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("General Info");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Participants");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Multimedia");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("View Project");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("General Info");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Participants");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Multimedia");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Users");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Add New User");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("View All Users");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Explore");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Search");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Advanced Search");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        optionsMenuTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        optionsMenuTree.setToolTipText("Explore");
        optionsMenuTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optionsMenuTreeMouseClicked(evt);
            }
        });
        optionsMenuTree.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                optionsMenuTreeTreeExpanded(evt);
            }
        });
        menuTreeScrollPane.setViewportView(optionsMenuTree);

        javax.swing.GroupLayout menuTreePanelLayout = new javax.swing.GroupLayout(menuTreePanel);
        menuTreePanel.setLayout(menuTreePanelLayout);
        menuTreePanelLayout.setHorizontalGroup(
            menuTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTreePanelLayout.createSequentialGroup()
                .addComponent(menuTreeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuTreePanelLayout.setVerticalGroup(
            menuTreePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTreeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 170, 153), 4));
        contentPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contentPanel.setInheritsPopupMenu(true);
        contentPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        contentPanel.setPreferredSize(new java.awt.Dimension(600, 600));
        contentPanel.removeAll();
        contentPanel.setRequestFocusEnabled(false);

        welcome.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        welcome.setText("Welcome.");

        logoLabel2.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scu-mission.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsz_1family.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcome)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(308, 308, 308)
                    .addComponent(logoLabel2)
                    .addContainerGap(308, Short.MAX_VALUE)))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(welcome)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(logoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 4));

        logoLabel.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Frugal_Blk_BriteRed_72dpi.jpg"))); // NOI18N

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/signoutbutton.png"))); // NOI18N
        logoutButton.setToolTipText("");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        manageAccountButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        manageAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/manageaccountbutton.png"))); // NOI18N
        manageAccountButton.setToolTipText("");
        manageAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountButtonActionPerformed(evt);
            }
        });

        logoLabel1.setBackground(new java.awt.Color(255, 255, 255));
        logoLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Squares.jpg"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(logoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addComponent(manageAccountButton)
                        .addGap(16, 16, 16))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel1)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageAccountButton))
                    .addComponent(logoLabel)))
        );

        javax.swing.GroupLayout welcomeMainPanelLayout = new javax.swing.GroupLayout(welcomeMainPanel);
        welcomeMainPanel.setLayout(welcomeMainPanelLayout);
        welcomeMainPanelLayout.setHorizontalGroup(
            welcomeMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomeMainPanelLayout.createSequentialGroup()
                .addComponent(menuTreePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        welcomeMainPanelLayout.setVerticalGroup(
            welcomeMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, welcomeMainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(welcomeMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuTreePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionsMenuTreeTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_optionsMenuTreeTreeExpanded
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsMenuTreeTreeExpanded

    private void optionsMenuTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsMenuTreeMouseClicked
        // TODO add your handling code here:
        getContentPanel().setLayout(new java.awt.BorderLayout());
        TreePath path = optionsMenuTree.getPathForLocation(evt.getX(), evt.getY());
        System.out.println("path : " + path);
        if (path != null) {
            System.out.println("lastcomponent : " + lastComponent);
            getContentPanel().removeAll();
            // Check the last added component and remove it
            if (!lastComponent.equals("")) {
                if (lastComponent.equals("Add New Project")) {
                    getContentPanel().remove(addNewProjectPanel);
                } else if (lastComponent.equals("View All Projects")) {
                    getContentPanel().remove(viewAllProjectsPanel);
                } else if (lastComponent.equals("Add Participant")) {
                    getContentPanel().remove(addNewParticipantPanel);
                } else if (lastComponent.equals("Add New User")) {
                    getContentPanel().remove(addNewUserPanel);
                } else if (lastComponent.equals("View All Users")) {
                    getContentPanel().remove(viewAllUsersPanel);
                } else if (lastComponent.equals("Advanced Search")) {
                    getContentPanel().remove(advancedSearchPanel);
                } else if (lastComponent.equals("Search")) {
                    getContentPanel().remove(searchPanel);
                } else if (lastComponent.equals("Multimedia")) {
                    getContentPanel().remove(editProjectMultimedia);
                } else if (lastComponent.equals("Edit Project Participants")) {
                    getContentPanel().remove(editProjectParticipants);
                } else if (lastComponent.equals("Edit Project General Info")) {
                    getContentPanel().remove(editGeneralProjectInformation);
                } else if (lastComponent.equals("View Project General Info")) {
                    getContentPanel().remove(viewGeneralProjectInformation);
                } else if (lastComponent.equals("View Project Participants")) {
                    getContentPanel().remove(viewProjectParticipants);
                } else if (lastComponent.equals("View Participant Details")) {
                    getContentPanel().remove(viewParticipantDetails);
                }                

            }
            // Add the new component on the frame
            // Depending on the Selected Tree Node
            if (path.toString().contains("Add New Project")) {
                getContentPanel().add(new AddNewProjectPanel());
                lastComponent = "Add New Project";
            } else if (path.toString().contains("View All Projects")) {
                getContentPanel().add(new ViewAllProjectsPanel());
                lastComponent = "View All Projects";
            } else if (path.toString().contains("Add Participant")) {
                getContentPanel().add(new AddNewParticipantPanel());

                lastComponent = "Add Participant";
            } else if (path.toString().contains("Add New User")) {
                getContentPanel().add(new AddNewUserPanel());
                lastComponent = "Add New User";
            } else if (path.toString().contains("View All Users")) {
                getContentPanel().add(new ViewAllUsersPanel());
                lastComponent = "View All Users";
            } else if (path.toString().contains("Advanced Search")) {
                getContentPanel().add(new AdvancedSearchPanel());
                lastComponent = "Advanced Search";
            } else if (path.toString().contains("Search")) {
                getContentPanel().add(new SearchPanel());
                lastComponent = "Search";
            } else if (path.toString().contains("Multimedia")) {
                getContentPanel().add(new EditProjectMultimedia());
                lastComponent = "Multimedia";
            } else if (path.toString().contains("Edit Project") && path.toString().contains("Participants")) {
                getContentPanel().add(new EditProjectParticipants());
                lastComponent = "Edit Project Participants";
            } else if (path.toString().contains("Edit Project") && path.toString().contains("General Info")) {
                editGeneralProjectInformation = new EditGeneralProjectInformation();
                getContentPanel().add(editGeneralProjectInformation);
                lastComponent = "Edit Project General Info";
            } else if (path.toString().contains("View Project") && path.toString().contains("General Info")) {
                viewGeneralProjectInformation = new ViewGeneralProjectInformation(this);
                getContentPanel().add(viewGeneralProjectInformation);
                lastComponent = "View Project General Info";
            } else if (path.toString().contains("View Project") && path.toString().contains("Participants")) {
                viewProjectParticipants = new ViewProjectParticipants(this);
                getContentPanel().add(viewProjectParticipants);
                lastComponent = "View Project Participants";
            }
            
            getContentPanel().revalidate();
            getContentPanel().repaint();
        }
    }//GEN-LAST:event_optionsMenuTreeMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        prefs.remove(Constants.USER_NAME);
        prefs.remove(Constants.PERSISTENCE_UNIT_NAME);
        prefs.remove(Constants.FULL_NAME);
        prefs.remove(Constants.USER_TYPE);
        new Login().setVisible(true);
        dispose();

    }//GEN-LAST:event_logoutButtonActionPerformed

    private void manageAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountButtonActionPerformed
        getContentPanel().setLayout(new java.awt.BorderLayout());
        getContentPanel().removeAll();
        manageAccountInfoPanel = new ManageAccountInfoPanel(user);
        getContentPanel().add(manageAccountInfoPanel);
        getContentPanel().revalidate();
        getContentPanel().repaint();
    }//GEN-LAST:event_manageAccountButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoLabel1;
    private javax.swing.JLabel logoLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton manageAccountButton;
    private javax.swing.JPanel menuTreePanel;
    private javax.swing.JScrollPane menuTreeScrollPane;
    private javax.swing.JTree optionsMenuTree;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel welcomeMainPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the contentPanel
     */
    public javax.swing.JPanel getContentPanel() {
        return contentPanel;
    }
    
    public String getLastComponent() {
        return lastComponent;
    }
    
    public void setLastComponent(String lastComponent) {
        this.lastComponent = lastComponent;
    }
    
    public ViewParticipantDetails getViewParticipantDetails() {
        return viewParticipantDetails;
    }
    
    public void setViewParticipantDetails(ViewParticipantDetails viewParticipantDetails) {
        this.viewParticipantDetails = viewParticipantDetails;
    }
    
    public ViewProjectParticipants getViewProjectParticipants() {
        return viewProjectParticipants;
    }
    
    public void setViewProjectParticipants(ViewProjectParticipants viewProjectParticipants) {
        this.viewProjectParticipants = viewProjectParticipants;
    }

    public ViewGeneralProjectInformation getViewGeneralProjectInformation() {
        return viewGeneralProjectInformation;
    }
    
    public void setViewGeneralProjectInformation(ViewGeneralProjectInformation viewGeneralProjectInformation) {
        this.viewGeneralProjectInformation = viewGeneralProjectInformation;
    }    
}
