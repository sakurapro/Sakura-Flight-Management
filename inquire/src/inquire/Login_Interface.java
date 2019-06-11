package inquire;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Login_Interface extends javax.swing.JFrame {

    String name,mobile,point; //用于下文，将数据库中的姓名，电话号码,个人积分赋给name，mobile,point
    
    Container ct;       //用于设置背景
    BackgroundPanel bgp;//用于设置背景
    class BackgroundPanel extends JPanel
    {
        Image im;	
        public BackgroundPanel(Image im)
        {
            this.im=im;
            this.setOpaque(true);               //背景类，用于下文设置背景
        } 	
        public void paintComponent(Graphics g)	
        {
            super.paintComponents(g);	
            g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);		
        }
    }
    
    public Login_Interface() 
    {
         
        initComponents();
        ct=this.getContentPane();
	this.setLayout(null);
        bgp=new BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Documents\\NetBeansProjects\\inquire\\src\\newpackage\\login.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0, 1300, 700);
        ct.add(bgp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Interface\n");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Welcome to Hainan First Airlines!");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User Name:");

        t1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        l9.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l9.setForeground(new java.awt.Color(51, 51, 51));
        l9.setText("Skip the Login and Book Directly");
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Forgot Password?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Password:");

        l8.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l8.setForeground(new java.awt.Color(51, 51, 51));
        l8.setText("Login");
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        l10.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l10.setForeground(new java.awt.Color(51, 51, 51));
        l10.setText("New User");
        l10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l10MouseClicked(evt);
            }
        });

        l11.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l11.setForeground(new java.awt.Color(51, 51, 51));
        l11.setText("Management Portal");
        l11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l11MouseClicked(evt);
            }
        });

        t2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l8)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(l9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(t2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l8)
                    .addComponent(l9)
                    .addComponent(l10))
                .addGap(74, 74, 74)
                .addComponent(l11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        Retrieve_Password r= new Retrieve_Password();
        r.setVisible(true);     
        r.setLocationRelativeTo(null);                  //打开Retrieve_password界面，并关闭此Login_Interface界面
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
       
        try 
        {
            Connection conn1=Connection1.getConnection();       //连接数据库
            String sql="select * from user where User_Name=? and Password=?";       
            PreparedStatement pst=conn1.prepareStatement(sql);
            pst.setString(1,t1.getText());                      //接收User name
            pst.setString(2,t2.getText());                      //接收Password
            ResultSet rs=pst.executeQuery();
            if(rs.next())   /*如果User name与Password正确，从数据库中得到此用户的姓名与手机号码，并打开Personal_Center界面，
                            将用户名，姓名与手机号码显示在Personal_Center上，并将密码传到Personal_Center中，用于进一步传给Revamp_informatization中去，关闭此登陆界面*/
            {
                name=rs.getString("Full_Name");
                mobile=rs.getString("Phone_number");
                point=rs.getString("Point");
                Personal_Center jf=new Personal_Center(t1.getText(),name,mobile,t2.getText(),point);
                jf.setVisible(true);
                jf.setLocationRelativeTo(null);
                dispose();
            }
            else if(t1.getText().length()==0)
                    {
                     JOptionPane.showMessageDialog(null,"请输入用户名！","错误！！！",JOptionPane.ERROR_MESSAGE);//User name为空时，显示错误
                    }
             else if(t2.getText().length()==0)
                    {
                     JOptionPane.showMessageDialog(null,"请输入密码！","错误！！！",JOptionPane.ERROR_MESSAGE);//Password为空时，显示错误
                    }
            else
            {
               
                JOptionPane.showMessageDialog(null,"您的账号或密码错误！","错误！！！",JOptionPane.ERROR_MESSAGE);//User name或Password输入错误时，显示错误
            }
             
            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_l8MouseClicked

    private void l10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l10MouseClicked
      dispose();
      New_User d=new New_User();        //打开New user界面，并关闭此登陆界面
      d.setVisible(true);
      d.setLocationRelativeTo(null);
    }//GEN-LAST:event_l10MouseClicked

    private void l11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l11MouseClicked
        Administrator adt=new Administrator();
        adt.show();                     //打开Administrator界面，并关闭此登陆界面
        adt.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_l11MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
      dispose();
      Booking b=new Booking(1);          //打开Booking界面，并关闭此登陆界面，1代表新用户
      b.setVisible(true);
      b.setLocationRelativeTo(null);
    }//GEN-LAST:event_l9MouseClicked

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
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                JFrame j=new Login_Interface();
                j.setVisible(true);
                j.setLocationRelativeTo(null);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables

    

}
