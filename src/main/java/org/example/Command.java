package org.example;

import java.util.List;

public class Command {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Command(List<Product> products) {
        this.products = products;
    }

    public double calculateTotalAmount(){
        return this.products.stream()
                .map((product -> product.calculateTotalAmountOfProduct()))
                .reduce(0.0, (totalAmountProduct, totalAmountCommand) -> totalAmountCommand+=totalAmountProduct);
    }
}
