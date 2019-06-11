package inquire;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Delete_Flight extends javax.swing.JFrame {

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
    public Delete_Flight() {
        initComponents(); 
        ct=this.getContentPane();
	this.setLayout(null);
        bgp=new Delete_Flight.BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Documents\\NetBeansProjects\\inquire\\src\\newpackage\\DeleteFi.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0,600, 450);
        ct.add(bgp);
     
        jb2.setContentAreaFilled(false);
        jb1.setContentAreaFilled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jf = new javax.swing.JTextField();
        jb2 = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jf1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Flight");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter the FLT No:");

        jf.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        jb2.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jb2.setForeground(new java.awt.Color(204, 255, 255));
        jb2.setText("Delete");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jb1.setForeground(new java.awt.Color(204, 255, 204));
        jb1.setText("Back");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter the Date:");

        jf1.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the Rank:");

        jc1.setFont(new java.awt.Font("宋体", 3, 24)); // NOI18N
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "经济舱", "商务舱", "头等舱" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jb2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jf, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(jf1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb1)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jf))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb2)
                    .addComponent(jb1))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        // TODO add your handling code here:
        try
        {
        Connection conn7=Connection1.getConnection();//数据库连接
        String sql="delete from hangban where FLT_NO =? and date=? and rank=?";//删除语句
        PreparedStatement pst=conn7.prepareStatement(sql);
        pst.setString(1,jf.getText());
        pst.setString(2,jf1.getText());
        pst.setString(3,jc1.getSelectedItem().toString());
        int ev=pst.executeUpdate();
        if(ev>0)
        {
            JOptionPane.showMessageDialog(this, "删除成功！");
        }
        else if(jf.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"请输入航班号！","错误！！！",JOptionPane.ERROR_MESSAGE);//FLY_NO为空时，显示错误
        }
        else if(jf1.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"请输入日期！","错误！！！",JOptionPane.ERROR_MESSAGE);//date为空时，显示错误
        }
        else
        {
            JOptionPane.showMessageDialog(null,"航班号或日期错误！","错误！！！",JOptionPane.ERROR_MESSAGE);//FLY_NO或者date错误时，显示错误
        }
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jb2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JTextField jf;
    private javax.swing.JTextField jf1;
    // End of variables declaration//GEN-END:variables
}
