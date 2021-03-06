/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import BancoDeDados.DatabaseUtilit;
import BancoDeDados.MercadoriaDAO;
import Modelo.MercadoriaModelo;
import Util.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Pessoal
 */
public class FrmVisualizarMercadoria extends javax.swing.JFrame {

    /**
     * Creates new form FrmVisualizarMercadoria
     */
    private MercadoriaModelo model;
    FrmMercadoria frmM;
    
    public FrmVisualizarMercadoria() {
        initComponents();
        frmM = new FrmMercadoria(this);
        this.setLocationRelativeTo(null);  //centralizar a tela
        configuraTabelaModelo();
        configuraTabelaColunas();
    }
    
    public void refresh() //atualiza a tabela (após remoção)
    {
        configuraTabelaModelo();
        configuraTabelaColunas();
    }
    
    public void configuraTabelaModelo()
    {
        model = new MercadoriaModelo();
        model.fillingRows();
        jtMercadoria.setModel(model);
    }
    
     public void configuraTabelaModelo(String like) //polimorfismo
    {
        model = new MercadoriaModelo();
        model.fillingRows(like);
        jtMercadoria.setModel(model);
    }
     
     public void configuraTabelaModelo(int like) //polimorfismo
    {
        model = new MercadoriaModelo();
        model.fillingRows(like);
        jtMercadoria.setModel(model);
    }
     
    public void configuraTabelaColunas()
    {
        jtMercadoria.getColumnModel().getColumn(0).setPreferredWidth(52);
        jtMercadoria.getColumnModel().getColumn(1).setPreferredWidth(100);
        jtMercadoria.getColumnModel().getColumn(2).setPreferredWidth(160);
        jtMercadoria.getColumnModel().getColumn(3).setPreferredWidth(120);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVisualizarCliente = new javax.swing.JPanel();
        cbbBuscarPor = new javax.swing.JComboBox();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMercadoria = new javax.swing.JTable();
        btnCadastro = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        brnAlterar = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();

        pnlVisualizarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Visualizar Mercadoria"));

        cbbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "código", "nome" }));
        cbbBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbBuscarPorItemStateChanged(evt);
            }
        });

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jtMercadoria);

        btnCadastro.setText("Cadastrar Mercadoria");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        brnAlterar.setText("Alterar");
        brnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnAlterarActionPerformed(evt);
            }
        });

        btnVerTodos.setText("Ver todos");
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVisualizarClienteLayout = new javax.swing.GroupLayout(pnlVisualizarCliente);
        pnlVisualizarCliente.setLayout(pnlVisualizarClienteLayout);
        pnlVisualizarClienteLayout.setHorizontalGroup(
            pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlVisualizarClienteLayout.createSequentialGroup()
                        .addGroup(pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVisualizarClienteLayout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cbbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerTodos))
                            .addGroup(pnlVisualizarClienteLayout.createSequentialGroup()
                                .addComponent(btnCadastro)
                                .addGap(86, 86, 86)
                                .addComponent(btnExcluir)
                                .addGap(110, 110, 110)
                                .addComponent(brnAlterar)))
                        .addGap(0, 325, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlVisualizarClienteLayout.setVerticalGroup(
            pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVisualizarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnVerTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVisualizarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(brnAlterar))
                    .addComponent(btnCadastro))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVisualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVisualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(cbbBuscarPor.getSelectedItem().toString()=="código") { //Faz a busca por código
            configuraTabelaModelo(Integer.parseInt(txtPesquisa.getText() ) );
        }
        
        if(cbbBuscarPor.getSelectedItem().toString()=="nome") { //Faz a Busca por nome
            String nomeComAspas = "\'"+"%"+ txtPesquisa.getText()+"%"+"\'"; //concatena o nome com '% para busca com like
            configuraTabelaModelo(nomeComAspas); // '%exemplo%'
        }
        configuraTabelaColunas();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        frmM.operacao = "salvar";
        frmM.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void brnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnAlterarActionPerformed
        int row = jtMercadoria.convertRowIndexToModel(jtMercadoria.getSelectedRow());
        MercadoriaModelo model = (MercadoriaModelo)jtMercadoria.getModel();
        if(row >= 0)
            {
                frmM.operacao = "alterar";
                frmM.setCodigoMercadoriaAlteracao(Integer.parseInt(model.getValueAt(row, 0).toString()));
                frmM.setTxtNome(model.getValueAt(row, 1).toString());
                frmM.setTxtCodFornecedor(model.getValueAt(row, 2).toString());
                frmM.setTxtDescricao(model.getValueAt(row, 3).toString());
                frmM.setTxtValor(model.getValueAt(row, 4).toString());
                frmM.setTxtQuantidade(model.getValueAt(row, 5).toString());
                frmM.setVisible(true);
            }
        else
                JOptionPane.showMessageDialog(rootPane, "Escolha uma Mercadoria na lista para fazer a alteração"); 
    }//GEN-LAST:event_brnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null,"Deseja excluir cadastro selecionado? A operação não poderá ser desfeita.","ATENÇÃO ",javax.swing.JOptionPane.YES_NO_OPTION)==0)
        {
            int row = jtMercadoria.convertRowIndexToModel(jtMercadoria.getSelectedRow());
            MercadoriaModelo model = (MercadoriaModelo)jtMercadoria.getModel();
            if(row >= 0) {
                int codigoMercadoriaDeletar = (Integer.parseInt(model.getValueAt(row, 0).toString()));
                
                Modelo.Mercadoria m = new Modelo.Mercadoria(codigoMercadoriaDeletar);
                DatabaseUtilit.Conectar();
                MercadoriaDAO mDAO = new MercadoriaDAO();
                mDAO.deleteMercadoria(m);
                refresh(); //atualiza o jTable sem o valor removida
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Escolha um Cliente na lista para fazer a alteração"); 
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cbbBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbBuscarPorItemStateChanged
        if(cbbBuscarPor.getSelectedItem().toString()=="código"){
            txtPesquisa.setText("");
        }
        if(cbbBuscarPor.getSelectedItem().toString()=="nome"){
            txtPesquisa.setText("");
        }
    }//GEN-LAST:event_cbbBuscarPorItemStateChanged

    private void txtPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyTyped
        if(cbbBuscarPor.getSelectedItem().toString()=="código"){
            Utilitarios util = new Utilitarios();
            util.apenasNumeros(evt);
        }
    }//GEN-LAST:event_txtPesquisaKeyTyped

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        configuraTabelaModelo();
        configuraTabelaColunas();
        txtPesquisa.setText("");
    }//GEN-LAST:event_btnVerTodosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVisualizarMercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarMercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarMercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVisualizarMercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVisualizarMercadoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JComboBox cbbBuscarPor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMercadoria;
    private javax.swing.JPanel pnlVisualizarCliente;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
