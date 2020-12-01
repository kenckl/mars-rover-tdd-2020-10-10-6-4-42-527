package com.afs.tdd;

public class ExecuteCommand {
    private Command command;

    public ExecuteCommand(Command command){
        this.command = command;
    }

    public void execCommand(){
        command.execute();
    }
}
