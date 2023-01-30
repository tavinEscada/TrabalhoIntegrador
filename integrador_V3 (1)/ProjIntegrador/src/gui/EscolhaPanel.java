package gui;

public class EscolhaPanel extends javax.swing.JPanel {

    private NewJFrame framePai;
    
    public EscolhaPanel(NewJFrame framePai) {
        initComponents();
        
        this.framePai = framePai;
        
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\otavi\\Downloads\\interdisc_V1\\ProjIntegrador\\src\\imagens/images.jpg")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        vendaBtn = new javax.swing.JButton();
        estoqueBtn = new javax.swing.JButton();
        sairBtn = new javax.swing.JButton();
        cadProdutoBtn = new javax.swing.JButton();
        cadUsuarioBtn = new javax.swing.JButton();
        historicoBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Menu");

        vendaBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        vendaBtn.setText("Venda");
        vendaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaBtnActionPerformed(evt);
            }
        });

        estoqueBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        estoqueBtn.setText("Estoque");
        estoqueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueBtnActionPerformed(evt);
            }
        });

        sairBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sairBtn.setText("Sair");
        sairBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBtnActionPerformed(evt);
            }
        });

        cadProdutoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadProdutoBtn.setText("Cadastro de produto");
        cadProdutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdutoBtnActionPerformed(evt);
            }
        });

        cadUsuarioBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadUsuarioBtn.setText("Cadastro de cliente");
        cadUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUsuarioBtnActionPerformed(evt);
            }
        });

        historicoBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        historicoBtn.setText("Histórico de vendas");
        historicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historicoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vendaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estoqueBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sairBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadProdutoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadUsuarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(historicoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vendaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(estoqueBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadUsuarioBtn)
                .addGap(18, 18, 18)
                .addComponent(cadProdutoBtn)
                .addGap(19, 19, 19)
                .addComponent(sairBtn)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vendaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaBtnActionPerformed
        framePai.trocarPainel(new VendaPanel(framePai));
        
    }//GEN-LAST:event_vendaBtnActionPerformed

    private void cadProdutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdutoBtnActionPerformed
        framePai.trocarPainel(new CadProdutoPanel(framePai));
    }//GEN-LAST:event_cadProdutoBtnActionPerformed

    private void cadUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUsuarioBtnActionPerformed
        framePai.trocarPainel(new CadUsuarioPanel(framePai));
    }//GEN-LAST:event_cadUsuarioBtnActionPerformed

    private void sairBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairBtnActionPerformed

    private void estoqueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueBtnActionPerformed
        framePai.trocarPainel(new EstoquePanel(framePai));
    }//GEN-LAST:event_estoqueBtnActionPerformed

    private void historicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicoBtnActionPerformed
        framePai.trocarPainel(new HistoricoPanel(framePai));
    }//GEN-LAST:event_historicoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadProdutoBtn;
    private javax.swing.JButton cadUsuarioBtn;
    private javax.swing.JButton estoqueBtn;
    private javax.swing.JButton historicoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairBtn;
    private javax.swing.JButton vendaBtn;
    // End of variables declaration//GEN-END:variables
}
