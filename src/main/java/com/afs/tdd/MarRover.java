package com.afs.tdd;

public class MarRover {
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    private int x;
    private int y;
    private String direction;

    public MarRover(int x, int y, String direction) {
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
                    case "M" -> y++;
                    case "L" -> direction = WEST;
                    case "R" -> direction = EAST;
                }
            }
            case EAST -> {
                switch (command) {
                    case "M" -> x++;
                    case "L" -> direction = NORTH;
                    case "R" -> direction = SOUTH;
                }
            }
            case SOUTH -> {
                switch (command) {
                    case "M" -> y--;
                    case "L" -> direction = EAST;
                    case "R" -> direction = WEST;
                }
            }
            case WEST -> {
                switch (command) {
                    case "M" -> x--;
                    case "L" -> direction = SOUTH;
                    case "R" -> direction = NORTH;
                }
            }
        }
    }
}
