package receiver;

public class copyOperator implements Receiver{
    @Override
    public void operate() {
        System.out.println("Copying...");
    }
}
