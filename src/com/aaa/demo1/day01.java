package com.aaa.demo1;

import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入：");
        int x = scan.nextInt();
        if(x==5)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
