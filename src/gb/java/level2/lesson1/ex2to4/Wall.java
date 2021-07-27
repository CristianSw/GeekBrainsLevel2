package gb.java.level2.lesson1.ex2to4;

public class Wall extends BaseObstacle {

    private int obstacleHeight;

    public Wall(int obstacleHeight) {
        this.obstacleHeight = obstacleHeight;
    }


    @Override
    public boolean run(Player player) {
        player.setDistanceResource(player.getDistanceResource());
        if (player.getDistanceResource() > 0) {
            return true;
        } else {
            System.out.println("Jump Failed");
            return false;
        }
    }

    @Override
    public boolean jump(Player player) {
        player.setJumpHeightResource(player.getJumpHeightResource() - getObstacleHeight());
        if (player.getJumpHeightResource() > 0) {
            player.setObstacleCount(player.getObstacleCount() + 1);
            System.out.println("Jump successful");
            return true;
        } else return false;
    }

    public int getObstacleHeight() {
        return obstacleHeight;
    }

    public void setObstacleHeight(int obstacleHeight) {
        this.obstacleHeight = obstacleHeight;
    }
}
