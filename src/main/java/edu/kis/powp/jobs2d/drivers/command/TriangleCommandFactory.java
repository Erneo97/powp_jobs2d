package edu.kis.powp.jobs2d.drivers.command;

public class TriangleCommandFactory implements CommandFactory {

    @Override
    public ComplexCommand createCommand() {
        ComplexCommand commands = new ComplexCommand(0,0 );

        commands.addComand(new OperateToCommand(0, 10));
        commands.addComand(new OperateToCommand(10, 10));

        commands.addComand(new SetPositionCommand(10, 10));
        commands.addComand(new OperateToCommand(0, 10));

        return null;
    }
}
