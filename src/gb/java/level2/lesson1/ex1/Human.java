package gb.java.level2.lesson1.ex1;

public class Human extends BaseEntity{
    @Override
    void run() {
        System.out.println("Human is running!");
    }

    @Override
    void jump() {
        System.out.println("Human is jumping!");
    }
}
