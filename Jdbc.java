import java.sql.*;
public class Jdbc {

  
    public static void main(String[] args)
    {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           String url="jdbc:mysql://localhost:3306/first";
           String username="root";
           
           Connection con=DriverManager.getConnection(url,username,"Star@3112");
           
           if(con.isClosed()){
               System.out.println("Connection is not established...");
           }
           
           else{
               System.out.println("Connection is established..");
           }
       
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
}