package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginCheck {
    private String userId;
    private String password;
    public LoginCheck(String userId,String password){
        this.userId=userId;
        this.password=password;
    }
    public LoginCheck(){};

    public  boolean checkInBE(String userId,String password,String table) throws SQLException, ClassNotFoundException {
        DBMSConnection dbmsConnect = new DBMSConnection("jdbc:mysql://localhost:3306/uniwheel", "root", "");
        Connection con = dbmsConnect.getConnection();
        PreparedStatement stmt = con.prepareStatement("SELECT EMAIL, PASSWORD FROM "+table);
        ResultSet rs = stmt.executeQuery();

        boolean match=false;
        while (rs.next()) {
            String dbID = rs.getString("EMAIL");
            String dbPassword = rs.getString("PASSWORD");
            if(dbID.equals(userId))
                if(dbPassword.equals(password)){
                    match= true;
                    break;
                }


        }

// Close the resources (Connection, PreparedStatement, ResultSet) after you're done using them.
        rs.close();
        stmt.close();
        con.close();
        return match;
    }


}
