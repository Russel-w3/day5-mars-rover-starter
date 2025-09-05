package com.afs.tdd;

public class MarsRover {
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String MOVE = "M";
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

    public void report(String command) {
        switch (direction) {
            case NORTH -> {
                switch (command) {
                    case MOVE -> y++;
                    case TURN_LEFT -> direction = WEST;
                    case TURN_RIGHT -> direction = EAST;
                }
            }
            case EAST -> {
                switch (command) {
                    case MOVE -> x++;
                    case TURN_LEFT -> direction = NORTH;
                    case TURN_RIGHT -> direction = SOUTH;
                }
            }
            case SOUTH -> {
                switch (command) {
                    case MOVE -> y--;
                    case TURN_LEFT -> direction = EAST;
                    case TURN_RIGHT -> direction = WEST;
                }
            }
            case WEST -> {
                switch (command) {
                    case MOVE -> x--;
                    case TURN_LEFT -> direction = SOUTH;
                    case TURN_RIGHT -> direction = NORTH;
                }
            }
        }
    }
}
