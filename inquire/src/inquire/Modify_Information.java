package inquire;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 *
 * @author HAIER
 */
public class Modify_Information extends javax.swing.JFrame {

    String n,m,x;   //用于下文赋值
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
    public Modify_Information(String a,String b,String c,String d,String e) {        //重写构造函数，接收来自Personal_Center的用户名，手机号码，密码，姓名
        initComponents();
        ct=this.getContentPane();
	this.setLayout(null);
        bgp=new BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Documents\\NetBeansProjects\\inquire\\src\\newpackage\\Revamp_Informatization.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0, 811, 485);
        ct.add(bgp);
        t1.setText(a);      //将原用户名显示
        t2.setText(b);      //将原手机号码显示
        t3.setText(c);      //将原密码显示
        n=d;                //将姓名赋给变量n
        m=a;                //将原用户名赋给变量m
        x=e;                //将原个人积分赋给变量x
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modify Information");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mobile:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check Password:");

        t1.setFont(new java.awt.Font("楷体", 3, 30)); // NOI18N

        t2.setFont(new java.awt.Font("楷体", 3, 30)); // NOI18N

        t3.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N

        t4.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sure to Modify ");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Please enter Eleven Digit telephone Numbers, including Digits only");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Can contain English Letters, Numbers, can not contain Symbols, Chinese Characters");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Can contain English Letters, Numbers, can not contain Symbols, Chinese Characters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel5)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if(t1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入用户名！","错误！！！",JOptionPane.ERROR_MESSAGE);   //用户名为空时，显示错误
        }
        else if(!isNumerict4t5(t1.getText()))
        {
            JOptionPane.showMessageDialog(null, "用户名仅能为数字，字母！","错误！！！",JOptionPane.ERROR_MESSAGE); //用户名不符合规定时，显示错误
        }
        else if(t2.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入电话号码！","错误！！！",JOptionPane.ERROR_MESSAGE); //电话号码为空时，显示错误
        }
        else if(t2.getText().length()>11||t2.getText().length()<11)
        {
            JOptionPane.showMessageDialog(null, "仅接收十一位电话号码！","错误！！！",JOptionPane.ERROR_MESSAGE);  //电话号码不符合规定时，显示错误
        }
        else if(t2.getText().length()==11&&(!isNumerict3(t2.getText())))
        {
            JOptionPane.showMessageDialog(null, "电话号码仅能为数字！","错误！！！",JOptionPane.ERROR_MESSAGE);   //电话号码不符合规定时，显示错误
        }
        else if(t3.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null, "请输入密码！","错误！！！",JOptionPane.ERROR_MESSAGE); //密码为空时，显示错误
        }
        else if(!isNumerict4t5(t3.getText()))
        {
            JOptionPane.showMessageDialog(null, "密码仅能为数字，字母！","错误！！！",JOptionPane.ERROR_MESSAGE);//密码不符合规定时，显示错误
        }
        else if(!(t3.getText().equals(t4.getText())))
        {
            JOptionPane.showMessageDialog(null, "您输入的密码不一致！","错误！！！",JOptionPane.ERROR_MESSAGE);
        }
         else
        {
            try
            {
                
                Connection conn1=Connection1.getConnection();       //连接数据库
                String sql="update user set User_Name=?,Phone_number=?,Password=? where User_Name=? ";  //更新
                PreparedStatement pst=conn1.prepareStatement(sql);
                pst.setString(1,t1.getText());      //接收新用户名
                pst.setString(2,t2.getText());      //接收新电话号码
                pst.setString(3,t3.getText());      //接收新密码
                pst.setString(4,m);                 //
                int i=pst.executeUpdate();
                if(i>0)
                {
                    dispose();
                    JOptionPane.showMessageDialog(null,"数据已更新成功","修改成功！",JOptionPane.ERROR_MESSAGE);
                    Personal_Center pc=new Personal_Center(t1.getText(),n,t2.getText(),null,x);                   //当数据正确，更新成功时，打开Personal_Center界面，将新用户名，原姓名，新电话号码,原个人积分显示在Personal_Center上，关闭此Modify_Information界面
                    pc.setVisible(true);
                    pc.setLocationRelativeTo(null);
                }
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(Modify_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
