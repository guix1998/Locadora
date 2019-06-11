package Locação;

import Fichas.Alugar;
import Fichas.Endereço;
import java.io.BufferedReader;
import java.io.File;
import java.util.Date;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;

public class Locacao extends javax.swing.JFrame {
    public Locacao() {
        initComponents();
        
        Date data = new Date();
        txt_DataL.setDate(data);
        
        Endereço en = new Endereço();
        
        // Le o arquivo
        try{
            File pastas = new File(en.getEnde()+"Filmes\\");
                File[] files = pastas.listFiles();

                for (int i = 0; i < files.length; i++) {
                    File file = files[i];

                    if (file.getPath().endsWith(".txt")) {  //PESQUISA O TXT DA MATRICULA
                        String arq = file.getName();
                        System.out.println(arq);

                        BufferedReader br = new BufferedReader(new FileReader(file));
                        while(br.ready()){
                            String linha = br.readLine();
                            String[] palavra = linha.split(" - ");
                            
                            dlm.addElement(palavra[0]+" - "+palavra[1]+" - "+palavra[2]+" - "+palavra[3]);
                            l_FixaFilmes.setModel(dlm);
                            
                            System.out.println(linha);   //PRINT NA TELA OS DADOS DO .TXT
                            
                            // Imprime confirmacao
                            System.out.println("Feito =D");
                        }
                        br.close();
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Classificação = new javax.swing.JLabel();
        Classificação1 = new javax.swing.JLabel();
        txt_Cliente = new javax.swing.JTextField();
        txt_Classi = new javax.swing.JTextField();
        txt_DataL = new com.toedter.calendar.JDateChooser();
        b_Voltar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        l_FixaFilmes = new javax.swing.JList<>();
        b_Limpar = new javax.swing.JButton();
        b_Concluuir = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        l_Alugar = new javax.swing.JList<>();
        b_Add = new javax.swing.JButton();
        b_Busca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(54, 75, 79));
        jPanel2.setToolTipText("Locação");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente:");

        Classificação.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação.setForeground(new java.awt.Color(255, 255, 255));
        Classificação.setText("Classificação:");

        Classificação1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação1.setForeground(new java.awt.Color(255, 255, 255));
        Classificação1.setText("Data da Locação:");

        b_Voltar.setBackground(new java.awt.Color(0, 102, 153));
        b_Voltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Voltar.setForeground(new java.awt.Color(255, 255, 255));
        b_Voltar.setText("Voltar");
        b_Voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_VoltarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(l_FixaFilmes);

        jTabbedPane1.addTab("Filmes Cadastrados", jScrollPane1);

        b_Limpar.setBackground(new java.awt.Color(204, 204, 0));
        b_Limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Limpar.setForeground(new java.awt.Color(255, 255, 255));
        b_Limpar.setText("Limpar");
        b_Limpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimparActionPerformed(evt);
            }
        });

        b_Concluuir.setBackground(new java.awt.Color(0, 102, 153));
        b_Concluuir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Concluuir.setForeground(new java.awt.Color(255, 255, 255));
        b_Concluuir.setText("Concluir");
        b_Concluuir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Concluuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ConcluuirActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(l_Alugar);

        jTabbedPane2.addTab("Filmes Selecionados", jScrollPane2);

        b_Add.setBackground(new java.awt.Color(0, 153, 0));
        b_Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Add.setForeground(new java.awt.Color(255, 255, 255));
        b_Add.setText("Add");
        b_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_AddActionPerformed(evt);
            }
        });

        b_Busca.setBackground(new java.awt.Color(0, 153, 204));
        b_Busca.setForeground(new java.awt.Color(255, 255, 255));
        b_Busca.setText("Buscar");
        b_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_BuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(b_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Classificação1)
                                .addComponent(Classificação, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Classi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_Busca))
                            .addComponent(txt_DataL, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(b_Concluuir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_Busca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Classi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_DataL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_Concluuir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        DefaultListModel dlm = new DefaultListModel();
        DefaultListModel dlm2 = new DefaultListModel();
    private void b_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_b_VoltarActionPerformed

    private void b_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimparActionPerformed
        int remove = l_Alugar.getSelectionMode();
        dlm2.remove(remove);
    }//GEN-LAST:event_b_LimparActionPerformed

    private void b_ConcluuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ConcluuirActionPerformed
        
    }//GEN-LAST:event_b_ConcluuirActionPerformed

    private void b_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_AddActionPerformed
        dlm2.addElement(l_FixaFilmes.getSelectedValue());
        l_Alugar.setModel(dlm2);

        int remover=l_FixaFilmes.getSelectedIndex();
        dlm.remove(remover);
    }//GEN-LAST:event_b_AddActionPerformed

    private void b_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_BuscaActionPerformed
        Endereço en = new Endereço();
        
        String buscaNome = txt_Cliente.getText();
        
        // Le o arquivo
        try{
            File pastas = new File(en.getEnde()+"Clientes\\");
                File[] files = pastas.listFiles();

                for (int i = 0; i < files.length; i++) {
                    File file = files[i];

                    if (file.getPath().endsWith(".txt")) {  //PESQUISA O TXT DA MATRICULA
                        String arq = file.getName();
                        
                        if(arq == buscaNome+".txt"){
                        
                            BufferedReader br = new BufferedReader(new FileReader(file));
                            while(br.ready()){
                                String linha = br.readLine();
                                String[] palavra = linha.split(" - ");

                                Alugar a = new Alugar();
                                a.setNome(palavra[0]);
                                a.setData(palavra[3]);
                                
                                System.out.println(palavra[0]);
                                System.out.println(palavra[3]);

                                // Imprime confirmacao
                                System.out.println("Feito =D");
                            }
                            br.close();
                        }
                    }
                }
            }catch(IOException e){
            }

    }//GEN-LAST:event_b_BuscaActionPerformed

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
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Locacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Locacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Classificação;
    private javax.swing.JLabel Classificação1;
    private javax.swing.JButton b_Add;
    private javax.swing.JButton b_Busca;
    private javax.swing.JButton b_Concluuir;
    private javax.swing.JButton b_Limpar;
    private javax.swing.JButton b_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList<String> l_Alugar;
    private javax.swing.JList<String> l_FixaFilmes;
    private javax.swing.JTextField txt_Classi;
    private javax.swing.JTextField txt_Cliente;
    private com.toedter.calendar.JDateChooser txt_DataL;
    // End of variables declaration//GEN-END:variables
}
