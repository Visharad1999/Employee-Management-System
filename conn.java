package Employeee;

import java.sql.*;

public class conn{
    
    public static Connection c=null;
    public Statement s;
    static String databaseName ="project";
    static String url="jdbc:mysql://localhost:3306/" +databaseName;
    
    static String username="root";
    static String password="Visharad@123";
    
 
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url,username,password);
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
