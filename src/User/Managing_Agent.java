/**
 * @author ：Haoxin Zhang
 */
package User;
import Database.JDBC;
/**
 * @Class ：Council_Member
 * @Description ：Operation on Managing Agent
 */
public class Managing_Agent {
    /**
    * @Method ：NewManaging_Agent
    * @argument: String arg[] (it has at least 6 dimention and these 6 dimentions contain the information of a Managing_Agent required)
    * @Description ：Create a new user
    */
    public void NewManaging_Agent(String arg[])
    {
        try
        {
            new User().NewUser(arg);
            new JDBC().executeSql("INSERT INTO managingagentmembership(ID,Use_ID,U_Email,Updated_atSince,MAM_Role) VALUES ('"+arg[0]+"','"+arg[0]+"','"+arg[1]+"',now(),'"+arg[5]+"');",false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean CheckManaging_AgentExistence(String argEmail)
    {
        try
        {
            String ch=new JDBC().executeSql("Select * from managingagentmembership where U_Email='"+argEmail+"'",true);
            System.out.println(ch);
            if (ch.equals(""))
            {
                return false;
            }
            else return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public boolean CheckManaging_AgentEmailPasswordMatch(String argEmail,String Password)
    {
        try
        {
            String ch=new JDBC().executeSql("Select * from user where U_Email='"+argEmail+"'",true);
            String rh[]=ch.split("\n");
            if (rh[5].equals(Password))
            {
                return true;
            }
            else return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String []args)
    {
        String a[]=new String [11];
        a[0]="1";a[1]="zhxdick@sina.com";a[2]="ZhangHaoxin";a[3]="NUS";a[4]="zhx";
        a[5]="developer";
        new Managing_Agent().NewManaging_Agent(a);
    }
}
