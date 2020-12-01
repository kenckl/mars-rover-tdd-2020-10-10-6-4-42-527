package com.afs.tdd;

public class TurnRightCommand implements Command {
    private CommandCenter commandCenter;

    public TurnRightCommand(CommandCenter commandCenter){
        this.commandCenter = commandCenter;
    }

    @Override
    public void execute(){
        commandCenter.goRight();
    }
}
