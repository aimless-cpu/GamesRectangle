package at.grabher.games;

import org.newdawn.slick.Graphics;

public class Rectangle implements Form {
    //instance
    private float x,y;
    private float speed;
    private enum Direction {RIGHT, LEFT}

    public Rectangle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void setDirection() {
        System.out.println("1 RIGHT, 2 LEFT");

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 40,40);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        if (this.x > 800) {
            this.x = 0;
        }
    }
}
