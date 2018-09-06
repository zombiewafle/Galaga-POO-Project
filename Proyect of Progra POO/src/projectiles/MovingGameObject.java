package projectiles;

import java.awt.Color;

public abstract class MovingGameObject extends GameObject implements Moveable{
    int xVel;
    int yVel;

    public MovingGameObject(int xPosition, int yPosition, int i, int i1, Color color) {
        super(xPosition, yPosition, int xVelocity, int yVelocity, Color color);
        this.xVel =xVelocity;
        this.yVel =yVelocity;
    }

    public int getxVel() {
        return xVel;
    }

    public int getyVel() {
        return yVel;
    }

    public void setxVel(int xVel) {
        this.xVel = xVel;
    }

    public void setyVel(int yVel) {
        this.yVel = yVel;
    }
    @Override

    public void move(){
        this.xPos += xVel;
        this.yPos += yVel;
    }
}
