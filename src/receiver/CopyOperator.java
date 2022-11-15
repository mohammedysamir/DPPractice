package receiver;

public class CopyOperator implements Receiver{
    @Override
    public void operate() {
        System.out.println("Copying...");
    }
}
