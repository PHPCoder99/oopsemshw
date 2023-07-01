package sem1.hw;

public class User {
    String login;
    String password;
    Basket basket;

    public User() {
    }

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void setBasketAtIndex(int i, Product product){
        basket.setProductBoughtAtIndex(i, product);
    }

    public void addBasket(Product product){
        basket.addProductBought(product);
    }

    public void printAllProducts(){
        System.out.println(this.login);
        this.basket.printAllProducts();
    }
}
