package invoker;

import Command.Command;

public class SaveButton implements Invoker {
    Command command; //reference of a command

    public SaveButton(Command command) {
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
