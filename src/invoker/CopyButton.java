package invoker;

import Command.Command;

public class CopyButton implements Invoker{
    Command command; //reference of a command

    public CopyButton(Command command) {
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
