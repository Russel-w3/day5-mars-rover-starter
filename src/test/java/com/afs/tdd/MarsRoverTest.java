package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    public static final String NORTH = "N";
    public static final String MOVE_FORWARD = "M";
    public static final String MOVE_BACKWARD = "B";
    public static final String TURN_LEFT = "L";
    public static final String TURN_RIGHT = "R";
    public static final String WEST = "W";
    public static final String EAST = "E";
    public static final String SOUTH = "S";

    @Test
    public void should_report_01N_when_input_00N_with_M() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, NORTH);
        //When
        marsRover.reportLocation(MOVE_FORWARD);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_report_00W_when_input_00N_with_L() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, NORTH);
        //When
        marsRover.reportLocation(TURN_LEFT);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_report_00E_when_input_00N_with_R() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, NORTH);
        //When
        marsRover.reportLocation(TURN_RIGHT);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_report_10E_when_input_00E_with_M() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, EAST);
        //When
        marsRover.reportLocation(MOVE_FORWARD);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_report_00N_when_input_00E_with_L() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, EAST);
        //When
        marsRover.reportLocation(TURN_LEFT);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_report_00S_when_input_00E_with_R() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, EAST);
        //When
        marsRover.reportLocation(TURN_RIGHT);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_report_10S_when_input_11S_with_M() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, SOUTH);
        //When
        marsRover.reportLocation(MOVE_FORWARD);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_report_11E_when_input_11S_with_L() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, SOUTH);
        //When
        marsRover.reportLocation(TURN_LEFT);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_report_11W_when_input_11S_with_R() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, SOUTH);
        //When
        marsRover.reportLocation(TURN_RIGHT);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_report_01W_when_input_11W_with_M() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, WEST);
        //When
        marsRover.reportLocation(MOVE_FORWARD);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    public void should_report_11S_when_input_11W_with_L() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, WEST);
        //When
        marsRover.reportLocation(TURN_LEFT);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_report_11N_when_input_11W_with_R() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, WEST);
        //When
        marsRover.reportLocation(TURN_RIGHT);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_report_10N_when_input_11N_with_B() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, NORTH);
        //When
        marsRover.reportLocation(MOVE_BACKWARD);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    public void should_report_01N_when_input_11E_with_B() {
        //Given
        int x = 1, y = 1;
        MarsRover marsRover = new MarsRover(x, y, EAST);
        //When
        marsRover.reportLocation(MOVE_BACKWARD);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    public void should_report_01S_when_input_00S_with_B() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, SOUTH);
        //When
        marsRover.reportLocation(MOVE_BACKWARD);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    public void should_report_10W_when_input_00W_with_B() {
        //Given
        int x = 0, y = 0;
        MarsRover marsRover = new MarsRover(x, y, WEST);
        //When
        marsRover.reportLocation(MOVE_BACKWARD);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }


}
