import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;



public class MysqlConnect {
    
    Connection conn =null;
    
    
    public static Connection ConnectDB(){
        
        try{ 
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection ("jdbc:mysql://localhost:3306/empdb","root","root");
            //JOptionPane.showMessageDialog(null, "connection successful");
            return conn;
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
        }    
    }
    
    
}
