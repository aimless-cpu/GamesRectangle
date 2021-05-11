package at.grabher.games;

import org.newdawn.slick.Graphics;

public class Ellipse implements Form {
    //instance
    private float x,y;
    private float speed;
    private float width,height;

    //le constructeur
    public Ellipse(float x, float y, float speed, float width, float height) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.width, this.height);
    }

    @Override
    public void update(int delta) {
        this.x -= (float) delta / this.speed;
        if (this.x <= 0) {
            this.x = 800;
        }
    }


}
