package gui;

import modelo.RegrasProduto;
import controller.ClienteController;
import controller.ProdutoController;
import controller.VendaController;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Compra;
import modelo.Produto;
import modelo.RegrasCompra;

public class VendaPanel extends javax.swing.JPanel {

    private NewJFrame framePai;
    private VendaController controllerVenda;
    private ProdutoController controller;
    private ClienteController cliController;
    private RegrasProduto minhasRegras;
    private RegrasCompra regrasCompra;
    private Vector<Produto> prodsCarrinho;
    private RegrasTabelaCompra regrasTabela;
    private double valorTotal;
    
    public VendaPanel(NewJFrame pai) {
        initComponents();
        meuInitComponents();
        
        this.framePai = pai;
        
        controllerVenda = new VendaController();
        regrasCompra = new RegrasCompra(controllerVenda);
        controller = new ProdutoController();
        cliController = new ClienteController();
        minhasRegras = new RegrasProduto(controller);
        prodsCarrinho = new Vector<>();
        valorTotal = 0.0;
        
    }

    private void meuInitComponents(){
        this.regrasTabela = new RegrasTabelaCompra(this);
        
        //minha tabela segue as regras implementadas na classe
        compraTable.setModel(regrasTabela);
        
    }
    
    public void atualizaCalculo(){
        //System.out.println("");
        
        valorTotal = 0;
        
        for(int i = 0; i < this.prodsCarrinho.size(); i++){
            valorTotal += this.prodsCarrinho.get(i).getPreco() * this.prodsCarrinho.get(i).getQuantidade();
        }
        
        
        valorTxt.setText(""+valorTotal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quantidadeTxt = new javax.swing.JTextField();
        adicionarBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        finalizarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        codigoProdTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        compraTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpfCliTxt = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Carrinho");

        adicionarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        adicionarBtn.setText("Adicionar");
        adicionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        finalizarBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        finalizarBtn.setText("Finalizar");
        finalizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Quantidade:");

        compraTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        compraTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                compraTableKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                compraTableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(compraTable);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Código do produto:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Valor total:");

        valorTxt.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        valorTxt.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("CPF do cliente:");

        cpfCliTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfCliTxt.setForeground(new java.awt.Color(153, 153, 153));
        cpfCliTxt.setText("999.999.999-99");
        cpfCliTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfCliTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(codigoProdTxt)
                        .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(adicionarBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorTxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(finalizarBtn)
                        .addGap(64, 64, 64)
                        .addComponent(cancelarBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cpfCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(227, 227, 227))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoProdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adicionarBtn)))
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfCliTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finalizarBtn)
                    .addComponent(cancelarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(valorTxt))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarBtnActionPerformed
        
        Produto prodTemp = null;
        String textoUsuario = codigoProdTxt.getText();
        Vector<Produto> prods = new Vector<>();
        prods = controller.buscaTodosProdutos();
        
        if(textoUsuario.isEmpty() || quantidadeTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!!!");
        }else{
            int quant = Integer.parseInt(quantidadeTxt.getText());
            
            for(int i = 0; i < prods.size(); i++){
                if(textoUsuario.equalsIgnoreCase(prods.get(i).getCodigo())){
                    prodTemp = prods.get(i);
                    
                    if(prodTemp.getQuantidade() < quant){
                        JOptionPane.showMessageDialog(this, "Quantidade em estoque insuficiente");
                        quantidadeTxt.setText("");
                        return;
                    }else{
                        valorTotal += prodTemp.getPreco() * quant;
                        prodTemp.setQuantidade(quant);
                        this.prodsCarrinho.add(prodTemp);
                        
                        //atualizar a tabela do carrinho
                        regrasTabela.insertProduto(prodTemp);
                        compraTable.updateUI();
                        
                        //atualizar valor total
                        valorTxt.setText(valorTotal+"");
                        
                        
                        codigoProdTxt.setText("");
                        quantidadeTxt.setText("");
                    }
                }
            }
            if(prodTemp == null){
                JOptionPane.showMessageDialog(this, "Código inválido.");
                codigoProdTxt.setText("");
            }
            
        }
    }//GEN-LAST:event_adicionarBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        framePai.trocarPainel(new EscolhaPanel(framePai));
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void finalizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarBtnActionPerformed

        controller.modificaQuant(this.prodsCarrinho);
        
        if(prodsCarrinho.isEmpty()){
            JOptionPane.showMessageDialog(this, "Não foi adicionado nenhum produto!");
            return;
        }
        
        Vector<Cliente> cli = new Vector<>();
        cli = cliController.buscaTodosClientes();
        
        Cliente cliente = null;

        for(int i = 0; i < cli.size(); i++){
            if(cpfCliTxt.getText().equals(cli.get(i).getCpf())){
                cliente = cli.get(i);
            }
        }
        String cpfCliente = cpfCliTxt.getText();
        //add no banco
        if(cpfCliTxt.getText().equals(("999.999.999-99")) || cliente == null){
            
            if (JOptionPane.showConfirmDialog(null, "Deseja realizar compra com usuário desconhecido?", "CPF iválido.",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
                // yes option
                cpfCliente = "000.000.000-00";
                //cpfCliTxt.setText("999.999.999-99");
            } else {
                // no option
                return;
            }
        }
        
        String codigo = "";
        
        Random gerador = new Random();
        
        for(int i = 0; i < 5; i++){
            codigo += gerador.nextInt(0, 9);
        }
        
        Date data = new Date();
        
        SimpleDateFormat dd = new SimpleDateFormat();
            
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        String dataCompra = formatoData.format(data);
        
        Double valorTotal = Double.parseDouble(valorTxt.getText());
        
        try{
                //String codigo, double valorTotal, Date dataCompra, String cpfCliente
                Compra novaCompra = new Compra(valorTotal, dataCompra, cpfCliente, codigo);
                
                boolean sucesso = controllerVenda.cadastraCompra(novaCompra);
                
                if(sucesso == true){
                    
                    JOptionPane.showMessageDialog(this, "Venda concluída.");
                    framePai.trocarPainel(new EscolhaPanel(framePai));
                    
                    this.regrasCompra.addNovaCompra(novaCompra);
                    

                }else{
                    JOptionPane.showMessageDialog(this, "Erro no cadastro");
                }
                 
            }catch(NumberFormatException e){
                
            }
        
        
    }//GEN-LAST:event_finalizarBtnActionPerformed

    private void compraTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compraTableKeyPressed
        
    }//GEN-LAST:event_compraTableKeyPressed

    private void compraTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_compraTableKeyTyped
        
    }//GEN-LAST:event_compraTableKeyTyped

    private void cpfCliTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfCliTxtMouseClicked
        cpfCliTxt.setText("");
        
        cpfCliTxt.setForeground(Color.black);
    }//GEN-LAST:event_cpfCliTxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarBtn;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JTextField codigoProdTxt;
    private javax.swing.JTable compraTable;
    private javax.swing.JTextField cpfCliTxt;
    private javax.swing.JButton finalizarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantidadeTxt;
    private javax.swing.JLabel valorTxt;
    // End of variables declaration//GEN-END:variables
}
