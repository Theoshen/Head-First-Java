package Loopy;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName Loopy.java
 * @email theoshen@foxmail.com
 * @Description <Head First Java> code 第一部分 语句、循环、条件分支 --The example of while loop while循环范例
 * @createTime 2020年09月28日 16:43:00
 */
public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the Loop ；循环开始前");
        while (x<4){
            System.out.println("In the loop；在循环中");
            System.out.println("Value of x is:" + x);
            System.out.println("x的值是：" + x);
            x += 1;
        }
        System.out.println("This is after the loop；循环结束");
    }
}
