package creator;

import product.Transport;
import product.Truck;

public class RoadLogistics extends LogisticsCreator{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
