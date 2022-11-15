package invoker;

import command.Command;

public interface Invoker {
    void setCommand(Command command);
    void executeCommand();
}
