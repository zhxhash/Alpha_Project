/**
 * @author ：Haoxin Zhang
 */
package Database;
import java.sql.*;
/**
 * @Class ：JDBC
 * @Description ：Set up connection with MySQL server
 */
public class JDBC {
    private final String MySQL_Username="root";
    private final String MySQL_Password="123456";
    public Connection setJDBC()
    {
         String driver = "com.mysql.jdbc.Driver"; 
         String url = "jdbc:mysql://127.0.0.1:3306/";
         Connection conn= null;
         try
         {
             Class.forName(driver); //Load driver for database server
             conn = DriverManager.getConnection(url, MySQL_Username, MySQL_Password);
             if(!conn.isClosed()) 
                System.out.println("Succeeded connecting to the Database!"); 
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return conn;
    }
    public String executeSql(String sql,boolean bool) throws Exception{
        Connection conn = this.setJDBC();
        String ch = "";
        try
        {
            Statement stmt=conn.createStatement();
            boolean hasResultSet = stmt.execute(sql);
            if (bool) 
            {
                if(hasResultSet)
                {
                    ResultSet rs = stmt.getResultSet();
                    java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                    int columnCount = rsmd.getColumnCount();
                    while (rs.next()) 
                    {
                        for (int i = 0; i < columnCount; i++) 
                        {
                            ch=ch+rs.getString(i+1) + "\n";
                        }
                    }
                    return ch;
                }
                else 
                    return "";
            }
            else
            {
                System.out.println("This affect total " + stmt.getUpdateCount() + " statements!");
                return "";
            }
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }
    public static void main(String []args)
    {
        new JDBC().setJDBC();
    }
}
