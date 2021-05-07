package at.grabher.games;

import net.java.games.input.DirectInputEnvironmentPlugin;
import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    //instance
    private float x;
    private float y;
    private float speed;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 400;
        this.speed = 5.0f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {



            if (x < 400 && y >= 400) {
                this.x += (float) delta / this.speed;
            }

            if (x > 400 && y > 100) {
                this.y -= (float) delta / this.speed;
            }

            if (y <= 100 && x > 100) {
                this.x -= (float) delta / this.speed;
            }

            if (x < 100 && y < 400) {
                this.y += (float) delta / this.speed;
            }






















    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x,this.y,100,100);
        graphics.drawString("Hello World!",50,50);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("Rectangle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
