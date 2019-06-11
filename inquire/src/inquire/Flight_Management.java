package inquire;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;

public class Flight_Management extends javax.swing.JFrame 
{
             
    public Flight_Management()
    {
        initComponents();
        getContentPane().setBackground(Color.PINK);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl3 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jl4 = new javax.swing.JLabel();
        jcb1 = new javax.swing.JComboBox<>();
        jcb2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Flight Management");
        setResizable(false);

        jl3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jl3.setText("Delete Fights");
        jl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl3MouseClicked(evt);
            }
        });

        jl1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jl1.setText("Add Fights");
        jl1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jl1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl1MouseClicked(evt);
            }
        });

        jl2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jl2.setText("Update Fights");
        jl2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jl2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl2MouseClicked(evt);
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
        if (jTable.getColumnModel().getColumnCount() > 0) {
            jTable.getColumnModel().getColumn(0).setResizable(false);
            jTable.getColumnModel().getColumn(1).setResizable(false);
            jTable.getColumnModel().getColumn(2).setResizable(false);
            jTable.getColumnModel().getColumn(3).setResizable(false);
            jTable.getColumnModel().getColumn(4).setResizable(false);
            jTable.getColumnModel().getColumn(5).setResizable(false);
            jTable.getColumnModel().getColumn(6).setResizable(false);
            jTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jl4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jl4.setText("Query");
        jl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl4MouseClicked(evt);
            }
        });

        jcb1.setFont(new java.awt.Font("楷体", 3, 18)); // NOI18N
        jcb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Origin", "北京", "西安", "海口", "广州", "上海", "成都", "深圳", "三亚" }));

        jcb2.setFont(new java.awt.Font("楷体", 3, 18)); // NOI18N
        jcb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destination", "北京", "西安", "海口", "广州", "上海", "成都", "深圳", "三亚" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jl4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jcb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jl4)
                .addGap(41, 41, 41))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/皮卡丘1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl2)
                .addGap(150, 150, 150)
                .addComponent(jl3)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl3)
                    .addComponent(jl2)
                    .addComponent(jl1))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl1MouseClicked
        // TODO add your handling code here:
        New_Flight k=new New_Flight();
        k.show();                       //显示New_Flight界面
        k.setLocationRelativeTo(null);
    }//GEN-LAST:event_jl1MouseClicked

    private void jl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl2MouseClicked
  
         Update_Flight m=new Update_Flight();     
         m.show();                      //显示UpdateFi界面
         m.setLocationRelativeTo(null);
    }//GEN-LAST:event_jl2MouseClicked

    private void jl2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jl2AncestorAdded
        // TODO add your handling code here:   
    }//GEN-LAST:event_jl2AncestorAdded

    private void jl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jl1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jl1AncestorAdded

    private void jl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl3MouseClicked
        // TODO add your handling code here:
        Delete_Flight d=new Delete_Flight();
        d.show();                       //显示DeleteFi界面
        d.setLocationRelativeTo(null);
        d.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }//GEN-LAST:event_jl3MouseClicked

    private void jl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl4MouseClicked
        // TODO add your handling code here:
        try 
        {
        Connection conn5=Connection1.getConnection();//数据库连接
        String k1=jcb1.getSelectedItem().toString();//将出发地赋值给变量k1
        String k2=jcb2.getSelectedItem().toString();//将到达地赋值给变量k1
        String sql="Select * from hangban where place_of_departure=? and place_of_destination=? ";//查询语句
        PreparedStatement pst=conn5.prepareStatement(sql);
        pst.setString(1, k1);   //接收出发地
        pst.setString(2, k2);   //接收到达地
       
        ResultSet rst=pst.executeQuery();
        ResultSetMetaData rsmt = rst.getMetaData();
        String a[] = null;    
        int columnCount = rsmt.getColumnCount();
        DefaultTableModel tm = (DefaultTableModel) jTable.getModel();//让查询到的数据显示在表格里
        tm.setColumnCount(0);        
        tm.setRowCount(0);
        tm.addColumn("航班号");//添加列名
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
            a = new String[columnCount];      
        }
                
       for (int s = 0; s < columnCount; s++) 
        {
            a[s] = rst.getString(s + 1);               
        }               
         tm.addRow(a);
        }
        }
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jl4MouseClicked

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
            java.util.logging.Logger.getLogger(Flight_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flight_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flight_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flight_Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
           
            @Override
            public void run() {
                Flight_Management kg=new Flight_Management();
                kg.setVisible(true);
                kg.setLocationRelativeTo(null);
                kg.setTitle("管理界面");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> jcb1;
    private javax.swing.JComboBox<String> jcb2;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JLabel jl4;
    // End of variables declaration//GEN-END:variables
}
