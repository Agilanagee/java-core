package com.learning.core.day5;

import java.util.HashSet;

class Product1 {
    public static final Object productid = null;
	public String productId;
    public String productName;

    public Product1(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product1 product = (Product1) obj;
        return productId.equals(product.productId);
    }

    
    public int hashCode() {
        return productId.hashCode();
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product1> productSet = new HashSet<>();

        productSet.add(new Product1("P001", "iPhone 13"));
        productSet.add(new Product1("P002", "Samsung Galaxy S21"));
        productSet.add(new Product1("P003", "Maruti Dezire"));
        productSet.add(new Product1("P004", "Sony PlayStation 5"));

        String searchProductId = "P003";
        String searchProductName = "Maruti Dezire";
        Product1 searchProduct = new Product1(searchProductId, searchProductName);

        if (productSet.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}

