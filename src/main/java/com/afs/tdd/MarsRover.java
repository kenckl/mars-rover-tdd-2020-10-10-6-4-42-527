package com.afs.tdd;

import java.util.Arrays;

public class MarsRover implements CommandCenter {
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";

    private int locationX;
    private int locationY;
    private String direction;

    public MarsRover(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getDirection() {
        return direction;
    }

//    public void processCommand(String commands) {
//        Arrays.asList(commands.split(""))
//                .forEach(command -> this.executeCommand(command));
//    }
//
//
//    private void executeCommand(String command) {
//        if (command.equals(MOVE_FORWARD)) {
//            move();
//        } else if (command.equals(TURN_LEFT)) {
//            goLeft();
//        } else if (command.equals(TURN_RIGHT)) {
//            goRight();
//        }
//    }

    @Override
    public void goRight() {
        switch(direction){
            case NORTH:
                direction = EAST;
                break;
            case SOUTH:
                direction = WEST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case WEST:
                direction = NORTH;
                break;
        }
    }

    @Override
    public void goLeft() {
        switch(direction){
            case NORTH:
                direction = WEST;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case EAST:
                direction = NORTH;
                break;
            case WEST:
                direction = SOUTH;
                break;
        }
    }

    @Override
    public void move() {
        switch(direction){
            case NORTH:
                locationY++;
                break;
            case SOUTH:
                locationY--;
                break;
            case EAST:
                locationX++;
                break;
            case WEST:
                locationX--;
                break;
        }
    }
}
