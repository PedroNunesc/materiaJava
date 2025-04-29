/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Projeto02.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.example.Projeto02.dao.ProductDAO;
import com.example.Projeto02.model.Product;
import java.util.ArrayList;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class ProductController {

    // Atributo privado que faz a interação com o banco de dados (via LivroDAO)
    private ProductDAO productDAO;

    // Construtor da classe, que inicializa o objeto LivroDAO
    public ProductController() {
        this.productDAO = new ProductDAO();  // Cria uma instância de LivroDAO para acessar o banco de dados
    }

    // função para registrar um produto na tabela
    public static String registerProduct(String product, String value, String brand, String kg) {
        try {
            Product Product = new Product(product, value, brand, kg); // chama a classe Product com as variavies a cima
            ProductDAO productDAO = new ProductDAO(); 
            productDAO.registerProduct(Product); // registra o produto com as novas variaveis
        } catch (NumberFormatException e) {
            return "Erro:" + e.getMessage();
        }
        return null;
    }

    // função para atualizar um produto na tabela
    public static String updateProduct(String newNameProduct, String newValue, String newBrand, String newKg, int id) {
        try {
            ProductDAO newProduct = new ProductDAO();
            // chama a classe DAO e atualiza o produto
            boolean update = newProduct.updateProduct(newNameProduct, newValue, newBrand, newKg, id);

            // retorna mensagens se o produto foi atualizado ou não
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

    // função para deletar um produto na tabela
    public static String deleteProduct(int id) {
        try {
            // chama a classe DAO e deleta o produto
            ProductDAO newProduct = new ProductDAO();
            Boolean delete = newProduct.deleteProduct(id);

            // retorna mensagens se o produto foi deletado ou não
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

    public ArrayList<String> ListProducts() {

        // cria um array list para receber os produtos da tabela
        ArrayList<String> ListDone = new ArrayList<>();
        try {
            
            // o array list recebe os dados de ProductDAO
            ArrayList<Product> ProductsList = productDAO.ListProducts();

            // processa os dados antes de enviar para a View
            for (Product product : ProductsList) {
                String detalhes = "ID: " + product.getId() + " | "
                        + "Product: " + product.getProduct() + " | "
                        + "Value: " + product.getValue() + " | "
                        + "Brand: " + product.getBrand() + " | "
                        + "Kg: " + product.getKg();
                ListDone.add(detalhes);
            }
        } catch (Exception e) {
            ListDone.add("Erro ao recuperar os produtos: " + e.getMessage());
        }
        return ListDone;
    }
}
