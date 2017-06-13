/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pburgerapplication;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yannick
 */
public class AddBurger extends javax.swing.JFrame {
    String ImgPath;
    /**
     * Creates new form AddBurger
     */
    public AddBurger() {
        initComponents();
        
        Show_Product_In_JTable();
    
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
        exitButton = new javax.swing.JButton();
        burgerID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        burgerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        burgerPrice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        burgerImage = new javax.swing.JLabel();
        imagePicker = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(java.awt.Color.yellow);
        jLabel1.setFont(new java.awt.Font("AR DESTINE", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TASTY BURGERS DELIVERY SYSTEM");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(null);

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton);
        exitButton.setBounds(700, 480, 90, 25);
        jPanel2.add(burgerID);
        burgerID.setBounds(140, 70, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("BURGER ID:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 80, 80, 17);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton);
        deleteButton.setBounds(280, 480, 110, 23);
        jPanel2.add(burgerName);
        burgerName.setBounds(140, 130, 210, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("BURGER NAME:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 140, 100, 17);
        jPanel2.add(burgerPrice);
        burgerPrice.setBounds(140, 200, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("PRICE:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 210, 80, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("PICTURE");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 270, 70, 17);

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD MORE BURGERS TYPES");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 30, 330, 31);
        jPanel2.add(burgerImage);
        burgerImage.setBounds(80, 240, 340, 190);

        imagePicker.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        imagePicker.setText("Choose Image");
        imagePicker.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        imagePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagePickerActionPerformed(evt);
            }
        });
        jPanel2.add(imagePicker);
        imagePicker.setBounds(170, 440, 110, 23);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);
        addButton.setBounds(60, 480, 110, 23);

        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "BURGER ID", "BURGERNAME", "PRICE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(430, 70, 360, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
      this.setVisible(false);
      logout newlogout=new logout();
      newlogout.setVisible(true);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if(burgerID.getText().equals(""))
        {
            try
            {
                Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp","root","yannick777");
                PreparedStatement ps= (PreparedStatement) con.prepareStatement("DELETE FROM burgers WHERE BurgerID=?");
                String BID = burgerID.getText().trim();
                
                ps.setString(1,BID);
                ps.executeUpdate();
                
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int index = jTable1.getSelectedRow();
                model.removeRow(index);
                
                JOptionPane.showMessageDialog(null, "Data Successfully Deleted");    
            }
            catch(SQLException e){
            Logger.getLogger(AddBurger.class.getName()).log(Level.SEVERE,null,e);
            JOptionPane.showMessageDialog(null,"Data Not Deleted");
            }
        }
        else
        {   JOptionPane.showMessageDialog(null,"Data Not Deleted"); }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void imagePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagePickerActionPerformed
        // TODO add your handling code here:
        JFileChooser file= new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty(("user.home"))));
        
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.images","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if (result== JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path= selectedFile.getAbsolutePath();
            
            burgerImage.setIcon(ResizeImage(path,null));
            ImgPath = path;
            
        }
        else 
            System.out.println("No File Seected");
        
    }//GEN-LAST:event_imagePickerActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        String BurgerID= burgerID.getText();
        String BurgerName= burgerName.getText();
       Float price=Float.parseFloat(burgerPrice.getText());
        try{
        Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp", "root", "yannick777");
      Statement st= (Statement) con.createStatement();
      ResultSet res = st.executeQuery("SELECT BurgerName FROM burgers");
      int insert=1;
        while(res.next()){
            if (BurgerName.equals(res.getString("BurgerName"))){
                JOptionPane.showMessageDialog(null, "This Burger already exists!");
                insert=0;
                break;
            }           
            
      
            
        }
         if(insert==1)
            {
                     PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO burgers(BurgerID,BurgerName,Price,BurgerPicture)"+"values(?,?,?,?)");
        ps.setString(1, BurgerID);
        ps.setString(2, BurgerName);
       
        ps.setFloat(3, price);
        
        InputStream img = new FileInputStream(new File(ImgPath));
        ps.setBlob(4, img);
        ps.executeUpdate();
        
         Show_Product_In_JTable();
        
        JOptionPane.showMessageDialog(null,("Data Inserted"));
            }
         con.close();
        }
        
        catch (Exception ex){
        JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
        burgerName.setText(null);
        burgerID.setText(null);
        burgerPrice.setText(null);
        
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index= jTable1.getSelectedRow();
        ShowItem(index);
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    
    
    public class Burgers{
        private String BID;
        private String BName;
        private float BPrice;
        private byte[] BPicture;

        public Burgers(String bBID, String bBName, float bBPrice, byte[] bBPicture)
        {
            this.BID=bBID;
            this.BName=bBName;
            this.BPrice=bBPrice;
            this.BPicture=bBPicture;
        }
    
        public String getBID()
        {   return BID;  }

        public String getBName()
        {   return BName;   }

        public float getBPrice()
        {   return BPrice;  }

        public byte[] getBPicture()
        {   return BPicture;    }
    
    }
    
    
    public ImageIcon ResizeImage(String imagePath,byte[] pic)
    {ImageIcon myImage=null;
    
    if (imagePath!=null)
    {
      myImage= new ImageIcon(imagePath);  
    }
    else
    {
        myImage= new ImageIcon(pic);
    }
    Image img= myImage.getImage();
    Image img2= img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(),Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(img2);
    return image;
    
    }
    
    
    public void Show_Product_In_JTable()
    {
        Delete_from_Table();
        
        ArrayList<Burgers> list= getProductList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        Object[] row = new Object[3];
        
        for (int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getBID();
            row[1]=list.get(i).getBName();
            row[2]=list.get(i).getBPrice();
            model.addRow(row);
        }
    }
        
    public ArrayList<Burgers> getProductList()
    {   
            ArrayList<Burgers> productList= new ArrayList<Burgers>();
            try
            {
                Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp","root","yannick777");
                String query= "SELECT* FROM burgers";
                
                Statement st= (Statement) con.createStatement();
                ResultSet rs=st.executeQuery(query);
                
                Burgers product;
                
                while(rs.next())
                {
                    product=new Burgers(rs.getString("BurgerID"), rs.getString("BurgerName"), Float.parseFloat(rs.getString("Price")), rs.getBytes("BurgerPicture"));
                    productList.add(product);
                    
                }
            }
            catch(SQLException ex)
            {   Logger.getLogger(AddBurger.class.getName()).log(Level.SEVERE, null, ex);     }
            
            
           return productList;
    }
    
    public void Delete_from_Table()
    {
        DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
        dm.getDataVector().removeAllElements();
    }
        
    public void ShowItem(int index)
    {
        burgerID.setText(getProductList().get(index).getBID());
        burgerName.setText(getProductList().get(index).getBName());
        burgerPrice.setText(Float.toString(getProductList().get(index).getBPrice()));
        burgerImage.setIcon(ResizeImage(null,getProductList().get(index).getBPicture()));
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(AddBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBurger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField burgerID;
    private javax.swing.JLabel burgerImage;
    private javax.swing.JTextField burgerName;
    private javax.swing.JTextField burgerPrice;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton imagePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}