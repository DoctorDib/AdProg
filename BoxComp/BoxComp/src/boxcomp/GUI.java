/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxcomp;
        
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Ben, James, Jake
 */
public class GUI extends javax.swing.JFrame {
//public String boxType;
public double Total = 0;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        spnQuantity.setValue(1);
    }

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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();
        lblTCost = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

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
        lblBoxOrder.setBounds(12, 13, 90, 14);

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

        lvlX1.setText("x");

        lblX2.setText("x");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWidth)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lvlX1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLength)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(length, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblX2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeight))
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lvlGrade)
                            .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColour)
                            .addComponent(colBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(btnReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(lblX2))
                .addGap(27, 27, 27)
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
                .addContainerGap(40, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblTotal)
                        .addGap(25, 25, 25)
                        .addComponent(lblTCost))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClear)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addComponent(btnClear)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 320, 350, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Reset button
     * This wipes the input and output fields
     * 
     * @param evt
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Resetting the whole form
        
        width.setText("");
        height.setText("");
        length.setText("");
        
        chkBottom.setSelected(false);
        chkCorners.setSelected(false);
        chkTop.setSelected(false);
        
        spnQuantity.setValue(1);
        
        colBox.setSelectedIndex(0);
        
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
                //Tests for valid size inputs
            if ((Double.parseDouble(width.getText()) < 0.1) || (Double.parseDouble(length.getText()) < 0.1) || (Double.parseDouble(height.getText()) < 0.1) || (Double.parseDouble(width.getText()) > 10) || (Double.parseDouble(length.getText())> 10) || (Double.parseDouble(height.getText()) > 10)){
                JOptionPane.showMessageDialog(null, "Box size limited to: \n - Min: 0.1m \n - Max: 10m", "Number out of range!", JOptionPane.ERROR_MESSAGE);
            }
            else {
                int grade = cmbGrade.getSelectedIndex() + 1;
                int col = colBox.getSelectedIndex();
                boolean bott = chkBottom.isSelected();
                boolean corn = chkCorners.isSelected();
                boolean seal = chkTop.isSelected();
                //double cost = 0; 
                int quan = (int) spnQuantity.getValue();
                double w = Double.parseDouble(width.getText());
                double l = Double.parseDouble(length.getText());
                double h = Double.parseDouble(height.getText());

                //Assuming no validation issues
                createBox(grade, col, bott, corn, w, l, h, quan, seal);
                }
        }catch(NumberFormatException e){
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
    
    //Test if box can exist
        String valid = validate(grade, col, bott, corn);        
        if(valid.equals("good")){
            Box box;
            //make box
            if (col == 0){
                box = new BoxType1(grade, l, w, h, seal);
            }
            else if (col == 1){
                box = new BoxType2(grade, l, w, h, seal);
            }
            else if (col == 2 && bott == false){
                box = new BoxType3(grade, l, w, h, seal);
            }
            else if (col == 2 && bott == true && corn == false){
                box = new BoxType4(grade, l, w, h, seal);
            }
            else{
                box = new BoxType5(grade, l, w, h, seal);
            }
            writeToReceipt(box, quan);

        }else{
            JOptionPane.showMessageDialog(null, valid, "Box Not Available", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * Make sure the quantity spinner can't go below 1 or above 100.
     * @param evt The mouse click event
     */
    private void spnQuantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnQuantityStateChanged
        int val = (int) spnQuantity.getValue();
        if (val<1){
            spnQuantity.setValue(1);
        } else if (val > 100) {
            spnQuantity.setValue(100);
        }
    }//GEN-LAST:event_spnQuantityStateChanged

    /**
     * Reset the order by clearing the receipt.
     * @param evt The mouse click event
     */
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        receipt.setText("");
        Total = 0;
        lblTCost.setText("£0.00");
    }//GEN-LAST:event_btnClearMouseClicked
        
    /**
    * Print the new box into the receipt and calculate the total cost of the
    * order.
    * @param box The box that was created.
    * @param quantity How many boxes of this type there are in the order.
    */
    public void writeToReceipt(Box box, int quantity){
        DecimalFormat dFormat = new DecimalFormat("0.00");
        receipt.setText(receipt.getText() + "\n===============================");
        receipt.setText(receipt.getText() + "\n     BoxType:" + box.getType());
        receipt.setText(receipt.getText() + box.getReceipt());
        receipt.setText(receipt.getText() + "\n     Quantity: \tx" + quantity);
        double itmTotal = (double)(Math.round(box.getTotal()*quantity*100))/100;
        receipt.setText(receipt.getText() + "\n     Item Total: \t£" + dFormat.format(itmTotal));
        
        Total += box.getTotal() * quantity;
        Total = (double)(Math.round(Total*100))/100;
        lblTCost.setText("£" + dFormat.format(Total));
    }
    
    /**
     * 
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
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
    private String validate(int grade, int colour, boolean bottom, boolean corner){
        boolean fail = false;
        String cause = "";
        if(corner&&!bottom){
            fail = true;
            cause += "Reinforced Bottom is required for Reinforced Corners \n";
        }
        if(bottom&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for Reinforced Bottom \n";
        }
        if(corner&&grade<3){
            fail = true;
            cause += "Grade 3 or higher is required for Reinforced Corners \n";
        }
        if (colour!=2&&bottom){
            fail = true;
            cause += "2 Colours are required for Reinforced Bottom \n";
        }
        if(colour==2&&grade==1){
            fail = true;
            cause += "Grade 2 or higher is required for 2 Colours \n";
        }
        if((grade<2 || grade>4) && colour==1){
            fail = true;
            cause += "Grade 2-4 is required for 1 Colour \n";
        }
        if(colour==0&&grade>3){
            fail = true;
            cause += "Grade 3 or lower is required for no Colours \n";
        }
        if(fail){
            return cause;
        } else {
            return "good";
        }
    }
}
