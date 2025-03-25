package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;

public class ComplexCommand extends AbstractDriverCommand{
    private ArrayList<AbstractDriverCommand> comands;

    public ComplexCommand(int x, int y) {
        super(x, y);

    }

    public void addComand(AbstractDriverCommand cmd) {
        comands.add(cmd);
    }

    @Override
    public void execute(Job2dDriver driver) {
        for ( AbstractDriverCommand cmd : comands ) {
            cmd.execute(driver);
        }
    }
}
