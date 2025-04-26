/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Projeto01.model;

/**
 *
 * @author PEDROHENRIQUENUNESCA
 */
public class Product {

    public int id; // id do produto
    public String product; // nome do produto
    public int value; // valor do produto
    public String brand; // marca do produto 
    public int units; // unidades do produto

    public Product(String product, int value, String brand, int units) {
        this.product = product;
        this.value = value;
        this.brand = brand;
        this.units = units;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}