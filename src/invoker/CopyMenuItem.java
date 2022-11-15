package invoker;

import Command.Command;

public class CopyMenuItem implements Invoker {
    Command command; //reference of a command

    public CopyMenuItem(Command command) {
        this.command = command;
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void executeCommand() {
        command.execute();
    }
}
