package io.jboxx.designpattern.commandpattern;

import java.util.Stack;

public class Invoker {

    private Stack<ICommand> commandStack;

    public Invoker() {
        this.commandStack = new Stack<>();
    }

    public void addCommandAndExecute(ICommand command) {
        command.execute();
        commandStack.push(command);
    }

    public void undoCommandAndPop() {
        if (!commandStack.empty()) {
            commandStack.pop().unexecute();
        }
    }
}
