/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.common.ui;

import com.pos.store.ui.AllOrders;
import com.pos.store.ui.CategoryManage;
import com.pos.store.ui.ClienManage;
import com.pos.store.ui.CreateOrderManage;
import com.pos.store.ui.ItemManage;
import com.pos.store.ui.WarehouseManage;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author moata
 */
public class MainFrame extends javax.swing.JFrame {

    CategoryManage category = new CategoryManage();
    ItemManage item = new ItemManage();
    WarehouseManage wareHouse = new WarehouseManage();
    AllOrders orders = new AllOrders();
    CreateOrderManage CreatOrder = new CreateOrderManage();
    ClienManage client = new ClienManage();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        initComponents();
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//        this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CategoryMI = new javax.swing.JMenuItem();
        itemMIActionPerformed = new javax.swing.JMenuItem();
        wareHoMIActionPerformed = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemAllorders = new javax.swing.JMenuItem();
        jMenuItemcreatOrder = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAddClient = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 10);
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/common/icon/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel1, new java.awt.GridBagConstraints());

        jMenu1.setText("Stock");

        CategoryMI.setText("Category");
        CategoryMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryMIActionPerformed(evt);
            }
        });
        jMenu1.add(CategoryMI);

        itemMIActionPerformed.setText("Items");
        itemMIActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMIActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(itemMIActionPerformed);

        wareHoMIActionPerformed.setText("Ware House");
        wareHoMIActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wareHoMIActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(wareHoMIActionPerformed);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Sales");

        jMenuItemAllorders.setText("All Orders");
        jMenuItemAllorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAllordersActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemAllorders);

        jMenuItemcreatOrder.setText("Creat Order");
        jMenuItemcreatOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcreatOrderActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemcreatOrder);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Client");

        jMenuItemAddClient.setText("Add Client");
        jMenuItemAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddClientActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAddClient);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CategoryMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryMIActionPerformed
        // TODO add your handling code here:

//        this.setContentPane(new MoJFrame());
//        this.validate();
//        this.repaint();
//        
        item.setVisible(false);
        wareHouse.setVisible(false);
        orders.setVisible(false);
        CreatOrder.setVisible(false);
        client.setVisible(false);
        category.setVisible(true);

    }//GEN-LAST:event_CategoryMIActionPerformed

    private void itemMIActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMIActionPerformedActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(this, "jmjjljmkl");

        category.setVisible(false);
        wareHouse.setVisible(false);
        orders.setVisible(false);
        CreatOrder.setVisible(false);
        client.setVisible(false);
        item.setVisible(true);
    }//GEN-LAST:event_itemMIActionPerformedActionPerformed

    private void wareHoMIActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wareHoMIActionPerformedActionPerformed
        // TODO add your handling code here:

        category.setVisible(false);
        item.setVisible(false);
        orders.setVisible(false);
        CreatOrder.setVisible(false);
        client.setVisible(false);
        wareHouse.setVisible(true);


    }//GEN-LAST:event_wareHoMIActionPerformedActionPerformed

    private void jMenuItemAllordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAllordersActionPerformed
        // TODO add your handling code here:
        
        category.setVisible(false);
        item.setVisible(false);
        wareHouse.setVisible(false);
       CreatOrder.setVisible(false);
       client.setVisible(false);
        orders.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAllordersActionPerformed

    private void jMenuItemcreatOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcreatOrderActionPerformed
        // TODO add your handling code here:
        
        
        category.setVisible(false);
        item.setVisible(false);
        wareHouse.setVisible(false);
        orders.setVisible(false);
        client.setVisible(false);
        CreatOrder.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemcreatOrderActionPerformed

    private void jMenuItemAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddClientActionPerformed
        // TODO add your handling code here:
        
        category.setVisible(false);
        item.setVisible(false);
        wareHouse.setVisible(false);
        orders.setVisible(false);
        CreatOrder.setVisible(false);
        client.setVisible(true);
    }//GEN-LAST:event_jMenuItemAddClientActionPerformed

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
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CategoryMI;
    private javax.swing.JMenuItem itemMIActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAddClient;
    private javax.swing.JMenuItem jMenuItemAllorders;
    private javax.swing.JMenuItem jMenuItemcreatOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem wareHoMIActionPerformed;
    // End of variables declaration//GEN-END:variables

}
