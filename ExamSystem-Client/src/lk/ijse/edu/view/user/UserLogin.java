/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.edu.view.user;

import javax.swing.JOptionPane;
import lk.ijse.edu.view.admin.AdminDashBoard;

/**
 *
 * @author Krishanthi
 */
public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlLoad1 = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        lblPassWord = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbUserSelect = new javax.swing.JComboBox();
        lblMainImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("www.Gurugedara .com");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, 20));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Power");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 50, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gurugedara @ gmail.com");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 430, 30));

        pnlLoad1.setOpaque(false);

        javax.swing.GroupLayout pnlLoad1Layout = new javax.swing.GroupLayout(pnlLoad1);
        pnlLoad1.setLayout(pnlLoad1Layout);
        pnlLoad1Layout.setHorizontalGroup(
            pnlLoad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlLoad1Layout.setVerticalGroup(
            pnlLoad1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(pnlLoad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 102, 255));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(153, 153, 153));
        btnRegister.setText("Register");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 370, 50));

        btnCancel.setBackground(new java.awt.Color(0, 102, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(153, 153, 153));
        btnCancel.setText("CANCEL");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 180, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("You are not a members ?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 370, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Forgot your password ?");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 370, 30));

        btnLogin.setBackground(new java.awt.Color(0, 102, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(153, 153, 153));
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 190, 50));

        jPasswordField1.setBackground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 370, 30));

        lblPassWord.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblPassWord.setForeground(new java.awt.Color(255, 255, 0));
        lblPassWord.setText("Password");
        jPanel1.add(lblPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 370, 10));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 370, 10));

        txtUserName.setBackground(new java.awt.Color(102, 102, 102));
        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setBorder(null);
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 370, 30));

        lblUserName.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 0));
        lblUserName.setText("UseName");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("urugedara");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 108)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("G");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 90));

        cmbUserSelect.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cmbUserSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Student" }));
        cmbUserSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserSelectActionPerformed(evt);
            }
        });
        jPanel1.add(cmbUserSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 370, 40));

        lblMainImage.setBackground(new java.awt.Color(0, 0, 0));
        lblMainImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/edu/images/123456789.jpg"))); // NOI18N
        lblMainImage.setBorder(new org.jdesktop.swingx.border.DropShadowBorder());
        lblMainImage.setOpaque(true);
        jPanel1.add(lblMainImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
       int res=JOptionPane.showConfirmDialog(this,"Do you want to leave?");
        if(res==0){
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if (cmbUserSelect.getSelectedItem().toString().equalsIgnoreCase("Admin")){
            new AdminDashBoard().setVisible(true);
            this.dispose();
        }
        if (cmbUserSelect.getSelectedItem().toString().equalsIgnoreCase("Student")){
            new UserDash().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        new RegisterNow().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
       PowerUser r=new PowerUser();
       pnlLoad1.removeAll();
       pnlLoad1.repaint();
       pnlLoad1.revalidate();
       r.setSize(pnlLoad1.getSize());
       pnlLoad1.add(r);
       r.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void cmbUserSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserSelectActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox cmbUserSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMainImage;
    private javax.swing.JLabel lblPassWord;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlLoad1;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
