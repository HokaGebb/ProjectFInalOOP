
package fastfoodinformationsystem;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewOrderFrame extends javax.swing.JFrame {

    public ViewOrderFrame() {
        initComponents();
        Connect();
        findIDNumber();
        tableContent();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javacrud_food","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void findIDNumber(){
    
        try {
            pst = con.prepareStatement("SELECT productnum FROM foodtable");
            rs = pst.executeQuery();
            orderIdComboBox.removeAllItems();
            while (rs.next()){
                orderIdComboBox.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orderIdComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        foodorderLabel = new javax.swing.JLabel();
        foodpriceLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        foodqtyLabel = new javax.swing.JLabel();
        foodtotalLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        drinksLabel = new javax.swing.JLabel();
        drinkspriceLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        drinksqtyLabel = new javax.swing.JLabel();
        drinkstotalLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        totalpriceLabel = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        totalAllPriceTextLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vieworderTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 470));
        setResizable(false);

        viewPanel.setBackground(new java.awt.Color(255, 255, 204));
        viewPanel.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Order ID:");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("View Order");

        orderIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Food Order:");

        foodorderLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        foodorderLabel.setForeground(new java.awt.Color(0, 0, 0));
        foodorderLabel.setText("None");

        foodpriceLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        foodpriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        foodpriceLabel.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Food Oty:");

        foodqtyLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        foodqtyLabel.setForeground(new java.awt.Color(0, 0, 0));
        foodqtyLabel.setText("0");

        foodtotalLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        foodtotalLabel.setForeground(new java.awt.Color(0, 153, 51));
        foodtotalLabel.setText("0.0");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Food Total:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Drinks:");

        drinksLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        drinksLabel.setForeground(new java.awt.Color(0, 0, 0));
        drinksLabel.setText("None");

        drinkspriceLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        drinkspriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        drinkspriceLabel.setText("0.0");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Drinks Qty:");

        drinksqtyLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        drinksqtyLabel.setForeground(new java.awt.Color(0, 0, 0));
        drinksqtyLabel.setText("0");

        drinkstotalLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        drinkstotalLabel.setForeground(new java.awt.Color(0, 153, 51));
        drinkstotalLabel.setText("0.0");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total Price:");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Drinks Total:");

        totalpriceLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        totalpriceLabel.setForeground(new java.awt.Color(0, 153, 51));
        totalpriceLabel.setText("0.0");

        viewButton.setBackground(new java.awt.Color(204, 204, 204));
        viewButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewButton.setForeground(new java.awt.Color(0, 0, 0));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 102, 102));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(153, 0, 0));
        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        totalAllPriceTextLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        totalAllPriceTextLabel1.setForeground(new java.awt.Color(0, 204, 51));
        totalAllPriceTextLabel1.setText("₱");

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPanelLayout.createSequentialGroup()
                        .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foodqtyLabel))
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(drinksqtyLabel))
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel2))
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addComponent(clearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPanelLayout.createSequentialGroup()
                        .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addGroup(viewPanelLayout.createSequentialGroup()
                                        .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(foodtotalLabel)
                                            .addGroup(viewPanelLayout.createSequentialGroup()
                                                .addComponent(drinksLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18))))
                                    .addGroup(viewPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(orderIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(viewButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(drinkspriceLabel))
                            .addGroup(viewPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(foodorderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foodpriceLabel)))
                        .addGap(46, 46, 46))))
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drinkstotalLabel)
                    .addGroup(viewPanelLayout.createSequentialGroup()
                        .addComponent(totalAllPriceTextLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalpriceLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(foodorderLabel)
                    .addComponent(foodpriceLabel))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(foodqtyLabel))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodtotalLabel)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinksLabel)
                    .addComponent(drinkspriceLabel)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(drinksqtyLabel))
                .addGap(18, 18, 18)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkstotalLabel)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalpriceLabel)
                    .addComponent(totalAllPriceTextLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(returnButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        vieworderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Food Order", "Food Price", "Food Qty", "Drinks", "Drinks Price", "Drinks Qty", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vieworderTable);
        if (vieworderTable.getColumnModel().getColumnCount() > 0) {
            vieworderTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        
        
        if (orderIdComboBox.getSelectedItem() == null){
           JOptionPane.showMessageDialog(this, "Order ID not Found, Add an Order.");
        }
        else{
        try {
            // TODO add your handling code here:
            String orderID = orderIdComboBox.getSelectedItem().toString();
            pst = con.prepareStatement("SELECT * FROM foodtable WHERE productnum=?");
            pst.setString(1, orderID);
            rs = pst.executeQuery();
            if (rs.next() == true){
                foodorderLabel.setText(rs.getString(2));
                foodpriceLabel.setText(rs.getString(3));
                foodqtyLabel.setText(rs.getString(4));
                drinksLabel.setText(rs.getString(5));
                drinkspriceLabel.setText(rs.getString(6));
                drinksqtyLabel.setText(rs.getString(7));
                totalpriceLabel.setText(rs.getString(8));
                //totalPriceFoodTextField.setText("");
                //totaldrinksPriceTextField.setText("");
                double num1Food = Double.parseDouble(foodpriceLabel.getText());
                double num2Food = Double.parseDouble(foodqtyLabel.getText());
                double num1Drink = Double.parseDouble(drinkspriceLabel.getText());
                double num2Drink = Double.parseDouble(drinksqtyLabel.getText());
        
                Total T = new Total();
                T.multiplyPrice(num1Food, num2Food);
                foodtotalLabel.setText(String.valueOf(T.getTprice()));
                T.multiplyPrice(num1Drink, num2Drink);
                drinkstotalLabel.setText(String.valueOf(T.getTprice()));
                
            }else{
                JOptionPane.showMessageDialog(this, "No Order Found!");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        foodorderLabel.setText("None");
        foodpriceLabel.setText("0.0");
        foodqtyLabel.setText("0");
        foodtotalLabel.setText("0.0");
        drinksLabel.setText("None");
        drinkspriceLabel.setText("0.0");
        drinksqtyLabel.setText("0");
        drinkstotalLabel.setText("0.0");
        totalpriceLabel.setText("0.0");
    }//GEN-LAST:event_clearButtonActionPerformed
    
 
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
            java.util.logging.Logger.getLogger(ViewOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewOrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel drinksLabel;
    private javax.swing.JLabel drinkspriceLabel;
    private javax.swing.JLabel drinksqtyLabel;
    private javax.swing.JLabel drinkstotalLabel;
    private javax.swing.JLabel foodorderLabel;
    private javax.swing.JLabel foodpriceLabel;
    private javax.swing.JLabel foodqtyLabel;
    private javax.swing.JLabel foodtotalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orderIdComboBox;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel totalAllPriceTextLabel1;
    private javax.swing.JLabel totalpriceLabel;
    private javax.swing.JButton viewButton;
    private javax.swing.JPanel viewPanel;
    private javax.swing.JTable vieworderTable;
    // End of variables declaration//GEN-END:variables

    private void tableContent() {
     try {
         int q;
         pst = con.prepareStatement("SELECT * FROM foodtable");
         rs = pst.executeQuery();
         ResultSetMetaData rss = rs.getMetaData();
         q = rss.getColumnCount();
         
         DefaultTableModel dtm = (DefaultTableModel)vieworderTable.getModel();
         dtm.setRowCount(0);
         while(rs.next()){
             Vector v = new Vector();
             for(int a = 1; a<=q; a++){
                 v.add(rs.getString("productnum"));
                 v.add(rs.getString("foodorder"));
                 v.add(rs.getString("foodprice"));
                 v.add(rs.getString("foodqt"));
                 v.add(rs.getString("drinks"));
                 v.add(rs.getString("drinksprice"));
                 v.add(rs.getString("drinksquantity"));
                 v.add(rs.getString("totalPrice"));
             }
             dtm.addRow(v);
         }
     }  catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
