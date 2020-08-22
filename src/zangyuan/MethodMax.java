package zangyuan;

import java.util.Scanner;

public class MethodMax {

    public static void main(String[] args) {
//      键盘录入
        Scanner sc = new Scanner(System.in);
//      接收数据
        System.out.println("请输入第一个数据");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据");
        int b = sc.nextInt();

        int max = getmax(a , b);

        System.out.println("max:"+ max);
    }

    public static int getmax(int a, int b){
        if (a > b){
            return a ;
        }else {
            return b ;
        }
    }


}
