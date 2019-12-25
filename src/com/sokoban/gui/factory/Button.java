package com.sokoban.gui.factory;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Button extends Component{

    private StyledBtn button;

    public Button(String title, Point pos, int width, int height){
        super(pos, width, height);
        button = new StyledBtn(title);
    }

    public JButton getButton(){
        return button;
    }

    private class StyledBtn extends JButton {

        public StyledBtn(String title){
            setText(title);
            setBounds(Button.this.getX(), Button.this.getY(), Button.this.getWidth(), Button.this.getHeight());

            setBackground(new Color(153,204,255));
            setFont(new Font("Times New Roman", Font.BOLD, 18));
            addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseEntered(java.awt.event.MouseEvent evt){
                    setBackground(new Color(255,204,229));
                }
                public void mouseExited(java.awt.event.MouseEvent evt){
                    setBackground(new Color(153,204,255));
                }
            });
        }

        protected void paintComponent(Graphics g){
            if (getModel().isArmed()) {
                // You might want to make the highlight color
                // a property of the RoundButton class.
                g.setColor(new Color(255,204,229));
            } else {
                g.setColor(getBackground());
            }
            g.fillOval(0, 0, getSize().width-1, getSize().height-1);

            // This call will paint the label and the focus rectangle.
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());

            //  g.drawOval(0, 0, getSize().width-1, getSize().height-1);
        }

        Shape shape;
        public boolean contains(int x, int y) {
            // If the button has changed size, make a new shape object.
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
            }
            return shape.contains(x, y);
        }

    }


}
