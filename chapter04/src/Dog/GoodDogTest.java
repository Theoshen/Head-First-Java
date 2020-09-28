package Dog;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName GoodDogTest.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年09月28日 17:14:00
 */
public class GoodDogTest {
    public static void main(String[] args)
    {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark();
        two.bark();
    }
}
