package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;
import edu.kis.powp.legacy.drawer.TestDrawer;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Factored triangle draw":
				TestDrawer.factoredDraw(driverManager.getCurrentDriver(), TestDrawer.TypeFactoredOfTest.TRIANGLE);
				break;
			case "Factored rectangle draw":
				TestDrawer.factoredDraw(driverManager.getCurrentDriver(), TestDrawer.TypeFactoredOfTest.RECTANGLE);
				break;
		}

	}


}
