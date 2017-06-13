/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pburgerapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yannick
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
        initComponents();
         username.setText("");
        lastname.setText("");
        sex.setSelectedItem("");
        address.setText("");
        phoneNumber.setText("");
        password.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        register1Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tasty Burger RegistrationPage");

        jLabel1.setBackground(java.awt.Color.yellow);
        jLabel1.setFont(new java.awt.Font("AR DESTINE", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TASTY BURGERS DELIVERY SYSTEM");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton);
        backButton.setBounds(630, 460, 90, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pburgerapplication/Tasty burger.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(390, 90, 360, 340);
        jPanel2.add(username);
        username.setBounds(140, 90, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("USERNAME:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 100, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("PASSWORD:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 410, 100, 17);

        register1Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register1Button.setText("REGISTER");
        register1Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        register1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(register1Button);
        register1Button.setBounds(140, 460, 110, 23);

        jLabel3.setFont(new java.awt.Font("Sitka Subheading", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRATION");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 40, 200, 30);
        jPanel2.add(lastname);
        lastname.setBounds(140, 150, 210, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("LASTNAME:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 160, 80, 17);
        jPanel2.add(address);
        address.setBounds(140, 220, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ADDRESS:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 230, 80, 17);
        jPanel2.add(phoneNumber);
        phoneNumber.setBounds(140, 280, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("SEX:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 340, 80, 17);

        sex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel2.add(sex);
        sex.setBounds(140, 340, 73, 21);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("PHONE NUMBER:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 290, 120, 17);
        jPanel2.add(password);
        password.setBounds(140, 400, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        loginPage newloginPage = new loginPage();
        newloginPage.setVisible(true);

    }//GEN-LAST:event_backButtonActionPerformed

    private void register1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register1ButtonActionPerformed
        // TODO add your handling code here:
        
        String Username= username.getText().trim();
        String Lastname= lastname.getText().trim();
        String Gender=sex.getSelectedItem().toString();
        String Address= address.getText().trim();
        String PhoneNumber= phoneNumber.getText().trim();
        String Password=String.valueOf(password.getPassword());
        String Role="customer";
        
        
        
        if(!Username.equals("")&&!Lastname.equals("")&&!Address.equals("")&&!PhoneNumber.equals("")&&!Password.equals("") )
        {
          try
            {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp","root", "yannick777");
                Statement st= (Statement)con.createStatement();
                ResultSet res= st.executeQuery("SELECT username FROM registration");
                
                int insert=1;
                
                while(res.next()){
                    if(Username.equals(res.getString("username"))){
                        insert=0;
                        JOptionPane.showMessageDialog(null, "The User alredy Exists!");
                        break;
                    }
                    }
                    
                    if (insert==1){
                    String statement="INSERT INTO registration VALUES('"+Username+"','"+Lastname+"','"+Gender+"','"+Address+"','"+PhoneNumber+"','"+Password+"','"+Role+"')";
                st.executeUpdate(statement);
                System.out.print("Registration Successful");
                con.close();
                
                 JOptionPane.showMessageDialog(null, "User Successfully Registered");

                    }
                
                

            }
             catch(Exception e)
             {
               e.printStackTrace();
             }
             
        username.setText("");
        lastname.setText("");
        sex.setSelectedItem("");
        address.setText("");
        phoneNumber.setText("");
        password.setText("");
        }
        else{ 
        
          JOptionPane.showMessageDialog(null, "All fields must be filled to successfully register");
      
        }
      
    }//GEN-LAST:event_register1ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton register1Button;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
