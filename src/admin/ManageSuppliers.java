/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import dao.Statistics;
import dao.SupplierDao;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ManageSuppliers extends javax.swing.JFrame {

    /**
     * Creates new form ManageSuppliers
     */
    Color textPrimaryColor = new Color(102, 120, 138);
    Color primaryColor = new Color(42, 58, 73);
    int xx, xy;
    DefaultTableModel model;
    SupplierDao supplier = new SupplierDao();
    int rowIndex;
    Statistics statistics = new Statistics();

    public ManageSuppliers() {
        initComponents();
        suppliersTable();
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
        btnClose = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        passAgainField = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        disablePassAgain = new javax.swing.JLabel();
        disablePass = new javax.swing.JLabel();
        enablePass = new javax.swing.JLabel();
        enablePassAgain = new javax.swing.JLabel();
        countryField = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 118, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 744));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("x");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Supplier ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(204, 204, 204));
        idField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 302, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        usernameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 302, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 302, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 300, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enter Password Again");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(passAgainField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 300, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        phoneField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 302, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Country");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 102, 102));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Clear");
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 300, 40));

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Update");
        btnSave.setBorderPainted(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 140, 40));

        disablePassAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        disablePassAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disablePassAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disablePassAgainMouseClicked(evt);
            }
        });
        jPanel1.add(disablePassAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, 30));

        disablePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        disablePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disablePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disablePassMouseClicked(evt);
            }
        });
        jPanel1.add(disablePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, 30));

        enablePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        enablePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enablePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enablePassMouseClicked(evt);
            }
        });
        jPanel1.add(enablePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        enablePassAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        enablePassAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enablePassAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enablePassAgainMouseClicked(evt);
            }
        });
        jPanel1.add(enablePassAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 30, 30));

        countryField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(countryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 302, 30));

        btnBack1.setBackground(new java.awt.Color(153, 153, 153));
        btnBack1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Delete");
        btnBack1.setBorderPainted(false);
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 140, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("______________________________________________________________________________________________________________________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 720, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier ID", "Username", "Email", "Password", "Phone", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 690, 190));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 310, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void suppliersTable() {
        supplier.getSuppliersValue(jTable1, "");
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.BLACK);
        jTable1.setBackground(Color.WHITE);
        jTable1.setSelectionBackground(Color.LIGHT_GRAY);
    }

    private void clear() {
        idField.setText(String.valueOf(supplier.getMaxRow()));
        usernameField.setText("");
        emailField.setText("");
        phoneField.setText("");
        passField.setText("");
        passAgainField.setText("");
        countryField.setText("");
        jTable1.clearSelection();
        statistics.admin();
    }

    public boolean isEmpty() {
        if (usernameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a supplier", "Warning", 2);
            return false;
        }

        if (emailField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email address is required", "Warning", 2);
            return false;
        }

        if (!emailField.getText().matches("^.+@.+\\..+$")) {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Warning", 2);
            return false;
        }

        if (String.valueOf(passField.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required", "Warning", 2);
            return false;
        }
        if (!String.valueOf(passField.getPassword()).matches(String.valueOf(passAgainField.getPassword()))) {
            JOptionPane.showMessageDialog(this, "Password and password again field must be matched", "Warning", 2);
            return false;
        }

        if (phoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Phone number is required", "Warning", 2);
            return false;
        }

        if (phoneField.getText().length() > 11 || phoneField.getText().length() < 9) {
            JOptionPane.showMessageDialog(this, "Phone number must be equal 10 character", "Warning", 2);
            return false;
        }

        if (countryField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Country field is required", "Warning", 2);
            return false;
        }

        return true;
    }

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        setVisible(false);
        AdminDashboard.jPanel22.setBackground(primaryColor);
        AdminDashboard.jPanel23.setBackground(primaryColor);
        AdminDashboard.jLabel31.setForeground(textPrimaryColor);
        AdminDashboard.jLabel32.setVisible(true);
        AdminDashboard.jLabel38.setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        clear();
    }//GEN-LAST:event_btnBackActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void enablePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enablePassMouseClicked
        passField.setEchoChar('*');
        enablePass.setVisible(false);
        disablePass.setVisible(true);
    }//GEN-LAST:event_enablePassMouseClicked

    private void enablePassAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enablePassAgainMouseClicked
        passAgainField.setEchoChar('*');
        disablePassAgain.setVisible(true);
        enablePassAgain.setVisible(false);
    }//GEN-LAST:event_enablePassAgainMouseClicked

    private void disablePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disablePassMouseClicked
        passField.setEchoChar((char) 0);
        disablePass.setVisible(false);
        enablePass.setVisible(true);
    }//GEN-LAST:event_disablePassMouseClicked

    private void disablePassAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disablePassAgainMouseClicked
        passAgainField.setEchoChar((char) 0);
        disablePassAgain.setVisible(false);
        enablePassAgain.setVisible(true);
    }//GEN-LAST:event_disablePassAgainMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        model = (DefaultTableModel) jTable1.getModel();
        rowIndex = jTable1.getSelectedRow();
        idField.setText(model.getValueAt(rowIndex, 0).toString());
        usernameField.setText(model.getValueAt(rowIndex, 1).toString());
        emailField.setText(model.getValueAt(rowIndex, 2).toString());
        passField.setText(model.getValueAt(rowIndex, 3).toString());
        passAgainField.setText(model.getValueAt(rowIndex, 3).toString());
        phoneField.setText(model.getValueAt(rowIndex, 4).toString());
        countryField.setText(model.getValueAt(rowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private boolean check() {
        String newUsername = usernameField.getText();
        String newPhone = phoneField.getText();
        String newEmail = emailField.getText();
        String oldPhone = model.getValueAt(rowIndex, 4).toString();
        String oldUsername = model.getValueAt(rowIndex, 1).toString();
        String oldEmail = model.getValueAt(rowIndex, 2).toString();
        if (newUsername.equals(oldUsername) && newPhone.equals(oldPhone) && newEmail.equals(oldEmail)) {
            return false;
        } else {
            if (!newEmail.equals(oldEmail)) {
                boolean x = supplier.isEmailExist(newEmail);
                if (x) {
                    JOptionPane.showMessageDialog(null, "This email is already used", "Warning", 2);
                }
                return x;
            }
            if (!newPhone.equals(oldPhone)) {
                boolean x = supplier.isPhoneExist(newPhone);
                if (x) {
                    JOptionPane.showMessageDialog(null, "This phone is already used", "Warning", 2);
                }
                return x;
            }
            if (!newUsername.equals(oldUsername)) {
                boolean x = supplier.isUserExist(newUsername);
                if (x) {
                    JOptionPane.showMessageDialog(null, "This username is already used", "Warning", 2);
                }
                return x;
            }
            return false;
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (isEmpty()) {
            if (!check()) {
                int id = Integer.parseInt(idField.getText());
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = String.valueOf(passField.getPassword());
                String phone = phoneField.getText();
                String country = countryField.getText();

                supplier.updateSupplier(id, username, email, password, phone, country);
                jTable1.setModel(new DefaultTableModel(null, new Object[]{"Supplier ID", "Username", "Email",
                    "Password", "Phone", "Country"}));
                supplier.getSuppliersValue(jTable1, "");
                clear();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        if (isEmpty()) {
            int id = Integer.parseInt(idField.getText());
            supplier.delete(id);
            jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "Username", "Email",
                "Password", "Phone", "Country"}));
            supplier.getSuppliersValue(jTable1, "");
            clear();
        }
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"User ID", "Username", "Email",
            "Password", "Phone", "Country"}));
        supplier.getSuppliersValue(jTable1, jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(ManageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField countryField;
    private javax.swing.JLabel disablePass;
    private javax.swing.JLabel disablePassAgain;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel enablePass;
    private javax.swing.JLabel enablePassAgain;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField passAgainField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
