package com.afs.tdd;

import java.util.List;

public class MarsRover {
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String MOVE_FORWARD = "M";
    public static final String MOVE_BACKWARD = "B";
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void executeCommand(String command) {
        switch (command) {
            case MOVE_FORWARD -> {
                switch (direction) {
                    case NORTH -> y++;
                    case SOUTH -> y--;
                    case EAST -> x++;
                    case WEST -> x--;
                }
            }
            case MOVE_BACKWARD -> {
                switch (direction) {
                    case NORTH -> y--;
                    case SOUTH -> y++;
                    case EAST -> x--;
                    case WEST -> x++;
                }
            }
            case TURN_LEFT -> {
                switch (direction) {
                    case NORTH -> direction = WEST;
                    case SOUTH -> direction = EAST;
                    case EAST -> direction = NORTH;
                    case WEST -> direction = SOUTH;
                }
            }
            case TURN_RIGHT -> {
                switch (direction) {
                    case NORTH -> direction = EAST;
                    case SOUTH -> direction = WEST;
                    case EAST -> direction = SOUTH;
                    case WEST -> direction = NORTH;
                }
            }
        }
    }

    public void reportAfterMultipleCommands(List<String> commandList) {
        commandList.forEach(this::executeCommand);
    }
}
