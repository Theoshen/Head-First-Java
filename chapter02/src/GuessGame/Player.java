package GuessGame;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName Player.java
 * @email theoshen@foxmail.com
 * @Description <Head First Java> code 第二部分 对象 -- 猜数字游戏
 * @createTime 2020年09月28日 17:00:00
 */
public class Player {
    int number = 0;
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
        System.out.println("我猜 " + number);
    }
}
