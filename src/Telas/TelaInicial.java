package Telas;

import Cadastro.Cliente;
import Cadastro.Filme;
import Cadastro.Usuario;
import Locação.Locacao;
import Fichas.LoginUsuario;

public class TelaInicial extends javax.swing.JFrame {
    public TelaInicial() {
        initComponents();
        
        LoginUsuario lu = new LoginUsuario();
        
        //Nome.setText(lu.getNome());
        //Funcao.setText(lu.getFuncao());
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        b_Fechar = new javax.swing.JToggleButton();
        b_Locação = new javax.swing.JToggleButton();
        b_Locação1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Funcao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        b_Filme = new javax.swing.JRadioButtonMenuItem();
        b_Cliente = new javax.swing.JCheckBoxMenuItem();
        b_Usuario = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(54, 75, 79));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        b_Fechar.setBackground(new java.awt.Color(204, 0, 0));
        b_Fechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Fechar.setForeground(new java.awt.Color(255, 255, 255));
        b_Fechar.setText("Fechar");
        b_Fechar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b_Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_FecharActionPerformed(evt);
            }
        });

        b_Locação.setBackground(new java.awt.Color(0, 102, 153));
        b_Locação.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Locação.setForeground(new java.awt.Color(255, 255, 255));
        b_Locação.setText("Locação");
        b_Locação.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b_Locação.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Locação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LocaçãoActionPerformed(evt);
            }
        });

        b_Locação1.setBackground(new java.awt.Color(0, 102, 153));
        b_Locação1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_Locação1.setForeground(new java.awt.Color(255, 255, 255));
        b_Locação1.setText("Devolução");
        b_Locação1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        b_Locação1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Locação1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_Locação1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(b_Fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(b_Locação, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(b_Locação1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(b_Locação, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_Locação1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(b_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem Vindo");

        Funcao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Funcao.setForeground(new java.awt.Color(255, 255, 255));
        Funcao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Funcao.setText("função");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Loucadora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Funcao)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        b_Filme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        b_Filme.setSelected(true);
        b_Filme.setText("Filme");
        b_Filme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_FilmeActionPerformed(evt);
            }
        });
        jMenu1.add(b_Filme);

        b_Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.ALT_MASK));
        b_Cliente.setSelected(true);
        b_Cliente.setText("Cliente");
        b_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ClienteActionPerformed(evt);
            }
        });
        jMenu1.add(b_Cliente);

        b_Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.ALT_MASK));
        b_Usuario.setSelected(true);
        b_Usuario.setText("Usuario");
        b_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(b_Usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_FilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_FilmeActionPerformed
        Filme fi = new Filme();
        fi.setVisible(true);
    }//GEN-LAST:event_b_FilmeActionPerformed

    private void b_LocaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LocaçãoActionPerformed
        Locacao l =new Locacao();
        l.setVisible(true);
    }//GEN-LAST:event_b_LocaçãoActionPerformed

    private void b_Locação1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_Locação1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_Locação1ActionPerformed

    private void b_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ClienteActionPerformed
        Cliente c = new Cliente();
        c.setVisible(true);
    }//GEN-LAST:event_b_ClienteActionPerformed

    private void b_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UsuarioActionPerformed
        Usuario u = new Usuario();
        u.setVisible(true);
    }//GEN-LAST:event_b_UsuarioActionPerformed

    private void b_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_FecharActionPerformed
        TelaLogin tg = new TelaLogin();
        tg.setVisible(true);
        dispose();
    }//GEN-LAST:event_b_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Funcao;
    private javax.swing.JCheckBoxMenuItem b_Cliente;
    private javax.swing.JToggleButton b_Fechar;
    private javax.swing.JRadioButtonMenuItem b_Filme;
    private javax.swing.JToggleButton b_Locação;
    private javax.swing.JToggleButton b_Locação1;
    private javax.swing.JCheckBoxMenuItem b_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
