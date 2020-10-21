package DotCom;

import java.util.ArrayList;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName DotCom.DotCom.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年10月16日 11:31:00
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;
    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0 ){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            } else{
                result = "hit";
            }
        }
        return result;
    }


    public void setName(String string) {
        name = string;
    }

}
