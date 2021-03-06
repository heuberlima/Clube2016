/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import javax.swing.JOptionPane;

/**
 *
 * @author HeuberLima
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        //Maximiza a tela
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAssociados = new javax.swing.JMenuItem();
        menuTipoAssociado = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuPesquisaAssociado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("iClub  - Sistema para Automação de Clubes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        menuAssociados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAssociados.setText("Associados");
        menuAssociados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAssociadosActionPerformed(evt);
            }
        });
        jMenu1.add(menuAssociados);

        menuTipoAssociado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuTipoAssociado.setText("Tipo Associado");
        menuTipoAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipoAssociadoActionPerformed(evt);
            }
        });
        jMenu1.add(menuTipoAssociado);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimentações");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");

        mnuPesquisaAssociado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuPesquisaAssociado.setText("Pesquisar Associado");
        mnuPesquisaAssociado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesquisaAssociadoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuPesquisaAssociado);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu4.add(menuSair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTipoAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipoAssociadoActionPerformed

        TipoAssociadoCadastro janelaTipos = new TipoAssociadoCadastro();
        this.jDesktopPane1.add(janelaTipos);
        janelaTipos.setVisible(true);

        util.Forms.centraliza(janelaTipos);


    }//GEN-LAST:event_menuTipoAssociadoActionPerformed

    private void menuAssociadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAssociadosActionPerformed
        AssociadoCadastro janelaAssociado = new AssociadoCadastro();
        this.jDesktopPane1.add(janelaAssociado);
        janelaAssociado.setVisible(true);

        util.Forms.centraliza(janelaAssociado);

    }//GEN-LAST:event_menuAssociadosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sair();
    }//GEN-LAST:event_formWindowClosing

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        sair();
    }//GEN-LAST:event_menuSairActionPerformed

    private void mnuPesquisaAssociadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesquisaAssociadoActionPerformed
        AssociadoPesquisa janela = new AssociadoPesquisa(this.jDesktopPane1);
        this.jDesktopPane1.add(janela);
        janela.setVisible(true);

        util.Forms.centraliza(janela);

    }//GEN-LAST:event_mnuPesquisaAssociadoActionPerformed

    private void sair() {

        int resposta = JOptionPane.showConfirmDialog(null,
                "Confirma a saída do Sistema?", "iClub",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuAssociados;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuTipoAssociado;
    private javax.swing.JMenuItem mnuPesquisaAssociado;
    // End of variables declaration//GEN-END:variables
}
