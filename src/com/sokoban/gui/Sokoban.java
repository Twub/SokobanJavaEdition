package com.sokoban.gui;

import com.sokoban.gui.menu.Header;
import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sokoban extends JPanel implements ActionListener {

    private static Sokoban instance = null;
    private static Image backgroundImage = new ImageIcon("res/background.jpg").getImage();
    private Timer updater;
    private Header menu = Header.getInstance();

    private Sokoban(){
        setLayout(null);
        updater = new Timer(15, this);

        // HEADER SETUP
        menu.setBounds(1280/2-300/2, 0, 300, 40);
        add(menu);
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
