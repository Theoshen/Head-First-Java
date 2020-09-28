package Dog;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName GoodDog.java
 * @email theoshen@foxmail.com
 * @Description TODO
 * @createTime 2020年09月28日 17:13:00
 */
 class GoodDog {
    private int size;
    public int getSize() { return size;}
    public void setSize(int s) {
        size = s;
    }
    void bark() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 60) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
