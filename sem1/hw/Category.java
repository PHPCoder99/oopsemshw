package sem1.hw;

import java.util.ArrayList;

public class Category {
    String name;
    ArrayList<Product> products;

    public Category() {
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setProductAtIndex(int i, Product product){
        products.set(i, product);
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void printAllProducts(){
        System.out.println(this.name);
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}
