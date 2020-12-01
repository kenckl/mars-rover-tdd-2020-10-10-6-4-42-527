package com.afs.tdd;

public class TurnLeftCommand implements Command {

    MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        marsRover.goLeft();
    }
}
