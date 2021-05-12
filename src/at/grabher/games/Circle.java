package at.grabher.games;

import org.newdawn.slick.Graphics;

public class Circle  implements Form {
    //instance
    private float x,y,t;
    private float diameter = 50.0f;
    private float speed;

    public Circle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.t = this.y;
        this.diameter = diameter;
        this.speed = speed;

    }

//    public Circle() {
//    }


    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, this.diameter, this.diameter);
    }

    @Override
    public void update(int delta) {

        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        this.diameter += (float) delta / this.speed;
        if (x > 800 || y > 600) {
            this.x = 0;
            this.y = this.t;
            this.diameter = 0;
        }
    }

    public float getDiameter() {
        return diameter;
    }

    public void setT(float t) {
        this.t = t;
    }
}
