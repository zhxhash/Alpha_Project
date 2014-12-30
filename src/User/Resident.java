/**
 * @author ：Haoxin Zhang
 */
package User;
import Database.JDBC;
/**
 * @Class ：Resident
 * @Description ：Operation on Residents
 */
public class Resident {
    /**
    * @Method ：NewResident
    * @argument: String arg[] (it has at least 11 dimention and these 11 dimentions contain the information of a Resident required)
    * @Description ：Create a new user
    */
    public void NewResident(String arg[])
    {
        try
        {
            new User().NewUser(arg);
            new JDBC().executeSql("INSERT INTO resident(ID,R_Name,R_Mobile_phone,R_Email,Use_ID,U_Email,Updated_atSince,R_Address,R_City,R_State,R_Country,R_Postal_code) VALUES ('"+arg[0]+"','"+arg[2]+"','"+arg[5]+"','"+arg[1]+"','"+arg[0]+"','"+arg[1]+"',now(),'"+arg[6]+"','"+arg[7]+"','"+arg[8]+"','"+arg[9]+"','"+arg[10]+"');",false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public boolean CheckResidentExistence(String argEmail)
    {
        try
        {
            String ch=new JDBC().executeSql("Select * from resident where R_Email='"+argEmail+"'",true);
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
    public boolean CheckResidentEmailPasswordMatch(String argEmail,String Password)
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
        a[5]="86949758";a[6]="address!!";a[7]="FangShan";a[8]="Beijing";a[9]="China";
        a[10]="259367";
        new Resident().NewResident(a);
    }
}
