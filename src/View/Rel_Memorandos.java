/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ferna
 */
public final class Rel_Memorandos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Rel_Memorandos
     */
    public Rel_Memorandos() {
        initComponents();
        MontaLista();
    }

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    ConexaoMySQL cn = new ConexaoMySQL();

    public void MontaLista() {
        // LISTA EMPRESAS QUE POSSUEM NOTAS PENDENTES
        String sql = "select distinct a.nome_terceiro from notas_disponiveis a ORDER BY a.nome_terceiro";
        
        cn.conecta();
        cn.executeConsulta(sql);
        try {
            jCBEmpresas.addItem("TODAS");
            while (cn.rs.next()) {
                jCBEmpresas.addItem(cn.rs.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível montar o relatório");
        }
        cn.desconecta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGAmostra = new javax.swing.ButtonGroup();
        bGPrazo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBEmpresas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRBAtual = new javax.swing.JRadioButton();
        jRBAnterior = new javax.swing.JRadioButton();
        jRBTudo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRBVencidas = new javax.swing.JRadioButton();
        jRBTodoPrazo = new javax.swing.JRadioButton();
        jRBOutro = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtOutro = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jTxtQuebra = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jBtnEmitir = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setTitle("Memorandos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Empresas:");

        jCBEmpresas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Amostra:");

        bGAmostra.add(jRBAtual);
        jRBAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBAtual.setSelected(true);
        jRBAtual.setText("Ano Atual");

        bGAmostra.add(jRBAnterior);
        jRBAnterior.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBAnterior.setText("Ano Anterior");
        jRBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBAnteriorActionPerformed(evt);
            }
        });

        bGAmostra.add(jRBTudo);
        jRBTudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBTudo.setText("Tudo");
        jRBTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTudoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Prazo:");

        bGPrazo.add(jRBVencidas);
        jRBVencidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBVencidas.setSelected(true);
        jRBVencidas.setText("Vencidas");
        jRBVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBVencidasActionPerformed(evt);
            }
        });

        bGPrazo.add(jRBTodoPrazo);
        jRBTodoPrazo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBTodoPrazo.setText("Tudo");
        jRBTodoPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBTodoPrazoActionPerformed(evt);
            }
        });

        bGPrazo.add(jRBOutro);
        jRBOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRBOutro.setText("Outro");
        jRBOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOutroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Dias");

        jTxtOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtOutro.setEditor(new javax.swing.JSpinner.NumberEditor(jTxtOutro, ""));
        jTxtOutro.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quebra:");

        jTxtQuebra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtQuebra.setModel(new javax.swing.SpinnerNumberModel(300, null, null, 1));
        jTxtQuebra.setEditor(new javax.swing.JSpinner.NumberEditor(jTxtQuebra, ""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBEmpresas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBAtual)
                            .addComponent(jRBVencidas))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(jRBTudo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRBTodoPrazo)
                                .addGap(18, 18, 18)
                                .addComponent(jRBOutro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtOutro, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtQuebra, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBAtual)
                    .addComponent(jRBAnterior)
                    .addComponent(jRBTudo))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBVencidas)
                    .addComponent(jRBTodoPrazo)
                    .addComponent(jRBOutro)
                    .addComponent(jLabel4)
                    .addComponent(jTxtOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtQuebra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jBtnEmitir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnEmitir.setText("Emitir");
        jBtnEmitir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEmitirActionPerformed(evt);
            }
        });

        jBtnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnEmitir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnEmitir)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEmitirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEmitirActionPerformed
        

        String rel = "reports/Memorandos.jasper";

        Calendar cal = Calendar.getInstance();

        String ano1;
        String ano2;
        String prazo1;
        String prazo2;
        String terceiro = jCBEmpresas.getSelectedItem().toString();
        String sql;
        String qtd = jTxtQuebra.getValue().toString();

        //DEFINE QUAL O ANO SERÁ INFORMADO NA CONSULTA
        if (jRBAtual.isSelected()) {
            ano1 = "" + (cal.get(Calendar.YEAR));
            ano2 = ano1;
        } else if (jRBAnterior.isSelected()) {
            ano1 = "" + (cal.get(Calendar.YEAR) - 1);
            ano2 = ano1;
        } else {
            ano1 = "1900";
            ano2 = "9999";
        }

        //DEFINE QUAL O PRAZO DA CONSULTA
        if (jRBVencidas.isSelected()) {
            prazo1 = "" + "-999999999";
            prazo2 = "" + "0";
        } else if (jRBTodoPrazo.isSelected()) {
            prazo1 = "" + "-999999999";
            prazo2 = "" + "999999999";
        } else {
            prazo1 = "" + "0";
            prazo2 = jTxtOutro.getValue().toString();
        }

        if ("TODAS".equals(terceiro)) {
            sql = " SELECT * FROM notas_disponiveis "
                    + "where extract(year from emissao) between '" + ano1 + "' and '" + ano2 + "'"
                    + " and datediff(emissao,current_date())+180 between '" + prazo1 + "' and '" + prazo2 + "'"
                    + " and (quantidade3 is null or (quantidade3 is not null and quantidade > '" + qtd + "'));";

        } else {
            sql = " SELECT * FROM notas_disponiveis "
                    + "where extract(year from emissao) >=" + ano1
                    + " and datediff(emissao,current_date())+180 between '" + prazo1 + "' and '" + prazo2 + "'"
                    + " and nome_terceiro = '" + terceiro + "'"
                    + " and (quantidade3 is null or (quantidade3 is not null and quantidade > '" + qtd + "'));";
        }

        cn.conecta();
        cn.executeConsulta(sql);
        try {

            JRResultSetDataSource relatResult = new JRResultSetDataSource(cn.rs);

            JasperPrint jasperprint;
            jasperprint = JasperFillManager.fillReport(rel, new HashMap(), relatResult);
            JasperViewer jv = new JasperViewer(jasperprint, false);

            jv.setVisible(true);

        } catch (JRException je) {
            JOptionPane.showMessageDialog(this, je);
        }
        cn.desconecta();
    }//GEN-LAST:event_jBtnEmitirActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jRBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBAnteriorActionPerformed

    private void jRBTodoPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTodoPrazoActionPerformed
        jTxtOutro.setEnabled(false);
    }//GEN-LAST:event_jRBTodoPrazoActionPerformed

    private void jRBOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOutroActionPerformed
        jTxtOutro.setEnabled(true);
    }//GEN-LAST:event_jRBOutroActionPerformed

    private void jRBVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBVencidasActionPerformed
        jTxtOutro.setEnabled(false);
    }//GEN-LAST:event_jRBVencidasActionPerformed

    private void jRBTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBTudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBTudoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGAmostra;
    private javax.swing.ButtonGroup bGPrazo;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEmitir;
    private javax.swing.JComboBox<String> jCBEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRBAnterior;
    private javax.swing.JRadioButton jRBAtual;
    private javax.swing.JRadioButton jRBOutro;
    private javax.swing.JRadioButton jRBTodoPrazo;
    private javax.swing.JRadioButton jRBTudo;
    private javax.swing.JRadioButton jRBVencidas;
    private javax.swing.JSpinner jTxtOutro;
    private javax.swing.JSpinner jTxtQuebra;
    // End of variables declaration//GEN-END:variables
}
