package at.grabher.games;

import org.lwjgl.Sys;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ObjectGames extends BasicGame {

    List<Form> formList;
    enum Direction {LEFT, RIGHT}
    Direction direction;



    public ObjectGames(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.formList = new ArrayList<>();
        Random rand = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1 LEFT, 2 RIGHT");

        int input = scanner.nextInt();

        switch (input) {
            case 1:
                direction = Direction.LEFT;
                break;
            case 2:
                direction = Direction.RIGHT;
                break;
            default:
                break;
        }
        //Circle circle = new Circle();

        for (int i = 0; i<10; i++) {
            Rectangle rectangle = new Rectangle(rand.nextInt(800),rand.nextInt(600), rand.nextInt(50), direction);
            Circle circle = new Circle(rand.nextInt(800), rand.nextInt(600), rand.nextInt(50));
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
