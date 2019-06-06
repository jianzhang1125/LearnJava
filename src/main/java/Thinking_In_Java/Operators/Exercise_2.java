package Thinking_In_Java.Operators;

/**
 * Exercise 2: (1) Create a class containing a float and use it to demonstrate aliasing.
 *
 * @author Jian Zhang
 * @version 1.0
 */

public class Exercise_2 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.capacity = 9.9f;
        tank2.capacity = 23.3f;
        System.out.println(String.format("tank1.capacity: %f, tank2.capacity: %f", tank1.capacity, tank2.capacity));
        tank1 = tank2;
        System.out.println(String.format("tank1.capacity: %f, tank2.capacity: %f", tank1.capacity, tank2.capacity));
        tank1.capacity = 2.23f;
        System.out.println(String.format("tank1.capacity: %f, tank2.capacity: %f", tank1.capacity, tank2.capacity));
    }
}

class Tank{
    float capacity;
}
