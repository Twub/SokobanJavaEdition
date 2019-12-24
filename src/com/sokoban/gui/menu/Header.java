package com.sokoban.gui.menu;

import com.sokoban.gui.factory.Button;
import com.sokoban.gui.factory.ComponentFactory;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {

    private static Header instance = null;
    private Button startButton = ComponentFactory.createButton("Start", new Point(1280/2-100/2, 5), 100, 40);
    private static Image backgroundImage = new ImageIcon("res/headerBackground.jpg").getImage();

    private Header(){
        setOpaque(false);
        setBackground(new Color(128,0,0));
        add(startButton.getButton());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(15,15); //Border corners arcs {width,height}, change this to whatever you want
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        graphics.setColor(getBackground());
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);
    }

    public static Header getInstance(){
        if (instance == null){
            instance = new Header();
        }
        return instance;
    }
}
