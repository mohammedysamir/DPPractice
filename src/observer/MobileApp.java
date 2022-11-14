package observer;

public class MobileApp implements Subscriber {
    String data;

    public String getData() {
        return data;
    }

    @Override
    public void update(String data) {
        this.data = data;
        System.out.format("%nUpdated data: %s %n", data);
    }
}
