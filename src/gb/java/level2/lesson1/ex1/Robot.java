package gb.java.level2.lesson1.ex1;

public class Robot extends BaseEntity{
    @Override
    void run() {
        System.out.println("Robot is running!");
    }

    @Override
    void jump() {
        System.out.println("Robot is jumping");
    }
}
