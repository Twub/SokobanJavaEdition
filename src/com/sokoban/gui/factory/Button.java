package com.sokoban.gui.factory;

import javax.swing.*;
import java.awt.*;

public class Button extends Component{

    private JButton button;

    public Button(String title, Point pos, int width, int height){
        super(pos, width, height);
        button = new JButton(title);
        button.setBounds(pos.x, pos.y, width, height);
    }

    public JButton getButton(){
        return button;
    }
}
