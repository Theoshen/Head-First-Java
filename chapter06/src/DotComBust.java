import java.util.ArrayList;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName DotComBust.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年10月16日 11:38:00
 */
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame() {
        DotCom first = new DotCom();
        DotCom second = new DotCom();
        DotCom third = new DotCom();
        first.setName("alibaba.com");
        second.setName("qq.com");
        third.setName("baidu.com");
        dotComArrayList.add(first);
        dotComArrayList.add(second);
        dotComArrayList.add(third);

        System.out.println("你的目标是击中三个目标网站");
        System.out.println("alibaba.com，qq.com，baidu.com");
        System.out.println("请尝试用最少的次数击中他们");

        for (DotCom dotComTest : dotComArrayList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComTest.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComArrayList.isEmpty()) {
            String userInput = helper.getUserInput("请输入数字：");
            checkUserGuess(userInput);
        }
        finshGame();
    }


    private void checkUserGuess(String userInput) {
        numOfGuess++;
        String result = "miss";
        for (DotCom dotComToTest : dotComArrayList) {
            result = dotComToTest.checkYourself(userInput);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finshGame() {
        System.out.println("所有网站都被你击中");
        if (numOfGuess <= 18) {
            System.out.println("你尝试了" + numOfGuess + "次就完成任务");
        } else {
            System.out.println("你尝试了" + numOfGuess + "次才完成");
        }
    }

    public static void main(String[] args) {
        DotComBust dotComBust = new DotComBust();
        dotComBust.setUpGame();
        dotComBust.startPlaying();
    }


}
