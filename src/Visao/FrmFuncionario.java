/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Util.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Pessoal
 */
public class FrmFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form FrmFuncionario
     */
    public FrmFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);  //centralizar a tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFuncionario = new javax.swing.JPanel();
        btnMassagista = new javax.swing.JButton();
        btnSecretaria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setTitle("Cadastro de Funcionário");

        pnlFuncionario.setBackground(new java.awt.Color(204, 204, 255));
        pnlFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder("Funcionário"));

        btnMassagista.setText("Atendente");
        btnMassagista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMassagistaActionPerformed(evt);
            }
        });

        btnSecretaria.setText("Secretaria");
        btnSecretaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecretariaActionPerformed(evt);
            }
        });

        jLabel1.setText("Massagistas, Fisioterapeutas, Manicures");

        jLabel2.setText("Secretários, RH, Administradores");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFuncionarioLayout = new javax.swing.GroupLayout(pnlFuncionario);
        pnlFuncionario.setLayout(pnlFuncionarioLayout);
        pnlFuncionarioLayout.setHorizontalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSecretaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMassagista, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(25, 25, 25))
        );
        pnlFuncionarioLayout.setVerticalGroup(
            pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFuncionarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMassagista)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSecretaria)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMassagistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMassagistaActionPerformed
        // TODO add your handling code here:
        FrmVisualizarMassagista objMa = new FrmVisualizarMassagista();
        objMa.setVisible(true);
                
    }//GEN-LAST:event_btnMassagistaActionPerformed

    private void btnSecretariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecretariaActionPerformed
        // TODO add your handling code here:
        FrmVisualizarSecretaria objSe = new FrmVisualizarSecretaria();
        objSe.setVisible(true);
    }//GEN-LAST:event_btnSecretariaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Util.Utilitarios util = new Utilitarios();
        util.fecharJanela(this);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMassagista;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSecretaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnlFuncionario;
    // End of variables declaration//GEN-END:variables
}
