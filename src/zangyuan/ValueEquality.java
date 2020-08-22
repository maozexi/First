package zangyuan;

import java.util.Scanner;

public class ValueEquality {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("请输入第一个数据:");
            int c = sc.nextInt();

            System.out.println("请输入第二个数据:");
            int d = sc.nextInt();

            boolean value = compare(c,d);
            System.out.println(value);


    }

    public static boolean compare(int a, int b){
        if (a==b){
            return true;
        }else {
            return false;
        }
    }
}
