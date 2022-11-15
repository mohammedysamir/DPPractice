package invoker;

import Command.Command;

public class SaveMenuItem implements Invoker {
    Command command; //reference of command

    public SaveMenuItem(Command command) {
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
