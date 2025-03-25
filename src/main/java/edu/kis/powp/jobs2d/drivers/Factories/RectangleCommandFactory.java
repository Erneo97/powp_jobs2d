package edu.kis.powp.jobs2d.drivers.Factories;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class RectangleCommandFactory implements CommandFactory {
    @Override
    public ComplexCommand createCommand() {
        ComplexCommand commands = new ComplexCommand(0,0 );

        commands.addComand(new OperateToCommand(0, 100));
        commands.addComand(new SetPositionCommand(0, 100));

        commands.addComand(new OperateToCommand(100, 100));
        commands.addComand(new SetPositionCommand(100, 100));

        commands.addComand(new OperateToCommand(100, 0));
        commands.addComand(new SetPositionCommand(100, 0));

        commands.addComand(new OperateToCommand(0, 0));

        return commands;
    }
}
