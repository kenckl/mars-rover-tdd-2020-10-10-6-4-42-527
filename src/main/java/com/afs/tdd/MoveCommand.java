package com.afs.tdd;

public class MoveCommand implements Command {
    MarsRover marsRover;

    public MoveCommand(MarsRover marsRover){
        this.marsRover = marsRover;
    }

    @Override
    public void execute(){
        marsRover.move();
    }
}
