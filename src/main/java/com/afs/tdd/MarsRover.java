package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String MOVE_FORWARD = "M";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";

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
        if (command.equals(MOVE_FORWARD)){
            move();
            }
        if (command.equals(TURN_LEFT)){
            goLeft();
        }
        if (command.equals(TURN_RIGHT)){
            goRight();
        }
    }

    private void goRight() {
        if (direction.equals(NORTH)){
            direction = EAST;
        }
    }

    private void goLeft(){
        if (direction.equals(NORTH)){
            direction = WEST;
        }
    }

    private void move() {
        if (direction.equals(NORTH)){
            this.locationY++;
        }
        if (direction.equals(SOUTH)){
            this.locationY--;
        }
    }

}
