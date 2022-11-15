package invoker;

import command.Command;

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
        System.out.println("Executing command from copy button");
        command.execute();
    }
}
