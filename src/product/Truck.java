package product;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Some goods are delivering by a Truck");
    }
}
