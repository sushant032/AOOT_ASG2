/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webstore;

import java.util.ArrayList;

/**
 *
 * @author Sushant Sinha
 */
public class cart {
    
    public ArrayList<Product> products;
    double total;

    public cart() {
        products = new ArrayList<>();
        total = 0;
    }
    
    
    
    public cart(cart c) {
        products = c.products;
        total = c.total;
    }
    
    
}
