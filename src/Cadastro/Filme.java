package Cadastro;

import Fichas.Endereço;
import java.io.*;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


public class Filme extends javax.swing.JFrame {
    public Filme() {
        initComponents();
        
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
                            //String[] palavra = linha.split(" - ");
                            
                            dlm.addElement(linha);
                            l_Filmes.setModel(dlm);
                            
                            System.out.println(linha);   //PRINT NA TELA OS DADOS DO .TXT
                            
                            // Imprime confirmacao
                            System.out.println("Feito =D");
                        }
                        br.close();
                    }
                }
            }catch(IOException e){
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Classificação = new javax.swing.JLabel();
        Classificação1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        txt_Ref = new javax.swing.JTextField();
        c_Genero = new javax.swing.JComboBox<>();
        c_Classi = new javax.swing.JComboBox<>();
        b_Voltar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        l_Filmes = new javax.swing.JList<>();
        b_Cadastrar = new javax.swing.JButton();
        b_Editar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Qtd = new javax.swing.JTextField();
        txt_Data = new javax.swing.JFormattedTextField();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filme:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Genero:");

        Classificação.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação.setForeground(new java.awt.Color(255, 255, 255));
        Classificação.setText("Classificação:");

        Classificação1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Classificação1.setForeground(new java.awt.Color(255, 255, 255));
        Classificação1.setText("Lançamento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Referencia:");

        c_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ...", "Acão", "Animação", "Aventura", "Comédia", "Documentário", "Drama", "Fantasia", "Ficção", "Romance", "Suspense", "Terror", " " }));

        c_Classi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione ...", "Livre", "10", "12", "14", "16", "18" }));

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

        jScrollPane1.setViewportView(l_Filmes);

        jTabbedPane1.addTab("Filmes Cadastrados", jScrollPane1);

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
        b_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EditarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Qtd:");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c_Genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Nome)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_Ref, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Qtd)))))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(Classificação))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(Classificação1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c_Classi, 0, 143, Short.MAX_VALUE)
                                    .addComponent(txt_Data)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(c_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_Classi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Classificação))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Classificação1)
                            .addComponent(txt_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(b_Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void b_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_b_VoltarActionPerformed
        DefaultListModel dlm = new DefaultListModel();
        DateFormat df = DateFormat.getDateInstance();
    private void b_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_CadastrarActionPerformed
        // salvar e add na lista o filme
        
        Endereço en = new Endereço();
        
        String nome = txt_Nome.getText();
        String ref = txt_Ref.getText();
        String qtd = txt_Qtd.getText();
        String genero = (String) c_Genero.getSelectedItem();
        String classi = (String) c_Classi.getSelectedItem();
        //    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //String data = sdf.format(txt_Data.getDate());
        String data = txt_Data.getText();
        System.out.println(data);
        
        File file = new File(en.getEnde()+"Filmes\\"+ref+".txt");
        try {
            FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                
                bw.write(ref+" - ");
                bw.write(nome+" - ");
                bw.write(genero+" - ");
                bw.write(classi+" - ");
                bw.write(data+" - ");
                bw.write(qtd);
                
                dlm.addElement(ref+" - "+nome+" - "+genero+" - "+classi+" - "+data+" - "+qtd);
                l_Filmes.setModel(dlm);
                
                txt_Nome.setText("");
                txt_Ref.setText("");
                txt_Qtd.setText("");
                c_Genero.setSelectedItem("Selecione ...");
                c_Classi.setSelectedItem("Selecione ...");
                txt_Data.setText("");
                
                bw.close();
            fw.close();
            
        } catch (IOException ex) {
        }
        
        
        
    }//GEN-LAST:event_b_CadastrarActionPerformed

    private void b_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EditarActionPerformed
        String selec = l_Filmes.getSelectedValue();
        
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(selec))) {
                while(br.ready()){
                    String linha = br.readLine();
                    
                    String[] palavra = linha.split(" - ");
                    
                    txt_Nome.setText(palavra[1]);
                    txt_Ref.setText(palavra[0]);
                    txt_Qtd.setText(palavra[5]);
                    txt_Data.setText(palavra[4]);
                    
                    
                    // Imprime confirmacao
                    System.out.println("Feito =D");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Filme.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int remove = l_Filmes.getSelectedIndex();
        dlm.removeElement(l_Filmes);

    }//GEN-LAST:event_b_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Classificação;
    private javax.swing.JLabel Classificação1;
    private javax.swing.JButton b_Cadastrar;
    private javax.swing.JButton b_Editar;
    private javax.swing.JButton b_Voltar;
    private javax.swing.JComboBox<String> c_Classi;
    private javax.swing.JComboBox<String> c_Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> l_Filmes;
    private javax.swing.JFormattedTextField txt_Data;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Qtd;
    private javax.swing.JTextField txt_Ref;
    // End of variables declaration//GEN-END:variables
}
