package gb.java.level2.lesson1.ex2to4;

public class Player {
    private int distanceResource;
    private int jumpHeightResource;
    private int obstacleCount;

    public Player(int distanceResource, int jumpHeightResource) {
        this.distanceResource = distanceResource;
        this.jumpHeightResource = jumpHeightResource;
    }

    public int getDistanceResource() {
        return distanceResource;
    }

    public void setDistanceResource(int distanceResource) {
        this.distanceResource = distanceResource;
    }

    public int getJumpHeightResource() {
        return jumpHeightResource;
    }

    public void setJumpHeightResource(int jumpHeightResource) {
        this.jumpHeightResource = jumpHeightResource;
    }

    public int getObstacleCount() {
        return obstacleCount;
    }

    public void setObstacleCount(int obstacleCount) {
        this.obstacleCount = obstacleCount;
    }
}
