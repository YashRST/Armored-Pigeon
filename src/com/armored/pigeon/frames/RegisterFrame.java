package com.armored.pigeon.frames;

import com.armored.pigeon.encryption.keyDistributor;
import com.armored.pigeon.interfaces.dto.*;
import com.armored.pigeon.interfaces.server.*;
import com.armored.pigeon.server.*;
import com.armored.pigeon.DTO.*;
import static com.armored.pigeon.frames.ChatFrame.userCache;
import java.awt.Toolkit;
import java.net.*;
import java.security.*;
import java.io.*;
import java.io.Serializable;
import java.net.*;
import javax.swing.border.LineBorder;



public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        errorLabel.setVisible(false);
        //setExtendedState(RegisterFrame.MAXIMIZED_BOTH);
        this.setName("RegisterFrame");
        this.getContentPane().setBackground(new java.awt.Color(26, 26, 26));
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        loginIdTextField = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        backToLoginBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setBackground(new java.awt.Color(26, 26, 26));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(253, 251, 249));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(253, 251, 249));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(253, 251, 249));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 251, 249));
        jLabel2.setText("First Name");

        jLabel3.setBackground(new java.awt.Color(253, 251, 249));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(253, 251, 249));
        jLabel3.setText("Last Name");

        firstNameTextField.setBackground(new java.awt.Color(26, 26, 26));
        firstNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        firstNameTextField.setBorder(null);
        firstNameTextField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        firstNameTextField.setOpaque(false);
        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.setBackground(new java.awt.Color(26, 26, 26));
        lastNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameTextField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameTextField.setBorder(null);
        lastNameTextField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        lastNameTextField.setOpaque(false);

        jLabel4.setBackground(new java.awt.Color(253, 251, 249));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(253, 251, 249));
        jLabel4.setText("Email ID");

        emailIdTextField.setBackground(new java.awt.Color(26, 26, 26));
        emailIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailIdTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailIdTextField.setBorder(null);
        emailIdTextField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        emailIdTextField.setOpaque(false);

        jLabel5.setBackground(new java.awt.Color(253, 251, 249));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(253, 251, 249));
        jLabel5.setText("Login ID");

        loginIdTextField.setBackground(new java.awt.Color(26, 26, 26));
        loginIdTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginIdTextField.setForeground(new java.awt.Color(255, 255, 255));
        loginIdTextField.setBorder(null);
        loginIdTextField.setMargin(new java.awt.Insets(2, 10, 2, 2));
        loginIdTextField.setOpaque(false);

        registerBtn.setBackground(new java.awt.Color(26, 26, 26));
        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(253, 253, 253));
        registerBtn.setText("Register");
        registerBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        registerBtn.setContentAreaFilled(false);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerBtnMouseExited(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        errorLabel.setBackground(new java.awt.Color(255, 151, 151));
        errorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(226, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(226, 0, 0), 1, true));
        errorLabel.setOpaque(true);

        backToLoginBtn.setBackground(new java.awt.Color(26, 26, 26));
        backToLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backToLoginBtn.setForeground(new java.awt.Color(253, 253, 253));
        backToLoginBtn.setText("Back to Login");
        backToLoginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        backToLoginBtn.setContentAreaFilled(false);
        backToLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backToLoginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backToLoginBtnMouseExited(evt);
            }
        });
        backToLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToLoginBtnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jSeparator2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSeparator3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(backToLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backToLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        errorLabel.setBackground(new java.awt.Color(255, 151, 151));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        errorLabel.setVisible(false);
        String name = firstNameTextField.getText() +" "+ lastNameTextField.getText();
        String mailId = emailIdTextField.getText();
        String loginId = loginIdTextField.getText();
        if(name.length() == 0 || mailId.length() == 0 || loginId.length() == 0){
            errorLabel.setVisible(true);
            errorLabel.setText("Please fill the details!");
            return;
        }
        String ip = "";
        try{
            InetAddress iAd = InetAddress.getLocalHost();
            ip = iAd.getHostAddress().trim();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        keyDistributor kDist= keyDistributor.generateKeyDistributor();
        KeyPair keyPair = kDist.keys();
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();
        //System.out.println(publicKey.toString());
        //System.out.println("length of key : " +publicKey.toString().length());
        
        //STORING PUBLIC KEY
        try (FileOutputStream fos = new FileOutputStream(".\\public.key")) {
            fos.write(publicKey.getEncoded());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        //STORING PRIVATE KEY
        try (FileOutputStream fos = new FileOutputStream(".\\private.key")) {
            fos.write(privateKey.getEncoded());
        }catch(Exception e){
            e.printStackTrace();
        }
        String pubKey = publicKey.toString();
        
        // ADDING DATA TO DTO
        userDTO uDTO = new userDTO();
        uDTO.setIPAddress(ip);
        uDTO.setLoginID(loginId);
        uDTO.setName(name);
        uDTO.setMailID(mailId);
        uDTO.setPublicKey(pubKey);
        
        // OPINITIALIZER 
        APServerOPInitializer initializer = new APServerOPInitializer();
        String code = "DSK001";
        initializer.setOperationCode(code);
        Socket socket = null;
        
        APServerUtilities apUtil = new APServerUtilities();
        APServerOPInitializer byteInput = null;
        try{
            byte[] dtoArray = apUtil.convertToBytes(uDTO);
            String l = "" + dtoArray.length;
            initializer.setMsgString(l);
            socket = APServerConnector.getConnection();
            //DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            APServerPacketSender sender = new APServerPacketSender(socket);
            APServerPacketReceiver packetIn = new APServerPacketReceiver(socket);
            //DataInputStream is = new DataInputStream(socket.getInputStream());
            byte[] outArr = apUtil.convertToBytes(initializer);
            int len = outArr.length;
            
            //SENDING LENGTH OF OPINIT
            sender.sendPacketSize(len);
            
            //SENDING OPINITIALIZER
            sender.send(outArr);
            
            //SENDING USERDT0
            sender.send(dtoArray);
            
            //RECEIVING PACKET LENGTH
            len = packetIn.receivePacketSize();
            
            
            //RECEIVING OP PACKET
            byte[] serverIn = packetIn.receive(len);
            
            byteInput = (APServerOPInitializer)apUtil.convertFromBytes(serverIn);
     
            String tag = byteInput.getOperationCode().trim();
            System.out.println(tag);
            if(tag.equals("SRV000")){
                String msg = byteInput.getMsgString();
                System.out.println(msg);
                if(msg.equals("-1")){
                    errorLabel.setVisible(true);
                    errorLabel.setText("Invalid LoginId");
                }
                if(msg.equals("-2")){
                    errorLabel.setVisible(true);
                    errorLabel.setText("Invalid MailId");
                }
                if(msg.equals("-3")){
                    registerBtnActionPerformed(evt);
                }
            }
            if(tag.equals("SRV001")){
                this.setVisible(false);
                DesktopIDFrame.deskId = byteInput.getMsgString();
                DesktopIDFrame dFrame = new DesktopIDFrame();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_registerBtnActionPerformed
    
    
    
    private void backToLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToLoginBtnActionPerformed
        LoginFrame ui = new LoginFrame();
        ui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backToLoginBtnActionPerformed

    private void registerBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseEntered
        this.registerBtn.setForeground(new java.awt.Color(26, 170, 92));
        this.registerBtn.setBorder(new LineBorder(new java.awt.Color(26, 170, 92),2,false));
    }//GEN-LAST:event_registerBtnMouseEntered

    private void registerBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseExited
        this.registerBtn.setForeground(new java.awt.Color(253, 253, 253));
        this.registerBtn.setBorder(new LineBorder(new java.awt.Color(253, 253, 253),2,false));
    }//GEN-LAST:event_registerBtnMouseExited

    private void backToLoginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToLoginBtnMouseEntered
        this.backToLoginBtn.setForeground(new java.awt.Color(200, 9, 21));
        this.backToLoginBtn.setBorder(new LineBorder(new java.awt.Color(200, 9, 21),2,false));
    }//GEN-LAST:event_backToLoginBtnMouseEntered

    private void backToLoginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToLoginBtnMouseExited
        this.backToLoginBtn.setForeground(new java.awt.Color(253, 253, 253));
        this.backToLoginBtn.setBorder(new LineBorder(new java.awt.Color(253, 253, 253),2,false));
    }//GEN-LAST:event_backToLoginBtnMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
        Socket socket = APServerConnector.getConnection();
        APServerOPInitializer aps = new APServerOPInitializer();
        APServerPacketSender apSend = new APServerPacketSender(socket);
        APServerUtilities apUtil = new APServerUtilities();
        
        aps.setOperationCode("DSK404");
        aps.setMsgString("");
        byte[] arr = apUtil.convertToBytes(aps);
        apSend.sendPacketSize(arr.length);
        apSend.send(arr);
        //System.out.println("IN Finalize");
        socket.close();
        APServerConnector.closeConnection();
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToLoginBtn;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField loginIdTextField;
    private javax.swing.JButton registerBtn;
    // End of variables declaration//GEN-END:variables
}
