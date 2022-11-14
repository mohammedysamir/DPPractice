package observer;

public class Website implements Subscriber {
    String data;

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void update(String data) {
        this.data = data;
        System.out.format("%nUpdated data: %s %n", data);
    }
}
