/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import com.sun.xml.internal.bind.v2.runtime.JAXBContextImpl;
import entidade.ETipoAssociado;
import javax.swing.JOptionPane;
import negocio.NTipoAssociado;

/**
 *
 * @author HeuberLima
 */
public class TipoAssociadoCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TipoAssociadoCadastro
     */
    public TipoAssociadoCadastro() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorMensal = new javax.swing.JTextField();
        cmdSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Tipo de Associado");
        setToolTipText("Funcionalidade que permite o cadastramento de tipos de associados.");
        setAlignmentX(1.0F);
        setAlignmentY(1.0F);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código");

        jLabel2.setText("Descrição");

        txtCodigo.setEditable(false);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Mensalidade");

        cmdSalvar.setText("Salvar");
        cmdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(63, 63, 63)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(btnConsultar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(50, 50, 50)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(10, 10, 10)
                            .addComponent(txtValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmdSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnConsultar))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2))
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel3))
                        .addComponent(txtValorMensal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmdSalvar)
                        .addComponent(btnExcluir)
                        .addComponent(btnLimpar)
                        .addComponent(btnFechar))
                    .addGap(0, 23, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void limpar() {

        //Limpa todo o formulário
        txtCodigo.setText("");
        txtDescricao.setText("");
        txtValorMensal.setText("");
        btnExcluir.setEnabled(false);
        txtDescricao.grabFocus();
    }


    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        try {

            String codigo = JOptionPane.showInputDialog(""
                    + "Digite o código do associado para consulta:");

            if (codigo == null || codigo.equals("")) {
                throw new Exception("Digite o código para consulta!");
            }

            int intCodigo = Integer.parseInt(codigo);

            NTipoAssociado negocio = new NTipoAssociado();
            ETipoAssociado tipo = negocio.consultar(intCodigo);

            if (tipo.getCodigo() != 0) {

                txtCodigo.setText(String.valueOf(tipo.getCodigo()));
                txtDescricao.setText(tipo.getDescricao());
                txtValorMensal.setText(String.valueOf(tipo.getValorMensalidade()));
                btnExcluir.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Tipo não encontrado!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "É necessário informar um número.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.hide();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            int resposta = JOptionPane.showConfirmDialog(null,
                "Confirma a exclusão do Tipo?", "iClub",
                JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {

                NTipoAssociado negocio = new NTipoAssociado();
                negocio.excluir(Integer.parseInt(txtCodigo.getText()));
                JOptionPane.showMessageDialog(null, "Exclusão efetuada com sucesso!");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void cmdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvarActionPerformed
        try {
            //Captura os erros dentro dessa seção

            //Declara os objetos a serem usados
            ETipoAssociado tipo = new ETipoAssociado();
            NTipoAssociado negocio = new NTipoAssociado();

            if (!txtCodigo.getText().isEmpty()) {
                tipo.setCodigo(Integer.parseInt(txtCodigo.getText()));
            }

            tipo.setDescricao(txtDescricao.getText());
            tipo.setValorMensalidade(Double.parseDouble(txtValorMensal.getText()));

            negocio.salvar(tipo);

            JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso!");

            limpar();

        } catch (Exception e) {
            //Quando acontecer um erro,
            //esse trecho de código é executado
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cmdSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton cmdSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtValorMensal;
    // End of variables declaration//GEN-END:variables
}