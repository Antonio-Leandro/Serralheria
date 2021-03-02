package View;

import Dao.PessoaDao;
import Modelo.Pessoa;
import java.sql.SQLException;

public class CadastroClientes extends javax.swing.JFrame {

        public CadastroClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelUF = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jTextFieldDataNasc = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelTelFixo = new javax.swing.JLabel();
        jTextFieldTelFixo = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
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
        jTextFieldCepComercial = new javax.swing.JTextField();
        jTextFieldBairroComercial = new javax.swing.JTextField();
        jTextFieldCidadeComercial = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jTextFieldDataCadastro = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jComboBoxTipoPessoa = new javax.swing.JComboBox<>();
        jLabelNumeroComercial = new javax.swing.JLabel();
        jTextFieldNumeroComercial = new javax.swing.JTextField();
        jLabelTipoPessoa = new javax.swing.JLabel();
        jComboBoxEstadoCivil1 = new javax.swing.JComboBox<>();

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

        jButtonDeletar.setText("Deletar");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.jpg"))); // NOI18N

        jLabelNumero.setText("Número:");

        jLabelDataCadastro.setText("Data de cadastro:");

        jLabelEstadoCivil.setText("Estado Civil:");

        jComboBoxTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "C", "F", "P" }));

        jLabelNumeroComercial.setText("Numero:");

        jLabelTipoPessoa.setText("Tipo pessoal:");

        jComboBoxEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Casado(a)", "Solteiro(a)", "União Estável" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelEmpresa)
                                                .addGap(104, 104, 104))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldEmpresa)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelNumeroComercial)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldNumeroComercial)
                                                .addGap(86, 86, 86)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCargo)
                                                    .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEnderecoComercial)
                                                    .addComponent(jTextFieldEnderecoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelCidadeComercial)
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabelUFComercial))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldCidadeComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBoxUFComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonDeletar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonEditar)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelBairro)
                                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCidade)
                                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUF)
                                            .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelCepComercial)
                                                .addComponent(jTextFieldCepComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelBairroComercial)
                                                .addComponent(jTextFieldBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTelFixo)
                                            .addComponent(jTextFieldTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCelular)
                                            .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEmail)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNacionalidade)
                                            .addComponent(jTextFieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelNaturalidade)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabelEstadoCivil)
                                                .addGap(33, 33, 33))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelTipoPessoa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelNome)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCPF)
                                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelRG))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCEP)
                            .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelRua)
                            .addComponent(jTextFieldRua, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumero)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelComplemento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(322, 322, 322))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelRG)
                    .addComponent(jLabelDataNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNacionalidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataCadastro)
                            .addComponent(jLabelEstadoCivil)
                            .addComponent(jLabelTipoPessoa)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNaturalidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelRua)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jLabelUF)
                    .addComponent(jLabelComplemento)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelFixo)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmpresa)
                            .addComponent(jLabelCargo)
                            .addComponent(jLabelEnderecoComercial)
                            .addComponent(jLabelCepComercial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEnderecoComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCepComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBairroComercial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBairroComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSair)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditar)
                        .addComponent(jButtonDeletar)
                        .addComponent(jButtonSalvar)))
                .addGap(69, 69, 69))
        );

        setSize(new java.awt.Dimension(787, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        Pessoa pessoa = new Pessoa();
        
            pessoa.setCPF(jTextFieldCPF.getText());
            pessoa.setNOME(jTextFieldNome.getText());
            pessoa.setRG(jTextFieldRG.getText());
            pessoa.setDATA_DE_NASCIMENTO(jTextFieldDataNasc.getText());
            pessoa.setDATA_DE_CADASTRO(jTextFieldDataCadastro.getText());
            pessoa.setNACIONALIDADE(jTextFieldNacionalidade.getText());
            pessoa.setNATURALIDADE(jTextFieldNaturalidade.getText());
            pessoa.setESTADO_CIVIL(jComboBoxTipoPessoa.getSelectedItem().toString());
            pessoa.setCEP(jTextFieldCEP.getText());
            pessoa.setLOGRADOURO(jTextFieldRua.getText());
            pessoa.setNUMERO(jTextFieldNumero.getText());
            pessoa.setCOMPLEMENTO(jTextFieldComplemento.getText());
            pessoa.setBAIRRO(jTextFieldBairro.getText());
            pessoa.setCIDADE(jTextFieldCidade.getText());
            pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
            pessoa.setTELEFONE_FIXO(jTextFieldTelFixo.getText());
            pessoa.setCELULAR(jTextFieldCelular.getText());
            pessoa.setEMAIL(jTextFieldEmail.getText());
            pessoa.setEMPRESA(jTextFieldEmpresa.getText());
            pessoa.setCARGO(jTextFieldCargo.getText());
            pessoa.setEND_COMERCIAL(jTextFieldEnderecoComercial.getText());
            pessoa.setNUM_END_COM(jTextFieldNumeroComercial.getText());
            pessoa.setCEP_END_COM(jTextFieldCepComercial.getText());
            pessoa.setBAIRRO_END_COM(jTextFieldBairroComercial.getText());
            pessoa.setCIDADE_END_COM(jTextFieldCidadeComercial.getText());
            pessoa.setESTADO_END_COM(jComboBoxUFComercial.getSelectedItem().toString());
            pessoa.setTIPO_PESSOA(jComboBoxTipoPessoa.getSelectedItem().toString());
            
            PessoaDao pessoadao = new PessoaDao();
            try {
                 if (pessoadao.busca(pessoa)) {
                     System.out.println("Já existe um cadastro para este CPF! ");
                 } else {
                     pessoadao.adiciona(pessoa);
                     System.out.println("Cadastro salvo com sucesso! ");
                 }         
            } catch (SQLException ex) {
                System.out.println("Não foi possível salvar o cadastro..." + ex.getMessage());
            }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF(jTextFieldCPF.getText());
        PessoaDao pessoadao = new PessoaDao();
        try {
            if (pessoadao.busca(pessoa)) {
                pessoadao.deleta(pessoa);
            } else {
                System.out.println("Não há registro com esta descrição na base! ");
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível executar a ação! " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

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
    private javax.swing.JComboBox<String> jComboBoxEstadoCivil1;
    private javax.swing.JComboBox<String> jComboBoxTipoPessoa;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JComboBox<String> jComboBoxUFComercial;
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
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNaturalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroComercial;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTelFixo;
    private javax.swing.JLabel jLabelTipoPessoa;
    private javax.swing.JLabel jLabelUF;
    private javax.swing.JLabel jLabelUFComercial;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldBairroComercial;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldCepComercial;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCidadeComercial;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataCadastro;
    private javax.swing.JTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldEnderecoComercial;
    private javax.swing.JTextField jTextFieldNacionalidade;
    private javax.swing.JTextField jTextFieldNaturalidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldNumeroComercial;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelFixo;
    // End of variables declaration//GEN-END:variables
}
