package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int [] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int x=0;x<arr.length;x++){
            System.out.println("请输入第" +(x+1)+ "个评委的打分(0-100):" );
            int score = sc.nextInt();
            arr[x] = score;

        }

        int max = max(arr);
        int min = min(arr);
        int sum = sum(arr);

        int avg = (sum - max - min)/(arr.length-2);

        System.out.println("平均分为："+avg);

    }
    public static int max(int []arr){
        int max = arr[0];
        for (int x=0;x<arr.length;x++){
            if (max<arr[x]){
                max = arr[x];
            }
        }
        return max;
    }

    public static int min(int []arr){
        int min = arr[0];
        for (int x=0;x<arr[x];x++){
            if (min>arr[x]){
                min = arr[x];
            }
        }
        return min;
    }

    public static int sum(int []arr){
        int sum = 0;
        for (int x=0;x<arr.length;x++){
            sum +=arr[x];
        }
        return sum;
    }

}
