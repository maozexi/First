package zangyuan;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int x = sc.nextInt();

        System.out.println("请输入第二个数：");
        int y = sc.nextInt();

        System.out.println("请输入第三个数：");
        int z = sc.nextInt();

        int value = max(x,y,z);

        System.out.println("最大值为:"+value);
    }

    public static int max(int a, int b, int c){
        if (a > b){
            if (a > c){
                return a;
            }else {
                return c;
            }
        }else {
            if (b > c){
                return b;
            }else {
                return c;
            }
        }
    }
}
