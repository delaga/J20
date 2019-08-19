/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Polaznik
 */
public class BazaTest {

    public Connection veza;

    public Connection getVeza() {
        return veza;
    }

    public void setVeza(Connection veza) {
        this.veza = veza;
    }

    public BazaTest() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            veza = DriverManager.getConnection("jdbc:mariadb://localhost/edunovaj20", "edunova", "edunova");
          
            PreparedStatement izraz = veza.prepareStatement("select * from smjer");
            ResultSet rs = izraz.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("naziv"));
            }
            rs.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new BazaTest();
    }
}
