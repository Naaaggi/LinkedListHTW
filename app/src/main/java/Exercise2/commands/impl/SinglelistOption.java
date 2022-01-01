package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;
import Exercise2.console.IConsole;

public class SinglelistOption implements ICommand{
    final private IConsole console;

    public SinglelistOption(IConsole console) {
        this.console = console;
    }

    @Override
    public void execute() {
        App.setIfSingleList(true);
        App.setExitSubMenu(true);
    }

    @Override
    public String toString() {
        return "SinglyLinkedList";
    }


}