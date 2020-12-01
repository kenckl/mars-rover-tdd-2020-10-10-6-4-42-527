package com.afs.tdd;

public class CommandReceiver {
    private static final String MOVE_FORWARD = "M";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";
    private MoveCommand moveCommand;
    private TurnLeftCommand turnLeftCommand;
    private TurnRightCommand turnRightCommand;

    public CommandReceiver(MarsRover marsRover){
        this.moveCommand = new MoveCommand(marsRover);
        this.turnLeftCommand = new TurnLeftCommand(marsRover);
        this.turnRightCommand = new TurnRightCommand(marsRover);
    }

    public void executeCommands(String commands){
        String[] inputCommands = commands.split("");

        for (String inputCommand : inputCommands){
            switch (inputCommand){
                case MOVE_FORWARD:
                    this.moveCommand.execute();
                    break;
                case TURN_LEFT:
                    this.turnLeftCommand.execute();
                    break;
                case TURN_RIGHT:
                    this.turnRightCommand.execute();
                    break;
            }
        }
    }
}
