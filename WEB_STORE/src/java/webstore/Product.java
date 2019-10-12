/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webstore;

/**
 *
 * @author Sushant Sinha
 */
public class Product {
    public Double price;
    public String name;
    public Integer qty;
    public String img;

    public Product(Double price, String name, Integer qty, String img) {
        this.price = price;
        this.name = name;
        this.qty = qty;
        this.img = img;
    }    
}
