package com.sokoban.gui.menu;

import com.sokoban.gui.factory.Button;
import com.sokoban.gui.factory.ComponentFactory;
import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {

    private static Header instance = null;
    private Button startButton = ComponentFactory.createButton("Start", new Point(10, 6), 100, 40);
    private Button stopButton = ComponentFactory.createButton("Stop", new Point(1280/2-100/2, 6), 100, 40);
    private Button settingsButton = ComponentFactory.createButton("Settings", new Point(190, 6), 100, 40);

    private Header(){
        setOpaque(false);
        setBackground(new Color(128,0,0));
        add(startButton.getButton());
        add(stopButton.getButton());
        add(settingsButton.getButton());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintUtility.drawRoundedCorners(g, 15, 15, getWidth(), getHeight(), getBackground(), getForeground());
    }

    public static Header getInstance(){
        if (instance == null){
            instance = new Header();
        }
        return instance;
    }
}
