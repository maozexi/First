package zangyuan;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();

        int number = r.nextInt(100) + 1;

        while (true) {
            //录入数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数：");
            int numberguess = sc.nextInt();
            //比较大小
            if (numberguess < number) {
                System.out.println("你猜的小了");
            } else if (numberguess > number) {
                System.out.println("你猜的大了");
            } else {
                System.out.println("恭喜，猜中了");break;
            }
        }

    }

}
