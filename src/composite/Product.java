package composite;

public class Product implements Composable {
    int price;
    String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void getPrice() {
        System.out.format("%n %s's price is:%d %n", name, price);
    }
}
