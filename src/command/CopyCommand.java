package command;

import receiver.Receiver;

public class CopyCommand implements Command {
    Receiver receiver;

    public CopyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.operate();
    }
}
