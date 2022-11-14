package observer;

public class MobileApp implements Subscriber {
    String data;

    public String getData() {
        return data;
    }

    @Override
    public void update(String data) {
        this.data = data;
        System.out.format("%n----received from a mobile---- %n" +
                "%nUpdated data: %s %n", data);
    }
}
