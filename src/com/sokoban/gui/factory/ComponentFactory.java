package com.sokoban.gui.factory;

import java.awt.*;

public abstract class ComponentFactory {

    public static Button createButton(String title, Point pos, int width, int height){
        Button button = new Button(title, pos, width, height);
        return button;
    }

    public static Box createBox(Point pos, int width, int height){
        Box box = new Box(pos, width, height);
        return box;
    }
}
