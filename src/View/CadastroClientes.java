package View;

import Dao.PessoaDao;
import Modelo.Pessoa;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class CadastroClientes extends javax.swing.JFrame {

        public CadastroClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        jFormattedDataCadastro.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelTelFixo = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jLabelNacionalidade = new javax.swing.JLabel();
        jTextFieldNacionalidade = new javax.swing.JTextField();
        jLabelNaturalidade = new javax.swing.JLabel();
        jTextFieldNaturalidade = new javax.swing.JTextField();
        jLabelEmpresa = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelEnderecoComercial = new javax.swing.JLabel();
        jLabelCepComercial = new javax.swing.JLabel();
        jLabelBairroComercial = new javax.swing.JLabel();
        jLabelCidadeComercial = new javax.swing.JLabel();
        jComboBoxUFComercial = new javax.swing.JComboBox<>();
        jLabelUFComercial = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldCargo = new javax.swing.JTextField();
        jTextFieldEnderecoComercial = new javax.swing.JTextField();
        jTextFieldBairroComercial = new javax.swing.JTextField();
        jTextFieldCidadeComercial = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBoxTipoPessoa = new javax.swing.JComboBox<>();
        jLabelNumeroComercial = new javax.swing.JLabel();
        jTextFieldNumeroComercial = new javax.swing.JTextField();
        jLabelTipoPessoa = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox<>();
        jFormattedDataNasc = new javax.swing.JFormattedTextField();
        jFormattedRG = new javax.swing.JFormattedTextField();
        jFormattedDataCadastro = new javax.swing.JFormattedTextField();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jFormattedCepComercial = new javax.swing.JFormattedTextField();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jFormattedTelFixo = new javax.swing.JFormattedTextField();
        jFormattedCelular = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelRG.setText("RG:");

        jLabelCEP.setText("CEP:");

        jLabelRua.setText("Logradouro:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelUF.setText("UF:");

        jLabelDataNasc.setText("Data de nascimento:");

        jLabelComplemento.setText("Complemento:");

        jLabelTelFixo.setText("Telefone fixo:");

        jLabelCelular.setText("Celular:");

        jLabelEmail.setText("e-mail:");

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));
        jComboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFActionPerformed(evt);
            }
        });

        jLabelNacionalidade.setText("Nacionalidade:");

        jLabelNaturalidade.setText("Naturalidade:");

        jLabelEmpresa.setText("Empresa:");

        jLabelCargo.setText("Cargo:");

        jLabelEnderecoComercial.setText("Endereço comercial:");

        jLabelCepComercial.setText("CEP:");

        jLabelBairroComercial.setText("Bairrro:");

        jLabelCidadeComercial.setText("Cidade:");

        jComboBoxUFComercial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));

        jLabelUFComercial.setText("UF:");

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

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.jpg"))); // NOI18N
        jButtonSair.setToolTipText("Sair");

        jLabelNumero.setText("Número:");

        jLabelDataCadastro.setText("Data de cadastro:");

        jLabelEstadoCivil.setText("Estado Civil:");

        jComboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "C", "F", "P" }));

        jLabelNumeroComercial.setText("Numero:");

        jLabelTipoPessoa.setText("Tipo pessoal:");

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Casado(a)", "Solteiro(a)", "União Estável" }));

        try {
            jFormattedDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCepComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelLogin.setText("Login:");

        jLabelSenha.setText("Senha:");

        try {
            jFormattedTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBairro)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelComplemento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUF)
                            .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabelSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNumeroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCidadeComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxUFComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCargo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEnderecoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEnderecoComercial))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCepComercial)
                                            .addComponent(jFormattedCepComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEmpresa)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabelNumeroComercial)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(jLabelCidadeComercial))))
                                        .addGap(86, 86, 86)
                                        .addComponent(jLabelUFComercial)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabelTelFixo))
                                    .addComponent(jFormattedTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCelular)
                                    .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNacionalidade)
                                    .addComponent(jTextFieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNaturalidade)
                                    .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelCPF))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedRG, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRG))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelDataNasc))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEstadoCivil)
                                            .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTipoPessoa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelCEP)
                                                .addGap(48, 48, 48))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRua)))))
                            .addComponent(jLabelNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelCPF)
                            .addComponent(jLabelRG)
                            .addComponent(jLabelDataNasc)
                            .addComponent(jLabelEstadoCivil)
                            .addComponent(jLabelTipoPessoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNacionalidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNaturalidade)
                                        .addComponent(jLabelDataCadastro))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCEP)
                                    .addComponent(jLabelRua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelBairro)
                                        .addComponent(jLabelComplemento)
                                        .addComponent(jLabelNumero))
                                    .addComponent(jLabelCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelUF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLogin)
                            .addComponent(jLabelSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTelFixo)
                                .addComponent(jLabelCelular))
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmpresa)
                            .addComponent(jLabelCargo)
                            .addComponent(jLabelEnderecoComercial)
                            .addComponent(jLabelCepComercial)
                            .addComponent(jLabelBairroComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEnderecoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedCepComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidadeComercial)
                            .addComponent(jLabelUFComercial)
                            .addComponent(jLabelNumeroComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCidadeComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxUFComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumeroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDeletar))
                            .addComponent(jButtonSalvar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(827, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        Pessoa pessoa = new Pessoa();
        
            pessoa.setCPF(jFormattedCPF.getText());
            pessoa.setNOME(jTextFieldNome.getText());
            pessoa.setRG(jFormattedRG.getText());
            pessoa.setDATA_DE_NASCIMENTO(jFormattedDataNasc.getText());
            pessoa.setDATA_DE_CADASTRO(jFormattedDataCadastro.getText());
            /*Date data = new Date();
            String dia = ""+data.getDate();
            String mes = ""+String.valueOf(data.getMonth()+1);
            String ano = ""+(1900 + data.getYear());
            if (Integer.parseInt(mes)<=0)
                mes = "0"+mes;
            pessoa.setDATA_DE_CADASTRO(dia+mes+ano);*/
            
            pessoa.setNACIONALIDADE(jTextFieldNacionalidade.getText());
            pessoa.setNATURALIDADE(jTextFieldNaturalidade.getText());
            pessoa.setESTADO_CIVIL(jComboBoxTipoPessoa.getSelectedItem().toString());
            pessoa.setCEP(jFormattedCEP.getText());
            pessoa.setLOGRADOURO(jTextFieldRua.getText());
            pessoa.setNUMERO(jTextFieldNumero.getText());
            pessoa.setCOMPLEMENTO(jTextFieldComplemento.getText());
            pessoa.setBAIRRO(jTextFieldBairro.getText());
            pessoa.setCIDADE(jTextFieldCidade.getText());
            pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
            pessoa.setTELEFONE_FIXO(jFormattedTelFixo.getText());
            pessoa.setCELULAR(jFormattedCelular.getText());
            pessoa.setEMAIL(jTextFieldEmail.getText());
            pessoa.setEMPRESA(jTextFieldEmpresa.getText());
            pessoa.setCARGO(jTextFieldCargo.getText());
            pessoa.setEND_COMERCIAL(jTextFieldEnderecoComercial.getText());
            pessoa.setNUM_END_COM(jTextFieldNumeroComercial.getText());
            pessoa.setCEP_END_COM(jFormattedCepComercial.getText());
            pessoa.setBAIRRO_END_COM(jTextFieldBairroComercial.getText());
            pessoa.setCIDADE_END_COM(jTextFieldCidadeComercial.getText());
            pessoa.setESTADO_END_COM(jComboBoxUFComercial.getSelectedItem().toString());
            pessoa.setTIPO_PESSOA(jComboBoxTipoPessoa.getSelectedItem().toString());
            pessoa.setLOGIN(jTextFieldLogin.getText());
            pessoa.setSENHA(jPasswordSenha.getText());
              
            PessoaDao pessoadao = new PessoaDao();
            try {
                if (pessoadao.busca(pessoa)) {
                     JOptionPane.showMessageDialog(null, "Já existe um cadastro para este CPF! ");
                } else {
                    pessoadao.adiciona(pessoa);
                    JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso! ");
                    jTextFieldNome.setText("");
                    jFormattedCPF.setText("");
                    jFormattedRG.setText("");
                    jFormattedDataNasc.setText("");
                    jComboBoxEstadoCivil.setToolTipText("");
                    jComboBoxTipoPessoa.setToolTipText("");
                    jTextFieldNacionalidade.setText("");
                    jTextFieldNaturalidade.setText("");
                    jFormattedDataCadastro.setText("");
                    jFormattedCEP.setText("");
                    jTextFieldRua.setText("");
                    jTextFieldNumero.setText("");
                    jTextFieldComplemento.setText("");
                    jTextFieldBairro.setText("");
                    jTextFieldCidade.setText("");
                    jComboBoxUF.setToolTipText("");
                    jFormattedTelFixo.setText("");
                    jFormattedCelular.setText("");
                    jTextFieldEmail.setText("");
                    jTextFieldEmpresa.setText("");
                    jTextFieldCargo.setText("");
                    jTextFieldEnderecoComercial.setText("");
                    jFormattedCepComercial.setText("");
                    jTextFieldBairroComercial.setText("");
                    jTextFieldNumeroComercial.setText("");
                    jTextFieldCidadeComercial.setText("");
                    jComboBoxUFComercial.setToolTipText("");
                    jTextFieldLogin.setText("");
                    jPasswordSenha.setText("");
                }         
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso! " + ex.getMessage());
            }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF(jFormattedCPF.getText());
        PessoaDao pessoadao = new PessoaDao();
        try {
            if (pessoadao.busca(pessoa)) {
                pessoadao.deleta(pessoa);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso! ");
                jTextFieldNome.setText("");
                jFormattedCPF.setText("");
                jFormattedRG.setText("");
                jFormattedDataNasc.setText("");
                jComboBoxEstadoCivil.setToolTipText("");
                jComboBoxTipoPessoa.setToolTipText("");
                jTextFieldNacionalidade.setText("");
                jTextFieldNaturalidade.setText("");
                jFormattedDataCadastro.setText("");
                jFormattedCEP.setText("");
                jTextFieldRua.setText("");
                jTextFieldNumero.setText("");
                jTextFieldComplemento.setText("");
                jTextFieldBairro.setText("");
                jTextFieldCidade.setText("");
                jComboBoxUF.setToolTipText("");
                jFormattedTelFixo.setText("");
                jFormattedCelular.setText("");
                jTextFieldEmail.setText("");
                jTextFieldEmpresa.setText("");
                jTextFieldCargo.setText("");
                jTextFieldEnderecoComercial.setText("");
                jFormattedCepComercial.setText("");
                jTextFieldBairroComercial.setText("");
                jTextFieldNumeroComercial.setText("");
                jTextFieldCidadeComercial.setText("");
                jComboBoxUFComercial.setToolTipText("");
                jTextFieldLogin.setText("");
                jPasswordSenha.setText("");
                    
            } else {
                System.out.println("Não há registro com esta descrição na base! ");
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível executar a ação! " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Pessoa pessoa = new Pessoa();
        
        pessoa.setCPF(jFormattedCPF.getText());
        pessoa.setNOME(jTextFieldNome.getText());
        pessoa.setRG(jFormattedRG.getText());
        pessoa.setDATA_DE_NASCIMENTO(jFormattedDataNasc.getText());
        pessoa.setDATA_DE_CADASTRO(jFormattedDataCadastro.getText());
        pessoa.setNACIONALIDADE(jTextFieldNacionalidade.getText());
        pessoa.setNATURALIDADE(jTextFieldNaturalidade.getText());
        pessoa.setESTADO_CIVIL(jComboBoxTipoPessoa.getSelectedItem().toString());
        pessoa.setCEP(jFormattedCEP.getText());
        pessoa.setLOGRADOURO(jTextFieldRua.getText());
        pessoa.setNUMERO(jTextFieldNumero.getText());
        pessoa.setCOMPLEMENTO(jTextFieldComplemento.getText());
        pessoa.setBAIRRO(jTextFieldBairro.getText());
        pessoa.setCIDADE(jTextFieldCidade.getText());
        pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
        pessoa.setTELEFONE_FIXO(jFormattedTelFixo.getText());
        pessoa.setCELULAR(jFormattedCelular.getText());
        pessoa.setEMAIL(jTextFieldEmail.getText());
        pessoa.setEMPRESA(jTextFieldEmpresa.getText());
        pessoa.setCARGO(jTextFieldCargo.getText());
        pessoa.setEND_COMERCIAL(jTextFieldEnderecoComercial.getText());
        pessoa.setNUM_END_COM(jTextFieldNumeroComercial.getText());
        pessoa.setCEP_END_COM(jFormattedCepComercial.getText());
        pessoa.setBAIRRO_END_COM(jTextFieldBairroComercial.getText());
        pessoa.setCIDADE_END_COM(jTextFieldCidadeComercial.getText());
        pessoa.setESTADO_END_COM(jComboBoxUFComercial.getSelectedItem().toString());
        pessoa.setTIPO_PESSOA(jComboBoxTipoPessoa.getSelectedItem().toString());
        pessoa.setLOGIN(jTextFieldLogin.getText());
        pessoa.setSENHA(jPasswordSenha.getText());
            
        PessoaDao pessoadao = new PessoaDao();
        try {
            pessoadao.atualiza(pessoa);
        } catch (SQLException ex) {
            System.out.println("Não foi possível atualizar o registro! " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jComboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CadastroClientes().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil;
    private javax.swing.JComboBox<String> jComboBoxTipoPessoa;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JComboBox<String> jComboBoxUFComercial;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedCelular;
    private javax.swing.JFormattedTextField jFormattedCepComercial;
    private javax.swing.JFormattedTextField jFormattedDataCadastro;
    private javax.swing.JFormattedTextField jFormattedDataNasc;
    private javax.swing.JFormattedTextField jFormattedRG;
    private javax.swing.JFormattedTextField jFormattedTelFixo;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBairroComercial;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCepComercial;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidadeComercial;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelEnderecoComercial;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNaturalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroComercial;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelFixo;
    private javax.swing.JLabel jLabelTipoPessoa;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JLabel jLabelUFComercial;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldBairroComercial;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCidadeComercial;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldEnderecoComercial;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNacionalidade;
    private javax.swing.JTextField jTextFieldNaturalidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldNumeroComercial;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
