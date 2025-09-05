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
        if(direction.equals("N")){
            if(command.equals("M")){
                y++;
            }
            else if(command.equals("L")){
                direction = "W";
            }
            else if(command.equals("R")){
                direction = "E";
            }
        }
        else if(direction.equals("E")){
            if(command.equals("M")){
                x++;
            }
            else if(command.equals("L")){
                direction = "N";
            }
        }
    }
}
