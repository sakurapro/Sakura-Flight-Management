package inquire;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Update_Flight extends javax.swing.JFrame {

    /**
     * Creates new form Modify
     */    
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
    public Update_Flight() {
        initComponents();   
         ct=this.getContentPane();
	this.setLayout(null);
        bgp=new Update_Flight.BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Documents\\NetBeansProjects\\inquire\\src\\newpackage\\Update.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0,600, 450);
        ct.add(bgp);
        jb1.setContentAreaFilled(false);
        jb2.setContentAreaFilled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jf1 = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jf2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jf4 = new javax.swing.JTextField();
        jc1 = new javax.swing.JComboBox<>();

        setTitle("Update Flight");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("FLT No:");

        jf1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jb1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jb1.setForeground(new java.awt.Color(102, 255, 204));
        jb1.setText("Sure to modify");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jb2.setForeground(new java.awt.Color(204, 255, 204));
        jb2.setText("Query");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Detailed Information:");

        jf2.setEditable(false);
        jf2.setColumns(20);
        jf2.setFont(new java.awt.Font("楷体", 3, 18)); // NOI18N
        jf2.setRows(5);
        jScrollPane1.setViewportView(jf2);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Rank:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Date:");

        jf4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jc1.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "经济舱", "商务舱", "头等舱" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jb1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jf4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(61, 61, 61)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jb2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jf1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb1)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
      //修改航班就是先删除此航班，航班然后添加一个航班号不变的新航班
       Connection conn6;
        try 
        {
            conn6 = Connection1.getConnection();//连接数据库
            String sql1="select * from hangban where FLT_NO=? and rank=? and date=?";
            String sql2="delete from hangban where FLT_NO=? and rank=? and date=?";
            PreparedStatement pst1=conn6.prepareStatement(sql1);
            PreparedStatement pst2=conn6.prepareStatement(sql2);
            pst1.setString(1,jf1.getText());            //接收FLT_NO
            pst1.setString(2,jc1.getSelectedItem().toString());            //接收rank
            pst1.setString(3,jf4.getText());            //接收Date
            ResultSet rst=pst1.executeQuery();
            if(jf1.getText().length()==0)
            {
               JOptionPane.showMessageDialog(null,"请先输入航班号！","错误！！！",JOptionPane.ERROR_MESSAGE);//Fly No为空时，显示错误
            }
            else if(jf4.getText().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请先输入日期！","错误！！！",JOptionPane.ERROR_MESSAGE);//date为空时，显示错误
           }
            else if(jc1.getSelectedItem().toString().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请先输入舱位等级！","错误！！！",JOptionPane.ERROR_MESSAGE);//rank为空时，显示错误
           }
            else if(rst.next())
            {
               String str=rst.getString("FLT_NO");//将FLT_NO赋值str，用于传给New_Flight,将FLT_NO显示在界面上
               New_Flight fi=new New_Flight(str); 
               fi.show();
               fi.setLocationRelativeTo(null);
               pst2.setString(1,rst.getString("FLT_NO"));
               pst2.setString(3,rst.getString("date"));
               pst2.setString(2,rst.getString("rank"));     //删除此航班信息
               pst2.executeUpdate();
            }
            else
           {
               JOptionPane.showMessageDialog(null,"航班号或日期或舱位等级错误！","错误！！！",JOptionPane.ERROR_MESSAGE);//Fly No或rank错误时，显示错误
           }
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
       
      
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        try 
        {
           Connection conn6=Connection1.getConnection();
           String sql1="select * from hangban where FLT_NO=? and rank=? and date=?";
           PreparedStatement pst1=conn6.prepareStatement(sql1);
           pst1.setString(1,jf1.getText());     //接收FLT_NO
           pst1.setString(3,jf4.getText());     //接收date
           pst1.setString(2,jc1.getSelectedItem().toString());     //接收rank
           ResultSet rst=pst1.executeQuery();
           if(jf1.getText().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入航班号！","错误！！！",JOptionPane.ERROR_MESSAGE);//Fly No为空时，显示错误
           }
           else if(jf4.getText().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入日期！","错误！！！",JOptionPane.ERROR_MESSAGE);//date为空时，显示错误
           }
           else if(jc1.getSelectedItem().toString().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入舱位等级！","错误！！！",JOptionPane.ERROR_MESSAGE);//rank为空时，显示错误
           }
           else if(rst.next())//FLT_NO与date与rank正确，显示要修改的航班的具体信息
           {
           jf2.setText("FLY No："+rst.getString("FLT_NO")+"\n\n"+"Place Of Departure："+rst.getString("place_of_departure")+"\n\n"
           +"Place Of Destination："+rst.getString("place_of_destination")+"\n\n"+"Date："+rst.getString("date")+"\n\n"+("Go Off：")
                   +rst.getString("go_off")+"\n\n"+"Arrival Time："+rst.getString("arrival_time")+"\n\n"
           +"Rank："+rst.getString("rank")+"\n\n"+"Price："+rst.getString("price"));
           }
           else
           {
               JOptionPane.showMessageDialog(null,"航班号或日期或舱位等级错误！","错误！！！",JOptionPane.ERROR_MESSAGE);//Fly No或rank错误时，显示错误
           }
         } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jb2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JTextField jf1;
    private javax.swing.JTextArea jf2;
    private javax.swing.JTextField jf4;
    // End of variables declaration//GEN-END:variables
}
