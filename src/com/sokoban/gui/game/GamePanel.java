package com.sokoban.gui.game;

import com.sokoban.gui.factory.Button;
import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class GamePanel extends JPanel {

    private static GamePanel instance = null;

    private GamePanel(){
        setLayout(null);
        setOpaque(false);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintUtility.drawRoundedCorners(g, 40, 40, getWidth(), getHeight(), getBackground(), getForeground());
    }

    public static GamePanel getInstance(){
        if (instance == null){
            instance = new GamePanel();
        }
        return instance;
    }
}
