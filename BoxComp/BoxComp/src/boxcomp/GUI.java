package boxcomp;
        
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * 
 * @author UP780104, UP780065, UP793946
 */
public class GUI extends javax.swing.JFrame {
    public double Total = 0; //The total cost of the order
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        spnQuantity.setValue(1); //Set the quantity to start at 1
    }

    //--------------------------------
    //Netbeans generated code below --
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog = new javax.swing.JDialog();
        lblBoxOrder = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        width = new javax.swing.JTextField();
        length = new javax.swing.JTextField();
        cmbGrade = new javax.swing.JComboBox();
        chkBottom = new javax.swing.JCheckBox();
        chkCorners = new javax.swing.JCheckBox();
        chkTop = new javax.swing.JCheckBox();
        spnQuantity = new javax.swing.JSpinner();
        lvlGrade = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        colBox = new javax.swing.JComboBox<String>();
        lblColour = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        lblWidth = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lvlX1 = new javax.swing.JLabel();
        lblX2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblM = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();
        lblTCost = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnCmplt = new javax.swing.JButton();

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog.getContentPane());
        dialog.getContentPane().setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(396, 600));
        setMinimumSize(new java.awt.Dimension(396, 600));
        getContentPane().setLayout(null);

        lblBoxOrder.setText("Box Ordering Form");
        getContentPane().add(lblBoxOrder);
        lblBoxOrder.setBounds(12, 13, 120, 14);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));

        cmbGrade.setMaximumRowCount(5);
        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        cmbGrade.setToolTipText("");

        chkBottom.setText("Reinforced Bottom");

        chkCorners.setText("Reinforced Corners");

        chkTop.setText("Sealable Top");

        spnQuantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnQuantityStateChanged(evt);
            }
        });

        lvlGrade.setText("Card Grade");

        lblQuantity.setText("Quantity");

        colBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No colour", "1 Colour", "2 Colours" }));

        lblColour.setText("Colour Printing");

        lblWidth.setText("Width:");

        lblLength.setText("Length:");

        lblHeight.setText("Height:");

        lvlX1.setText("M x");

        lblX2.setText("M x");

        btnAdd.setForeground(new java.awt.Color(0, 153, 0));
        btnAdd.setText("Add to Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(204, 0, 51));
        btnReset.setText("Clear Fields");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblM.setText("M");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColour)
                            .addComponent(colBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvlGrade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAdd)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkTop)
                                .addComponent(chkCorners)
                                .addComponent(chkBottom))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWidth)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lvlX1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLength)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblX2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblM))
                                    .addComponent(lblHeight))))
                        .addGap(28, 28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWidth)
                    .addComponent(lblLength)
                    .addComponent(lblHeight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlX1)
                    .addComponent(lblX2)
                    .addComponent(lblM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lvlGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblColour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(colBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnAdd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkBottom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCorners)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkTop)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 350, 280);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        receipt.setBackground(new java.awt.Color(204, 204, 204));
        receipt.setColumns(20);
        receipt.setRows(5);
        receipt.setText("ORDER RECEIPT");
        receipt.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(receipt);

        lblTotal.setText("Total:");

        lblTCost.setText("0.0");

        btnClear.setForeground(new java.awt.Color(204, 0, 51));
        btnClear.setText("Clear Order");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnCmplt.setForeground(new java.awt.Color(0, 153, 0));
        btnCmplt.setText("Complete Order");
        btnCmplt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCmpltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCmplt))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lblTotal)
                                .addGap(25, 25, 25)
                                .addComponent(lblTCost))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTCost))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnCmplt))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 320, 350, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //End of netbeans generated code --
    //---------------------------------
    
    /**
     * Reset button
     * This wipes the input and output fields
     * 
     * @param evt
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Resetting the whole input form
        //Clear text boxes and checkboxes
        
        //Clear the dimension boxes
        width.setText("");
        height.setText("");
        length.setText("");
        
        //Clear the check boxes
        chkBottom.setSelected(false);
        chkCorners.setSelected(false);
        chkTop.setSelected(false);
        
        //Reset the quantity spinner
        spnQuantity.setValue(1);
        
        //Reset the colour dropdown
        colBox.setSelectedIndex(0);
        
        //Reset the grade dropdown
        cmbGrade.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed
    
    
    /**
     * Confirm button
     * This is used to validate and submit the box specs
     * After being clicked input is wiped
     * 
     * @param evt
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //validate and choose box
        try{
            //Get the dimensions to test for valid size
            double w = Double.parseDouble(width.getText());
            double l = Double.parseDouble(length.getText());
            double h = Double.parseDouble(height.getText());
            
            //Test if the dimensions are within the valid ranges.
            if (w < 0.1 || l < 0.1 || h < 0.1 || w > 10 || l > 10 || h > 10){
                JOptionPane.showMessageDialog(null, "Box size limited to: \n - Min: 0.1m \n - Max: 10m", "Number out of range!", JOptionPane.ERROR_MESSAGE);
            }
            else {
                //Get all the other variables needed to create the box from user inputs.
                int grade = cmbGrade.getSelectedIndex() + 1;
                int col = colBox.getSelectedIndex();
                boolean bott = chkBottom.isSelected();
                boolean corn = chkCorners.isSelected();
                boolean seal = chkTop.isSelected();
                int quan = (int) spnQuantity.getValue();

                //Now we will create the box
                createBox(grade, col, bott, corn, w, l, h, quan, seal);
                }
        }catch(NumberFormatException e){ //The user didn't enter a number into the right fields.
                //Size values aren't doubles
                JOptionPane.showMessageDialog(null, "Size must be a number!", 
                        "Wrong Size", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    /**
     * Determine what box type the user is ordering and create a box of that type.
     * @param grade The grade of the box
     * @param col How many colours the box has
     * @param bott  Does it have a reinforced bottom?
     * @param corn Does it have reinforced corners?
     * @param w The width of the box
     * @param l The length of the box
     * @param h The height of the box
     * @param quan How many of the box is in the order
     * @param seal Does it have a sealable top.
     */
    public void createBox(int grade, int col, boolean bott, boolean corn, 
            double w, double l, double h, int quan, boolean seal){
    
        //Does the box exist?
        String valid = validateBox(grade, col, bott, corn);        
        if(valid.equals("good")){ //The box exists.
            Box box;
            //Make the correct box
            if (col == 0){ //Box Type 1
                box = new BoxType1(grade, l, w, h, seal);
            }
            else if (col == 1){ //Box Type 2
                box = new BoxType2(grade, l, w, h, seal);
            }
            else if (col == 2 && bott == false){ //Box Type 3
                box = new BoxType3(grade, l, w, h, seal);
            }
            else if (col == 2 && bott == true && corn == false){ //Box Type 4
                box = new BoxType4(grade, l, w, h, seal);
            }
            else{ //Box Type 5
                box = new BoxType5(grade, l, w, h, seal);
            }
            
            //Print out the receipt
            writeToReceipt(box, quan);

        }else{ //The box doesn't exist so send an error.
            JOptionPane.showMessageDialog(null, valid, "Box Not Available", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * Make sure the quantity spinner can't go below 1 or above 100.
     * @param evt The mouse click event
     */
    private void spnQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQuantityStateChanged
        int val = (int) spnQuantity.getValue(); //Get the quantity the user wanted
        //Is the quantity below 1?
        if (val<1){
            //Reset it back to 1
            spnQuantity.setValue(1);
        } else if (val > 100) { //Is it more than 100?
            //Reset it back to 100
            spnQuantity.setValue(100);
        }
    }//GEN-LAST:event_spnQuantityStateChanged

    /**
     * Reset the order by clearing the receipt.
     * @param evt The mouse click event
     */
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        //Reset the receipt by clearing the textbox
        receipt.setText("ORDER RECEIPT");
        //Reset the total order cost
        Total = 0;
        //Reset the cost label
        lblTCost.setText("£0.00");
    }//GEN-LAST:event_btnClearMouseClicked

    /**
     * Dummy complete method, the form isn't actually sent anywhere
     * The form/order is just cleared for now.
     * @param evt 
     */
    private void btnCmpltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCmpltMouseClicked
        //Reset the receipt by clearing the textbox
        receipt.setText("ORDER RECEIPT");
        //Reset the total order cost
        Total = 0;
        //Reset the cost label
        lblTCost.setText("£0.00");
        
        //Clear the dimension boxes
        width.setText("");
        height.setText("");
        length.setText("");
        
        //Clear the check boxes
        chkBottom.setSelected(false);
        chkCorners.setSelected(false);
        chkTop.setSelected(false);
        
        //Reset the quantity spinner
        spnQuantity.setValue(1);
        
        //Reset the colour dropdown
        colBox.setSelectedIndex(0);
        
        //Reset the grade dropdown
        cmbGrade.setSelectedIndex(0);
    }//GEN-LAST:event_btnCmpltMouseClicked
        
    /**
    * Print the new box into the receipt and calculate the total cost of the
    * order.
    * @param box The box that was created.
    * @param quantity How many boxes of this type there are in the order.
    */
    public void writeToReceipt(Box box, int quantity){
        //Set formatting 
        DecimalFormat dFormat = new DecimalFormat("0.00");
        
        receipt.setText(receipt.getText() + "\n===============================");
        receipt.setText(receipt.getText() + "\n     BoxType:" + box.getType());
        
        //Get the extras from the box class
        receipt.setText(receipt.getText() + box.getReceipt());
        receipt.setText(receipt.getText() + "\n     Quantity: \tx" + quantity);
        double itmTotal = (double)(Math.round(box.getTotal()*quantity*100))/100;
        receipt.setText(receipt.getText() + "\n     Item Total: \t£" + dFormat.format(itmTotal));
        
        //Calculate the total cost of the order
        Total += box.getTotal() * quantity;
        //Format the total to 2 deciaml places
        Total = (double)(Math.round(Total*100))/100;
        lblTCost.setText("£" + dFormat.format(Total));
    }
    
    /**
     * 
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    //Netbeans generated code
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCmplt;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkBottom;
    private javax.swing.JCheckBox chkCorners;
    private javax.swing.JCheckBox chkTop;
    private javax.swing.JComboBox cmbGrade;
    private javax.swing.JComboBox<String> colBox;
    private javax.swing.JDialog dialog;
    private javax.swing.JTextField height;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoxOrder;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTCost;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblWidth;
    private javax.swing.JLabel lblX2;
    private javax.swing.JTextField length;
    private javax.swing.JLabel lvlGrade;
    private javax.swing.JLabel lvlX1;
    private javax.swing.JTextArea receipt;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTextField width;
    // End of variables declaration//GEN-END:variables
    //End of netbeans generated code
    /**
     * Determine if the box the user wants to create exists in flexbox. If not
     * return exactly what is wrong so the user knows what to change.
     * @param grade The grade of the cardboard the user wants to have.
     * @param colour How many colours the user wants on the box.
     * @param bottom Does the user want to have reinforced bottom on the box
     * @param corner Does the user want to have reinforced corners on the box
     * @return Returns "good" if there are no issues or a string of why this box
     * can't be created.
     */
    private String validateBox(int grade, int colour, boolean bottom, boolean corner){
        boolean fail = false;
        String cause = ""; //We need a variable to store all the issues
        
        //Reinforced corners MUST have reinforced bottom
        if(corner&&!bottom){
            fail = true;
            cause += "Reinforced Bottom is required for Reinforced Corners \n";
        }
        //Grade 2 or above is needed for reinforced bottom
        if(bottom&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for Reinforced Bottom \n";
        }
        //Grade 3 or above is needed for reinforced corners
        if(corner&&grade<3){
            fail = true;
            cause += "Grade 3 or higher is required for Reinforced Corners \n";
        }
        //You need 2 colours for reinforced bottom
        if (colour!=2&&bottom){
            fail = true;
            cause += "2 Colours are required for Reinforced Bottom \n";
        }
        //Grade 2 or higher is needed for 2 colours
        if(colour==2&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for 2 Colours \n";
        }
        //Grade 2-4 is needed for only 1 colour
        if((grade<2 || grade>4) && colour==1){
            fail = true;
            cause += "Grade 2-4 is required for 1 Colour \n";
        }
        //Grade 1-3 is needed for no colours
        if(colour==0&&grade>3){
            fail = true;
            cause += "Grade 3 or lower is required for no Colours \n";
        }
        
        //Did the validation fail?
        if(fail){
            //Return everything that's wrong
            return cause;
        } else {
            //It didn't fail so return "good"
            return "good";
        }
    }
}
