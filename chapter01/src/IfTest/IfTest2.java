package IfTest;

/**
 * @author chensihua
 * @version 1.0.0
 * @ClassName IfTest2.java
 * @email theoshen@foxmail.com
 * @Description <Head First Java> code 第一部分 语句、循环、条件分支 -- if语句2
 * @createTime 2020年09月28日 16:49:00
 */
public class IfTest2 {
    public static void main(String[] args) {
        int x = 2;
        if (x==3){
            System.out.println("x must be 3");
            System.out.println("x的值肯定为3");
        }else {
            System.out.println("x is not 3");
            System.out.println("x的值不为3");
        }
        System.out.println("This runs no matter what");
        System.out.println("没毛病");
    	}
}
