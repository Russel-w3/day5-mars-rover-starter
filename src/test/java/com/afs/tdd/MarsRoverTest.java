package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    public void should_report_01N_when_input_00N_with_M() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "M";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(direction, marsRover.getDirection());
    }

    @Test
    public void should_report_00W_when_input_00N_with_L() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "L";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_report_00E_when_input_00N_with_R() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "R";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_report_10E_when_input_00E_with_M() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "M";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(direction, marsRover.getDirection());
    }

    @Test
    public void should_report_00N_when_input_00E_with_L() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "L";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_report_00S_when_input_00E_with_R() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "R";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_report_10S_when_input_11S_with_M() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "M";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(direction, marsRover.getDirection());
    }

    @Test
    public void should_report_11E_when_input_11S_with_L() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "L";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_report_11W_when_input_11S_with_R() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "R";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_report_01W_when_input_11W_with_M() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "M";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(direction, marsRover.getDirection());
    }

    @Test
    public void should_report_11S_when_input_11W_with_L() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "L";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_report_11N_when_input_11W_with_R() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "R";
        MarsRover marsRover = new MarsRover(x, y, direction);
        //When
        marsRover.report(command);
        //Then
        assertEquals(1, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }
}
