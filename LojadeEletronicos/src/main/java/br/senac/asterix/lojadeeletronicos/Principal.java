package br.senac.asterix.lojadeeletronicos;

import br.senac.asterix.lojadeeletronicos.classes.Produto;
import br.senac.asterix.lojadeeletronicos.servicos.ServicoProduto;
import java.awt.CardLayout;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        jbSalvar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpPrincipal = new javax.swing.JPanel();
        JbCadastar = new javax.swing.JButton();
        JbConsultar = new javax.swing.JButton();
        Root = new javax.swing.JPanel();
        JpCadastrar = new javax.swing.JPanel();
        jlbNome = new javax.swing.JLabel();
        jlbDescricao = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        jlbCompra = new javax.swing.JLabel();
        jlbVenda = new javax.swing.JLabel();
        JtxtNome = new javax.swing.JTextField();
        jtxtCategoria = new javax.swing.JTextField();
        jtxtCompra = new javax.swing.JTextField();
        jtxtVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jADescricao = new javax.swing.JTextArea();
        jbIncluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        JpConsultar = new javax.swing.JPanel();
        jlbConsultar = new javax.swing.JLabel();
        jtxtConsultar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtConsultar = new javax.swing.JTable();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JbCadastar.setText("Cadastrar");
        JbCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCadastarActionPerformed(evt);
            }
        });

        JbConsultar.setText("Consultar");
        JbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbConsultarActionPerformed(evt);
            }
        });

        Root.setLayout(new java.awt.CardLayout());

        jlbNome.setText("Nome:");

        jlbDescricao.setText("Descrição:");

        jlbCategoria.setText("Categoria:");

        jlbCompra.setText("Valor compra:");

        jlbVenda.setText("Valor Venda:");

        jADescricao.setColumns(20);
        jADescricao.setRows(5);
        jScrollPane1.setViewportView(jADescricao);

        jbIncluir.setText("Incluir");
        jbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIncluirActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");

        javax.swing.GroupLayout JpCadastrarLayout = new javax.swing.GroupLayout(JpCadastrar);
        JpCadastrar.setLayout(JpCadastrarLayout);
        JpCadastrarLayout.setHorizontalGroup(
            JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpCadastrarLayout.createSequentialGroup()
                        .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDescricao)
                            .addComponent(jlbNome))
                        .addGap(34, 34, 34)
                        .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtxtNome)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpCadastrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpCadastrarLayout.createSequentialGroup()
                        .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JpCadastrarLayout.createSequentialGroup()
                                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbCompra)
                                    .addComponent(jlbVenda))
                                .addGap(18, 18, 18)
                                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtVenda)
                                    .addComponent(jtxtCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                            .addGroup(JpCadastrarLayout.createSequentialGroup()
                                .addComponent(jlbCategoria)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtCategoria)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JpCadastrarLayout.setVerticalGroup(
            JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNome)
                    .addComponent(JtxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCompra)
                    .addComponent(jtxtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbVenda)
                    .addComponent(jtxtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(JpCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbIncluir)
                    .addComponent(jbSalvar))
                .addContainerGap())
        );

        Root.add(JpCadastrar, "JpCadastrar");

        jlbConsultar.setText("Consultar:");

        jtConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtConsultar);

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpConsultarLayout = new javax.swing.GroupLayout(JpConsultar);
        JpConsultar.setLayout(JpConsultarLayout);
        JpConsultarLayout.setHorizontalGroup(
            JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addGroup(JpConsultarLayout.createSequentialGroup()
                        .addComponent(jlbConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtConsultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpConsultarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JpConsultarLayout.setVerticalGroup(
            JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpConsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbConsultar)
                    .addComponent(jtxtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(JpConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbBuscar))
                .addContainerGap())
        );

        Root.add(JpConsultar, "JpConsultar");

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpPrincipalLayout = new javax.swing.GroupLayout(JpPrincipal);
        JpPrincipal.setLayout(JpPrincipalLayout);
        JpPrincipalLayout.setHorizontalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JbCadastar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpPrincipalLayout.setVerticalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JbCadastar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JbConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSair)
                .addContainerGap())
            .addComponent(Root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JbCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCadastarActionPerformed
        jbIncluir.setVisible(true);
        jbSalvar.setVisible(false);
        CardLayout cardCadastrar = (CardLayout) Root.getLayout();
        cardCadastrar.show(Root, "JpCadastrar");
    }//GEN-LAST:event_JbCadastarActionPerformed

    private void JbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbConsultarActionPerformed
        CardLayout cardConsultar = (CardLayout) Root.getLayout();
        cardConsultar.show(Root, "JpConsultar");
    }//GEN-LAST:event_JbConsultarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        CardLayout cardCadastrar = (CardLayout) Root.getLayout();
        cardCadastrar.show(Root, "JpCadastrar");

        jbIncluir.setVisible(false);
        jbSalvar.setVisible(true);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIncluirActionPerformed
        Produto p = new Produto();

        p.setNome(JtxtNome.getText());
        p.setDescricao(jADescricao.getText());
        p.setCategoria(jtxtCategoria.getText());
        p.setValorCompra(new BigDecimal(jtxtCompra.getText()));
        p.setValorVenda(new BigDecimal(jtxtVenda.getText()));

        try {
            ServicoProduto.cadastrarProduto(p);
            JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        limparCaixas();
    }//GEN-LAST:event_jbIncluirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        boolean resultSearch;

        try {
            resultSearch = refreshList(jtxtConsultar.getText());

            if (!resultSearch) {
                JOptionPane.showMessageDialog(rootPane, "A busca não gerou resultados",
                        "Busca", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbExcluirActionPerformed

    public boolean refreshList(String nomeProduto) {
        ArrayList<Produto> resultado = ServicoProduto.procurarProduto(nomeProduto);

        if (resultado == null || resultado.isEmpty()) {
            return false;
        }

        DefaultTableModel model = (DefaultTableModel) jtConsultar.getModel();

        model.setRowCount(0);

        for (int i = 0; i < resultado.size(); i++) {
            Produto p = resultado.get(i);
            if (p != null) {

            }
        }
        return true;
    }

    public void limparCaixas() {
        JtxtNome.setText(null);
        jADescricao.setText(null);
        jtxtCategoria.setText(null);
        jtxtCompra.setText(null);
        jtxtVenda.setText(null);
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
    private javax.swing.JButton JbCadastar;
    private javax.swing.JButton JbConsultar;
    private javax.swing.JPanel JpCadastrar;
    private javax.swing.JPanel JpConsultar;
    private javax.swing.JPanel JpPrincipal;
    private javax.swing.JTextField JtxtNome;
    private javax.swing.JPanel Root;
    private javax.swing.JTextArea jADescricao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbIncluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbCompra;
    private javax.swing.JLabel jlbConsultar;
    private javax.swing.JLabel jlbDescricao;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbVenda;
    private javax.swing.JTable jtConsultar;
    private javax.swing.JTextField jtxtCategoria;
    private javax.swing.JTextField jtxtCompra;
    private javax.swing.JTextField jtxtConsultar;
    private javax.swing.JTextField jtxtVenda;
    // End of variables declaration//GEN-END:variables
}
