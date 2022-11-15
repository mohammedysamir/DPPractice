package invoker;

import command.Command;

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
        System.out.println("Executing command from copy menu item");
        command.execute();
    }
}
