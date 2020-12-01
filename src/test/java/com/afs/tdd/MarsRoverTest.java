package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void should_return_0_1_N_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.processCommand("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_N_and_L() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.processCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_N_and_R() {

        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.processCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_0_minus1_S_when_executeCommands_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        //when
        marsRover.processCommand("M");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_E_when_executeCommands_given_0_0_S_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        //when
        marsRover.processCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());

    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_S_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");

        //when
        marsRover.processCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_1_0_E_when_executeCommands_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        //when
        marsRover.processCommand("M");

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_executeCommands_given_0_0_E_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        //when
        marsRover.processCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_executeCommands_given_0_0_E_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "E");

        //when
        marsRover.processCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_minus1_0_W_when_executeCommands_given_0_0_W_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //when
        marsRover.processCommand("M");

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("W", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_S_when_executeCommands_given_0_0_W_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //when
        marsRover.processCommand("L");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    public void should_return_0_0_N_when_executeCommands_given_0_0_W_and_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "W");

        //when
        marsRover.processCommand("R");

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_return_minus1_1_N_when_executeCommands_given_0_0_N_and_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        marsRover.processCommand("MLMR");

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals("N", marsRover.getDirection());
    }
}
