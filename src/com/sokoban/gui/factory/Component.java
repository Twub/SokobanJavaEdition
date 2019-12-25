package com.sokoban.gui.factory;

import java.awt.*;

public abstract class Component {

    private Point position;
    private int width;
    private int height;

    public Component(Point position, int width, int height){
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public int getX(){
        return position.x;
    }

    public int getY(){
        return position.y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}
