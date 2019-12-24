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

}
