/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicstore.ui.buyproduct;

import java.util.List;
import musicstore.datastructures.AccountInfo;
import musicstore.datastructures.ProductInfo;
import musicstore.logic.AccountUpdater;
import musicstore.ui.browseproducts.MusicStoreBrowseProductsUI;

/**
 *
 * @author jablo
 */
public class MusicStoreBuyProductUI extends javax.swing.JFrame {

    private List<ProductInfo> context;
    private ProductInfo product;
    private AccountInfo account;
    
    /**
     * Creates new form MusicStoreBuyProductUI
     */
    public MusicStoreBuyProductUI() {
        initComponents();     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addToCartButton = new javax.swing.JButton();
        backToBrowseItemsButton = new javax.swing.JButton();
        musicStoreProductPanel1 = new musicstore.ui.buyproduct.MusicStoreProductPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MusicStore");

        addToCartButton.setText("Add to cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });

        backToBrowseItemsButton.setText("Back to product list");
        backToBrowseItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToBrowseItemsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musicStoreProductPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backToBrowseItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(musicStoreProductPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToBrowseItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToBrowseItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToBrowseItemsButtonActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(() -> {
            MusicStoreBrowseProductsUI musicStoreBrowseProductsUI = new MusicStoreBrowseProductsUI();
            musicStoreBrowseProductsUI.setVisible(true);
            musicStoreBrowseProductsUI.LoadData(context);
            musicStoreBrowseProductsUI.SetContext(account);
        });
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backToBrowseItemsButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        // TODO add your handling code here:
        AccountUpdater.AddToCart(product, account);
        
        //confirmation dialog
        
        java.awt.EventQueue.invokeLater(() -> {
            MusicStoreBrowseProductsUI musicStoreBrowseProductsUI = new MusicStoreBrowseProductsUI();
            musicStoreBrowseProductsUI.setVisible(true);
            musicStoreBrowseProductsUI.LoadData(context);
            musicStoreBrowseProductsUI.SetContext(account);
        });
        this.setVisible(false);
        this.dispose();                   
    }//GEN-LAST:event_addToCartButtonActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicStoreBuyProductUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MusicStoreBuyProductUI().setVisible(true);
        });
    }
    
    public void LoadData(ProductInfo product, AccountInfo account)
    {
        this.product = product;
        this.account = account;
        musicStoreProductPanel1.SetProductInfo(product);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JButton backToBrowseItemsButton;
    private musicstore.ui.buyproduct.MusicStoreProductPanel musicStoreProductPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @param context the context to set
     */
    public void setContext(List<ProductInfo> context) {
        this.context = context;
    }
}