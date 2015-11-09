/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import BancoDeDados.DatabaseUtilit;
import BancoDeDados.MassagistaDAO;
import Modelo.Massagista;
import Util.Utilitarios;
import javax.swing.JOptionPane;

/**
 *
 * @author Pessoal
 */
public class FrmMassagista extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionario
     */
    public FrmMassagista() {
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

        pnlMassagista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeMassagista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxMasculino = new javax.swing.JCheckBox();
        cbxFeminino = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNroCasa = new javax.swing.JTextField();
        instform = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JTextField();
        txtAnosExperiencia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        txtCpfMassagista = new javax.swing.JFormattedTextField();
        txtRgMassagista = new javax.swing.JFormattedTextField();
        txtTelefoneMassagista = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();

        setTitle("Cadastro de Funcionários Atendentes ao Público");

        pnlMassagista.setBorder(javax.swing.BorderFactory.createTitledBorder("Atendente"));

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("RG:");

        cbxMasculino.setText("Masculino");
        cbxMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMasculinoActionPerformed(evt);
            }
        });

        cbxFeminino.setText("Feminino");
        cbxFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFemininoActionPerformed(evt);
            }
        });

        jLabel5.setText("Gênero:");

        jLabel4.setText("Telefone:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel6.setText("Cep:");

        jLabel7.setText("Nº");

        txtNroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroCasaKeyTyped(evt);
            }
        });

        instform.setText("Formação:");

        jLabel8.setText("Anos de Experiência:");

        txtAnosExperiencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnosExperienciaKeyTyped(evt);
            }
        });

        jLabel9.setText("Especialidade:");

        try {
            txtCpfMassagista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfMassagista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfMassagistaKeyTyped(evt);
            }
        });

        try {
            txtRgMassagista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRgMassagista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgMassagistaActionPerformed(evt);
            }
        });
        txtRgMassagista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRgMassagistaKeyTyped(evt);
            }
        });

        try {
            txtTelefoneMassagista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneMassagista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneMassagistaKeyTyped(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnlMassagistaLayout = new javax.swing.GroupLayout(pnlMassagista);
        pnlMassagista.setLayout(pnlMassagistaLayout);
        pnlMassagistaLayout.setHorizontalGroup(
            pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMassagistaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(40, 40, 40)
                .addComponent(btnLimpar)
                .addGap(40, 40, 40)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(pnlMassagistaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMassagistaLayout.createSequentialGroup()
                        .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMassagistaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefoneMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbxFeminino)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMasculino)
                                .addGap(48, 48, 48))
                            .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlMassagistaLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCpfMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtRgMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMassagistaLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNomeMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))
                    .addGroup(pnlMassagistaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(pnlMassagistaLayout.createSequentialGroup()
                        .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlMassagistaLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEspecialidade))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMassagistaLayout.createSequentialGroup()
                                .addComponent(instform)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAnosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))))
        );
        pnlMassagistaLayout.setVerticalGroup(
            pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMassagistaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtCpfMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(cbxFeminino)
                    .addComponent(cbxMasculino)
                    .addComponent(txtTelefoneMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtNroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instform)
                    .addComponent(jLabel8)
                    .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(pnlMassagistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMassagista, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlMassagista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Util.Utilitarios util = new Utilitarios();
        util.fecharJanela(this);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Util.Utilitarios util = new Utilitarios();
        util.limparCampos(pnlMassagista);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtAnosExperienciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnosExperienciaKeyTyped
        
        //Codigo para que o JTextField aceite apenas números
        //String caracteres="0987654321";
        //if(!caracteres.contains(evt.getKeyChar()+"")){
        //evt.consume();
        //}
        
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
        
    }//GEN-LAST:event_txtAnosExperienciaKeyTyped

    private void txtNroCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroCasaKeyTyped
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
    }//GEN-LAST:event_txtNroCasaKeyTyped

    private void txtRgMassagistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgMassagistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgMassagistaActionPerformed

    private void cbxFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFemininoActionPerformed
        cbxMasculino.setSelected(false);
    }//GEN-LAST:event_cbxFemininoActionPerformed

    private void cbxMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMasculinoActionPerformed
        //Se masculino selecionado, feminino nao selecionado (desmarcado)
        cbxFeminino.setSelected(false);
    }//GEN-LAST:event_cbxMasculinoActionPerformed

    private void txtCpfMassagistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfMassagistaKeyTyped
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
    }//GEN-LAST:event_txtCpfMassagistaKeyTyped

    private void txtRgMassagistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRgMassagistaKeyTyped
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
    }//GEN-LAST:event_txtRgMassagistaKeyTyped

    private void txtTelefoneMassagistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneMassagistaKeyTyped
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
    }//GEN-LAST:event_txtTelefoneMassagistaKeyTyped

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        Util.Utilitarios util = new Utilitarios();
        util.apenasNumeros(evt);
    }//GEN-LAST:event_txtCepKeyTyped

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNomeMassagista.getText();
        String cpf = txtCpfMassagista.getText();
        String rg = txtRgMassagista.getText();
        String telefone = txtTelefoneMassagista.getText();
        String genero="";
        if(cbxFeminino.isSelected())
            genero = "F";
        if(cbxMasculino.isSelected())
            genero = "M";
        String cep = txtCep.getText();
        String numeroCasa = txtNroCasa.getText();
        String formacao = txtFormacao.getText();
        int anosExp = Integer.parseInt(txtAnosExperiencia.getText());
        String especialidade = txtEspecialidade.getText();
        
        //alt codigo
        Massagista m = new Massagista(cpf, rg, nome, telefone, genero, cep, numeroCasa, formacao, anosExp, especialidade);
        DatabaseUtilit.Conectar();
        MassagistaDAO mDAO = new MassagistaDAO();
        mDAO.insereMassagista(m);
                    

    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMassagista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMassagista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMassagista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMassagista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMassagista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbxFeminino;
    private javax.swing.JCheckBox cbxMasculino;
    private javax.swing.JLabel instform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlMassagista;
    private javax.swing.JTextField txtAnosExperiencia;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JFormattedTextField txtCpfMassagista;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtNomeMassagista;
    private javax.swing.JTextField txtNroCasa;
    private javax.swing.JFormattedTextField txtRgMassagista;
    private javax.swing.JFormattedTextField txtTelefoneMassagista;
    // End of variables declaration//GEN-END:variables
}
