package gui;

//import basedados.FakeBanco;
import modelo.RegrasCliente;
import controller.ClienteController;
import java.awt.Color;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import repository.ClienteRepository;

public class CadUsuarioPanel extends javax.swing.JPanel {

    private NewJFrame framePai;
    private ClienteController controller;
    private RegrasCliente minhasRegras;
    
    public CadUsuarioPanel(NewJFrame pai) {
        initComponents();
        
        this.framePai = pai;
        
        controller = new ClienteController();
        minhasRegras = new RegrasCliente(controller);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numeroTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidadeTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bairroTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cepTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Email");

        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Estado");

        cpfTxt.setForeground(new java.awt.Color(153, 153, 153));
        cpfTxt.setText("(ex.:999.999.999-99)");
        cpfTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfTxtMouseClicked(evt);
            }
        });
        cpfTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTxtActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Bairro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("CPF");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Cidade");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Número da residência");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("CEP");

        cepTxt.setForeground(new java.awt.Color(153, 153, 153));
        cepTxt.setText("(ex.:99999-999)");
        cepTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cepTxtMouseClicked(evt);
            }
        });
        cepTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTxtActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Senha");

        cadastrarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(numeroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addContainerGap(109, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(cadastrarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelarBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(cidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cepTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        
        if(nomeTxt.getText().isEmpty() || bairroTxt.getText().isEmpty() || cidadeTxt.getText().isEmpty() || estadoTxt.getText().isEmpty() 
                || numeroTxt.getText().isEmpty() || senhaTxt.getText().isEmpty() || emailTxt.getText().isEmpty() 
                || cpfTxt.getText().equals("(ex.:999.999.999-99)") || cepTxt.getText().equals("(ex.:99999-999)")){
            JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos.", "Preenchimento de dados", JOptionPane.WARNING_MESSAGE);
        }else{
            
            Vector<Cliente> cli = new Vector<>();
            cli = controller.buscaTodosClientes();

            for(int i = 0; i < cli.size(); i++){
                if(cpfTxt.getText().equals(cli.get(i).getCpf())){
                    JOptionPane.showMessageDialog(this, "Já existe um usuário cadastrado com este CPF", "Preenchimento de dados", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            String[] divPal = cpfTxt.getText().split("");
            
            if(divPal.length != 14){
                JOptionPane.showMessageDialog(this, "Cpf no formato errado!");
                return;
            }
            
            String[] divCep = cepTxt.getText().split("");
            if(divCep.length != 9){
                JOptionPane.showMessageDialog(this, "Cep no formato errado!");
                return;
            }

            String nomeCliente = nomeTxt.getText();
            String cpf = cpfTxt.getText();
            String cep = cepTxt.getText();
            String bairro = bairroTxt.getText();
            String cidade = cidadeTxt.getText();
            String estado = estadoTxt.getText();
            String email = emailTxt.getText();
            String senha = senhaTxt.getText();
            int numero = Integer.parseInt(numeroTxt.getText());
            
            try{
                //String nome, String cpf, String cidade, String estado, String bairro, String cep, int num, String email, String senha
                Cliente novoCliente = new Cliente(nomeCliente, cpf, cidade, estado, bairro, cep, numero, email, senha);
                
                boolean sucesso = controller.cadastraCliente(novoCliente);
                
                if(sucesso == true){
                    
                    JOptionPane.showMessageDialog(this, "cadastro realizado com sucesso.");
                    
                    framePai.trocarPainel(new EscolhaPanel(framePai));
                    
                    this.minhasRegras.addNovoCliente(novoCliente);
                    

                }else{
                    JOptionPane.showMessageDialog(this, "Erro no cadastro");
                }
                 
            }catch(NumberFormatException e){
                //tratamento do erro
                JOptionPane.showMessageDialog(this, "O número de residência deve ser um valor do tipo inteiro.");
                numeroTxt.setText("");
            }
            
            
        }
        
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        framePai.trocarPainel(new EscolhaPanel(framePai));
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void cpfTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTxtActionPerformed

    }//GEN-LAST:event_cpfTxtActionPerformed

    private void cpfTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfTxtMouseClicked
        cpfTxt.setText("");
        cpfTxt.setForeground(Color.black);
    }//GEN-LAST:event_cpfTxtMouseClicked

    private void cepTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cepTxtMouseClicked
        cepTxt.setText("");
        cepTxt.setForeground(Color.black);
    }//GEN-LAST:event_cepTxtMouseClicked

    private void cepTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTxtActionPerformed

    }//GEN-LAST:event_cepTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairroTxt;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField cepTxt;
    private javax.swing.JTextField cidadeTxt;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField estadoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField numeroTxt;
    private javax.swing.JTextField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
