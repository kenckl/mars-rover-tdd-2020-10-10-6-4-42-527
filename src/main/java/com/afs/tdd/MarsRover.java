package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction){
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX(){
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection(){
        return direction;
    }

    public void executeCommands(String commands){
        Arrays.asList(commands.split(""))
                .forEach(command->this.executeCommand(command));
    }

    private void executeCommand(String command) {
        if (command.equals("M")){
            move();
            }
        if (command.equals("L")){
            goLeft();
        }
        if (command.equals("R")){
            goRight();
        }
    }

    private void goRight() {
        if (direction.equals("N")){
            direction = "E";
        }
    }

    private void goLeft(){
        if (direction.equals("N")){
            direction = "W";
        }
    }

    private void move() {
        if (direction.equals("N")){
            this.locationY++;
        }
    }

}
