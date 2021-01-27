package chap07;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName chap07.TestBoat.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2021年01月27日 15:37:00
 */
public class TestBoat {

    public TestBoat() {
    }

    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }

//    class chap07.Boat {
//        private int length;
//        public void setLength(int len) {
//            length = len;
//        }
//        public int getLength() {
//            return length;
//        }
//        public void move() {
//            System.out.print("drift ");
//        }
//    }
//
//    class chap07.Rowboat extends chap07.Boat {
//        public void rowTheBoat() {
//            System.out.print("stroke natasha");
//        }
//    }
//    class chap07.Sailboat extends chap07.Boat {
//        public void move() {
//            System.out.print("hoist sail ");
//        }
//    }
}
