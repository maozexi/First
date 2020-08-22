package com.breakpoint;

import java.util.Scanner;

public class breakpoint1 {

    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数: ");
        int x = sc.nextInt();

        System.out.println("请输入第二个数: ");
        int y = sc.nextInt();

        int add = sum(x,y);

        System.out.println("sum: "+add);

    }
}
