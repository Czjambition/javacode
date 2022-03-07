package com.aaa.demo1;
import java.sql.SQLOutput;
import java.util.Scanner;

public class October {
    public static void main(String[] args) {
        int cout = 2;
        int i = 0;
        String[][] arr = new String[50][4];
        arr[0][0] =  "张三";
        arr[0][1] = "zhangsan";
        arr[0][2] = "男";
        arr[0][3] = "18";
        System.out.printf("编号\t\t\t");
        System.out.printf("%-15s","姓名");
        System.out.printf("%-15s","密码");
        System.out.printf("%-15s","性别");
        System.out.printf("%-15s","年龄");
        System.out.println();
        for(i =0;i < cout;i++){
            System.out.print(i+9+"\t\t\t\t");
            System.out.printf("%-15s",arr[i][0]);
            System.out.printf("%-17s",arr[i][1]);
            System.out.printf("%-15s",arr[i][2]);
            System.out.printf("%-15s",arr[i][3]);
            System.out.println();

    }
}
}
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个三位数字：");
//        int num = scan.nextInt();
//        //前面三行为输入语句
//        int bw,sw,gw;
//        bw = num/100;
//        sw = num%100/10;
//        gw = num%100%10;
//        if (bw>=10)
//        {
//            System.out.println("臭傻逼搞错了");
//        }
//        else
//            System.out.println("该数字的百位数是\n"+bw+"\n该数字的十位数是\n"+sw+"\n该数字的个位数是\n"+gw);
//
//    }

        //    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入一个三个数字用空格符隔开：");
//        int a1=scan.nextInt();
//        int a2=scan.nextInt();
//        int a3=scan.nextInt();
//        int max=a1>a2?a1:a2;
//        int m=max>a3?max:a3;
//        System.out.println("max="+m);
//    }

//----------------------------------------------------

//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("请输入鲁班7号的上个月的月销售额：");
//            int num1=scan.nextInt();
//            System.out.println("请输入鲁班7号的这个月的月销售额：");
//            int num2=scan.nextInt();
//            if ((num1>10000&&num2>10000)||(num1>=15000)&&num2>5000)
//                System.out.println("你将获得一个ipone11");
//            else
//                System.out.println("你将1");
//
//
//        }
//    }
//
//
