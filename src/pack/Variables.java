
package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.opencv.core.Core;


public class Variables {
   
    public static ArrayList AdminPass = new ArrayList();
    public static ArrayList AdminUsername = new ArrayList();
    public static ArrayList AdminCheck = new ArrayList();
    
    
    public static ArrayList<String> Fullname = new ArrayList();
    public static ArrayList Firstname = new ArrayList();
    public static ArrayList Lastname = new ArrayList();
    public static ArrayList Middlename = new ArrayList();
    public static ArrayList Birthday = new ArrayList();
    public static ArrayList Month = new ArrayList();
    public static ArrayList Day = new ArrayList();
    public static ArrayList Year = new ArrayList();
    public static ArrayList Age = new ArrayList();
    public static ArrayList Gender = new ArrayList();
    public static ArrayList Religion = new ArrayList();
    public static ArrayList Housenumber = new ArrayList();
    public static ArrayList Zone = new ArrayList();
    public static ArrayList FullnameMother = new ArrayList();
    public static ArrayList surnameMother = new ArrayList();
    public static ArrayList firstnameMother = new ArrayList();
    public static ArrayList midnameMother = new ArrayList();
    public static ArrayList FullnameFather = new ArrayList();
    public static ArrayList surnameFather = new ArrayList();
    public static ArrayList firstnameFather = new ArrayList();
    public static ArrayList midnameFather = new ArrayList();
    public static ArrayList Civilstatus = new ArrayList();
    public static ArrayList FullAddress = new ArrayList();
    public static ArrayList<Integer> Unique = new ArrayList();
    public static ArrayList<Integer> admin_id = new ArrayList();
   
    public static ArrayList <String> userPath = new ArrayList();
    
    public static String path="";
     
    public static int UniId=0;
   
    
    
    public static String captFullname = "Reyes III, Doroteo M.";
    public static String captSurname = "Reyes III";
    public static String captFirstname = "Doroteo";
    public static String captMiddle = "M.";
    
    public static String secFullname = "Del Rosario, Ronaldo M.";
    public static String secSurname = "Del Rosario";
    public static String secFirstname = "Ronaldo";
    public static String secMiddle = "M.";
    
    public static String tresFullname = "Dalmacio, Alvin D.";
    public static String tresSurname = "Dalmacio";
    public static String tresFirstname = "Alvin";
    public static String tresMiddle = "D.";
    
    public static String kag1Fullname = "Martin, Liberto F.";
    public static String kag1Surname = "Martin";
    public static String kag1Firstname = "Liberto";
    public static String kag1Middle = "F.";
    
    public static String kag2Fullname = "Magbitang, Daniel T.";
    public static String kag2Surname = "Magbitang";
    public static String kag2Firstname = "Daniel";
    public static String kag2Middle = "T.";
    
    public static String kag3Fullname = "Alfonso, Leonora R.";
    public static String kag3Surname = "Alfonso";
    public static String kag3Firstname = "Leonora";
    public static String kag3Middle = "R.";
    
    public static String kag4Fullname = "Miranda, Carolina F.";
    public static String kag4Surname = "Miranda";
    public static String kag4Firstname = "Carolina";
    public static String kag4Middle = "F.";
    
    public static String kag5Fullname = "Agulto, Marcelino F.";
    public static String kag5Surname = "Agulto";
    public static String kag5Firstname = "Marcelino";
    public static String kag5Middle = "F.";
    
    public static String kag6Fullname = "Dalmacio Sr, Herminio A.";
    public static String kag6Surname = "Dalmacio Sr";
    public static String kag6Firstname = "Herminio";
    public static String kag6Middle = "A.";
    
    public static String kag7Fullname = "Vistan, Arturo A.";
    public static String kag7Surname = "Vistan";
    public static String kag7Firstname = "Arturo";
    public static String kag7Middle = "A.";
    
    
    static final String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        static final String DB_URL="jdbc:sqlserver://localhost:1433;DATABASE=RecordKeeping";

        static final String user="justine";
        static final String pass="1234";
        
        static Connection conn = null;
        static Statement stmt = null;
        static PreparedStatement statement = null;
        static ResultSet rs  = null;  
    
    
    public static void main(String[] args) throws SQLException {
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
         try 
            {
                Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                conn = DriverManager.getConnection(DB_URL,user,pass);
                System.out.println ("Successfully Connected");

                //Creating Table---------------------------------------------------------------------
                stmt = conn.createStatement();
                String admin = "create table ADMINISTRATOR (admin_id int primary key identity(1,1),"
                        + "admin_user varchar (30),"
                        + "admin_pass varchar(30),"
                        + "account_type varchar(30))";
                stmt.executeUpdate(admin);
                System.out.println("Table created");
            
                stmt = conn.createStatement();
                String citizen = "create table CITIZEN (Citizen_id int primary key,"
                        + "Position varchar(30),"
                        + "Fname varchar(30),"
                        + "Lname varchar(30),"
                        + "Mname varchar(30),"
                        + "fullname varchar(100),"
                        + "age varchar(20),"
                        + "gender varchar(20),"
                        + "address varchar(100),"
                        + "house_num varchar(30),"
                        + "zone varchar(30),"
                        + "religion varchar(30),"
                        + "year varchar(30),"
                        + "month varchar(30),"
                        + "day varchar(20),"
                        + "birthday varchar(30),"
                        + "motherFname varchar(30),"
                        + "motherLname varchar(30),"
                        + "motherMname varchar(30),"
                        + "motherFullname varchar(100),"
                        + "fatherFname varchar(30),"
                        + "fatherLname varchar(30),"
                        + "fatherMname varchar(30),"
                        + "fatherFullname varchar(100),"
                        + "civil_status varchar(30),"
                        + "picture varchar(50))";
                stmt.executeUpdate(citizen);
                System.out.println("Table created");
                
                stmt = conn.createStatement();
                String Record = "create table RECORD ("
                        + "citizen_Id int,"
                        + "date varchar(50),"
                        + "record varchar(1000))";
                stmt.executeUpdate(Record);
                System.out.println("Table created");
                
                //Creating Table---------------------------------------------------------------------
                
                
                
            }
         catch(SQLException e)
            {
                System.out.println(e.getMessage());
            }
         catch (Exception e) 
            {
                System.out.println(e.getMessage());
            }
        
        
        
            String query = "select * from ADMINISTRATOR";
            rs = stmt.executeQuery(query);
            
            while(rs.next())
            {
                
                AdminPass.add(rs.getString("admin_pass"));
                AdminUsername.add(rs.getString("admin_user"));
                AdminCheck.add(rs.getString("account_type"));
            }
        
            String citiquery = "select * from CITIZEN";
            rs = stmt.executeQuery(citiquery);
            
            while(rs.next())
            {
                UniId++;
                Unique.add(rs.getInt("Citizen_id"));
                Firstname.add(rs.getString("Fname"));
                Lastname.add(rs.getString("Lname"));
                Middlename.add(rs.getString("Mname"));
                Fullname.add(rs.getString("fullname"));
                Age.add(rs.getString("age"));
                Gender.add(rs.getString("gender"));
                FullAddress.add(rs.getString("address"));
                Housenumber.add(rs.getString("house_num"));
                Zone.add(rs.getString("zone"));
                Religion.add(rs.getString("religion"));
                Year.add(rs.getString("year"));
                Month.add(rs.getString("month"));
                Day.add(rs.getString("day"));
                Birthday.add(rs.getString("birthday"));
                firstnameMother.add(rs.getString("motherFname"));
                surnameMother.add(rs.getString("motherLname"));
                midnameMother.add(rs.getString("motherMname"));
                FullnameMother.add(rs.getString("motherFullname"));
                firstnameFather.add(rs.getString("fatherFname"));
                surnameFather.add(rs.getString("fatherLname"));
                midnameFather.add(rs.getString("fatherMname"));
                FullnameFather.add(rs.getString("fatherFullname"));
                Civilstatus.add(rs.getString("civil_status"));
                userPath.add(rs.getString("picture"));
            }
        
           
        System.out.println("Numbers: "+UniId);
        
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
     
        
        Login wer = new Login();
        wer.setVisible(true);
        
    }
    
}
