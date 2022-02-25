package View;

import Modelo.Produto;
import Dao.ProdutoDao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroProdutos extends javax.swing.JFrame {

        public CadastroProdutos() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        preencherTabela();
    }
        
        private void preencherTabela() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel)jTbProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDao pdao = new ProdutoDao();
        for(Produto p: pdao.listar()) {
            modelo.addRow(new Object[]{
                p.getID_PRODUTO(),
                p.getID_FORNECEDOR(),
                p.getFORNECEDOR(),
                p.getNOME_PRODUTO(),
                p.getVALOR_UNI(),
                p.getFABRICANTE()
            });
        }
    }
        
        private void LimpaCampos() {
            jTextIdProduto.setText("");
            jTextIdFornecedor.setText("");
            jTextNomeProduto.setText("");
            jTextFornecedor.setText("");
            jTextValor.setText("");
            jTextFabricante.setText("");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIdProduto = new javax.swing.JLabel();
        jLabelIdFornecedor = new javax.swing.JLabel();
        jLabelNomeProduto = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelFornecedor = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jTextIdProduto = new javax.swing.JTextField();
        jTextIdFornecedor = new javax.swing.JTextField();
        jTextNomeProduto = new javax.swing.JTextField();
        jTextValor = new javax.swing.JTextField();
        jTextFornecedor = new javax.swing.JTextField();
        jTextFabricante = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelIdProduto.setText("ID do produto:");

        jLabelIdFornecedor.setText("ID do fornecedor:");

        jLabelNomeProduto.setText("Nome do produto:");

        jLabelValor.setText("Valor:");

        jLabelFornecedor.setText("Fornecedor:");

        jLabelFabricante.setText("Fabricante:");

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.jpg"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete_pessoa.png"))); // NOI18N
        jButtonDeletar.setToolTipText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRODUTO", "ID_FORNECEDOR", "NOME_PRODUTO", "VALOR_UNI", "FORNECEDOR", "FABRICANTE"
            }
        ));
        jTbProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTbProdutos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFabricante)
                                    .addComponent(jLabelFornecedor)
                                    .addComponent(jLabelValor)
                                    .addComponent(jLabelNomeProduto)
                                    .addComponent(jLabelIdFornecedor)
                                    .addComponent(jLabelIdProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextIdFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                        .addComponent(jTextIdProduto, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jTextNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFabricante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(jTextFornecedor, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(0, 258, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdProduto)
                    .addComponent(jTextIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdFornecedor)
                    .addComponent(jTextIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeProduto)
                    .addComponent(jTextNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFornecedor)
                    .addComponent(jTextFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFabricante)
                    .addComponent(jTextFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSair)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDeletar))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(565, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Produto produto = new Produto();
        produto.setID_PRODUTO(jTextIdProduto.getText());
        ProdutoDao produtodao = new ProdutoDao();
        try {
            if (produtodao.BuscaProduto(produto)) {
                produtodao.DeletaProduto(produto);
                JOptionPane.showMessageDialog(null, "Deseja Realmente Excluir o registro ? ");
                this.LimpaCampos();
            } else {
                System.out.println("Não há registro com esta descrição na base! ");
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível executar a ação! " + ex.getMessage());
        }
            try {
                preencherTabela();
            } catch (SQLException ex) {
                System.out.println("Erro ao atualizar a tabela! " + ex.getMessage());
            }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Produto produto = new Produto();

//        produto.setID_PRODUTO(jTextIdProduto.getText());
        produto.setID_FORNECEDOR(jTextIdFornecedor.getText());
        produto.setNOME_PRODUTO(jTextNomeProduto.getText());
        produto.setVALOR_UNI(jTextValor.getText());
        produto.setFORNECEDOR(jTextFornecedor.getText());
        produto.setFABRICANTE(jTextFabricante.getText());
//        if (jComboBoxUF.getSelectedIndex()!=-1) {
//            produto.setESTADO(jComboBoxUF.getSelectedItem().toString());
//        }
        ProdutoDao produtodao = new ProdutoDao();
        try {
            produtodao.AtualizaProduto(produto);
        } catch (SQLException ex) {
            System.out.println("Não foi possível atualizar o registro! " + ex.getMessage());
        }
            try {
                preencherTabela();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        Produto produto = new Produto();

            produto.setID_PRODUTO(jTextIdProduto.getText());
            produto.setID_FORNECEDOR(jTextIdFornecedor.getText());
            produto.setNOME_PRODUTO(jTextNomeProduto.getText());
            produto.setVALOR_UNI(jTextValor.getText());
            produto.setFORNECEDOR(jTextFornecedor.getText());
            produto.setFABRICANTE(jTextFabricante.getText());
//          if (jComboBoxUF.getSelectedIndex()!=-1) {
//            pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
//          }

        ProdutoDao produtodao = new ProdutoDao();
        try {
            if (produtodao.BuscaProduto(produto)) {
                JOptionPane.showMessageDialog(null, "Já existe um cadastro para este CNPJ! ");
            } else {
                produtodao.AdicionaProduto(produto);
                JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso! ");
                this.LimpaCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cadastro! " + ex.getMessage());
        }
            try {
                preencherTabela();
            } catch (SQLException ex) {
                Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButtonSalvarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroProdutos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelIdFornecedor;
    private javax.swing.JLabel jLabelIdProduto;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbProdutos;
    private javax.swing.JTextField jTextFabricante;
    private javax.swing.JTextField jTextFornecedor;
    private javax.swing.JTextField jTextIdFornecedor;
    private javax.swing.JTextField jTextIdProduto;
    private javax.swing.JTextField jTextNomeProduto;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables
}
