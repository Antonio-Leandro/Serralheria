package View;

import Dao.FornecedorDao;
import Dao.PessoaDao;
import Modelo.Pessoa;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class CadastroFornecedores extends javax.swing.JFrame {
      
    public CadastroFornecedores() {
    initComponents();
    this.setLocationRelativeTo(null);
    jFormattedDataCadastro.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

    preencherTabela();   
    }
    
    private void preencherTabela() {
        DefaultTableModel modelo = (DefaultTableModel)jTbFornecedores.getModel();
        modelo.setNumRows(0);
        FornecedorDao fdao = new FornecedorDao();
        for(Pessoa p: fdao.listar()) {
            modelo.addRow(new Object[]{
                p.getRAZAO_SOCIAL(),
                p.getNOME_FANTASIA(),
                p.getCNPJ(),
                p.getDATA_FUNDACAO(),
                p.getDATA_DE_CADASTRO(),
                p.getLOGRADOURO(),
                p.getNUMERO(),
                p.getCEP(),
                p.getESTADO(),
                p.getCOMPLEMENTO(),
                p.getBAIRRO(),
                p.getCIDADE(),
                p.getTELEFONE_FIXO(),
                p.getSITE(),
                p.getEMAIL_RESP()
            });
        }
    }
    
    public void limpaCampos() {
        jTextFieldRasaoSocial.setText("");
        jFormattedCNPJ.setText("");
        jFormattedDataFun.setText("");
        jComboBoxUF.setSelectedItem(null);
        jFormattedCEP.setText("");
        jTextFieldRua.setText("");
        jTextFieldNumero.setText("");
        jTextFieldComplemento.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCidade.setText("");
        jFormattedTelFixo.setText("");
        jTextFieldSite.setText("");
        jTextFieldContatoResp.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldRasaoSocial = new javax.swing.JTextField();
        jLabelRasaoSocial = new javax.swing.JLabel();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelDataFund = new javax.swing.JLabel();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabelTelFixo = new javax.swing.JLabel();
        jLabelSite = new javax.swing.JLabel();
        jTextFieldSite = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelDataCadastro = new javax.swing.JLabel();
        jLabelEmailResp = new javax.swing.JLabel();
        jTextFieldContatoResp = new javax.swing.JTextField();
        jFormattedDataFun = new javax.swing.JFormattedTextField();
        jFormattedDataCadastro = new javax.swing.JFormattedTextField();
        jFormattedCNPJ = new javax.swing.JFormattedTextField();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jFormattedTelFixo = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbFornecedores = new javax.swing.JTable();
        jLabelUFPessoa = new javax.swing.JLabel();
        jComboBoxUF = new javax.swing.JComboBox<>();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabelNomeFantasia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setResizable(false);

        jLabelRasaoSocial.setText("Rasão Social:");

        jLabelCNPJ.setText("CNPJ:");

        jLabelCEP.setText("CEP:");

        jLabelRua.setText("Logradouro:");

        jLabelBairro.setText("Bairro:");

        jLabelCidade.setText("Cidade:");

        jLabelDataFund.setText("Data Fundação:");

        jLabelComplemento.setText("Complemento:");

        jLabelTelFixo.setText("Telefone fixo:");

        jLabelSite.setText("Site:");

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
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabelNumero.setText("Número:");

        jLabelDataCadastro.setText("Data Cadastro:");

        jLabelEmailResp.setText("E- mail Responsável:");

        try {
            jFormattedDataFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTbFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RAZAO SOCIAL", "NOME FANTASIA", "CNPJ", "FUNDAÇÃO", "CADASTRO", "ENDEREÇO", "NÚMERO", "CEP", "UF", "COMPLEMENTO", "BAIRRO", "CIDADE", "TELEFONE", "SITE", "EMAIL_RESP"
            }
        ));
        jTbFornecedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTbFornecedores);
        if (jTbFornecedores.getColumnModel().getColumnCount() > 0) {
            jTbFornecedores.getColumnModel().getColumn(0).setPreferredWidth(110);
            jTbFornecedores.getColumnModel().getColumn(1).setPreferredWidth(110);
            jTbFornecedores.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTbFornecedores.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTbFornecedores.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTbFornecedores.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTbFornecedores.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTbFornecedores.getColumnModel().getColumn(7).setPreferredWidth(70);
            jTbFornecedores.getColumnModel().getColumn(8).setPreferredWidth(30);
            jTbFornecedores.getColumnModel().getColumn(9).setPreferredWidth(150);
            jTbFornecedores.getColumnModel().getColumn(10).setPreferredWidth(150);
            jTbFornecedores.getColumnModel().getColumn(11).setPreferredWidth(110);
            jTbFornecedores.getColumnModel().getColumn(12).setPreferredWidth(80);
            jTbFornecedores.getColumnModel().getColumn(13).setPreferredWidth(130);
            jTbFornecedores.getColumnModel().getColumn(14).setPreferredWidth(180);
        }

        jLabelUFPessoa.setText("UF:");

        jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));
        jComboBoxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUFActionPerformed(evt);
            }
        });

        jLabelNomeFantasia.setText("Nome Fatasia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelUFPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataFund)
                                .addGap(2, 2, 2)
                                .addComponent(jFormattedDataFun, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelRasaoSocial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRasaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNomeFantasia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTelFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSite, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmailResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldContatoResp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRasaoSocial)
                    .addComponent(jTextFieldRasaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCNPJ)
                    .addComponent(jLabelDataFund)
                    .addComponent(jFormattedCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedDataFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataCadastro)
                    .addComponent(jFormattedDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCEP)
                    .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComplemento)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUFPessoa)
                    .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelFixo)
                    .addComponent(jFormattedTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSite)
                    .addComponent(jTextFieldSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmailResp)
                    .addComponent(jTextFieldContatoResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSair)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDeletar))
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        setSize(new java.awt.Dimension(651, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        Pessoa pessoa = new Pessoa();
        
            pessoa.setCNPJ(jFormattedCNPJ.getText());
            pessoa.setRAZAO_SOCIAL(jTextFieldRasaoSocial.getText());
            pessoa.setNOME_FANTASIA(jTextFieldNomeFantasia.getText());
            pessoa.setDATA_FUNDACAO(jFormattedDataFun.getText());
            pessoa.setDATA_DE_CADASTRO(jFormattedDataCadastro.getText());          
            pessoa.setCEP(jFormattedCEP.getText());
            pessoa.setLOGRADOURO(jTextFieldRua.getText());
            pessoa.setNUMERO(jTextFieldNumero.getText());
            pessoa.setCOMPLEMENTO(jTextFieldComplemento.getText());
            pessoa.setBAIRRO(jTextFieldBairro.getText());
            pessoa.setCIDADE(jTextFieldCidade.getText());
            if (jComboBoxUF.getSelectedIndex()!=-1) {
                pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
            }         
            pessoa.setTELEFONE_FIXO(jFormattedTelFixo.getText());
            pessoa.setSITE(jTextFieldSite.getText());
            pessoa.setEMAIL_RESP(jTextFieldContatoResp.getText());
              
            FornecedorDao fornecedordao = new FornecedorDao();
            try {
                if (fornecedordao.busca(pessoa)) {
                     JOptionPane.showMessageDialog(null, "Já existe um cadastro para este CNPJ! ");
                } else {
                    fornecedordao.adiciona(pessoa);
                    JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso! ");
                    this.limpaCampos();
                }         
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cadastro! " + ex.getMessage());
            }
            preencherTabela();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        Pessoa pessoa = new Pessoa();
        pessoa.setCPF(jFormattedCNPJ.getText());
        PessoaDao pessoadao = new PessoaDao();
        try {
            if (pessoadao.busca(pessoa)) {
                pessoadao.deleta(pessoa);
                JOptionPane.showMessageDialog(null, "Deseja Realmente Excluir o registro ? ");
                this.limpaCampos();    
            } else {
                System.out.println("Não há registro com esta descrição na base! ");
            }
        } catch (SQLException ex) {
            System.out.println("Não foi possível executar a ação! " + ex.getMessage());
        }
        preencherTabela();
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        Pessoa pessoa = new Pessoa();
        
        pessoa.setCNPJ(jFormattedCNPJ.getText());
        pessoa.setRAZAO_SOCIAL(jTextFieldRasaoSocial.getText());
        pessoa.setDATA_FUNDACAO(jFormattedDataFun.getText());
        pessoa.setDATA_DE_CADASTRO(jFormattedDataCadastro.getText());
        pessoa.setCEP(jFormattedCEP.getText());
        pessoa.setLOGRADOURO(jTextFieldRua.getText());
        pessoa.setNUMERO(jTextFieldNumero.getText());
        pessoa.setCOMPLEMENTO(jTextFieldComplemento.getText());
        pessoa.setBAIRRO(jTextFieldBairro.getText());
        pessoa.setCIDADE(jTextFieldCidade.getText());
        if (jComboBoxUF.getSelectedIndex()!=-1) {
            pessoa.setESTADO(jComboBoxUF.getSelectedItem().toString());
        }
        pessoa.setTELEFONE_FIXO(jFormattedTelFixo.getText());
        pessoa.setSITE(jTextFieldSite.getText());
        pessoa.setEMAIL_RESP(jTextFieldContatoResp.getText());
            
        //PessoaDao pessoadao = new PessoaDao();
        FornecedorDao fornecedordao = new FornecedorDao();
        try {
            fornecedordao.atualiza(pessoa);
        } catch (SQLException ex) {
            System.out.println("Não foi possível atualizar o registro! " + ex.getMessage());
        }
        preencherTabela();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUFActionPerformed
  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CadastroFornecedores().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxUF;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedCNPJ;
    private javax.swing.JFormattedTextField jFormattedDataCadastro;
    private javax.swing.JFormattedTextField jFormattedDataFun;
    private javax.swing.JFormattedTextField jFormattedTelFixo;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDataCadastro;
    private javax.swing.JLabel jLabelDataFund;
    private javax.swing.JLabel jLabelEmailResp;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRasaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSite;
    private javax.swing.JLabel jLabelTelFixo;
    private javax.swing.JLabel jLabelUFPessoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbFornecedores;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldContatoResp;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRasaoSocial;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSite;
    // End of variables declaration//GEN-END:variables
}
