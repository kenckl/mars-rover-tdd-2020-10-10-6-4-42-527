package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void should_return_0_1_N_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        marsRover.executeCommands("M");

        //then
        assertEquals(marsRover.getLocationX(), 0);
        assertEquals(marsRover.getLocationY(), 1);
        assertEquals(marsRover.getDirection(), "N");
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_N_and_L(){

        //given
        MarsRover marsRover = new MarsRover(0,0,"N");

        //when
        marsRover.executeCommands("L");

        //then
        assertEquals(marsRover.getLocationX(), 0);
        assertEquals(marsRover.getLocationY(), 0);
        assertEquals(marsRover.getDirection(), "W");

    }
}
