package receiver;

public class SaveOperator implements Receiver {
    @Override
    public void operate() {
        System.out.println("Saving...");
    }
}
