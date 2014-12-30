/**
 * @author ：Haoxin Zhang
 */
package User_Interface;
import User.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    ButtonGroup bg;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Password:");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Resident");

        jLabel4.setText("You are:");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Council Member");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Managing Agent");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addGap(22, 22, 22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jButton3))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButton1)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset
        jPasswordField1.setText("");
        jTextField1.setText("");
    }//GEN-LAST:event_Reset

    private void Back(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back
        this.setVisible(false);
        Command base = new Command();
        base.setVisible(true);
        base.setLocationRelativeTo(null); 
    }//GEN-LAST:event_Back

    private void Submit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit
        String Email=jTextField1.getText(),Password=jPasswordField1.getText();
        if(Email.equals("")||Password.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill in information blank required!","Warning!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if(bg.isSelected(jRadioButton1.getModel()))
            {
               if(!new Resident().CheckResidentExistence(Email))
               {
                   JOptionPane.showMessageDialog(this,"Email does not exist!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(!new Resident().CheckResidentEmailPasswordMatch(Email,Password))
               {
                   JOptionPane.showMessageDialog(this,"Email and Password do not match!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                    JOptionPane.showMessageDialog(this,"Login Successfully! Welcome back!","Congratulations!!",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    Resident_UI RI= new Resident_UI(Email);
                    RI.setVisible(true);
                    RI.setLocationRelativeTo(null);
               }
            }
            else if(bg.isSelected(jRadioButton2.getModel()))
            {
               if(!new Council_Member().CheckCouncil_MemberExistence(Email))
               {
                   JOptionPane.showMessageDialog(this,"Email does not exist!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(!new Council_Member().CheckCouncil_MemberEmailPasswordMatch(Email,Password))
               {
                   JOptionPane.showMessageDialog(this,"Email and Password do not match!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                    JOptionPane.showMessageDialog(this,"Login Successfully! Welcome back!","Congratulations!!",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    Manage_UI MU= new Manage_UI(Email,"Council Member");
                    MU.setVisible(true);
                    MU.setLocationRelativeTo(null);
               }
            }
            else if(bg.isSelected(jRadioButton3.getModel()))
            {
               if(!new Managing_Agent().CheckManaging_AgentExistence(Email))
               {
                   JOptionPane.showMessageDialog(this,"Email does not exist!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(!new Managing_Agent().CheckManaging_AgentEmailPasswordMatch(Email,Password))
               {
                   JOptionPane.showMessageDialog(this,"Email and Password do not match!","Warning!",JOptionPane.INFORMATION_MESSAGE);
               }
               else
               {
                    JOptionPane.showMessageDialog(this,"Login Successfully! Welcome back!","Congratulations!!",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    Manage_UI MU= new Manage_UI(Email,"Managing Agent");
                    MU.setVisible(true);
                    MU.setLocationRelativeTo(null);
               }
            }
        }
    }//GEN-LAST:event_Submit

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
