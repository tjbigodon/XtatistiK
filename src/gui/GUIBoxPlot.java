/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import funcoes.BoxPlot;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jehymeson Gil
 */
public class GUIBoxPlot extends javax.swing.JFrame {

    URL url = this.getClass().getResource("/img/X32.png");
    Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);

    public void setTitulo(Image iconeTitulo) {
        this.setIconImage(iconeTitulo);
    }

    /**
     * Creates new form GUIBoxPlot
     */
    public GUIBoxPlot() {
        initComponents();
        setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBoxPlot = new javax.swing.JTable();
        bNovaLinha = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bLimparTabela = new javax.swing.JButton();
        bExcluirLinha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detector de Outliers");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabBoxPlot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabBoxPlot);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bNovaLinha.setText("Nova Linha");
        bNovaLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovaLinhaActionPerformed(evt);
            }
        });

        jButton2.setText("Detectar Outliers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bLimparTabela.setText("Limpar Tabela");
        bLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparTabelaActionPerformed(evt);
            }
        });

        bExcluirLinha.setText("Excluir Linha");
        bExcluirLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirLinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNovaLinha)
                        .addGap(36, 36, 36)
                        .addComponent(bExcluirLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bLimparTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovaLinha)
                    .addComponent(bExcluirLinha)
                    .addComponent(bLimparTabela)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovaLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovaLinhaActionPerformed
        DefaultTableModel linha = (DefaultTableModel) tabBoxPlot.getModel();
        Double[] novaLinha = null;
        linha.addRow(novaLinha);
        tabBoxPlot.setModel(linha);
    }//GEN-LAST:event_bNovaLinhaActionPerformed

    private void bLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparTabelaActionPerformed
        DefaultTableModel limparTabela = (DefaultTableModel) tabBoxPlot.getModel();
        limparTabela.setRowCount(0);
        tabBoxPlot.setModel(limparTabela);
    }//GEN-LAST:event_bLimparTabelaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel pegarDados = (DefaultTableModel) tabBoxPlot.getModel();
        int numDados = pegarDados.getRowCount();
        ArrayList<Double> dados = new ArrayList();
        ArrayList<Double> outliers = new ArrayList();
        BoxPlot bp = new BoxPlot();
        
        if (numDados == 0 || numDados <= 3) {
            JOptionPane.showMessageDialog(null, "Insira novas linhas e adicione valores, \n"
                    + "assim poderemos detectar outlier(s) nos dados.", "Atenção", 0);
        } else {

            for (int i = 0; i < numDados; i++) {
                dados.add((Double) pegarDados.getValueAt(i, 0));
            }

            //Verifica se possui algum valor nulo.
            int olho = 0;
            for (int i = 0; i < dados.size(); i++) {
                if (dados.get(i) == null) {
                    olho = 1;
                }
            }
            if (olho == 1) {
                JOptionPane.showMessageDialog(null, "Remova todas as linhas que não possui valores.", "Atenção", 0);
            } else {
                dados = BoxPlot.amostraEmRol(dados);
                outliers = bp.retornaOutliers(dados);

                if (outliers == null) {
                    JOptionPane.showMessageDialog(null, "Não há outliers!\nDados:\nQ1: "+bp.getQ1()+"\tQ2: "+bp.getQ2()+"\tQ3: "+bp.getQ3()+"\nAIQ: "+bp.getAiq()+"\nLimite Superior: "+bp.getLimiteS()+"\tLimite Inferior: "+bp.getLimiteI(), "Aviso", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Foram encontrados outlier(s): \n" + outliers.toString()+"\nDados:\nQ1: "+bp.getQ1()+"\nQ2: "+bp.getQ2()+"\nQ3: "+bp.getQ3()+"\nAIQ: "+bp.getAiq()+"\nLimite Superior: "+bp.getLimiteS()+"\tLimite Inferior: "+bp.getLimiteI(), "Aviso", 1);
                }
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void bExcluirLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirLinhaActionPerformed
        DefaultTableModel pegarDados = (DefaultTableModel) tabBoxPlot.getModel();
        int idLinha = tabBoxPlot.getSelectedRow();

        if (idLinha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione a linha a ser removida.", "Atenção", 0);
        } else {
            pegarDados.removeRow(idLinha);
            tabBoxPlot.setModel(pegarDados);
        }
    }//GEN-LAST:event_bExcluirLinhaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIBoxPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBoxPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBoxPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBoxPlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBoxPlot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExcluirLinha;
    private javax.swing.JButton bLimparTabela;
    private javax.swing.JButton bNovaLinha;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabBoxPlot;
    // End of variables declaration//GEN-END:variables
}
