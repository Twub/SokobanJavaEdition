package com.sokoban.gui.game;

public abstract class Level {

    public static String[][] getEasyLevel(){
        String[][] easy = {
                {"W", "W", "W", "W", "W", "W", "W", "W", "W", "W"},
                {"W", " ", " ", " ", " ", " ", " ", "W", "F", "W"},
                {"W", "U", "B", " ", " ", " ", " ", " ", " ", "W"},
                {"W", "W","W", "W", "B", " ", " ", "W", " ", "W"},
                {"W", " ", " ", " ", " ", " ", " ", "D", " ", "W"},
                {"W","P", " ", " ", " "," ", " ", "D", " ","W"},
                {"W","W", "W", "W", "B"," ", " ", "W", " ","W"},
                {"W"," ", "B", " ", " "," ", " ", " ", " ","W"},
                {"W"," ", " ", "T", "B"," ", " ", "W", "F","W"},
                {"W","W", "W", "W", "W","W", "W", "W", "W","W"}
        };
        return easy;
    }
}
