
package fastfoodinformationsystem;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame {

    //Constructor
    public MainFrame() {
        initComponents();
        Connect();
        findIDNumber();
        tableContent();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    //Method to Connect on myPHPAdmin Database 
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
    
    //To fine the ID/Order Number
    public void findIDNumber(){
    
        try {
            pst = con.prepareStatement("SELECT productnum FROM foodtable");
            rs = pst.executeQuery();
            ordernumComboBox.removeAllItems();
            while (rs.next()){
                ordernumComboBox.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        ordernumLabel = new javax.swing.JLabel();
        foodorderLabel = new javax.swing.JLabel();
        foodquantityLabel = new javax.swing.JLabel();
        foodpriceTextField = new javax.swing.JTextField();
        foodquantityTextField = new javax.swing.JTextField();
        foodComboBox = new javax.swing.JComboBox<>();
        ordernumComboBox = new javax.swing.JComboBox<>();
        selectButton = new javax.swing.JButton();
        totalPriceFoodTextField = new javax.swing.JTextField();
        totalfoodpriceButton = new javax.swing.JButton();
        selectUpdateDeleteLabel = new javax.swing.JLabel();
        withdrinksLabel = new javax.swing.JLabel();
        drinkComboBox = new javax.swing.JComboBox<>();
        drinkqtyLabel = new javax.swing.JLabel();
        drinkquantityTextField = new javax.swing.JTextField();
        totaldrinkpriceButton = new javax.swing.JButton();
        equalLabel1 = new javax.swing.JLabel();
        totaldrinksPriceTextField = new javax.swing.JTextField();
        drinkspriceTextField = new javax.swing.JTextField();
        totalfoodpriceLabel = new javax.swing.JLabel();
        equalLabel2 = new javax.swing.JLabel();
        totaldrinkpriceLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        tableorderPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        computePanel = new javax.swing.JPanel();
        computePriceButton = new javax.swing.JButton();
        totalAllPriceTextLabel = new javax.swing.JLabel();
        totalAllPriceTextLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        ordertypeLabel = new javax.swing.JLabel();
        orderTypeComboBox = new javax.swing.JComboBox<>();
        viewFrameButton = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setResizable(false);

        ButtonPanel.setBackground(new java.awt.Color(0, 204, 204));

        ordernumLabel.setBackground(new java.awt.Color(0, 0, 0));
        ordernumLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ordernumLabel.setForeground(new java.awt.Color(0, 0, 0));
        ordernumLabel.setText("Order ID:");

        foodorderLabel.setBackground(new java.awt.Color(0, 0, 0));
        foodorderLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        foodorderLabel.setForeground(new java.awt.Color(0, 0, 0));
        foodorderLabel.setText("Food Order:");

        foodquantityLabel.setBackground(new java.awt.Color(0, 0, 0));
        foodquantityLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        foodquantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        foodquantityLabel.setText("Food Quantity:");

        foodpriceTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        foodpriceTextField.setText("0.0");

        foodquantityTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        foodquantityTextField.setText("0");

        foodComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        foodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Hamburger", "French Fries", "Chicken Nuggets", "Ham Sandwich", "Ramen", "Footlong Sandwich" }));
        foodComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodComboBoxActionPerformed(evt);
            }
        });

        ordernumComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ordernumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selectButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectButton.setForeground(new java.awt.Color(51, 51, 51));
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        totalPriceFoodTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        totalPriceFoodTextField.setText("0.0");

        totalfoodpriceButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        totalfoodpriceButton.setText("X");
        totalfoodpriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalfoodpriceButtonActionPerformed(evt);
            }
        });

        selectUpdateDeleteLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        selectUpdateDeleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectUpdateDeleteLabel.setText("To Update/Delete Order ID");

        withdrinksLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        withdrinksLabel.setForeground(new java.awt.Color(0, 0, 0));
        withdrinksLabel.setText("With Drinks:");

        drinkComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        drinkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Softdrink", "Iced Tea", "Buko Juice", "Lemonnade", "Zesto" }));
        drinkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkComboBoxActionPerformed(evt);
            }
        });

        drinkqtyLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        drinkqtyLabel.setForeground(new java.awt.Color(0, 0, 0));
        drinkqtyLabel.setText("Drink Quantity:");

        drinkquantityTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        drinkquantityTextField.setText("0");

        totaldrinkpriceButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        totaldrinkpriceButton.setText("X");
        totaldrinkpriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaldrinkpriceButtonActionPerformed(evt);
            }
        });

        equalLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        equalLabel1.setForeground(new java.awt.Color(0, 0, 0));
        equalLabel1.setText("=");

        totaldrinksPriceTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        totaldrinksPriceTextField.setText("0.0");

        drinkspriceTextField.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        drinkspriceTextField.setText("0.0");

        totalfoodpriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totalfoodpriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalfoodpriceLabel.setText("Total Food Price");

        equalLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        equalLabel2.setForeground(new java.awt.Color(0, 0, 0));
        equalLabel2.setText("=");

        totaldrinkpriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        totaldrinkpriceLabel.setForeground(new java.awt.Color(0, 0, 0));
        totaldrinkpriceLabel.setText("Total Drink Price");

        logoutButton.setBackground(new java.awt.Color(255, 153, 153));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("Log Out");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drinkqtyLabel)
                    .addComponent(foodquantityLabel)
                    .addComponent(foodorderLabel)
                    .addComponent(ordernumLabel)
                    .addComponent(withdrinksLabel))
                .addGap(18, 18, 18)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(totaldrinkpriceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ButtonPanelLayout.createSequentialGroup()
                                .addComponent(ordernumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectUpdateDeleteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ButtonPanelLayout.createSequentialGroup()
                                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalfoodpriceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                                        .addComponent(foodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(foodpriceTextField))
                                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                                        .addComponent(foodquantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(equalLabel1)
                                        .addGap(30, 30, 30)
                                        .addComponent(totalPriceFoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalfoodpriceLabel))
                            .addGroup(ButtonPanelLayout.createSequentialGroup()
                                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                                        .addComponent(drinkquantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(equalLabel2))
                                    .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(drinkspriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                                        .addComponent(totaldrinksPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(totaldrinkpriceLabel)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton)
                .addGap(1, 1, 1)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordernumLabel)
                    .addComponent(ordernumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton)
                    .addComponent(selectUpdateDeleteLabel))
                .addGap(18, 18, 18)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodorderLabel)
                    .addComponent(foodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodpriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalfoodpriceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodquantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalLabel1)
                    .addComponent(totalPriceFoodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodquantityLabel)
                    .addComponent(totalfoodpriceLabel))
                .addGap(18, 18, 18)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkspriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrinksLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totaldrinkpriceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkquantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkqtyLabel)
                    .addComponent(totaldrinksPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalLabel2)
                    .addComponent(totaldrinkpriceLabel))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tableorderPanel.setBackground(new java.awt.Color(204, 204, 255));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Food Order", "Food Price", "Food Qty", "Drinks", "Drink Price", "Drink Qty", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orderTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout tableorderPanelLayout = new javax.swing.GroupLayout(tableorderPanel);
        tableorderPanel.setLayout(tableorderPanelLayout);
        tableorderPanelLayout.setHorizontalGroup(
            tableorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        tableorderPanelLayout.setVerticalGroup(
            tableorderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        computePanel.setBackground(new java.awt.Color(204, 204, 204));

        computePriceButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        computePriceButton.setForeground(new java.awt.Color(153, 153, 255));
        computePriceButton.setText("Compute");
        computePriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computePriceButtonActionPerformed(evt);
            }
        });

        totalAllPriceTextLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        totalAllPriceTextLabel.setForeground(new java.awt.Color(0, 204, 51));
        totalAllPriceTextLabel.setText("0.0");

        totalAllPriceTextLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        totalAllPriceTextLabel1.setForeground(new java.awt.Color(0, 204, 51));
        totalAllPriceTextLabel1.setText("₱");

        javax.swing.GroupLayout computePanelLayout = new javax.swing.GroupLayout(computePanel);
        computePanel.setLayout(computePanelLayout);
        computePanelLayout.setHorizontalGroup(
            computePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(computePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(computePanelLayout.createSequentialGroup()
                        .addComponent(computePriceButton)
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, computePanelLayout.createSequentialGroup()
                        .addComponent(totalAllPriceTextLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAllPriceTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        computePanelLayout.setVerticalGroup(
            computePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(computePriceButton)
                .addGap(18, 18, 18)
                .addGroup(computePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAllPriceTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalAllPriceTextLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(computePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        buttonsPanel.setBackground(new java.awt.Color(153, 255, 255));

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Create");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 0, 0));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        ordertypeLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        ordertypeLabel.setForeground(new java.awt.Color(0, 0, 0));
        ordertypeLabel.setText("Order Type:");

        orderTypeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order Type", "Food", "Drink", "Food+Drink" }));
        orderTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderTypeComboBoxActionPerformed(evt);
            }
        });

        viewFrameButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        viewFrameButton.setForeground(new java.awt.Color(0, 102, 0));
        viewFrameButton.setText("View");
        viewFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFrameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(ordertypeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewFrameButton)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordertypeLabel)
                    .addComponent(orderTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewFrameButton))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tableorderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        if(orderTypeComboBox.getSelectedItem() == "Order Type"){
            JOptionPane.showMessageDialog(this, "Please Choose Order Type!");
        }
        else if(orderTypeComboBox.getSelectedItem() == "Food")
        {    
            if(foodComboBox.getSelectedItem() == "None"){
            JOptionPane.showMessageDialog(this, "Food Order Required!");
        }
            else if (foodquantityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Food Quantity Required!");
        }
            else if (totalPriceFoodTextField.getText().isEmpty() || "0.0".equals(totalPriceFoodTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please Multiply to Get the Total Food Price!");
        }
            else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Compute Button to Get the Overall Price!");
        }
            else{
            try {
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText();
            
            pst = con.prepareStatement("INSERT INTO foodtable (foodorder,foodprice,foodqt,drinks,drinksprice,drinksquantity,totalprice)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);
            pst.setString(7, totalprice);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Added to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("0.0");
                foodquantityTextField.setText("0");
                drinkComboBox.setSelectedItem("None");
                drinkspriceTextField.setText("0.0");
                drinkquantityTextField.setText("0");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                tableContent();
                findIDNumber();
                
            }else{
                JOptionPane.showMessageDialog(this, "Order Failed to add to list");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Food Only Order Type
    }
            
        }else if(orderTypeComboBox.getSelectedItem() == "Drink")
        {
            if(drinkComboBox.getSelectedItem() == "None"){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order"); 
            }
            else if (drinkspriceTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order so the Price will generate");  
            }
            else if(drinkquantityTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Drink Quantity Required!");
            }else if (totaldrinksPriceTextField.getText().isEmpty() || "0.0".equals(totaldrinksPriceTextField.getText())){
               JOptionPane.showMessageDialog(this, "Please Multiply to Get the Total Drink Price!");
            }else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Compute Button to Get the Overall Price!");
        }
            else{
            try {
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText();
            
            pst = con.prepareStatement("INSERT INTO foodtable (foodorder,foodprice,foodqt,drinks,drinksprice,drinksquantity,totalprice)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);
            pst.setString(7, totalprice);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Added to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("");
                foodquantityTextField.setText("");
                drinkComboBox.setSelectedItem("None");
                drinkspriceTextField.setText("");
                drinkquantityTextField.setText("");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                tableContent();
                findIDNumber();
                
            }else{
                JOptionPane.showMessageDialog(this, "Order Failed to add to list");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        //Drink Only Order Type
    }
        else if (orderTypeComboBox.getSelectedItem() == "Food+Drink")
        {
            if(foodComboBox.getSelectedItem() == "None"){
            JOptionPane.showMessageDialog(this, "Food Order Required!");
            }
            else if (foodquantityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Food Quantity Required!");
            }
            else if (totalPriceFoodTextField.getText().isEmpty() || "0.0".equals(totalPriceFoodTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please Multiply to Get the Total Food Price!");
            }   
            else if(drinkComboBox.getSelectedItem() == "None"){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order"); 
            }
            else if (drinkspriceTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order so the Price will generate");  
            }
            else if(drinkquantityTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Drink Quantity Required!");
            }else if (totaldrinksPriceTextField.getText().isEmpty() || "0.0".equals(totaldrinksPriceTextField.getText())){
               JOptionPane.showMessageDialog(this, "Please Multiply to Get the Drink Price!");
            }else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Compute Button to Get the Overall Price!");
            }
            else{
            try {
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText();
            
            pst = con.prepareStatement("INSERT INTO foodtable (foodorder,foodprice,foodqt,drinks,drinksprice,drinksquantity,totalprice)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);
            pst.setString(7, totalprice);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Added to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("");
                foodquantityTextField.setText("");
                drinkComboBox.setSelectedItem("None");
                drinkspriceTextField.setText("");
                drinkquantityTextField.setText("");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                tableContent();
                findIDNumber();
                
            }else{
                JOptionPane.showMessageDialog(this, "Order Failed to add to list");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }
        else{
        try {
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText();
            
            pst = con.prepareStatement("INSERT INTO foodtable (foodorder,foodprice,foodqt,drinks,drinksprice,drinksquantity,totalprice)VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);
            pst.setString(7, totalprice);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Added to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("");
                foodquantityTextField.setText("");
                drinkComboBox.setSelectedItem("None");
                drinkspriceTextField.setText("");
                drinkquantityTextField.setText("");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                tableContent();
                findIDNumber();
                
            }else{
                JOptionPane.showMessageDialog(this, "Order Failed to add to list");
            }        
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed
}
    private void foodComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodComboBoxActionPerformed
        
        if (foodComboBox.getSelectedItem() == "None"){
                foodpriceTextField.setText("0.0");
                foodquantityTextField.setText("0");
                totalPriceFoodTextField.setText("0.0");
                
        }else if (foodComboBox.getSelectedItem() == "Hamburger"){
                FoodList fl = new FoodList();
                fl.setpriceHamburger(30.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceHamburger()));
                
        }else if (foodComboBox.getSelectedItem() == "French Fries"){
                FoodList fl = new FoodList();
                fl.setpriceFrenchFries(15.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceFrenchFries()));
                
        }else if (foodComboBox.getSelectedItem() == "Chicken Nuggets"){
                FoodList fl = new FoodList();
                fl.setpriceChickenNuggets(25.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceChickenNuggets()));
                        
        }else if (foodComboBox.getSelectedItem() == "Ham Sandwich"){
                FoodList fl = new FoodList();
                fl.setpriceHamSandwich(20.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceHamSandwich()));
                
        }else if (foodComboBox.getSelectedItem() == "Ramen"){
                FoodList fl = new FoodList();
                fl.setpriceRamen(45.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceRamen()));
                
        }else if (foodComboBox.getSelectedItem() == "Footlong Sandwich"){
                FoodList fl = new FoodList();
                fl.setpriceFootlongSandwich(35.00);
                foodpriceTextField.setText(String.valueOf(fl.getpriceFootlongSandwich()));
                
        }
    }//GEN-LAST:event_foodComboBoxActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        
        if (ordernumComboBox.getSelectedItem() == null){
           JOptionPane.showMessageDialog(this, "Order ID not Found, Add an Order.");
        }
        else{
        try {
            // TODO add your handling code here:
            String orderID = ordernumComboBox.getSelectedItem().toString();
            pst = con.prepareStatement("SELECT * FROM foodtable WHERE productnum=?");
            pst.setString(1, orderID);
            rs = pst.executeQuery();
            if (rs.next() == true){
                foodComboBox.setSelectedItem(rs.getString(2));
                foodpriceTextField.setText(rs.getString(3));
                foodquantityTextField.setText(rs.getString(4));
                drinkComboBox.setSelectedItem(rs.getString(5));
                drinkspriceTextField.setText(rs.getString(6));
                drinkquantityTextField.setText(rs.getString(7));
                totalPriceFoodTextField.setText("");
                totaldrinksPriceTextField.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "No Order Found!");
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selectButtonActionPerformed
}
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if(orderTypeComboBox.getSelectedItem() == "Order Type"){
            JOptionPane.showMessageDialog(this, "Please Choose Order Type!");
        }
        else if(orderTypeComboBox.getSelectedItem() == "Food")
        {    
            if(foodComboBox.getSelectedItem() == "None"){
            JOptionPane.showMessageDialog(this, "Food Order Required!");
            }
            else if (foodquantityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Food Quantity Required!");
            }
            else if (totalPriceFoodTextField.getText().isEmpty() || "0.0".equals(totalPriceFoodTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please Multiply to Get the Price!");
            }
            else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Total Button to Get the Total Price!");
            }
            else{
            try {
            // TODO add your handling code here:
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText(); 
            String orderID = ordernumComboBox.getSelectedItem().toString();
            
            pst = con.prepareStatement("UPDATE foodtable SET foodorder=?,foodprice=?,foodqt=?,drinks=?,drinksprice=?,drinksquantity=?,totalPrice=? WHERE productnum=?");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);;
            pst.setString(7, totalprice);
            pst.setString(8, orderID);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Updated to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("0.0");
                foodquantityTextField.setText("0");
                drinkspriceTextField.setText("0.0");
                drinkquantityTextField.setText("0");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                foodComboBox.requestFocus();
                tableContent();
                findIDNumber();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed
            //Food Only Update
}
        else if(orderTypeComboBox.getSelectedItem() == "Drink"){
            if(drinkComboBox.getSelectedItem() == "None"){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order"); 
            }
            else if (drinkspriceTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order so the Price will generate");  
            }
            else if(drinkquantityTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Drink Quantity Required!");
            }else if (totaldrinksPriceTextField.getText().isEmpty() || "0.0".equals(totaldrinksPriceTextField.getText())){
               JOptionPane.showMessageDialog(this, "Please Multiply to Get the Price!");
            }else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Total Button to Get the Total Price!");
        }
        else{
        try {
            // TODO add your handling code here:
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText(); 
            String orderID = ordernumComboBox.getSelectedItem().toString();
            
            pst = con.prepareStatement("UPDATE foodtable SET foodorder=?,foodprice=?,foodqt=?,drinks=?,drinksprice=?,drinksquantity=?,totalPrice=? WHERE productnum=?");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);;
            pst.setString(7, totalprice);
            pst.setString(8, orderID);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Updated to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("");
                foodquantityTextField.setText("");
                drinkspriceTextField.setText("");
                drinkquantityTextField.setText("");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                foodComboBox.requestFocus();
                tableContent();
                findIDNumber();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            //Drink Only Update
}
        else if (orderTypeComboBox.getSelectedItem() == "Food+Drink")
        {
            if(foodComboBox.getSelectedItem() == "None"){
            JOptionPane.showMessageDialog(this, "Food Order Required!");
            }
            else if (foodquantityTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Food Quantity Required!");
            }
            else if (totalPriceFoodTextField.getText().isEmpty() || "0.0".equals(totalPriceFoodTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please Multiply to Get the Total Food Price!");
            }   
            else if(drinkComboBox.getSelectedItem() == "None"){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order"); 
            }
            else if (drinkspriceTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Please Choose Drink Order so the Price will generate");  
            }
            else if(drinkquantityTextField.getText().isEmpty()){
               JOptionPane.showMessageDialog(this, "Drink Quantity Required!");
            }else if (totaldrinksPriceTextField.getText().isEmpty() || "0.0".equals(totaldrinksPriceTextField.getText())){
               JOptionPane.showMessageDialog(this, "Please Multiply to Get the Drink Price!");
            }else if ("0.0".equals(totalAllPriceTextLabel.getText())){
            JOptionPane.showMessageDialog(this, "Please Press Total Button to Get the Total Price!");
            }
            else{
            try {
            // TODO add your handling code here:
            String foodOrder = foodComboBox.getSelectedItem().toString();
            String foodPrice = foodpriceTextField.getText();
            String foodQuantity = foodquantityTextField.getText();
            String drinkOrder = drinkComboBox.getSelectedItem().toString();
            String drinkPrice = drinkspriceTextField.getText();
            String drinkQuantity = drinkquantityTextField.getText();
            String totalprice = totalAllPriceTextLabel.getText(); 
            String orderID = ordernumComboBox.getSelectedItem().toString();
            
            pst = con.prepareStatement("UPDATE foodtable SET foodorder=?,foodprice=?,foodqt=?,drinks=?,drinksprice=?,drinksquantity=?,totalPrice=? WHERE productnum=?");
            pst.setString(1, foodOrder);
            pst.setString(2, foodPrice);
            pst.setString(3, foodQuantity);
            pst.setString(4, drinkOrder);
            pst.setString(5, drinkPrice);
            pst.setString(6, drinkQuantity);;
            pst.setString(7, totalprice);
            pst.setString(8, orderID);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
                JOptionPane.showMessageDialog(this, "Order Updated to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("");
                foodquantityTextField.setText("");
                drinkspriceTextField.setText("");
                drinkquantityTextField.setText("");
                totalPriceFoodTextField.setText("0.0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                foodComboBox.requestFocus();
                tableContent();
                findIDNumber();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            //Food+Drink Order Update
    }       
}
    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       
        try {
            // TODO add your handling code here:
            String orderID = ordernumComboBox.getSelectedItem().toString();
            pst = con.prepareStatement("DELETE FROM foodtable WHERE productnum=?");
            pst.setString(1, orderID);
            
            int k = pst.executeUpdate();
            
            if(k == 1){
            
                JOptionPane.showMessageDialog(this, "Order Deleted to the list");
                foodComboBox.setSelectedItem("None");
                foodpriceTextField.setText("0.0");
                foodquantityTextField.setText("0");
                totalPriceFoodTextField.setText("0.0");
                drinkComboBox.setSelectedItem("None");
                drinkspriceTextField.setText("0.0");
                drinkquantityTextField.setText("0");
                totaldrinksPriceTextField.setText("0.0");
                totalAllPriceTextLabel.setText("0.0");
                foodComboBox.requestFocus();
                tableContent();
                findIDNumber();
                
            }else{
                JOptionPane.showMessageDialog(this, "Order Failed to Deleted to the list");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        foodComboBox.setSelectedItem("None");
        foodpriceTextField.setText("");
        foodquantityTextField.setText("");
        totalPriceFoodTextField.setText("0.0");
        drinkComboBox.setSelectedItem("None");
        drinkspriceTextField.setText("");
        drinkquantityTextField.setText("");
        totaldrinksPriceTextField.setText("0.0");
        totalAllPriceTextLabel.setText("0.0");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void totalfoodpriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalfoodpriceButtonActionPerformed
        // TODO add your handling code here:
        if (foodpriceTextField.getText().isEmpty() && "0.0".equals(foodpriceTextField.getText()) || foodComboBox.getSelectedItem() == "None"){
            JOptionPane.showMessageDialog(this, "Please Choose Food Drink!");
            foodpriceTextField.setText("0.0");
            foodquantityTextField.setText("0");
        }
        else if (foodquantityTextField.getText().isEmpty() || "0".equals(foodquantityTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please put Order Qty!");
            foodquantityTextField.setText("0");
        }
        else{
        double num1 = Double.parseDouble(foodpriceTextField.getText());
        double num2 = Double.parseDouble(foodquantityTextField.getText());
        Total T = new Total();
        T.multiplyPrice(num1, num2);
        totalPriceFoodTextField.setText(String.valueOf(T.getTprice()));
    }//GEN-LAST:event_totalfoodpriceButtonActionPerformed
}
    
    private void totaldrinkpriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaldrinkpriceButtonActionPerformed
        // TODO add your handling code here:
        if(drinkComboBox.getSelectedItem() == "None" && drinkspriceTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Choose Drink!");
            drinkspriceTextField.setText("0.0");
            drinkquantityTextField.setText("0");
    }//GEN-LAST:event_totaldrinkpriceButtonActionPerformed
        else if (drinkquantityTextField.getText().isEmpty() || "0".equals(drinkquantityTextField.getText())){
            JOptionPane.showMessageDialog(this, "Please put Drink Qty!");
            drinkquantityTextField.setText("0");
        }
        else{
        double num1 = Double.parseDouble(drinkspriceTextField.getText());
        double num2 = Double.parseDouble(drinkquantityTextField.getText());
        Total T = new Total();
        T.multiplyPrice(num1, num2);
        totaldrinksPriceTextField.setText(String.valueOf(T.getTprice()));
    }
}
    private void drinkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkComboBoxActionPerformed
        
        if (drinkComboBox.getSelectedItem() == "None"){
                drinkspriceTextField.setText("0.0");
                drinkquantityTextField.setText("0");
                totaldrinksPriceTextField.setText("0.0");

        }else if (drinkComboBox.getSelectedItem() == "Softdrink"){
                DrinkList dl = new DrinkList();
                dl.setPriceSoftdrink(15.00);
                drinkspriceTextField.setText(String.valueOf(dl.getPriceSoftdrink()));
                
        }else if (drinkComboBox.getSelectedItem() == "Iced Tea"){
                DrinkList dl = new DrinkList();
                dl.setPriceIcedTea(10.00);
                drinkspriceTextField.setText(String.valueOf(dl.getPriceIcedTea()));
                
        }else if (drinkComboBox.getSelectedItem() == "Buko Juice"){
                DrinkList dl = new DrinkList();
                dl.setPriceBukoJuice(5.00);
                drinkspriceTextField.setText(String.valueOf(dl.getPriceBukoJuice()));
                        
        }else if (drinkComboBox.getSelectedItem() == "Lemonnade"){
                DrinkList dl = new DrinkList();
                dl.setPriceLemonnade(10.00);
                drinkspriceTextField.setText(String.valueOf(dl.getPriceLemonnade()));
                
        }else if (drinkComboBox.getSelectedItem() == "Zesto"){
                DrinkList dl = new DrinkList();
                dl.setPriceZesto(8.00);
                drinkspriceTextField.setText(String.valueOf(dl.getPriceZesto()));
                
        }
        
    }//GEN-LAST:event_drinkComboBoxActionPerformed

    private void computePriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computePriceButtonActionPerformed
        // TODO add your handling code here:

        if(totalPriceFoodTextField.getText() == "" || totalPriceFoodTextField.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please Compute the Total Price Food First!!");
        }
        else if(totaldrinksPriceTextField.getText() == "" || totaldrinksPriceTextField.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Please Compute the Total Price Drinks First!");
        }else{
        double foodTotalPrice = Double.parseDouble(totalPriceFoodTextField.getText());
        double drinkTotalPrice = Double.parseDouble(totaldrinksPriceTextField.getText());
        Total T = new Total();
        T.addtotalPrice(foodTotalPrice, drinkTotalPrice);
        totalAllPriceTextLabel.setText(String.valueOf(T.getTprice()));
        }
    }//GEN-LAST:event_computePriceButtonActionPerformed

    private void orderTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderTypeComboBoxActionPerformed
        // TODO add your handling code here:
        if (orderTypeComboBox.getSelectedItem() == "Order Type"){
            foodComboBox.setEnabled(false);
            foodComboBox.setSelectedItem("None");
            foodpriceTextField.setEnabled(false);
            foodpriceTextField.setText("0.0");
            totalfoodpriceButton.setEnabled(false);
            foodquantityTextField.setEnabled(false);
            foodquantityTextField.setText("0");
            
            drinkComboBox.setEnabled(false);
            drinkComboBox.setSelectedItem("None");
            drinkspriceTextField.setEnabled(false);
            drinkspriceTextField.setText("0.0");
            totaldrinkpriceButton.setEnabled(false);
            drinkquantityTextField.setEnabled(false);
            drinkquantityTextField.setText("0");
        }
        if (orderTypeComboBox.getSelectedItem() == "Food"){
            foodComboBox.setEnabled(true);
            foodpriceTextField.setEnabled(true);
            totalfoodpriceButton.setEnabled(true);
            foodquantityTextField.setEnabled(true);
            
            drinkComboBox.setEnabled(false);
            drinkComboBox.setSelectedItem("None");
            drinkspriceTextField.setEnabled(false);
            drinkspriceTextField.setText("0.0");
            totaldrinkpriceButton.setEnabled(false);
            drinkquantityTextField.setEnabled(false);
            drinkquantityTextField.setText("0");
        }
        else if (orderTypeComboBox.getSelectedItem() == "Drink"){
            foodComboBox.setEnabled(false);
            foodComboBox.setSelectedItem("None");
            foodpriceTextField.setEnabled(false);
            foodpriceTextField.setText("0.0");
            totalfoodpriceButton.setEnabled(false);
            foodquantityTextField.setEnabled(false);
            foodquantityTextField.setText("0");
            
            drinkComboBox.setEnabled(true);
            drinkspriceTextField.setEnabled(true);
            totaldrinkpriceButton.setEnabled(true);
            drinkquantityTextField.setEnabled(true);
        }
        else if (orderTypeComboBox.getSelectedItem() == "Food+Drink"){
            foodComboBox.setEnabled(true);
            foodpriceTextField.setEnabled(true);
            totalfoodpriceButton.setEnabled(true);
            foodquantityTextField.setEnabled(true);
            
            drinkComboBox.setEnabled(true);
            drinkspriceTextField.setEnabled(true);
            totaldrinkpriceButton.setEnabled(true);
            drinkquantityTextField.setEnabled(true);
        }
    }//GEN-LAST:event_orderTypeComboBoxActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Are you Sure You Want to Log Out?","Alert",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            new LoginFrame().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void viewFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFrameButtonActionPerformed
        // TODO add your handling code here:
        new ViewOrderFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_viewFrameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel computePanel;
    private javax.swing.JButton computePriceButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> drinkComboBox;
    private javax.swing.JLabel drinkqtyLabel;
    private javax.swing.JTextField drinkquantityTextField;
    private javax.swing.JTextField drinkspriceTextField;
    private javax.swing.JLabel equalLabel1;
    private javax.swing.JLabel equalLabel2;
    private javax.swing.JComboBox<String> foodComboBox;
    private javax.swing.JLabel foodorderLabel;
    private javax.swing.JTextField foodpriceTextField;
    private javax.swing.JLabel foodquantityLabel;
    private javax.swing.JTextField foodquantityTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable orderTable;
    private javax.swing.JComboBox<String> orderTypeComboBox;
    private javax.swing.JComboBox<String> ordernumComboBox;
    private javax.swing.JLabel ordernumLabel;
    private javax.swing.JLabel ordertypeLabel;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel selectUpdateDeleteLabel;
    private javax.swing.JPanel tableorderPanel;
    private javax.swing.JLabel totalAllPriceTextLabel;
    private javax.swing.JLabel totalAllPriceTextLabel1;
    private javax.swing.JTextField totalPriceFoodTextField;
    private javax.swing.JButton totaldrinkpriceButton;
    private javax.swing.JLabel totaldrinkpriceLabel;
    private javax.swing.JTextField totaldrinksPriceTextField;
    private javax.swing.JButton totalfoodpriceButton;
    private javax.swing.JLabel totalfoodpriceLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewFrameButton;
    private javax.swing.JLabel withdrinksLabel;
    // End of variables declaration//GEN-END:variables

    private void tableContent() {
     try {
         int q;
         pst = con.prepareStatement("SELECT * FROM foodtable");
         rs = pst.executeQuery();
         ResultSetMetaData rss = rs.getMetaData();
         q = rss.getColumnCount();
         
         DefaultTableModel dtm = (DefaultTableModel)orderTable.getModel();
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
