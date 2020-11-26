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
        else if (command.equals(TURN_LEFT)){
            goLeft();
        }
        else if (command.equals(TURN_RIGHT)){
            goRight();
        }
    }

    private void goRight() {
        if (direction.equals(NORTH)){
            direction = EAST;
        }
        else if (direction.equals(SOUTH)){
            direction = WEST;
        }
        else if (direction.equals(EAST)){
            direction = SOUTH;
        }
        else if (direction.equals(WEST)){
            direction = NORTH;
        }
    }

    private void goLeft(){
        if (direction.equals(NORTH)){
            direction = WEST;
        }
        else if (direction.equals(SOUTH)){
            direction = EAST;
        }
        else if (direction.equals(EAST)){
            direction = NORTH;
        }
        else if (direction.equals(WEST)){
            direction = SOUTH;
        }
    }

    private void move() {
        if (direction.equals(NORTH)){
            locationY++;
        }
        else if (direction.equals(SOUTH)){
            locationY--;
        }
        else if (direction.equals(EAST)){
            locationX++;
        }
        else if (direction.equals(WEST)){
            locationX--;
        }
    }

}
