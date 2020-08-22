package zangyuan;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
//        for (int x=0;x<10;x++){
//            int number = r.nextInt(100);
//            System.out.println("number:"+ number);
//        }
        int number = r.nextInt(100) + 1 ;
        System.out.println("number:"+ number);
    }
}
