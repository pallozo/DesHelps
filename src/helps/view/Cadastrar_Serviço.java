/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.view;


import javax.swing.JOptionPane;
import helps.dao.Cadastrar_Servico_Banco;
import helps.model.model;
import helps.pojo.pojo_servico;
import helps.pojo.pojo;
/**
 *
 * @author gabrielw
 */
public class Cadastrar_Serviço extends javax.swing.JFrame {
        
        String ferramenta, infoadicional, tiposervico;
        int codigo;
    /**
     * Creates new form Cadastrar_Serviço
     */
    public Cadastrar_Serviço(int n2) {
        codigo=n2;
        initComponents();
    }

    public void voltar()
    {
        escolha es=new escolha(codigo);
       es.setVisible(true);
       this.dispose();
    }
    public void desabilitar_tfield(){
            if(jComboBoxSimOuNao.getSelectedItem()== "Não"){
                TQualFerramenta.setEditable(false);
                TQualFerramenta.setText("");
            }else
                TQualFerramenta.setEditable(true);
                    
                      
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboboxTipoServico = new javax.swing.JComboBox<>();
        BVoltar = new javax.swing.JButton();
        jComboBoxSimOuNao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TQualFerramenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TInfoAdicional = new javax.swing.JTextField();
        BSolicitar = new javax.swing.JButton();
        BLimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Solicitar Serviço");

        jComboboxTipoServico.setMaximumRowCount(3);
        jComboboxTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o Serviço", "Roçar a Grama", "Trocar Pneu de Carro" }));
        jComboboxTipoServico.setToolTipText("");
        jComboboxTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboboxTipoServicoActionPerformed(evt);
            }
        });

        BVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/SetaEsquerda24x24.png"))); // NOI18N
        BVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoltarActionPerformed(evt);
            }
        });

        jComboBoxSimOuNao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim ", "Não" }));
        jComboBoxSimOuNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSimOuNaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de serviço");

        jLabel3.setText("Necessita ferramenta");

        jLabel4.setText("Qual?");

        jLabel5.setText("Informações adicionais");

        BSolicitar.setText("Solicitar");
        BSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSolicitarActionPerformed(evt);
            }
        });

        BLimpar1.setText("Limpar");
        BLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimpar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BLimpar1)
                                .addGap(18, 18, 18)
                                .addComponent(BSolicitar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(jComboboxTipoServico, 0, 322, Short.MAX_VALUE)
                                .addComponent(jComboBoxSimOuNao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(TQualFerramenta)
                                .addComponent(TInfoAdicional)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboboxTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSimOuNao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TQualFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TInfoAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BSolicitar)
                    .addComponent(BLimpar1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoltarActionPerformed
        voltar();
       //escolha es = new escolha();
      // es.setVisible(true);              
    }//GEN-LAST:event_BVoltarActionPerformed

    private void jComboboxTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboboxTipoServicoActionPerformed
      

    }//GEN-LAST:event_jComboboxTipoServicoActionPerformed

    private void BLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimpar1ActionPerformed
        Limpar_tela();
    }//GEN-LAST:event_BLimpar1ActionPerformed

    private void BSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSolicitarActionPerformed
      Cadastrar_Servico_Banco csb = new Cadastrar_Servico_Banco();
      pojo_servico pj = new pojo_servico();
        model md_dao = new model();
        login lg = new login();
     
       
       pj.setServico(String.valueOf(jComboboxTipoServico.getSelectedItem()));
       pj.setFerramenta(String.valueOf(jComboBoxSimOuNao.getSelectedItem()));
       pj.setQualFerramenta(TQualFerramenta.getText());
       pj.setInfoAdicional(TInfoAdicional.getText());
       
        try {
            model.verificar_campos_servico(pj);
            int n = csb.inserir_servico(pj);
            if(n==1)
            {
                voltar();
            }
        }   catch 
               (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, pj.getErro()+ "","Erro",2);
            desabilitar_tfield();
                     
        }
       
    }//GEN-LAST:event_BSolicitarActionPerformed

    private void jComboBoxSimOuNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSimOuNaoActionPerformed
        desabilitar_tfield();
    }//GEN-LAST:event_jComboBoxSimOuNaoActionPerformed
        public void Limpar_tela(){
            TQualFerramenta.setText("");
            TInfoAdicional.setText("");
            
        }
        
        public void solicitar_servico(){
          Cadastrar_Servico_Banco csb = new Cadastrar_Servico_Banco();
            model mss = new model();
            pojo_servico pss = new pojo_servico();
            login lss = new login();
            
            pss.setServico(String.valueOf(jComboboxTipoServico.getSelectedIndex()));
            pss.setFerramenta(String.valueOf(jComboBoxSimOuNao.getSelectedIndex()));
            pss.setQualFerramenta(TQualFerramenta.getText());
            pss.setInfoAdicional(TInfoAdicional.getText());
                   
                      
        }
                    
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Serviço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Serviço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Serviço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Serviço.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Cadastrar_Serviço(id).setVisible(true);
  }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLimpar1;
    private javax.swing.JButton BSolicitar;
    private javax.swing.JButton BVoltar;
    private javax.swing.JTextField TInfoAdicional;
    private javax.swing.JTextField TQualFerramenta;
    private javax.swing.JComboBox<String> jComboBoxSimOuNao;
    private javax.swing.JComboBox<String> jComboboxTipoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
