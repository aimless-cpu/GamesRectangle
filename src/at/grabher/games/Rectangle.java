package at.grabher.games;

import org.newdawn.slick.Graphics;

public class Rectangle implements Form {
    //instance
    private float x,y;
    private float speed;

    public Rectangle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 40,40);
    }

    @Override
    public void update(int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
        }

    }
}
