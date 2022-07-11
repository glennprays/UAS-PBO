/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.CategoryUser;
import java.util.ArrayList;
import Database.DatabaseHandler;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author glenn
 */
public class CategoryUserContorller {
    DatabaseHandler c = new DatabaseHandler();
    
    public ArrayList<CategoryUser> retrieveCategory() {
        ArrayList<CategoryUser> cList = new ArrayList<>();
        try {
            c.connect();
            String query = "SELECT * FROM categoryuser";
            PreparedStatement stmt = c.con.prepareStatement(query);
            ResultSet rs=stmt.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id_category");
                String cate = rs.getString("category");
                CategoryUser category = new CategoryUser(id, cate);
                cList.add(category);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        c.disconnect();
        return cList;
    }
}
