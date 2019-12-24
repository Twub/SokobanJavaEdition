package com.sokoban.gui;

import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sokoban extends JPanel implements ActionListener {

    private static Sokoban instance = null;
    private static Image backgroundImage = new ImageIcon("res/background.jpg").getImage();
    private Timer updater;

    private Sokoban(){
        updater = new Timer(15, this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintUtility.draw(PaintUtility.PaintType.IMAGE, g, backgroundImage, new Point(0,0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(updater)){
            repaint();
            return;
        }
    }

    public static Sokoban getInstance(){
        if (instance == null){
            instance = new Sokoban();
        }
        return instance;
    }
}
