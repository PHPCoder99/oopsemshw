package sem1.hw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category cat1 = new Category("category 1", new ArrayList<>());
        Category cat2 = new Category("category 2", new ArrayList<>());
        Category cat3 = new Category("category 3", new ArrayList<>());
        Category cat4 = new Category("category 4", new ArrayList<>());

        cat1.addProduct(new Product("product 1.1", 400, 5));
        cat1.addProduct(new Product("product 1.2", 300, 4));
        cat1.addProduct(new Product("product 1.3", 600, 5));

        cat2.addProduct(new Product("product 2.1", 200, 3));
        cat2.addProduct(new Product("product 2.2", 150, 4));
        cat2.addProduct(new Product("product 2.3", 350, 4));

        cat3.addProduct(new Product("product 3.1", 700, 2));
        cat3.addProduct(new Product("product 3.2", 900, 5));
        cat3.addProduct(new Product("product 3.3", 800, 3));

        cat4.addProduct(new Product("product 4.1", 100, 4));
        cat4.addProduct(new Product("product 4.2", 150, 5));
        cat4.addProduct(new Product("product 4.3", 250, 3));

        User user1 = new User("login1", "pass1", new Basket(new ArrayList<>()));
        User user2 = new User("login2", "pass2", new Basket(new ArrayList<>()));
        User user3 = new User("login3", "pass3", new Basket(new ArrayList<>()));

        user1.addBasket(new Product("product 2.1", 200, 3));
        user1.addBasket(new Product("product 3.1", 700, 2));
        user2.addBasket(new Product("product 4.2", 150, 5));
        user2.addBasket(new Product("product 4.2", 150, 5));
        user3.addBasket(new Product("product 1.2", 300, 4));
        user3.addBasket(new Product("product 4.3", 250, 3));

        cat1.printAllProducts();
        cat2.printAllProducts();
        cat3.printAllProducts();
        cat4.printAllProducts();

        user1.printAllProducts();
        user2.printAllProducts();
        user3.printAllProducts();
    }
}
