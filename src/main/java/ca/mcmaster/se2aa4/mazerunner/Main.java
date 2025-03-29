package ca.mcmaster.se2aa4.mazerunner;

import ca.mcmaster.se2aa4.mazerunner.commands.SolveMazeCommand;
import ca.mcmaster.se2aa4.mazerunner.factory.SolverFactory;

public class Main {
    public static void main(String[] args) {
        Maze maze = new Maze("examples/small.maz.txt");
        MazeSolver solver = SolverFactory.createSolver("RightHand");
        SolveMazeCommand command = new SolveMazeCommand(solver, maze);
        
        command.execute();
        System.out.println("Solution Path Length: " + command.getResult().getLength());
    }
}
