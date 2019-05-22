package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    //CRIAÇÃO DE VARIÁVEIS 
    private Sistema sistema;
    //CRIAÇÃO DE VARIÁVEIS 

    //CRIAÇÃO DO CONSTRUTOR, ESTANCIO O OBJETO DADOS !
    public Login(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        
    }
    //CRIAÇÃO DO CONSTRUTOR, ESTANCIO O OBJETO DADOS !

    //METODO DE AUTENTICAR, SERVE PARA VALIDAR O LOGIN !
    private void Autenticar() {

        //VALIDA SE ESTÁ PREECHIDO O UTILIZADOR
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. o nome de utilizador!");
            txtUsername.requestFocus();
            return;
        }
        //VALIDA SE ESTÁ PREECHIDA A PASSWORD
        if (txtPassword.getPassword().length == 0) {
           
            JOptionPane.showMessageDialog(this, "Introduza p.f. a password de utilizador!",
                    "Autenticação", JOptionPane.WARNING_MESSAGE);
            
            return;
        }
        //VALIDA SE O UTILIZADOR E A PASSWORD  EXISTE NO ARRAY !

        sistema.login(txtUsername.getText(), new String(txtPassword.getPassword()));

        if (sistema.isUtilizadorAutenticado() == true) {
            dispose();
            Principal principal = new Principal(sistema);
            principal.setVisible(true);
        }else {
           
            JOptionPane.showMessageDialog(this, "O Nome de Utilizador e/ou Password estão errados",
                    "Autenticação", JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
            
        }
        /*if (dados.login(txtUsername.getText(), new String(txtPassword.getPassword()))) {
            //Devolve o controlo da aplicação para o método main
            dispose(); 
        } else {
           
            JOptionPane.showMessageDialog(this, "O Nome de Utilizador e/ou Password estão errados",
                    "Autenticação", JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
            
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btnRegisto = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lfPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lfUsername = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("frmLogin"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnRegisto.setText("Registo");
        btnRegisto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistoActionPerformed(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Lock_35px.png"))); // NOI18N

        lfPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lfPassword.setText("Password");
        lfPassword.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Male_User_35px.png"))); // NOI18N

        txtUsername.setToolTipText("");
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        lfUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lfUsername.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lfUsername)
                            .addComponent(lfPassword))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegisto)
                                .addGap(244, 244, 244)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lfUsername)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(lfPassword)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //CHAMA O METODO AUTENTICAR !
        Autenticar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //FECHA A APLICAÇÃO !
        sistema.terminar();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRegistoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistoActionPerformed
        //ABRE A JANELA DE REGISTO
        RegistarUtilizador registo = new RegistarUtilizador(sistema);
        registo.setVisible(true);
    }//GEN-LAST:event_btnRegistoActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
           
   
    }//GEN-LAST:event_formKeyPressed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
  
        // Invoked when a key has been pressed.
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
         
            Autenticar();
        }
        
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
     
        if (evt.getKeyCode() == KeyEvent.VK_ENTER ) {
            
            Autenticar();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.txtUsername.requestFocus();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnRegisto;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lfPassword;
    private javax.swing.JLabel lfUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
