package com.sokoban.gui.game;

import com.sokoban.gui.factory.Box;
import com.sokoban.gui.factory.ComponentFactory;
import com.sokoban.utility.PaintUtility;

import java.awt.*;

public class Grid {

    private Difficulty level;
    private Box[][] board = new Box[10][10];

    public Grid(Difficulty level){
        this.level = level;
    }

    public Box[][] getGrid(){
        Point position = new Point(50,10);
        switch (level){
            case EASY:
                for (int row = 0; row < board.length; row++){
                    for (int col = 0; col < board[row].length; col++){
                        int w = 20;
                        int h = 20;

                        if (col == 0 && row != 0){
                            position.x += 21;
                            position.y = 10;
                        }
                        //TODO position logic need some work man.
                        board[row][col] = ComponentFactory.createBox(position, w, h);
                        position.y += 21;
                    }
                }
                return board;
        }
        return null;
    }



}
