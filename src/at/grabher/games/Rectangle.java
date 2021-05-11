package at.grabher.games;

import jdk.dynalink.Operation;
import org.newdawn.slick.Graphics;

public class Rectangle implements Form {
    //instance
    private float x,y;
    private float speed;
    //public enum Direction {LEFT, RIFHT}
    private ObjectGames.Direction direction;

    public Rectangle(float x, float y, float speed, ObjectGames.Direction direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 40,40);
    }

    @Override
    public void update(int delta) {
        if (direction.equals(ObjectGames.Direction.LEFT)) {
            this.x -= (float) delta / this.speed;
        } else if (direction.equals(ObjectGames.Direction.RIGHT)) {
            this.x += (float) delta / this.speed;
        }
        if (this.x > 800) {
            this.x = 0;
        }
    }

}
