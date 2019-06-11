package Cadastro;

import Fichas.Endereço;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.DefaultListModel;

public class Cliente extends javax.swing.JFrame {
    public Cliente() {
        initComponents();
        
        Endereço en = new Endereço();
        
        // Le o arquivo
        try{
            File pastas = new File(en.getEnde()+"Clientes\\");
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
                            l_Clientes.setModel(dlm);
                            
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Classificação1 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        b_Voltar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        l_Clientes = new javax.swing.JList<>();
        b_Cadastrar = new javax.swing.JButton();
        b_Editar = new javax.swing.JButton();
        Classificação2 = new javax.swing.JLabel();
        txt_Endereço = new javax.swing.JTextField();
        txt_Cpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Fone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        Classificação3 = new javax.swing.JLabel();
        txt_Bairro = new javax.swing.JTextField();
        Classificação4 = new javax.swing.JLabel();
        txt_Cidade = new javax.swing.JTextField();
        Classificação5 = new javax.swing.JLabel();
        txt_Estado = new javax.swing.JTextField();
        Classificação6 = new javax.swing.JLabel();
        txt_Cep = new javax.swing.JFormattedTextField();
        txt_Data = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 75, 79));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        Classificação1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação1.setForeground(new java.awt.Color(255, 255, 255));
        Classificação1.setText("Nascimento:");

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

        jScrollPane1.setViewportView(l_Clientes);

        jTabbedPane1.addTab("Ficha de Clientes", jScrollPane1);

        b_Cadastrar.setBackground(new java.awt.Color(0, 102, 153));
        b_Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        b_Cadastrar.setText("Cadastrar");
        b_Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_CadastrarActionPerformed(evt);
            }
        });

        b_Editar.setBackground(new java.awt.Color(204, 153, 0));
        b_Editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Editar.setForeground(new java.awt.Color(255, 255, 255));
        b_Editar.setText("Editar");
        b_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Classificação2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação2.setForeground(new java.awt.Color(255, 255, 255));
        Classificação2.setText("Endereço:");

        try {
            txt_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");

        try {
            txt_Fone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone:");

        Classificação3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação3.setForeground(new java.awt.Color(255, 255, 255));
        Classificação3.setText("Bairro:");

        Classificação4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação4.setForeground(new java.awt.Color(255, 255, 255));
        Classificação4.setText("Cidade:");

        Classificação5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação5.setForeground(new java.awt.Color(255, 255, 255));
        Classificação5.setText("Estado:");

        Classificação6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação6.setForeground(new java.awt.Color(255, 255, 255));
        Classificação6.setText("CEP:");

        try {
            txt_Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_Data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Classificação2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Endereço))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Classificação3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Classificação5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Estado)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(Classificação6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Cep))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Classificação4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Classificação1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Nome)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Data, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Cpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Fone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txt_Fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Classificação1)
                            .addComponent(txt_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação3)
                            .addComponent(txt_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Classificação5)
                            .addComponent(txt_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação6)
                            .addComponent(txt_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTabbedPane1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    private void b_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_b_VoltarActionPerformed
    DefaultListModel dlm = new DefaultListModel();
    private void b_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CadastrarActionPerformed
        // salvar e add na lista o filme

        Endereço en = new Endereço();
        
        String nome = txt_Nome.getText();
        String cpf = txt_Cpf.getText();
        String fone = txt_Fone.getText();
        //    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //String data = sdf.format(txt_Data.getDateFormatString());
        String data = txt_Data.getText();

        File file = new File(en.getEnde()+"Clientes\\"+nome+".txt");
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(nome+" - ");
                bw.write(cpf+" - ");
                bw.write(fone+" - ");
                bw.write(data);

                dlm.addElement(nome+" - "+cpf+" - "+data+" - "+fone);
                l_Clientes.setModel(dlm);

                txt_Nome.setText("");
                txt_Cpf.setText("");
                txt_Fone.setText("");
                txt_Data.setText("");

                bw.close();
                fw.close();

            } catch (IOException ex) {
            }
    }//GEN-LAST:event_b_CadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Classificação1;
    private javax.swing.JLabel Classificação2;
    private javax.swing.JLabel Classificação3;
    private javax.swing.JLabel Classificação4;
    private javax.swing.JLabel Classificação5;
    private javax.swing.JLabel Classificação6;
    private javax.swing.JButton b_Cadastrar;
    private javax.swing.JButton b_Editar;
    private javax.swing.JButton b_Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> l_Clientes;
    private javax.swing.JTextField txt_Bairro;
    private javax.swing.JFormattedTextField txt_Cep;
    private javax.swing.JTextField txt_Cidade;
    private javax.swing.JFormattedTextField txt_Cpf;
    private javax.swing.JFormattedTextField txt_Data;
    private javax.swing.JTextField txt_Endereço;
    private javax.swing.JTextField txt_Estado;
    private javax.swing.JFormattedTextField txt_Fone;
    private javax.swing.JTextField txt_Nome;
    // End of variables declaration//GEN-END:variables
}
