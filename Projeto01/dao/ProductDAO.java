/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto01.dao;

import Projeto01.database.ConnectionSQL;
import Projeto01.model.Product;
import java.sql.*;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class ProductDAO {
 public boolean registerProduct(Product product) {
        String sql = "INSERT INTO products (product, value, brand, units) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = ConnectionSQL.connect(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.product);
            stmt.setInt(2, product.value);
            stmt.setString(3, product.brand);
            stmt.setInt(4, product.units);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateProduct(String newNameProduct, int newValue, String newBrand, int newUnits, int id) {
        String sql = "UPDATE products SET product = ?, value = ?, brand = ?, units = ? WHERE id  = ?";

        try (Connection conn = ConnectionSQL.connect(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, newNameProduct);
            stmt.setInt(2, newValue);
            stmt.setString(3, newBrand);
            stmt.setInt(4, newUnits);
             stmt.setInt(5, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
    }

    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE id = ?";

        try (Connection conn = ConnectionSQL.connect(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
    }
}
   
