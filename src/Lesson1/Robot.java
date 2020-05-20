package Lesson1;

import java.util.Random;

public class Robot implements Jump, Run{

    private String name;
    private int runLimit;
    private int jumpLimit;
    private boolean done = true;

    public Robot(String name) {
        Random random = new Random();
        this.name = name;
        runLimit = random.nextInt(11);
        jumpLimit = random.nextInt(11);
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public void startAction(Wall wall) {
        System.out.println("Робот " + name + " прыгает!");
        if (jumpLimit >= wall.getHeight()) {
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " не смог перепрыгнуть");
            done = false;
        }
    }

    @Override
    public void startAction(Track track) {
        System.out.println("Робот " + name + " побежал!");
        if (runLimit >= track.getLength()) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " не смог пробежать");
            done = false;
        }
    }
}
