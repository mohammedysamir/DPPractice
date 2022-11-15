package creator;

import product.Transport;

public abstract class LogisticsCreator {
    public abstract Transport createTransport(); //function to be implemented in different concrete creators

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
