package gb.java.level2.lesson1.ex1;

public class Cat extends BaseEntity{
    @Override
    void run() {
        System.out.println("Cat is running!");
    }

    @Override
    void jump() {
        System.out.println("Cat is jumping!");
    }
}
