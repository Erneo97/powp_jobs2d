package edu.kis.powp.jobs2d.drivers.command;

public abstract class AbstractDriverCommand implements DriverCommand {
    protected int x, y;

    public AbstractDriverCommand(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
