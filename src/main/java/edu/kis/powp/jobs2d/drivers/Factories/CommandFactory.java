package edu.kis.powp.jobs2d.drivers.Factories;

import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;

public interface CommandFactory {
    ComplexCommand createCommand();
}
