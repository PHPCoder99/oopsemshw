package sem2.hw;

import java.util.ArrayList;

public class Main { // weishenme? yinweiwobuxihuarwo. woxiangshuijiao.
    public static void main(String[] args) {
        ArrayList<Object> contestants = new ArrayList<>();
        contestants.add(new Human(200, 1, "a"));
        contestants.add(new Cat(250, 2, "b"));
        contestants.add(new Robot(1000, 0, "c"));
        contestants.add(new Cat(400, 3, "d"));
        contestants.add(new Human(100, 3, "e"));

        ArrayList<Object> obstacles = new ArrayList<>();
        obstacles.add(new Wall(2));
        obstacles.add(new Racetrack(200));
        obstacles.add(new Wall(1));
        obstacles.add(new Racetrack(300));
        obstacles.add(new Racetrack(200));

        for (int i = 0; i < contestants.size(); i++) {
            for (int j = 0; j < obstacles.size(); j++) {
                if (obstacles.get(j) instanceof Racetrack){
                    if (contestants.get(i) instanceof Human human){
                        if (!human.run((Racetrack) obstacles.get(j))){
                            break;
                        }
                    } else if (contestants.get(i) instanceof Cat cat) {
                        if (!cat.run((Racetrack) obstacles.get(j))){
                            break;
                        }
                    } else if (contestants.get(i) instanceof Robot robot) {
                        if (!robot.run((Racetrack) obstacles.get(j))){
                            break;
                        }
                    }
                } else if (obstacles.get(j) instanceof Wall) {
                    if (contestants.get(i) instanceof Human human){
                        if (!human.jump((Wall) obstacles.get(j))){
                            break;
                        }
                    } else if (contestants.get(i) instanceof Cat cat) {
                        if (!cat.jump((Wall) obstacles.get(j))){
                            break;
                        }
                    } else if (contestants.get(i) instanceof Robot robot) {
                        if (!robot.jump((Wall) obstacles.get(j))){
                            break;
                        }
                    }
                }
            }
        }
    }
}
