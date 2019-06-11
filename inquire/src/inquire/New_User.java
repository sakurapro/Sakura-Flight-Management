package inquire;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class New_User extends javax.swing.JFrame {

    
    Container ct;           //用于设置背景
    BackgroundPanel bgp;    //用于设置背景
    
    class BackgroundPanel extends JPanel
    {
        Image im;	
        public BackgroundPanel(Image im)
        {
            this.im=im;
            this.setOpaque(true);	
        } 	
        public void paintComponent(Graphics g)              //背景类，用于下文设置背景
        {
            super.paintComponents(g);	
            g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);		
        }
    }
    public New_User() 
    {
        initComponents();
        ct=this.getContentPane();
	this.setLayout(null);
        bgp=new BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Desktop\\inquire\\src\\newpackage\\new user.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0, 795, 584);
        ct.add(bgp);
    }
    
    public static boolean isNumerict2(String str) 
    {
        for (int i = 0; i < str.length()-1; i++)
        {
            if (!Character.isDigit(str.charAt(i))) //判断身份证的前十七位是否是数字
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isNumerict3(String str) 
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (!Character.isDigit(str.charAt(i))) //判断电话号码是否是数字
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumerict4t5(String str) 
    {
        for (int i = 0; i < str.length(); i++)
        {
            if ((str.charAt(i)>=19968&&str.charAt(i)<=40869)||(str.charAt(i)>=0&&str.charAt(i)<=47)||(str.charAt(i)>=58&&str.charAt(i)<=64)
                    ||(str.charAt(i)>=91&&str.charAt(i)<=96)||(str.charAt(i)>=123&&str.charAt(i)<=127)) //判断用户名，密码是否包含汉字，符号
            {
                return false;
            }
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setTitle("New User");
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("ID Number:");

        q1.setFont(new java.awt.Font("楷体", 3, 30)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Check Password:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("User Name:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Mobile:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Password:");

        q2.setFont(new java.awt.Font("楷体", 3, 30)); // NOI18N

        q3.setFont(new java.awt.Font("楷体", 3, 30)); // NOI18N

        q4.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N

        q5.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });

        t6.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Please input Chinese name, can not contain English, Number, Symbol");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Please enter your id number in 18 Digits. The Last Digit may be a Capital X");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Please enter Eleven Digit telephone Numbers, including Digits only");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Can contain English Letters, Numbers, can not contain Symbols, Chinese Characters");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Can contain English Letters, Numbers, can not contain Symbols, Chinese Characters");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Login");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(q2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(t6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q5ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
       
        if(q1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入姓名！","错误！！！",JOptionPane.ERROR_MESSAGE);     //姓名为空时，显示错误
        }
        else if(!q1.getText().matches("[\\u4E00-\\u9FA5]+"))
        {
           JOptionPane.showMessageDialog(null, "姓名仅接收汉字！","错误！！！",JOptionPane.ERROR_MESSAGE);  //姓名不符合规定时，显示错误
        }
        else if(q2.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入身份证号！","错误！！！",JOptionPane.ERROR_MESSAGE); //身份证号为空时，显示错误
        }
        else if(q2.getText().length()>18||q2.getText().length()<18)
        {
            JOptionPane.showMessageDialog(null, "仅接收十八位身份证号！","错误！！！",JOptionPane.ERROR_MESSAGE);//身份证号不符合规定时，显示错误
        }
        else if(q2.getText().length()==18&&(!isNumerict2(q2.getText())))
        {
            JOptionPane.showMessageDialog(null, "前十七位只能为数字","错误！！！",JOptionPane.ERROR_MESSAGE);   //身份证号不符合规定时，显示错误
        }
        else if(q2.getText().length()==18&&(((int)(q2.getText().charAt(17))<48||((int)(q2.getText().charAt(17))>57
                &&(int)(q2.getText().charAt(17))<88))||(int)(q2.getText().charAt(17))>88))
        {
            JOptionPane.showMessageDialog(null, "最后一位只能为数字或大写字母X","错误！！！",JOptionPane.ERROR_MESSAGE);    //身份证号不符合规定时，显示错误
        }
        else if(q3.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入电话号码！","错误！！！",JOptionPane.ERROR_MESSAGE); //电话号码为空时，显示错误
        }
        else if(q3.getText().length()>11||q3.getText().length()<11)
        {
            JOptionPane.showMessageDialog(null, "仅接收十一位电话号码！","错误！！！",JOptionPane.ERROR_MESSAGE);  //电话号码不符合规定时，显示错误
        }
        else if(q3.getText().length()==11&&(!isNumerict3(q3.getText())))
        {
            JOptionPane.showMessageDialog(null, "电话号码仅能为数字","错误！！！",JOptionPane.ERROR_MESSAGE);   //电话号码不符合规定时，显示错误
        }
        else if(q4.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入用户名！","错误！！！",JOptionPane.ERROR_MESSAGE);   //用户名为空时，显示错误
        }
        else if(!isNumerict4t5(q4.getText()))
        {
            JOptionPane.showMessageDialog(null, "用户名仅能为数字，字母！","错误！！！",JOptionPane.ERROR_MESSAGE); //用户名不符合规定时，显示错误
        }
        else if(q5.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入密码！","错误！！！",JOptionPane.ERROR_MESSAGE); //密码为空时，显示错误
        }
        else if(!isNumerict4t5(q5.getText()))
        {
            JOptionPane.showMessageDialog(null, "密码仅能为数字，字母！","错误！！！",JOptionPane.ERROR_MESSAGE);//密码不符合规定时，显示错误
        }
        else if(t6.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请再次确认您的密码！","错误！！！",JOptionPane.ERROR_MESSAGE); //再次确认密码为空时，显示错误
        }
        else if(!(t6.getText().equals(q5.getText())))
        {
            JOptionPane.showMessageDialog(null, "您输入的密码不一致！","错误！！！",JOptionPane.ERROR_MESSAGE);//再次确认密码不符合规定时，显示错误
        }
        else
        {
            try
            {
                
                Connection conn1=Connection1.getConnection();       //连接数据库
                String sql="insert into user values (?,?,?,?,?,?)";       //将新用户的用户名，密码，身份证号，电话号码，姓名,个人积分输入数据库
                PreparedStatement pst=conn1.prepareStatement(sql);
                pst.setString(1,q4.getText());  //接收用户名
                pst.setString(2,q5.getText());  //接收密码
                pst.setString(3,q2.getText());  //接收身份证号
                pst.setString(4,q3.getText());  //接收电话号码  
                pst.setString(5,q1.getText());  //接收姓名
                pst.setString(6,"0");
                int i=pst.executeUpdate();
                if(i>0)
                {
                    dispose();
                    JOptionPane.showMessageDialog(this,"欢迎您加入海南第一航空！");      //当输入正确时，显示画面，并进入Personal_Center界面，关闭此New_user界面
                    Personal_Center pc=new Personal_Center(q4.getText(),q1.getText(),q3.getText(),null,"0");    //将用户名，姓名，电话号码传入Personal_Center中
                    pc.setVisible(true);
                    pc.setLocationRelativeTo(null);
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jLabel13MouseClicked

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
            java.util.logging.Logger.getLogger(New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
