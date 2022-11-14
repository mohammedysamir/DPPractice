import composite.Box;
import composite.Composable;
import composite.Product;

public class Main {
    public static void main(String[] args) {
        //composite pattern is used when we can represent our system's state as tree
        //create the biggest object
        Box biggestBox = new Box();
        //add some products
        biggestBox.addComposable(new Product(130, "Product A"));
        biggestBox.addComposable(new Product(10, "Product B"));
        biggestBox.addComposable(new Product(45, "Product C"));
        //add another composite box
        Box anotherBox = new Box();
        anotherBox.addComposable(new Product(30, "Product D"));
        anotherBox.addComposable(new Product(6, "Product E"));
        biggestBox.addComposable(anotherBox);

        biggestBox.getPrice();
    }
}