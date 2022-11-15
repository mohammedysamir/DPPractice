package creator;

import product.Ship;
import product.Transport;

public class SeaLogistics extends LogisticsCreator {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
