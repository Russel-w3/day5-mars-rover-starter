package com.afs.tdd;

public class MarRover {
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
            case "N" -> {
                switch (command) {
                    case "M" -> y++;
                    case "L" -> direction = "W";
                    case "R" -> direction = "E";
                }
            }
            case "E" -> {
                switch (command) {
                    case "M" -> x++;
                    case "L" -> direction = "N";
                    case "R" -> direction = "S";
                }
            }
            case "S" -> {
                switch (command) {
                    case "M" -> y--;
                    case "L" -> direction = "E";
                    case "R" -> direction = "W";
                }
            }
            case "W" -> {
                switch (command) {
                    case "M" -> x--;
                    case "L" -> direction = "S";
                    case "R" -> direction = "N";
                }
            }
        }
    }
}
