package View;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblFundoTelaPrincipal = new javax.swing.JLabel();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuItemCadastroDeClientes = new javax.swing.JMenuItem();
        MenuItemCadastroDeFornecedores = new javax.swing.JMenuItem();
        MenuItemCadastroDeProdutos = new javax.swing.JMenuItem();
        MenuItemCadastroDeFuncionarios = new javax.swing.JMenuItem();
        MenuOrcamentos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        LblFundoTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem 2.jpg"))); // NOI18N

        jMenu1.setText("Financeiro");
        jMenuBarPrincipal.add(jMenu1);

        jMenu2.setText("Cadastros");

        MenuItemCadastroDeClientes.setText("Cadastro de Clientes");
        MenuItemCadastroDeClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroDeClientesActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCadastroDeClientes);

        MenuItemCadastroDeFornecedores.setText("Cadastro de Fornecedores");
        MenuItemCadastroDeFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroDeFornecedoresActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCadastroDeFornecedores);

        MenuItemCadastroDeProdutos.setText("Cadastro de Produtos");
        MenuItemCadastroDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroDeProdutosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCadastroDeProdutos);

        MenuItemCadastroDeFuncionarios.setText("Cadastro de Funcionários");
        MenuItemCadastroDeFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadastroDeFuncionariosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemCadastroDeFuncionarios);

        jMenuBarPrincipal.add(jMenu2);

        MenuOrcamentos.setText("Orçamentos");
        jMenuBarPrincipal.add(MenuOrcamentos);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblFundoTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblFundoTelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(814, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadastroDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeClientesActionPerformed
        CadastroClientes cadastroclientes = new CadastroClientes();
        cadastroclientes.setVisible(true);
    }//GEN-LAST:event_MenuItemCadastroDeClientesActionPerformed

    private void MenuItemCadastroDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeFornecedoresActionPerformed
        CadastroFornecedores cadastrofornecedores = new CadastroFornecedores();
        cadastrofornecedores.setVisible(true);
    }//GEN-LAST:event_MenuItemCadastroDeFornecedoresActionPerformed

    private void MenuItemCadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeProdutosActionPerformed
        CadastroProdutos cadastroprodutos = new CadastroProdutos();
        cadastroprodutos.setVisible(true);
    }//GEN-LAST:event_MenuItemCadastroDeProdutosActionPerformed

    private void MenuItemCadastroDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeFuncionariosActionPerformed
        CadastroFuncionarios cadastrofuncionarios = new CadastroFuncionarios();
        cadastrofuncionarios.setVisible(true);
    }//GEN-LAST:event_MenuItemCadastroDeFuncionariosActionPerformed

 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFundoTelaPrincipal;
    private javax.swing.JMenuItem MenuItemCadastroDeClientes;
    private javax.swing.JMenuItem MenuItemCadastroDeFornecedores;
    private javax.swing.JMenuItem MenuItemCadastroDeFuncionarios;
    private javax.swing.JMenuItem MenuItemCadastroDeProdutos;
    private javax.swing.JMenu MenuOrcamentos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    // End of variables declaration//GEN-END:variables
}
