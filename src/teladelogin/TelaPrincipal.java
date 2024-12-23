/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package teladelogin;

/**
 *
 * @author mari
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rigt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        labelSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        labelNaoTenhoConta = new javax.swing.JLabel();
        btnEntrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        rigt.setBackground(new java.awt.Color(255, 255, 255));
        rigt.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Screenshot_2024-12-19_at_18-21-00_AlfaEdu-removebg-preview.png__imagem_PNG_500___500_pixels_-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout rigtLayout = new javax.swing.GroupLayout(rigt);
        rigt.setLayout(rigtLayout);
        rigtLayout.setHorizontalGroup(
            rigtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rigtLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        rigtLayout.setVerticalGroup(
            rigtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rigtLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1.add(rigt);
        rigt.setBounds(0, 0, 400, 500);

        left.setBackground(new java.awt.Color(51, 102, 255));
        left.setPreferredSize(new java.awt.Dimension(400, 500));

        labelLogin.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelLogin.setText("LOGIN");

        labelMatricula.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        labelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        labelMatricula.setText("Email ou Matricula");

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });

        labelSenha.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 102, 255));
        btnEntrar.setText("Entrar");

        labelNaoTenhoConta.setBackground(new java.awt.Color(102, 102, 102));
        labelNaoTenhoConta.setForeground(new java.awt.Color(255, 255, 255));
        labelNaoTenhoConta.setText("Não tem conta?");

        btnEntrar1.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrar1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 51, 0));
        btnEntrar1.setText("Cadastrar-se");

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogin)
                .addGap(140, 140, 140))
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addComponent(labelNaoTenhoConta)
                        .addGap(4, 4, 4)
                        .addComponent(btnEntrar1))
                    .addComponent(labelSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(labelLogin)
                .addGap(32, 32, 32)
                .addComponent(labelMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNaoTenhoConta)
                    .addComponent(btnEntrar1))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanel1.add(left);
        left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNaoTenhoConta;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel left;
    private javax.swing.JPanel rigt;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}