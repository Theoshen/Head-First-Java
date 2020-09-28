package BeerSong;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName BeerSong.java
 * @email theoshen@foxmail.com
 * @Description <Head First Java> code 第一部分 语句、循环、条件分支  -- 从99数到0
 * @createTime 2020年09月28日 16:18:00
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; // 单数的瓶子
            }
            System.out.println(beerNum + "" + word + "of beer on the wall");
            System.out.println(beerNum + "" + word + "of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around");
            beerNum -= 1;

            if (beerNum > 0) {
                System.out.println(beerNum + "" + word + "of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }
        }

    }
}
