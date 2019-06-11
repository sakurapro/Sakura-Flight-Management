
package inquire;

import java.sql.*;
public class Connection1 {
    
    static  private Connection conn;//建立数据库连接类，给其他类调用
    public static Connection getConnection() throws Exception
    {
    String url="jdbc:mysql://localhost:3306/flight";
    String user="root";
    String passwd="abc123";
    
   try
   {
   Class.forName("com.mysql.jdbc.Driver");
   conn=DriverManager.getConnection(url, user, passwd);
   if(conn!=null)
   {
   System.out.println("Succeed to Connect to Mysql.");
   }
    }catch(ClassNotFoundException e)
   {
   System.out.println("Fail to connect to Mysql.");
   }
   catch (SQLException e) {
       System.out.println("Fail to connect to Mysql.");
        }
   return conn;
    }
}
