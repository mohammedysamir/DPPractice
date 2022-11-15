package command;

import receiver.Receiver;

public class SaveCommand implements Command{
    Receiver receiver;

    public SaveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operate();
    }
}
