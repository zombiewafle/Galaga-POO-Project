package projectiles;

import java.awt.*;
import javax.swing.*;

public class Bullet {
    Color col;
    private int x;
    private int height;
    private int width;
    private int y;

    Bullet(){
        int width = 10;
        int height = 10;

        int x= 0;
        int y = 0;

        String attribute = "bullet";
        col = Color.WHITE;
    }

    public void update(){
        y -= 10;
    }

    public void makeColor(){
        col = Color.RED;
    }

    public void draw(Graphics g, Component c){
        g.setColor(col);
        g.fillOval(x,y, width, height);
    }

}
