package Exercise2.commands.impl;


import Exercise2.commands.ICommand;

public class ExitProgramCmd implements ICommand {

    @Override
    public void execute() {
        System.out.println("Exit program.");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Exit program";
    }


}