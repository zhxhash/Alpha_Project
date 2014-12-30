/**
 * @author ：Haoxin Zhang
 */
package Case_;
import Database.JDBC;
import User.*;
public class Case_Comment {
    public void NewCase_Comment(String arg[])
    {
        try
        {
            new JDBC().executeSql("INSERT INTO casecomment (ID,Cas_ID,C_Serial_number,Use_ID,U_Email,Updated_atSince,CC_Content)VALUES ('"+arg[0]+"','"+arg[1]+"','"+arg[2]+"','"+arg[3]+"','"+arg[4]+"',now(),'"+arg[5]+"');", false);
            new Case().UpdateCaseStatus("",arg[2], true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public String getAllComment(String S_Num)
    {
        String result = "";
        try
        {
            String st = new JDBC().executeSql("SELECT U_Email FROM casecomment WHERE C_Serial_number='"+S_Num+"';",true);
            if(st.equals(""))
            {
                return result;
            }
            String Email[] = st.split("\n");
            st = new JDBC().executeSql("SELECT Updated_atSince FROM casecomment WHERE C_Serial_number='"+S_Num+"';",true);
            String Time[] = st.split("\n");
            st = new JDBC().executeSql("SELECT CC_Content FROM casecomment WHERE C_Serial_number='"+S_Num+"';",true);
            String Comment[] = st.split("\n");
            for(int i = 0;i<Email.length;i++)
            {
                result = result + "<-" + (i+1) + "->\n";
                result = result + "Post by:  " + Email[i] + "\n";
                result = result + "Time: " + Time[i] + "\n";
                result = result + "Content:\n" + Comment[i] + "\n";
                result = result + "****************************************************************\n";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String []args)
    {
        String arg[] = new String[6];
        arg[0] = "5";arg[1] = "4";arg[2] = "A1";arg[3] = "2";arg[4] = "ManagingAgent1@ManagingAgent1.com";arg[5] = "Case Comment... (for example 1) ";
        new Case_Comment().NewCase_Comment(arg);
    }
}
