package inquire;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
import javax.swing.*;

public class Result1 extends javax.swing.JFrame {

    Container ct;        //用于设置背景
    BackgroundPanel bgp; //用于设置背景
    class BackgroundPanel extends JPanel
    {
        Image im;	
        public BackgroundPanel(Image im)
        {
            this.im=im;
            this.setOpaque(true);                //背景类，用于下文设置背景
        } 	
        public void paintComponent(Graphics g)	
        {
            super.paintComponents(g);	
            g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);		
        }
    }
    public Result1(String a,String b) 
    {
        initComponents();
        p1.setText(a);//接收来自Booking的出发地，并显示在界面上
        p2.setText(b);//接收来自Booking的到达地，并显示在界面上
        ct=this.getContentPane();
	this.setLayout(null);
        bgp=new BackgroundPanel((new ImageIcon("C:\\Users\\HAIER\\Desktop\\inquire\\src\\newpackage\\Result.jpg")).getImage());//设置背景
        bgp.setBounds(0, 0, 1300, 700);
        ct.add(bgp);
        
        try
        {
            Connection conn1=Connection1.getConnection();       //连接数据库
            String sql="select * from hangban where place_of_departure=? and place_of_destination=? ";       
            PreparedStatement pst=conn1.prepareStatement(sql);
            pst.setString(1,p1.getText()); //接收出发地
            pst.setString(2,p2.getText()); //接收到达地
            ResultSet rst=pst.executeQuery();
            ResultSetMetaData rsmt = rst.getMetaData();
            String x[] = null;    
            int columnCount = rsmt.getColumnCount();
            DefaultTableModel tm = (DefaultTableModel) jTable.getModel();//让查询到的数据显示在表格
            tm.setColumnCount(0);        
            tm.setRowCount(0);
            tm.addColumn("航班");//添加列名
            tm.addColumn("出发地");
            tm.addColumn("到达地");
            tm.addColumn("日期");
            tm.addColumn("出发时间");
            tm.addColumn("到达时间");
            tm.addColumn("舱位等级");
            tm.addColumn("票价");
            while(rst.next())
            {
                for (int i = 1; i <= columnCount; i++) 
                {
                    x = new String[columnCount];      
                }
                for (int s = 0; s < columnCount; s++) 
                {
                    x[s] = rst.getString(s + 1);               
                }               
                tm.addRow(x);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        l1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setTitle("Result");

        t1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        p1.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        p2.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        l2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l2.setText("Booking");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        jTable.setBackground(new java.awt.Color(255, 204, 204));
        jTable.setFont(new java.awt.Font("微软雅黑", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "航班号", "出发地", "到达地", "日期", "出发时间", "到达时间", "舱位等级", "票价"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable);

        l1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l1.setText("To");

        t2.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        l3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l3.setText("FLY No:");

        l4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l4.setText("Date:");

        l5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l5.setText("Rank:");

        l6.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l6.setText("Relocating");
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        jc1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "经济舱", "商务舱", "头等舱" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3)
                                    .addComponent(l4)
                                    .addComponent(l5))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l6)))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(l1)
                        .addGap(40, 40, 40)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(l1)
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l2)
                            .addComponent(l6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        try 
        {
           Connection conn1=Connection1.getConnection();       //连接数据库
           String sql1="select * from hangban where FLT_NO=? and date=? and rank=?";
           PreparedStatement pst1=conn1.prepareStatement(sql1);
           pst1.setString(1,t1.getText());
           pst1.setString(2,t2.getText());
           pst1.setString(3,jc1.getSelectedItem().toString());
           ResultSet rst=pst1.executeQuery();
           
           if(rst.next())//数据正确后，将航班的具体信息赋给变量abcdefgh，用于进一步传给Booking_Success界面
           {
           String a,b,c,d,e,f,g,h;
           a=rst.getString("FLT_NO");
           b=rst.getString("place_of_departure");
           c=rst.getString("place_of_destination");
           d=rst.getString("date");
           e=rst.getString("go_off");
           f=rst.getString("arrival_time");
           g=rst.getString("rank");
           h=rst.getString("price");
           Successful_Booking q=new Successful_Booking(a,b,c,d,e,f,g,h,0);  //打开Booking_Success界面，关闭此Result1界面
           q.show();
           q.setLocationRelativeTo(null);
           dispose();
           }
           else if(t1.getText().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入航班号！","错误！！！",JOptionPane.ERROR_MESSAGE);//Fly No为空时，显示错误
           }
           else if(t2.getText().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入日期！","错误！！！",JOptionPane.ERROR_MESSAGE);//date为空时，显示错误
           }
           else if(jc1.getSelectedItem().toString().length()==0)
           {
               JOptionPane.showMessageDialog(null,"请输入舱位等级！","错误！！！",JOptionPane.ERROR_MESSAGE);//rank为空时，显示错误
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
        
    }//GEN-LAST:event_l2MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
      dispose();
      Booking b=new Booking(0);          //打开Booking界面，并关闭此登陆界面
      b.setVisible(true);
      b.setLocationRelativeTo(null);
    }//GEN-LAST:event_l6MouseClicked

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
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run() {
                Result1 c=new Result1(null,null);
                c.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
