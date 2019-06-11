package inquire;
import static inquire.New_User.isNumerict2;//调用New_User的方法，判断身份证的前十七位是否是数字
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
import javax.swing.*;

public class Result2 extends javax.swing.JFrame {

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
    public Result2(String a,String b) 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        l1 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jc1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l8 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        p1.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        p2.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        l3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l3.setText("FLY No:");

        l4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l4.setText("Date:");

        l5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l5.setText("Rank:");

        jc1.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "经济舱", "商务舱", "头等舱" }));

        t1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        t2.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        l2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l2.setText("Booking");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l6.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        l6.setText("Relocating");
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        l7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l7.setText("Name:");

        t3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N

        l8.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        l8.setText("ID Number:");

        t4.setFont(new java.awt.Font("楷体", 3, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(l5)
                                .addGap(168, 168, 168)
                                .addComponent(l6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4)
                            .addComponent(l3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l8)
                                        .addComponent(l7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(l1)
                                    .addGap(42, 42, 42)
                                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(l1)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l2)
                            .addComponent(l6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
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
                Successful_Booking q=new Successful_Booking(a,b,c,d,e,f,g,h,1);  //打开Booking_Success界面，关闭此Result2界面
                q.show();
                q.setLocationRelativeTo(null);
                dispose();
            }
            
            else if(t4.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"请输入姓名！","错误！！！",JOptionPane.ERROR_MESSAGE);//Name为空时，显示错误
            }
            else if(!t4.getText().matches("[\\u4E00-\\u9FA5]+"))
            {
            JOptionPane.showMessageDialog(null, "姓名仅接收汉字！","错误！！！",JOptionPane.ERROR_MESSAGE);  //姓名不符合规定时，显示错误
            }
            else if(t3.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"请输入身份证号！","错误！！！",JOptionPane.ERROR_MESSAGE);//ID Number为空时，显示错误
            }
            else if(t3.getText().length()>18||t3.getText().length()<18)
            {
                JOptionPane.showMessageDialog(null, "仅接收十八位身份证号！","错误！！！",JOptionPane.ERROR_MESSAGE);//身份证号不符合规定时，显示错误
            }
            else if(t3.getText().length()==18&&(!isNumerict2(t3.getText())))
            {
                JOptionPane.showMessageDialog(null, "前十七位只能为数字","错误！！！",JOptionPane.ERROR_MESSAGE);   //身份证号不符合规定时，显示错误
            }
            else if(t3.getText().length()==18&&(((int)(t3.getText().charAt(17))<48||((int)(t3.getText().charAt(17))>57
                    &&(int)(t3.getText().charAt(17))<88))||(int)(t3.getText().charAt(17))>88))
            {
                JOptionPane.showMessageDialog(null, "最后一位只能为数字或大写字母X","错误！！！",JOptionPane.ERROR_MESSAGE);    //身份证号不符合规定时，显示错误
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
        Booking b=new Booking(1);          //打开Booking界面，并关闭此登陆界面
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
            java.util.logging.Logger.getLogger(Result2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
