/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeto02.dao;

/**
 *
 * @author Usuario
 */
import com.example.Projeto02.database.ConnectionSQL;
import com.example.Projeto02.model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class ProductDAO {

    // Atributo para armazenar a conexão com o banco de dados
    private Connection connect;

    // Construtor da classe, responsável por estabelecer a conexão com o banco de dados
    public ProductDAO() {
        connect = ConnectionSQL.connect();
    }

    public boolean registerProduct(Product product) {
        String sql = "INSERT INTO products (product, value, brand, kg) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, product.product);
            stmt.setString(2, product.value);
            stmt.setString(3, product.brand);
            stmt.setString(4, product.kg);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateProduct(String newNameProduct, String newValue, String newBrand, String newKg, int id) {
        String sql = "UPDATE products SET product = ?, value = ?, brand = ?, kg = ? WHERE id  = ?";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setString(1, newNameProduct);
            stmt.setString(2, newValue);
            stmt.setString(3, newBrand);
            stmt.setString(4, newKg);
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

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
    }

    public ArrayList<Product> ListProducts() {
        ArrayList<Product> lista = new ArrayList<>();
        String sql = "SELECT * FROM products";

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Product product;
                product = new Product(
                        rs.getString("Product"),
                        rs.getString("Value"),
                        rs.getString("Brand"),
                        rs.getString("Kg")
                );
                product.setId(rs.getInt("id"));
                lista.add(product);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: " + e.getMessage());
        }
        return lista;
    }

    public boolean restoreProducts(List<Product> products) {
        String sql = "INSERT INTO products (product, value, brand, kg) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            for (Product product : products) {
                stmt.setString(1, product.getProduct());
                stmt.setString(2, product.getValue());
                stmt.setString(3, product.getBrand());
                stmt.setString(4, product.getKg());
                stmt.executeUpdate();
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
