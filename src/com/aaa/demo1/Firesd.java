package com.aaa.demo1;
import java.util.Scanner;

public class Firesd {
    public static void main(String[] args) {
        int[] ar = {5,6,4,2,3};
        int min = ar[0];
        int x = 0;
        for(int i=0;i<ar.length;i++) {
            if (ar[i] <= min) {
                min = ar[i];
                x = i;

            }

        }
        System.out.println(x+"\t"+min);



    }
}
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入三位数:");
//        int num = scan.nextInt();
//        int ge=num%10;
//        int shi =num%100/10;
//        int bai=num/100;
//        System.out.println("个位数为："+ge);
//        System.out.println("十位数为："+shi);
//        System.out.println("百位数为："+bai);

//        int m = 3;
//        int n = 5;
//        int t = 0;
//       t=m;
//       m=n;
//       n=t;
//       System.out.println("此时m="+m);
//       System.out.println("此时n="+n);

//        char x = 'x';
//        int i = 10;
//        System.out.println(true? x : i);
//        System.out.println(true? 'x' : 10);
//        int a = 8, b = 3;
//        System.out.println(a>>>b);
//        System.out.println(a>>>b | 2);

//package com.aaa.demo1;
//
//import java.util.Scanner;
//
//public class leran {
//    public static  void main(String[] args){
//        double[] sorce = new  double[10];
//        Scanner scan = new Scanner(System.in);
//        for(int i=0;i<sorce.length;i++) {
//            System.out.print("请输入第" + (i + 1) + "个数字：");
//            sorce[i]=scan.nextDouble();
//        }
//        getsum(sorce);
//
//    }
//    public static void getsum(double[] sorce) {
//        double num = 0;
//        int t = 0;
//        for(int i=0;i<sorce.length;i++) {
//           num += sorce[i];
//           t ++;
//        }
//
//        System.out.println(num);
//    }
//}
////------------------------
////    public static String b(){
////        return "我";
////
////    }//void 没有返回值 必须要用~基本数据类型
////    public static void c(int a){
////        System.out.println(a);
////    }
////    public static void d(int a,String b){
////        System.out.println(a+"+++++++"+b);
////    }
////-----------------------------
////    public static void  b(int a){
////        int num=0;
////        for(int s=0;s<=a;s++)
////        {
////            num +=s;
////        }
////        System.out.println("num = " + num);
////    }
////    public static void main(String[] args) {
////        b(100);
////    }
////}
////------------------------------------
////public class leran {
////    public static void a(int s){
////        for(int jl=10;jl>=0;jl--) {
////            if (jl<=s)
////                System.out.println("发射炮弹");
////        }
////    }
////    public static void main(String[] args) {
////        int s=4;
////        a(s);
////    }
////}

