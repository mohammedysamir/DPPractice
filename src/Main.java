import command.Command;
import command.CopyCommand;
import command.SaveCommand;
import invoker.*;
import receiver.CopyOperator;
import receiver.Receiver;
import receiver.SaveOperator;

public class Main {
    public static void main(String[] args) {
        //Create receivers
        Receiver saveOperator = new SaveOperator();
        Receiver copyOperator = new CopyOperator();
        //create commands
        Command saveCommand = new SaveCommand(saveOperator);
        Command copyCommand = new CopyCommand(copyOperator);
        //Create invokers
        Invoker saveButton = new SaveButton(saveCommand);
        Invoker saveMenuItem = new SaveMenuItem(saveCommand);
        Invoker copyButton = new CopyButton(copyCommand);
        Invoker copyMenuItem = new CopyMenuItem(copyCommand);
        //invoke
        saveButton.executeCommand();
        saveMenuItem.executeCommand();
        copyButton.executeCommand();
        copyMenuItem.executeCommand();

    }
}
/*
 * command pattern
 *  Usually is used to provide shared code that can be executed from different objects.
 *  Encapsulate shared code into the concrete command classes that implement command interface
 *  Consists of 3 main actors: invoker, receiver and command. invoker invokes commands through the command interface that delegate work to receivers
 *  famous example: Button, menu item, shortcuts they can execute same operation [copy, paste, exit, create ...]
 *
 *  Receivers have logic code. concrete commands have reference to receivers
 * */