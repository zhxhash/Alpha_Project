/**
 * @author ：Haoxin Zhang
 */
package Case_;
import Database.JDBC;
import User.*;
import javax.swing.DefaultListModel;
public class Case {
    public void NewCase(String ResidentEmail,String arg[])
    {
        try
        {
            new JDBC().executeSql("INSERT INTO case_ (ID,C_Serial_number,Updated_atSince,C_Name,C_Description,U_Email)VALUES ('"+arg[0]+"','"+arg[1]+"',now(),'"+arg[2]+"','"+arg[3]+"','"+ResidentEmail+"');",false);
            String Email[]=new User().GetAllUserEmail();
            String ID[]=new User().GetAllUserID();
            for(int i=0;i<ID.length;i++)
            {
                new JDBC().executeSql("INSERT INTO user_many_to_many_case (ID,U_Email,Cas_ID,C_Serial_number,C_Status)VALUES ('"+ID[i]+"','"+Email[i]+"','"+arg[0]+"','"+arg[1]+"','Unread');",false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void UpdateCaseStatus(String Email,String Serial_Number,boolean bool)
    {
        if(bool)
        {
            try
            {
                new JDBC().executeSql("UPDATE user_many_to_many_case SET C_Status='new comments' WHERE C_Serial_number='"+Serial_Number+"';", false);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            try
            {
                new JDBC().executeSql("UPDATE user_many_to_many_case SET C_Status='read' WHERE C_Serial_number='"+Serial_Number+"' AND U_Email='"+Email+"';", false);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public DefaultListModel GetCaseList(String Email)
    {
        DefaultListModel listModel = new DefaultListModel();
        try
        {
            String ch = new JDBC().executeSql("SELECT C_Serial_number FROM user_many_to_many_case WHERE U_Email='"+Email+"';",true);
            String SnumL [] = ch.split("\n");
            for(int i=0;i<SnumL.length;i++)
            {
                ch = SnumL[i];
                ch = ch + ":\t" + new JDBC().executeSql("SELECT C_Name FROM case_ WHERE C_Serial_number='"+SnumL[i]+"';",true); 
                String sh = new JDBC().executeSql("SELECT C_Status FROM user_many_to_many_case WHERE C_Serial_number='"+SnumL[i]+"' AND U_Email='"+Email+"';",true); 
                if(sh.equals("new comments\n"))
                    ch = ch + "\t (new comments!)";
                else if(sh.equals("Unread\n"))
                    ch = ch + "\t (Unread!)";
                listModel.addElement(ch);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return listModel;
    }
    public String getCaseContent(String S_Num)
    {
        String result="";
        try
        {
            result = "Post by: " + new JDBC().executeSql("SELECT U_Email FROM case_ WHERE C_Serial_number='"+S_Num+"';",true) + "Time:" + new JDBC().executeSql("SELECT Updated_atSince FROM case_ WHERE C_Serial_number='"+S_Num+"';",true)+"-------------------------------------------------------------------------------------\n";
            result = result + new JDBC().executeSql("SELECT C_Description FROM case_ WHERE C_Serial_number='"+S_Num+"';",true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public String getCaseID(String S_Num)
    {
        String result="";
        try
        {
            result = new JDBC().executeSql("SELECT ID FROM case_ WHERE C_Serial_number='"+S_Num+"';",true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String []args)
    {
        String arg[] = new String[4];
        arg[0] = "4";arg[1] = "A1";arg[2] = "CaseTitleA1";arg[3] = "CaseDescriptionA1";
        new Case().NewCase("Resident1@Resident1.com", arg);
        new Case().UpdateCaseStatus("Resident1@Resident1.com","A1", true);
    }
}
