package inquire;
import inquire.Connection1;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.time.*;
import java.util.Calendar;

public class New_Flight extends javax.swing.JFrame {

    String len=null;
                
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
    
    public New_Flight() {
        initComponents();
        ct=this.getContentPane();
        this.setLayout(null);
        bgp=new New_Flight.BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Desktop\\inquire\\src\\newpackage\\New_Fight.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0,700, 500);
        ct.add(bgp);
        jb1.setContentAreaFilled(false);
        jb.setContentAreaFilled(false);
    }
    public New_Flight(String str)//重写构造函数，接收来自UpdateFi的FLT_NO
    {
        initComponents();
        ct=this.getContentPane();
        this.setLayout(null);
        bgp=new New_Flight.BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Desktop\\inquire\\src\\newpackage\\New_Fight.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0,600, 500);
        ct.add(bgp);
        jf1.setText(str);       //将航班号显示在界面上
        jf1.setEditable(false);
        jb1.setContentAreaFilled(false);
        jb.setContentAreaFilled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf1 = new javax.swing.JTextField();
        jb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jf5 = new javax.swing.JTextField();
        jf6 = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();
        jc2 = new javax.swing.JComboBox<>();
        jc4 = new javax.swing.JComboBox<>();
        jf7 = new javax.swing.JTextField();
        jf8 = new javax.swing.JTextField();

        setResizable(false);

        jf1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N

        jb.setFont(new java.awt.Font("方正粗黑宋简体", 1, 30)); // NOI18N
        jb.setForeground(new java.awt.Color(0, 255, 255));
        jb.setText("Submit");
        jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel1.setText("FLT No:");

        jLabel2.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel3.setText("Arrival Time:");

        jLabel4.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel4.setText("Go Off:");

        jLabel5.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel5.setText("Place of Departure:");

        jLabel6.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel6.setText("Place of Destination:");

        jf5.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N

        jf6.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N

        jb1.setFont(new java.awt.Font("方正粗黑宋简体", 1, 30)); // NOI18N
        jb1.setForeground(new java.awt.Color(0, 255, 255));
        jb1.setText("Back");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel7.setText("Rank:");

        jLabel8.setFont(new java.awt.Font("方正粗黑宋简体", 1, 24)); // NOI18N
        jLabel8.setText("Price:");

        jc1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "上海", "北京", "成都", "海口", "三亚", "西安", "深圳", "广州" }));

        jc2.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "北京", "成都", "海口", "上海", "三亚", "西安", "深圳", "广州" }));

        jc4.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "经济舱", "商务舱", "头等舱" }));

        jf7.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N

        jf8.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jf6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(jf1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(jf5, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jf7)
                        .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jf8)))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jf8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb)
                    .addComponent(jb1))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActionPerformed
        // TODO add your handling code here:
         try
        {
        int op=0;
        Connection conn2=Connection1.getConnection();
        String sql1="insert into hangban values (?,?,?,?,?,?,?,?)";
        PreparedStatement pst1=conn2.prepareStatement(sql1);
        pst1.setString(1,jf1.getText());
        pst1.setString(2,jc1.getSelectedItem().toString());
        pst1.setString(3,jc2.getSelectedItem().toString());
        pst1.setString(4,jf7.getText());
        pst1.setString(5,jf5.getText());
        pst1.setString(6,jf6.getText());
        pst1.setString(7,jc4.getSelectedItem().toString());
         pst1.setString(8,jf8.getText());

        if(jf1.getText().length()==0||jc1.getSelectedItem().toString().length()==0||jc2.getSelectedItem().toString().length()==0||jf7.getText().length()==0||jf5.getText().length()==0||jf6.getText().length()==0||jc4.getSelectedItem().toString().length()==0||jf8.getText().length()==0)//判断是否有为填写的数据
        {
        JOptionPane.showMessageDialog(this,"请将数据添加完整");
        }
        else if(jc1.getSelectedItem().toString().equals(jc2.getSelectedItem().toString()))
        {
        JOptionPane.showMessageDialog(this,"出发地和到达地不能相同");
        }
        else if(!jf1.getText().matches("^[A-Z0-9]+$"))
        {
           JOptionPane.showMessageDialog(this,"FLT No只能输入大写字母和数字");     
        }
        else if(!jf7.getText().matches("((([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29))$"))
        {
            JOptionPane.showMessageDialog(this,"Date格式为xxxx-xx-xx,其中x为数字,或者时间逻辑有错误，请重新输入");     
        }
        else if(!jf5.getText().matches("^([0-1]?[0-9]|2[0-3]):([0-5][0-9])$"))
        {
        JOptionPane.showMessageDialog(this,"Go Off格式为xx:xx,其中x为数字，或者时间逻辑有错误，请重新输入"); 
        } 
         else if(!jf6.getText().matches("^([0-1]?[0-9]|2[0-3]):([0-5][0-9])$"))
        {
        JOptionPane.showMessageDialog(this,"Arrive Time格式为xx:xx,其中x为数字，或者时间逻辑有错误，请重新输入"); 
        } 
         else if(Integer.parseInt(jf8.getText())<=0||jf8.getText().charAt(0)=='0')
         {
         JOptionPane.showMessageDialog(this,"Price必须为大于0的整数且输入数字符合规范");
         }
        else  
        {
            op=pst1.executeUpdate();
        }
        if(op!=0)//不为0，表示操作成功
        {
        JOptionPane.showMessageDialog(this,"添加成功！");
        }
        
        }catch(Exception e)
        {
         JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jbActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jb1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(New_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                New_Flight ne=new New_Flight();
                ne.setVisible(true);
                ne.setLocationRelativeTo(null);
                ne.setTitle("Add Flights");
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
    private javax.swing.JButton jb;
    private javax.swing.JButton jb1;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JComboBox<String> jc4;
    private javax.swing.JTextField jf1;
    private javax.swing.JTextField jf5;
    private javax.swing.JTextField jf6;
    private javax.swing.JTextField jf7;
    private javax.swing.JTextField jf8;
    // End of variables declaration//GEN-END:variables
}
