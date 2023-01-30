package gui;

import modelo.RegrasProduto;
import controller.ClienteController;
import controller.ProdutoController;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Produto;

public class CadProdutoPanel extends javax.swing.JPanel {

    private NewJFrame framePai;
    private ProdutoController controller;
    private RegrasProduto minhasRegras;
    
    public CadProdutoPanel(NewJFrame pai) {
        initComponents();
        
        this.framePai = pai;
        
        controller = new ProdutoController();
        minhasRegras = new RegrasProduto(controller);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        precoTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sexoCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nomeProdTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modalidadeTxt = new javax.swing.JTextField();
        cancelarBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tamanhoTxt = new javax.swing.JTextField();
        cadastrarProdBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        quantidadeTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        precoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Preço");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Tamanho");

        codigoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Código");

        sexoCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "U" }));
        sexoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoComboActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Nome");

        nomeProdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Modalidade");

        modalidadeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modalidadeTxtActionPerformed(evt);
            }
        });

        cancelarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Sexo");

        cadastrarProdBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastrarProdBtn.setText("Cadastrar");
        cadastrarProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Quantidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(cadastrarProdBtn)
                        .addGap(56, 56, 56)
                        .addComponent(cancelarBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sexoCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tamanhoTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(nomeProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modalidadeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(codigoTxt))))
                .addGap(200, 200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanhoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(modalidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProdBtn)
                    .addComponent(cancelarBtn))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoTxtActionPerformed

    private void codigoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTxtActionPerformed

    private void sexoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoComboActionPerformed

    private void nomeProdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeProdTxtActionPerformed

    private void modalidadeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modalidadeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modalidadeTxtActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        framePai.trocarPainel(new EscolhaPanel(framePai));
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void cadastrarProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdBtnActionPerformed
        
        if(nomeProdTxt.getText().isEmpty() || tamanhoTxt.getText().isEmpty() || quantidadeTxt.getText().isEmpty() || modalidadeTxt.getText().isEmpty()
                || codigoTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos.", "Preenchimento de dados", JOptionPane.WARNING_MESSAGE);
        }else{
            
            Vector<Produto> prod = new Vector<>();
            prod = controller.buscaTodosProdutos();
            
            for(int i = 0; i < prod.size(); i++){
                if(codigoTxt.getText().equals(prod.get(i).getCodigo())){
                    
                    JOptionPane.showMessageDialog(this, "Já existe um produto cadastrado com este código", "Preenchimento de dados", JOptionPane.WARNING_MESSAGE);
                    return;
                    
                }
            }
            
            String nomeProd = nomeProdTxt.getText();
            String tamanho = tamanhoTxt.getText();
            int quantidade = Integer.parseInt(quantidadeTxt.getText());
            Double preco = Double.parseDouble(precoTxt.getText());
            String codigo = codigoTxt.getText();
            String modalidade = modalidadeTxt.getText();
            
            try{
                //double preco, String codigo, String nome, String modalidade, String sexo, String tamanho, int quantidade
                Produto novoProduto = new Produto(preco, codigo, nomeProd, modalidade, (String)sexoCombo.getSelectedItem(), tamanho, quantidade);
                
                boolean sucesso = controller.cadastraProduto(novoProduto);
                
                if(sucesso == true){
                    
                    JOptionPane.showMessageDialog(this, "cadastro realizado com sucesso.");
                    
                    framePai.trocarPainel(new EscolhaPanel(framePai));
                    
                    this.minhasRegras.addNovoProduto(novoProduto);
                    
                }else{
                    JOptionPane.showMessageDialog(this, "Erro no cadastro");
                }
                 
            }catch(NumberFormatException e){
                //tratamento do erro
                JOptionPane.showMessageDialog(this, "A qantidade em estoque deve ser um valor do tipo inteiro.");
                quantidadeTxt.setText("");
            }
            
        }
        
    }//GEN-LAST:event_cadastrarProdBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarProdBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField modalidadeTxt;
    private javax.swing.JTextField nomeProdTxt;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JTextField quantidadeTxt;
    private javax.swing.JComboBox<String> sexoCombo;
    private javax.swing.JTextField tamanhoTxt;
    // End of variables declaration//GEN-END:variables
}
