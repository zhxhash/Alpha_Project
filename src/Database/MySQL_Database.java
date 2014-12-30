/**
 * @author ：Haoxin Zhang
 */
package Database;
import java.sql.*;
import java.io.*;
/**
 * @Class ：MySQL_Database
 * @Description ：Database Operating: Initialization and etc.
 */
public class MySQL_Database {
    private Connection conn = null;
    public boolean Database_Initialization()
    {
        try
        {
            FileReader fr = new FileReader("crebas.sql");//crebas.sql saves all statements about creating database with whole empty tables
            BufferedReader br = new BufferedReader(fr);
            conn = new JDBC().setJDBC();
            Statement stmt = conn.createStatement();
            String sql;
            while((sql=br.readLine())!=null)//Execute all the statements to initialize the database
            {
                System.out.println(sql);
                int result = stmt.executeUpdate(sql);
                if(result==-1)
                    System.out.println("Error!");
            }
            conn.close();
            br.close();
            fr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static void main(String []args)
    {
        new MySQL_Database().Database_Initialization();
    }
}
