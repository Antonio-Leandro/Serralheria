package View;

import Dao.PessoaDao;
import Modelo.Pessoa;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

   
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblChaveLogin = new javax.swing.JLabel();
        LblUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        LblSenha = new javax.swing.JLabel();
        PassSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LbFundol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        LblChaveLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Chave 2.png"))); // NOI18N
        getContentPane().add(LblChaveLogin);
        LblChaveLogin.setBounds(10, 10, 250, 260);

        LblUsuario.setText("Usuário:");
        getContentPane().add(LblUsuario);
        LblUsuario.setBounds(300, 100, 40, 20);
        getContentPane().add(TxtUsuario);
        TxtUsuario.setBounds(350, 100, 140, 20);

        LblSenha.setText("Senha:");
        getContentPane().add(LblSenha);
        LblSenha.setBounds(300, 130, 40, 20);

        PassSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(PassSenha);
        PassSenha.setBounds(350, 130, 140, 20);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(350, 170, 63, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(430, 170, 60, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Software Serralheria");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 40, 180, 26);

        LbFundol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FUNDO.png"))); // NOI18N
        getContentPane().add(LbFundol);
        LbFundol.setBounds(0, 0, 520, 320);

        setSize(new java.awt.Dimension(523, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        
        Pessoa pessoa = new Pessoa();
        pessoa.setLOGIN(TxtUsuario.getText());
        pessoa.setSENHA(PassSenha.getText());
        
        PessoaDao pessoadao = new PessoaDao();
        try {
            if (pessoadao.busca(pessoa)) {
                TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido!");
                TxtUsuario.setText("");
                PassSenha.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!"+ex.getMessage());
        }   
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void PassSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassSenhaKeyPressed
        //Pessoa pessoa = new Pessoa();
        //pessoa.setLOGIN(TxtUsuario.getText());
        //pessoa.setSENHA(PassSenha.getText());
        
        //PessoaDao pessoadao = new PessoaDao();
        
        /*if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            try {
                if (pessoadao.busca(pessoa)) {
                    TelaPrincipal tela = new TelaPrincipal();
                    tela.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou Senha inválido!");
                    TxtUsuario.setText("");
                    PassSenha.setText("");
                }
            } catch (SQLException ex) {
                
            }
        }*/
    }//GEN-LAST:event_PassSenhaKeyPressed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbFundol;
    private javax.swing.JLabel LblChaveLogin;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JLabel LblUsuario;
    private javax.swing.JPasswordField PassSenha;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
