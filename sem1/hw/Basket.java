package sem1.hw;

import java.util.ArrayList;

public class Basket {
    ArrayList<Product> productsBought;

    public Basket() {
    }

    public Basket(ArrayList<Product> productsBought) {
        this.productsBought = productsBought;
    }

    public ArrayList<Product> getProductsBought() {
        return productsBought;
    }

    public void setProductsBought(ArrayList<Product> products) {
        this.productsBought = products;
    }

    public void setProductBoughtAtIndex(int i, Product product){
        productsBought.set(i, product);
    }

    public void addProductBought(Product product){
        productsBought.add(product);
    }

    public void printAllProducts(){
        for (Product product : productsBought) {
            System.out.println(product);
        }
        System.out.println();
    }
}
