package product;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Some Cargos are delivered by a Ship");
    }
}
