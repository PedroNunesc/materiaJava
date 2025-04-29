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

    // função para registrar um produto na tabela
    public boolean registerProduct(Product product) {
        String sql = "INSERT INTO products (product, value, brand, kg) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            // adiciona as variaveis nas classes escolhidas
            stmt.setString(1, product.product);
            stmt.setString(2, product.value);
            stmt.setString(3, product.brand);
            stmt.setString(4, product.kg);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
    }

    // função para atualizar um produto na tabela
    public boolean updateProduct(String newNameProduct, String newValue, String newBrand, String newKg, int id) {
        String sql = "UPDATE products SET product = ?, value = ?, brand = ?, kg = ? WHERE id  = ?";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            // atualiza as variaveis nas classes escolhidas
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

    // função para deletar um produto na tabela
    public boolean deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE id = ?";

        try (PreparedStatement stmt = connect.prepareStatement(sql)) {
            // deleta o produto com o id selecionado
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro! " + e.getMessage());
            return false;
        }
    }

    // função para listar os produtos da tabela para um array list
    public ArrayList<Product> ListProducts() {
        ArrayList<Product> lista = new ArrayList<>(); // Cria uma array list para armazenar os produtos
        String sql = "SELECT * FROM products";

        try (Statement stmt = connect.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { // adiciona todos os produtos no array
                Product product;
                product = new Product(
                        rs.getString("Product"),
                        rs.getString("Value"),
                        rs.getString("Brand"),
                        rs.getString("Kg")
                );
                product.setId(rs.getInt("id")); // pega o id do produto
                lista.add(product); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Produtos: " + e.getMessage());
        }
        return lista;
    }
}
