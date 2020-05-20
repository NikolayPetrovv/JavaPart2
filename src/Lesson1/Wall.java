package Lesson1;

import java.util.Random;

public class Wall extends Barrier{

    private int height;

    public Wall() {
        Random random = new Random();
        this.height = random.nextInt(9);
    }

    public int getHeight() {
        return height;
    }

    public void go(Actions jumper) {
        jumper.startAction(this);
    }
}
