package invoker;

import command.Command;

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
        System.out.println("Executing command from save menu item");
        command.execute();
    }
}
