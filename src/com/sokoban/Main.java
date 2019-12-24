package com.sokoban;

import com.sokoban.gui.Sokoban;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().createAndShowGUI();
            }
        });
    }

    private void createAndShowGUI(){
        JFrame window = new JFrame("Sokoban Java Edition");
        window.setSize(1280, 820);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Sokoban game = Sokoban.getInstance();
        window.getContentPane().add(game);

        window.setVisible(true);
    }
}
