/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;

import dao.UserDao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class UserAccount extends javax.swing.JFrame {

    /**
     * Creates new form UserAccount
     */
    UserDao user = new UserDao();
    Color textPrimaryColor =  new Color(102,120,138);
    Color primaryColor = new Color(42,58,73);
    int xx,xy;
    private int uId;
    String[] value = new String[9];
    
    public UserAccount() {
        initComponents();
        init();
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
        jLabel15 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ansField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        securityField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        disablePassAgain = new javax.swing.JLabel();
        disablePass = new javax.swing.JLabel();
        enablePass = new javax.swing.JLabel();
        enablePassAgain = new javax.swing.JLabel();
        countryField1 = new javax.swing.JTextField();

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
        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(204, 204, 204));
        idField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 302, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        usernameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameFieldKeyTyped(evt);
            }
        });
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 302, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        emailField.setEditable(false);
        emailField.setBackground(new java.awt.Color(204, 204, 204));
        emailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 302, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFieldKeyTyped(evt);
            }
        });
        jPanel1.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Enter Password Again");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        passAgainField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passAgainFieldKeyTyped(evt);
            }
        });
        jPanel1.add(passAgainField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Security question");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        phoneField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneFieldKeyTyped(evt);
            }
        });
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 302, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Phone");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Answer");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        ansField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ansField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansFieldActionPerformed(evt);
            }
        });
        jPanel1.add(ansField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 302, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Country");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        securityField.setEditable(false);
        securityField.setBackground(new java.awt.Color(204, 204, 204));
        securityField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        securityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(securityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 302, 30));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Delete");
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 140, 40));

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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 140, 40));

        disablePassAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        disablePassAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disablePassAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disablePassAgainMouseClicked(evt);
            }
        });
        jPanel1.add(disablePassAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, 30));

        disablePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hide.png"))); // NOI18N
        disablePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disablePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disablePassMouseClicked(evt);
            }
        });
        jPanel1.add(disablePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 30));

        enablePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        enablePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enablePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enablePassMouseClicked(evt);
            }
        });
        jPanel1.add(enablePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 30, 30));

        enablePassAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visible.png"))); // NOI18N
        enablePassAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enablePassAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enablePassAgainMouseClicked(evt);
            }
        });
        jPanel1.add(enablePassAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 30, 30));

        countryField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        countryField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryField1ActionPerformed(evt);
            }
        });
        jPanel1.add(countryField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 302, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void init(){
        uId=user.getUserId(UserDashboard.userEmail.getText());
        value=user.getUserValue(uId);
        setValue();
    }
    
    private void setValue(){
        idField.setText(value[0]);
        usernameField.setText(value[1]);
        emailField.setText(value[2]);
        passField.setText(value[3]);
        passAgainField.setText(value[3]);
        phoneField.setText(value[4]);
        countryField1.setText(value[7]);
        securityField.setText(value[5]);
        ansField.setText(value[6]);
        emailField.setEditable(false);
    }
    
    public boolean isEmpty(){
        if(usernameField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Username is required","Warning",2);
            return false;
        }
        
        if(String.valueOf(passField.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(this, "Password is required","Warning",2);
            return false;
        }
        if(!String.valueOf(passField.getPassword()).matches(String.valueOf(passAgainField.getPassword()))){
            JOptionPane.showMessageDialog(this, "Password and password again field must be matched","Warning",2);
            return false;
        }
        
        if(phoneField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Phone number is required","Warning",2);
            return false;
        }
        
        if(phoneField.getText().length()>11||phoneField.getText().length()<9){
            JOptionPane.showMessageDialog(this, "Phone number must be equal 10 character","Warning",2);
            return false;
        }
        
        if(countryField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Country field is required","Warning",2);
            return false;
        }
        
        if(ansField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Security answer is required","Warning",2);
            return false;
        }
        
        return true;
    }
    
    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        setVisible(false);
        setDefault();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void ansFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansFieldActionPerformed

    private void securityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_securityFieldActionPerformed

    private void countryField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryField1ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

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

    private boolean check(){
        String newPhone = phoneField.getText();
        if(newPhone.equals(value[4])){
            JOptionPane.showMessageDialog(null, "New phone cannot be matched old phone","Warning",2);
            return false;
        }else{
            boolean x=user.isPhoneExist(newPhone);
            if(x){
                JOptionPane.showMessageDialog(null, "This phone is already used","Warning",2);
            }
            return x;
        }
    }
    
    private void setDefault(){
        UserDashboard.jPanel13.setBackground(primaryColor);
        UserDashboard.jPanel14.setBackground(primaryColor);
        UserDashboard.jLabel10.setForeground(textPrimaryColor);
        UserDashboard.jLabel11.setVisible(true);
        UserDashboard.jLabel22.setVisible(false);
    }
    
    private boolean checkPassword(){
        if(String.valueOf(passField.getPassword()).matches(String.valueOf(passAgainField.getPassword()))){
            return true;
        }
        return false;
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(isEmpty()){
            if(!checkPassword()){
                JOptionPane.showMessageDialog(null, "Password and password again must match","Warning",2);
            }
            
            if(!check()&&checkPassword()){
                int id = Integer.parseInt(idField.getText());
                String username = usernameField.getText();
                String email = emailField.getText();
                String password = String.valueOf(passField.getPassword());
                String phone = phoneField.getText();
                String seq = securityField.getText();
                String ans = ansField.getText();
                String country = countryField1.getText();
            
                user.updateUser(id, username, email, password, phone, seq, ans, country);
                this.dispose();
                setDefault();
             }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        user.delete(uId);
        System.exit(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void usernameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyTyped
        char input = evt.getKeyChar();
        if(!(input<'0'|input>'9')&&input!='\b'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Username mustn't include any number!","Warning",2);
        }
    }//GEN-LAST:event_usernameFieldKeyTyped

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_passFieldKeyTyped

    private void passAgainFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passAgainFieldKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_passAgainFieldKeyTyped

    private void phoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneFieldKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_phoneFieldKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansField;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField countryField1;
    private javax.swing.JLabel disablePass;
    private javax.swing.JLabel disablePassAgain;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel enablePass;
    private javax.swing.JLabel enablePassAgain;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passAgainField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField securityField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
