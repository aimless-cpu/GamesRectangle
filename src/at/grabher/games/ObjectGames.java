package at.grabher.games;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGames extends BasicGame {

    List<Form> formList;

    public ObjectGames(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.formList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i<10; i++) {
            Rectangle rectangle = new Rectangle(rand.nextInt(800),rand.nextInt(600), rand.nextInt(50));
            Circle circle = new Circle(rand.nextInt(800), rand.nextInt(600), 50, rand.nextInt(50));
            Ellipse ellipse = new Ellipse(rand.nextInt(800), rand.nextInt(600), rand.nextInt(70), rand.nextInt(40), rand.nextInt(50));
            formList.add(rectangle);
            formList.add(circle);
            formList.add(ellipse);
        }

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Form form : this.formList) {
            form.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Form form : this.formList ) {
            form.render(graphics);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGames("Rectangles and more"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
