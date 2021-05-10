package at.grabher.games;

import net.java.games.input.DirectInputEnvironmentPlugin;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    //instance
    private float x;
    private float y;
    private float speed;

    private DIRECTION direction = DIRECTION.RIGHT;
    private enum DIRECTION{
        RIGHT,
        DOWN,
        UP,
        LEFT
    }


    public Rectangle(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed = 40.0f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {


        switch (direction) {
            case RIGHT:
                this.x++;
                if (this.x > 600) {
                    direction = DIRECTION.DOWN;
                }
                break;
            case DOWN:
                this.y++;
                if (this.y > 400) {
                    direction = DIRECTION.LEFT;
                }
                break;
            case LEFT:
                this.x--;
                if (x<10) {
                    this.direction = DIRECTION.UP;
                }
                break;
            case UP:
                this.y--;
                if (this.y<10) {
                    this.direction = DIRECTION.RIGHT;
                }
                break;

            default:
                System.out.println("direction unknown");
                break;
        }
    }
//            if (x < 400 && y >= 400) {
//                this.x += (float) delta / this.speed;
//            }
//            if (x > 400 && y > 100) {
//                this.y -= (float) delta / this.speed;
//            }
//            if (y <= 100 && x > 100) {
//                this.x -= (float) delta / this.speed;
//            }
//            if (x < 100 && y < 400) {
//                this.y += (float) delta / this.speed;
//            }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawString("Hello World!", 50, 50);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
