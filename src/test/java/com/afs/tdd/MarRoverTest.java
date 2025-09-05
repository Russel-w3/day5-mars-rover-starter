package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarRoverTest {
    @Test
    public void should_report_01N_when_input_00N_with_M() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "M";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals(direction, marRover.getDirection());
    }

    @Test
    public void should_report_00W_when_input_00N_with_L() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "L";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals("W", marRover.getDirection());
    }

    @Test
    public void should_report_00E_when_input_00N_with_R() {
        //Given
        int x = 0, y = 0;
        String direction = "N", command = "R";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals("E", marRover.getDirection());
    }

    @Test
    public void should_report_10E_when_input_00E_with_M() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "M";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals(direction, marRover.getDirection());
    }

    @Test
    public void should_report_00N_when_input_00E_with_L() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "L";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals("N", marRover.getDirection());
    }

    @Test
    public void should_report_00S_when_input_00E_with_R() {
        //Given
        int x = 0, y = 0;
        String direction = "E", command = "R";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals("S", marRover.getDirection());
    }

    @Test
    public void should_report_10S_when_input_11S_with_M() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "M";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(0, marRover.getY());
        assertEquals(direction, marRover.getDirection());
    }

    @Test
    public void should_report_11E_when_input_11S_with_L() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "L";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals("E", marRover.getDirection());
    }

    @Test
    public void should_report_11W_when_input_11S_with_R() {
        //Given
        int x = 1, y = 1;
        String direction = "S", command = "R";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals("W", marRover.getDirection());
    }

    @Test
    public void should_report_01W_when_input_11W_with_M() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "M";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals(direction, marRover.getDirection());
    }

    @Test
    public void should_report_11S_when_input_11W_with_L() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "L";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals("S", marRover.getDirection());
    }

    @Test
    public void should_report_11N_when_input_11W_with_R() {
        //Given
        int x = 1, y = 1;
        String direction = "W", command = "R";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(1, marRover.getX());
        assertEquals(1, marRover.getY());
        assertEquals("N", marRover.getDirection());
    }
}
