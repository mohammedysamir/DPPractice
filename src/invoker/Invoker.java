package invoker;

import Command.Command;

public interface Invoker {
    void setCommand(Command command);
    void executeCommand();
}
