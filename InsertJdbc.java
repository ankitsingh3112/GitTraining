import java.sql.*;
import java.io.*;
public class InsertJdbc {

  
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
		   
		  /* 
		   String query="create table table1(tId int(20) primary key auto_increment, Name varchar(200) not null, tcity varchar(400))";
		   
		   Statement stmt=con.createStatement();
		   stmt.executeUpdate(query);
		   
		   System.out.println("Table is created....");
		   
		   //insert into table
                   String q="insert into table1(Name,tcity) values(?,?)";
                   
                   PreparedStatement pstmt=con.prepareStatement(q);
                   
                   //set values to query
                   
                   pstmt.setString(1,"Ankit");
                   pstmt.setString(2, "Palwal");
				   */
                   
				   
				    /*
                   Now to take dynamic input from user
                   */
                    String q="insert into table1(Name,tcity) values(?,?)";
                    PreparedStatement pstmt=con.prepareStatement(q);
				   
                   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                   System.out.println("Enter name:");
                   String name=br.readLine();
                   
                   System.out.println("Enter city:");
                   String city=br.readLine();
                    pstmt.setString(1,name);
                   pstmt.setString(2, city);
                   
                   pstmt.executeUpdate();
                   
                   System.out.println("Query and Values inserted...");
		   
		   con.close();
       
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    
} 