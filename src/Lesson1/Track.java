package Lesson1;

import java.util.Random;

public class Track extends Barrier{

    private int length;

    public Track() {
        Random random = new Random();
        this.length = random.nextInt(9);
    }

    public int getLength() {
        return length;
    }

    public void go(Actions runner) {
        runner.startAction(this);
    }
}
