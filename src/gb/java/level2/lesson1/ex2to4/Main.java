package gb.java.level2.lesson1.ex2to4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player(250, 50));
        players.add(new Player(100, 25));
        players.add(new Player(200, 75));
        players.add(new Player(150, 100));
        players.add(new Player(55, 150));

        Set<BaseObstacle> obstacles = new HashSet<>();
        obstacles.add(new RunBand(55));
        obstacles.add(new Wall(15));
        obstacles.add(new RunBand(55));
        obstacles.add(new Wall(15));
        obstacles.add(new RunBand(55));
        obstacles.add(new Wall(15));

        boolean haveResourceRun = true;
        boolean haveResourceJump = true;
        int i = 0;
        for (Player player : players) {
            System.out.println("Player " + i);
            for (BaseObstacle obstacle : obstacles) {
                haveResourceRun = obstacle.run(player);
                haveResourceJump = obstacle.jump(player);
                if (!haveResourceRun || !haveResourceJump) {
                    break;
                }
            }
            System.out.println("Player " + i + " passed " + player.getObstacleCount() + " obstacles");
            i++;
        }
    }
}
