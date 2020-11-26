package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M() {
        MarsRover marsRover = new MarsRover(0,0,"N"); //given

        marsRover.executeCommands("M"); //when
        
        assertEquals(marsRover.getLocationX(), 0);
        assertEquals(marsRover.getLocationY(), 1);
        assertEquals(marsRover.getDirection(), "N");

    }
}
