package gb.java.level2.lesson1.ex2to4;

public class RunBand extends BaseObstacle {

    private int obstacleDistance;

    public RunBand(int obstacleDistance) {
        this.obstacleDistance = obstacleDistance;
    }

    @Override
    public boolean run(Player player) {
        player.setDistanceResource(player.getDistanceResource() - getObstacleDistance());
        if (player.getDistanceResource() > 0) {
            player.setObstacleCount(player.getObstacleCount() + 1);
            System.out.println("Run successful");
            return true;
        } else {
            System.out.println("Run Failed");
            return false;
        }
    }

    @Override
    public boolean jump(Player player) {
        player.setJumpHeightResource(player.getJumpHeightResource());
        if (player.getJumpHeightResource() > 0) {
            return true;
        } else return false;
    }

    public int getObstacleDistance() {
        return obstacleDistance;
    }

    public void setObstacleDistance(int obstacleDistance) {
        this.obstacleDistance = obstacleDistance;
    }
}
