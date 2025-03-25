package edu.kis.powp.legacy.drawer;

import edu.kis.legacy.drawer.panel.DefaultDrawerFrame;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.Factories.RectangleCommandFactory;
import edu.kis.powp.jobs2d.drivers.Factories.TriangleCommandFactory;

import java.util.Objects;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer {
	public enum TypeFactoredOfTest {RECTANGLE, TRIANGLE};
	/**
	 * Drawer test.
	 */
	public static void main(String[] args) {
		DrawPanelController controller = new DrawPanelController();
		DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(-100, -60);
		line.setEndCoordinates(60, 130);
		controller.drawLine(line);
	}

	public static void factoredDraw(Job2dDriver driver, TypeFactoredOfTest type) {
		ComplexCommand command;
        if (Objects.requireNonNull(type) == TypeFactoredOfTest.TRIANGLE) {
            command = new TriangleCommandFactory().createCommand();
        } else {
            command = new RectangleCommandFactory().createCommand();
        }
		System.out.println(command);
		command.execute(driver);
	}
}
