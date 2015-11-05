/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class FrmArquivo extends javax.swing.JFrame {

    public File arquivo;
    /**
     * Creates new form FrmArquivo
     */
    public FrmArquivo() {
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

        pnlArquivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        btnProcessar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlArquivo.setBorder(javax.swing.BorderFactory.createTitledBorder("Envio de Arquivo"));

        jLabel1.setText("Nome:");

        btnSelecionar.setText("SELECIONAR");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnProcessar.setText("PROCESSAR");
        btnProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessarActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");

        javax.swing.GroupLayout pnlArquivoLayout = new javax.swing.GroupLayout(pnlArquivo);
        pnlArquivo.setLayout(pnlArquivoLayout);
        pnlArquivoLayout.setHorizontalGroup(
            pnlArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArquivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSelecionar)
                .addGap(117, 117, 117)
                .addComponent(btnProcessar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
            .addGroup(pnlArquivoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlArquivoLayout.setVerticalGroup(
            pnlArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlArquivoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(pnlArquivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessar)
                    .addComponent(btnSelecionar)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlArquivo.getAccessibleContext().setAccessibleName("Envio de Arquivo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(jLabel1);
        if (result == JFileChooser.APPROVE_OPTION) 
        {
            arquivo = fileChooser.getSelectedFile();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnProcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessarActionPerformed
        if(arquivo == null)
            JOptionPane.showMessageDialog(rootPane, "Importe um arquivo antes de processar");
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Processando...");
            arquivo.getName();
        }
    }//GEN-LAST:event_btnProcessarActionPerformed

    private void processarArquivo(File file) throws FileNotFoundException, IOException
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            
            while (line != null) {  
                processarLinhas(line);
                line = br.readLine();
            }
            br.close();
        }
        catch(FileNotFoundException ex)
        {
            throw new FileNotFoundException("Erro ao processar arquivo" + ex.getMessage());
        }
    }
    
    private void processarLinhas(String line)
    {
        String nossoNumero;
        String cliente;
        String valor;
        String dataPagamento;
        
    }
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
            java.util.logging.Logger.getLogger(FrmArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmArquivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlArquivo;
    // End of variables declaration//GEN-END:variables
}
