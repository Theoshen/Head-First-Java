package SimpleDotCom;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName SimpleDotComTest.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年09月29日 10:00:00
 */
public class SimpleDotComTest {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int[] locations = {2,3,4};
        simpleDotCom.setLocationCells(locations);
        String userGuess = "2";
        String result = simpleDotCom.checkYourself(userGuess);
    }
}
