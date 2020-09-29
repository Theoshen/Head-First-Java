package SimpleDotCom;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName Game.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年09月29日 16:29:00
 */
public class Game {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper gameHelper = new GameHelper();

        SimpleDotCom dotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = gameHelper.getUserInput("请输入数字：");
            String result = dotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("你猜了"+ numOfGuess + "次");
            }
        }
    }
}
