/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.defalt.midtermexamination;
import java.awt.Dimension;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author ming
 */
public class GoodsPanel extends javax.swing.JPanel {

    /**
     * Creates new form GoodsPanel
     */
    int index = -1;
    DefaultTableModel model;
    public GoodsPanel() {
        initComponents();
        GoodsService.loadData();;
        model = (DefaultTableModel)goodsTable.getModel();
        model.setRowCount(0);
        updateTable();
        disbleUI();
    }public void updateTotalPrice(){
        ArrayList<Goods> goodsList = GoodsService.getGoodsList();
        double total=0;
        for(int i=0;i<goodsList.size();i++){
            total+=goodsList.get(i).getAmount()*goodsList.get(i).getPrice();
        }displayTotalPrice.setText(String.valueOf(total)+" Baht");
    }public void updateTotalItems(){
        ArrayList<Goods> goodsList = GoodsService.getGoodsList();
        int total=0;
        for(int i=0;i<goodsList.size();i++){
            total+=goodsList.get(i).getAmount();
        }displayTotalItems.setText(String.valueOf(total)+" item(s)");
    }
    public void clearTextField(){
        inputName.setText("");
        inputID.setText("");
        inputPrice.setText("");
        inputBrand.setText("");
        inputAmount.setText("");
    }
    public void disbleUI(){
        inputName.setEnabled(false);
        inputID.setEnabled(false);
        inputPrice.setEnabled(false);
        inputBrand.setEnabled(false);
        inputAmount.setEnabled(false);
        Save.setEnabled(false);
        cancelButton.setEnabled(false);
    }public void enableUI(){
        inputName.setEnabled(true);
        inputID.setEnabled(true);
        inputPrice.setEnabled(true);
        inputBrand.setEnabled(true);
        inputAmount.setEnabled(true);
        Save.setEnabled(true);
        cancelButton.setEnabled(true);
    }
    public void updateTable(){
        model.setRowCount(0);
        ArrayList<Goods> goodsList = GoodsService.getGoodsList();
        for(int i=0;i<goodsList.size();i++){
            Goods goods = goodsList.get(i);
            model.addRow(new Object[]{goods.getId(),goods.getName(), 
                goods.getBrand(),goods.getPrice(),goods.getAmount()});
            model.fireTableDataChanged();
        }updateTotalPrice();
        updateTotalItems();
        displayErrorMessage.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        goodsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        inputPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputAmount = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inputBrand = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        displayTotalItems = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        displayTotalPrice = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        displayErrorMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 153, 255));

        goodsTable.setBackground(new java.awt.Color(255, 102, 0));
        goodsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Brand", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(goodsTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Goods Management");

        jLabel2.setText("ID : ");

        inputID.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Name :");

        inputName.setBackground(new java.awt.Color(255, 255, 255));

        Save.setBackground(new java.awt.Color(255, 255, 0));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Price :");

        inputPrice.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Amount :");

        inputAmount.setBackground(new java.awt.Color(255, 255, 255));

        editButton.setBackground(new java.awt.Color(51, 255, 51));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(51, 255, 51));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(51, 255, 51));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Brand :");

        inputBrand.setBackground(new java.awt.Color(255, 255, 255));
        inputBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBrandActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Total :");

        displayTotalItems.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayTotalItems.setText("1Item(s)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Total price :");

        displayTotalPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        displayTotalPrice.setText("0.00 Baht");

        jLabel9.setText("Error message :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputID, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(inputBrand))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputName, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(inputPrice))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(168, 168, 168)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(45, 45, 45)))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayTotalItems, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Save)
                            .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(inputPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(inputBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(displayTotalItems))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(displayTotalPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(displayErrorMessage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editButton)
                            .addComponent(addButton)
                            .addComponent(deleteButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
       index = goodsTable.getSelectedRow();
       if(index<0){
           displayErrorMessage.setText("Please select row to edit goods!.");
           return;
       }enableUI();
       Goods goods = GoodsService.getGoods(index);
       inputID.setText(goods.getId());
       inputName.setText(goods.getName());
       inputBrand.setText(goods.getBrand());
       inputAmount.setText(String.valueOf(goods.getAmount()));
       inputPrice.setText(String.valueOf(goods.getPrice()));
    }//GEN-LAST:event_editButtonActionPerformed

    private void inputBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBrandActionPerformed
        enableUI();
    }//GEN-LAST:event_inputBrandActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        enableUI();
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearTextField();
        disbleUI();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
       if(index<0){
           GoodsService.addGoods(new Goods(inputID.getText(),inputName.getText()
                   ,inputBrand.getText(),Double.parseDouble(inputPrice.getText())
                   ,Integer.parseInt(inputAmount.getText())));
       }else{
           GoodsService.updateGoods(index, new Goods(inputID.getText()
                   ,inputName.getText(),inputBrand.getText(),
                   Double.parseDouble(inputPrice.getText())
                   ,Integer.parseInt(inputAmount.getText())));
       }updateTable();
       clearTextField();
       disbleUI();
       GoodsService.saveData();
    }//GEN-LAST:event_SaveActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        index = goodsTable.getSelectedRow();
        if(index<0){
            displayErrorMessage.setText("Please select row to delete goods!.");
            return;
        }int reply = JOptionPane.showConfirmDialog(null, "Are you sure?\n"
                + "ID : "+GoodsService.getGoods(index).getId()
                +" Name : "+GoodsService.getGoods(index).getName()
                +"\nBrand:"+GoodsService.getGoods(index).getBrand()
                +" Price : "+GoodsService.getGoods(index).getPrice()
                +" Amount : "+GoodsService.getGoods(index).getAmount()
                +"\nWill delete this process cannot be undone!!!"
                , "Delete goods", JOptionPane.YES_NO_OPTION);
        if(reply==JOptionPane.YES_OPTION){
            GoodsService.delGoods(index);
            updateTable();
        }
        disbleUI();
        GoodsService.saveData();
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel displayErrorMessage;
    private javax.swing.JLabel displayTotalItems;
    private javax.swing.JLabel displayTotalPrice;
    private javax.swing.JButton editButton;
    private javax.swing.JTable goodsTable;
    private javax.swing.JTextField inputAmount;
    private javax.swing.JTextField inputBrand;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
