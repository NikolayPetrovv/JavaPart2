package Lesson1;

public class Competitions {

    public static void main(String[] args) {

        Actions[] sportsmens = new Actions[6];
        sportsmens[0] = new Cat("1");
        sportsmens[1] = new Cat("2");
        sportsmens[2] = new Human("1");
        sportsmens[3] = new Human("2");
        sportsmens[4] = new Robot("1");
        sportsmens[5] = new Robot("2");

        Barrier[] barriers = new Barrier[4];
        barriers[0] = new Track();
        barriers[1] = new Track();
        barriers[2] = new Wall();
        barriers[3] = new Wall();

        for (int i = 0; i < sportsmens.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (!sportsmens[i].isDone()) break;
                    barriers[j].go(sportsmens[i]);
            }
        }
    }
}

