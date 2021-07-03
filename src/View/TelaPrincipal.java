package View;


public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblAtivo = new javax.swing.JLabel();
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
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jLblAtivo);
        jLblAtivo.setBounds(620, 600, 140, 0);

        jMenuBarPrincipal.setBackground(java.awt.SystemColor.inactiveCaption);
        jMenuBarPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenuBarPrincipal.setForeground(new java.awt.Color(153, 153, 153));

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Financeiro_1.png"))); // NOI18N
        jMenu1.setToolTipText("Financeiro");
        jMenuBarPrincipal.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastros_1.png"))); // NOI18N
        jMenu2.setToolTipText("Cadastros");

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

        MenuOrcamentos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuOrcamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Orcamento.png"))); // NOI18N
        MenuOrcamentos.setToolTipText("Orçamentos");
        jMenuBarPrincipal.add(MenuOrcamentos);

        setJMenuBar(jMenuBarPrincipal);

        setSize(new java.awt.Dimension(1161, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadastroDeClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeClientesActionPerformed
        CadastroClientes cadastroclientes = new CadastroClientes();
        cadastroclientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuItemCadastroDeClientesActionPerformed

    private void MenuItemCadastroDeFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeFornecedoresActionPerformed
        CadastroFornecedores cadastrofornecedores = new CadastroFornecedores();
        cadastrofornecedores.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_MenuItemCadastroDeFornecedoresActionPerformed

    private void MenuItemCadastroDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeProdutosActionPerformed
        CadastroProdutos cadastroprodutos = new CadastroProdutos();
        cadastroprodutos.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_MenuItemCadastroDeProdutosActionPerformed

    private void MenuItemCadastroDeFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadastroDeFuncionariosActionPerformed
        CadastroFuncionarios cadastrofuncionarios = new CadastroFuncionarios();
        cadastrofuncionarios.setVisible(true);
        //this.dispose();
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
    private javax.swing.JMenuItem MenuItemCadastroDeClientes;
    private javax.swing.JMenuItem MenuItemCadastroDeFornecedores;
    private javax.swing.JMenuItem MenuItemCadastroDeFuncionarios;
    private javax.swing.JMenuItem MenuItemCadastroDeProdutos;
    private javax.swing.JMenu MenuOrcamentos;
    private javax.swing.JLabel jLblAtivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    // End of variables declaration//GEN-END:variables
}
