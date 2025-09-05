package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_report_01N_when_input_00N_with_M(){
        //Given
        int x = 0,y = 0;
        String direction = "N",command = "M";
        MarRover marRover = new MarRover(x, y, direction);
        //When
        marRover.report(command);
        //Then
        assertEquals(0,marRover.getX());
        assertEquals(1,marRover.getY());
        assertEquals(direction,marRover.getDirection());
    }
    
}
