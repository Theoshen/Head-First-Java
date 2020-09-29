package SimpleDotCom;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName SimpleDotCom.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年09月29日 10:01:00
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String guessStr) {
        int guess = Integer.parseInt(guessStr);
        String result = "miss";
        for (int cell:locationCells){
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
