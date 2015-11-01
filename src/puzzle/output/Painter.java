package puzzle.output;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by User on 29.10.2015.
 */
public class Painter extends JPanel {
    private List fields = null;
    private int frameWidth = 0;
    private int frameHeight = 0;

    Painter(List fields, int frameWidth, int frameHeight) {
        this.fields = fields;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color (0, 127, 255));
        g.fillRect(0, 0, getWidth(), getHeight());
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawAllTiles(g2d);
    }

    private void drawAllTiles(Graphics2D g2d){
        int tilesInLine = (int) Math.sqrt(fields.size());

        int startVer = (int) frameHeight/tilesInLine/10;
        int startHor = (int) frameWidth/tilesInLine/10;

        int distanceVer = (int) startVer/2;
        int distanceHor = (int) startHor/2;

        int tileHeigth = (int) ((frameHeight - startVer * 4  - distanceVer * (tilesInLine - 1))/tilesInLine * 0.95);
        int tileWidth = (int) ((frameWidth - startHor * 4 - distanceHor * (tilesInLine - 1))/tilesInLine);

        int k = 0;
        for (int i = 0; i < tilesInLine; i++) {
            int curStartHor = (int) frameWidth/tilesInLine/10;
            for (int j = 0; j < tilesInLine; j++) {
                int value = (int) fields.get(k);
                drawTile(curStartHor, startVer, tileWidth, tileHeigth, value, g2d);
                curStartHor += tileWidth + distanceHor;
                k++;
            }
            startVer += tileHeigth + distanceVer;
        }

    }

    private void drawTile(int x, int y, int hor, int ver, int value, Graphics2D g2d) {
        g2d.setColor(new Color(128, 0, 0));
        g2d.drawRoundRect(x, y, hor, ver, (int) hor / 4, (int) ver / 4);
        Integer intValue = value;
        String strValue = intValue.toString();
        g2d.drawChars(strValue.toCharArray(), 0, strValue.length(), (x + hor / 2), (y + ver / 2)); //TODO Needs to make it beautiful
    }
}