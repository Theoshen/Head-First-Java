package chap08;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName Test.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2021年01月27日 15:44:00
 */
public class Test extends Clowns {

    public Test() {
    }

    public static void main(String[] args) {
        Nose[] noses = {new Acts(), new Clowns(), new Test()};

        for (int i = 0; i < 3; ++i) {
            System.out.println(noses[i].iMethod() + "" + noses[i].getClass());
        }
    }
}
