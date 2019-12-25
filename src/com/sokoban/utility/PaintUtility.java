package com.sokoban.utility;

import java.awt.*;

public abstract class PaintUtility {

    public enum PaintType{
        IMAGE,
    }

    public static void draw(PaintType type, Graphics g, Image img, Point pos){
        switch (type){
            case IMAGE:
                g.drawImage(img, pos.x, pos.y, null);
                break;
        }
    }

    public static void drawRoundedCorners(Graphics g, int width, int height, int pWidth, int pHeight, Color bgColor, Color frColor){
        Dimension arcs = new Dimension(width,height); //Border corners arcs {width,height}, change this to whatever you want
        int w = pWidth;
        int h = pHeight;
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setColor(bgColor);
        graphics.fillRoundRect(0, 0, w-1, h-1, arcs.width, arcs.height);//paint background
        graphics.setColor(frColor);
        graphics.drawRoundRect(0, 0, w-1, h-1, arcs.width, arcs.height);
    }

}
