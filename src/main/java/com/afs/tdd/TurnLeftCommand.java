package com.afs.tdd;

public class TurnLeftCommand implements Command {

    private CommandCenter commandCenter;

    public TurnLeftCommand(CommandCenter commandCenter){
        this.commandCenter = commandCenter;
    }

    @Override
    public void execute(){
        commandCenter.goLeft();
    }
}
