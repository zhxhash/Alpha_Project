/**
 * @author ：Haoxin Zhang
 */
package User;
import Database.JDBC;
/**
 * @Class ：User
 * @Description ：Operation on Users
 */
public class User {
    /**
    * @Method ：NewUser
    * @argument: String arg[] (it has at least 5 dimention and these 5 dimentions contain the information of a user required)
    * @Description ：Create a new user
    */
    public void NewUser(String arg[])
    {
        try
        {
            new JDBC().executeSql("INSERT INTO user(ID,U_Email,Updated_atSince,U_Name,U_Company,U_password) VALUES ('"+arg[0]+"','"+arg[1]+"',now(),'"+arg[2]+"','"+arg[3]+"','"+arg[4]+"');",false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    /**
    * @Method ：CheckUserExistence
    * @argument: String argEmail 
    * @Description ：Check if argEmail exists in Database, if exist return true. In order to prevent duplication of Email address.
    */
    public boolean CheckUserExistence(String argEmail)
    {
        try
        {
            String ch=new JDBC().executeSql("Select * from user where U_Email='"+argEmail+"'",true);
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
    /**
    * @Method ：GetAllUserEmail
    * @argument: 
    * @Description ：Return a String Object which contains all user's Email
    */
    public String [] GetAllUserEmail()
    {
        String []Email= new String [1];
        try
        {
            String ch=new JDBC().executeSql("Select U_Email from user",true);
            System.out.print(ch);
            Email=ch.split("\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return Email;
    }
     /**
    * @Method ：GetAllUserID
    * @argument: 
    * @Description ：Return a String Object which contains all user's Email
    */
    public String [] GetAllUserID()
    {
        String []ID= new String [1];
        try
        {
            String ch=new JDBC().executeSql("Select ID from user",true);
            System.out.print(ch);
            ID=ch.split("\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return ID;
    }
    public String getUserID(String Email)
    {
        String result="";
        try
        {
            result = new JDBC().executeSql("SELECT ID FROM user WHERE U_Email='"+Email+"';",true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String []args)
    {
        new User().GetAllUserID();
    }
}
