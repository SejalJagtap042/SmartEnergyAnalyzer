package database;

import model.Appliance;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAO {

    public List<Appliance> getAllAppliances() {

        List<Appliance> appliances = new ArrayList<>();

        try {

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/energy_analyzer",
                    "root",
                    "root123"
            );

            String sql = "SELECT * FROM appliances";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {

                Appliance appliance = new Appliance(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("power_rating"),
                        rs.getDouble("usage_hours")
                );

                appliances.add(appliance);
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return appliances;
    }
}
