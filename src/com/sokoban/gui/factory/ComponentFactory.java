package com.sokoban.gui.factory;

import java.awt.*;

public class ComponentFactory {

    public static Button createButton(String title, Point pos, int width, int height){
        Button button = new Button(title, pos, width, height);
        return button;
    }
}
