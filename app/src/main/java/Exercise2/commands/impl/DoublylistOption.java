package Exercise2.commands.impl;

import Exercise2.App;
import Exercise2.commands.ICommand;

public class DoublylistOption implements ICommand {

    @Override
    public void execute() {
        App.setIfSingleList(false);
        App.setExitSubMenu(true);
    }

    @Override
    public String toString() {
        return "DoublyLinkedList";
    }

}