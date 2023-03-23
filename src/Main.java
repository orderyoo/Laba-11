public class Main {
    public static void main(String[] args) {
        ProductA productA = new ProductA("milk", 100, 5);
        ProductB productB = new ProductB("cheese", 200, 5);
        ProductC productC = new ProductC("broad", 40, 5);

        UserA userA = new UserA("Maxim", "123");
        UserB userB = new UserB("Artem", "123q");
        UserC userC = new UserC("Ildar", "123f");

        Buyer buyer = new Buyer();
        buyer.displayInfo(userA, productA);
        buyer.displayInfo(userB, productB);
        buyer.displayInfo(userC, productC);

    }
}
interface Product {
    void setName(String name);
    String getName();
    void setPrice(double price);
    double getPrice();
    void setRating(double rating);
    double getRating();
}
interface User {
    void setUsername(String username);
    String getUsername();
    void setPassword(String password);
    String getPassword();
}

