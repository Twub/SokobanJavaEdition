package com.sokoban.gui.game;

import com.sokoban.gui.factory.Box;
import com.sokoban.gui.factory.ComponentFactory;
import com.sokoban.gui.factory.Drawable;
import com.sokoban.utility.PaintUtility;

import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel{

    private Difficulty level;
    private GridBox[][] board;
    GridLayout layout;

    public Grid(Difficulty level){
        this.level = level;
        createBoard();
    }

    private void createBoard(){
        switch (level){
            case EASY:
                String[][] level = Level.getEasyLevel();
                layout = new GridLayout(10,10);
                setLayout(layout);
                board = new GridBox[10][10];
                for (int row=0; row < board.length; row++){
                    for (int col=0; col < board[row].length; col++){
                        switch (level[row][col].charAt(0)){
                            case 'W':
                                break;
                            case 'P':
                                break;
                            case 'B':
                                break;
                            case ' ':
                                break;
                            case 'F':
                                break;
                            case 'S':
                                break;
                            case 'U':
                                break;
                            case 'D':
                                break;
                            case 'T':
                                break;
                        }
                    }
                }
                break;
        }
    }

    /*
        TEST GRID
     */


    public void setup(){
        for (int row=0; row < board.length; row++){
            for (int col=0; col < board[row].length; col++){
                GridBox box = new GridBox(null);
                box.setBackground(Color.red);
                box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                board[row][col] = box;
                add(box);
            }
        }
    }

    private class GridBox extends JPanel{

        private Image img;

        public GridBox(Image img){
            this.img = img;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0,0, null);
        }
    }








}
