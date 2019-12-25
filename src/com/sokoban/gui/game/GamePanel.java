package com.sokoban.gui.game;

import com.sokoban.gui.factory.Box;
import com.sokoban.gui.factory.Button;
import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class GamePanel extends JPanel {

    private static GamePanel instance = null;
    private Grid board = new Grid(Difficulty.EASY);
    private Box[][] level = board.getGrid();

    private GamePanel(){
        setLayout(null);
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintUtility.drawRoundedCorners(g, 40, 40, getWidth(), getHeight(), getBackground(), getForeground());
        for (int row = 0; row < level.length; row++){
            for (int col = 0; col < level[row].length; col++){
                g.setColor(Color.black);
                int x = level[row][col].getX();
                int y = level[row][col].getY();
                int w = level[row][col].getWidth();
                int h = level[row][col].getHeight();
                g.fillRect(x,y,w,h);
            }
        }
    }

    public static GamePanel getInstance(){
        if (instance == null){
            instance = new GamePanel();
        }
        return instance;
    }
}
