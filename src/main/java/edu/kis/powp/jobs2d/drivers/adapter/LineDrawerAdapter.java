package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;

/**
 * driver adapter to draw selected line
 */
public class LineDrawerAdapter extends Jobs2dMagicToDrawerAdapter {
    private final ILine line;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
        super(drawPanelController);
        this.line = line;
    }

    @Override
    public void operateTo(int x, int y) {
        this.line.setStartCoordinates(this.startX, this.startY);
        this.line.setEndCoordinates(x, y);
        setPosition(x, y);
        drawPanelController.drawLine(line);
    }


    @Override
    public String toString() {
        return "Selected Line" ;
    }
}
