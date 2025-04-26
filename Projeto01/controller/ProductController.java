/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto01.controller;

import Projeto01.dao.ProductDAO;
import Projeto01.model.Product;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class ProductController {

    public static String registerProduct(String product, int value, String brand, int units) {

        try {
            Product Product = new Product(product, value, brand, units);
            ProductDAO productDAO = new ProductDAO();
            productDAO.registerProduct(Product);
        } catch (NumberFormatException e) {
            return "Erro:" + e.getMessage();
        }
        return null;
    }

    public static String updateProduct(String newNameProduct, int newValue, String newBrand, int newUnits, int id) {
        try {
            ProductDAO newProduct = new ProductDAO();
            boolean update = newProduct.updateProduct(newNameProduct, newValue, newBrand, newUnits, id);

            if (update) {
                return "Produto atualizado com sucesso!";
            } else {
                return "Produto não encontrado ou não pôde ser atualizado.";
            }
        } catch (Exception e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
        return "Erro ao atualizar produto.";
    }

    public static String deleteProduct(int id) {
        try {
            ProductDAO newProduct = new ProductDAO();
            Boolean delete = newProduct.deleteProduct(id);

            if (delete) {
                return "Produto deletado com sucesso!";
            } else {
                return "Produto não encontrado ou não pode ser deletado";
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar tarefa: " + e.getMessage());
            return "Erro ao deletar tarefa.";
        }
    }
}
