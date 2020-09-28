package Movie;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName MovieTestDrive.java
 * @email theoshen@foxmail.com
 * @Description <Head First Java> code 第二部分 对象 -- 第一个类
 * @createTime 2020年09月28日 17:07:00
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = " Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
}
