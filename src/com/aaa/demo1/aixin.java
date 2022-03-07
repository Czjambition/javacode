package com.aaa.demo1;
import java.util.Scanner;
public class aixin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ar = new int[5];
        int max = ar[0];
        int d = 0, x = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.print("请输入数组的第" + (i + 1) + "数字:");
            ar[i] = scanner.nextInt();
        }
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] <= min) {
                min = ar[i];
                x = i;
            }
            if (ar[i] >= max) {
                max = ar[i];
                d = i;
            }
        }
        if(x == 0&& d == ar.length-1)
        {
            ar[0] = max;//6 5 4 2 3
            ar[ar.length - 1] = min;//6 5 4 3 2
        }
        else if(x == 0 ) //0 1 3 5 4
        {
            ar[d] = ar[ar.length-1];
            ar[ar.length-1] = ar[0];//5 1 3 4 0
            ar[0] = max;//5 1 3 0 4
        }
        else if(d == ar.length-1) // 6 2 3 4 8
        {
            ar[d] = ar[0];//6 2 3 4 6
            ar[0] = max;//8 2 3 4 6
            ar[x] = ar[ar.length - 1];//
            ar[ar.length - 1] = min;//
        }

else {
            ar[d] = ar[0];//5 5 4 2 3
            ar[0] = max;//6 5 4 2 3
            ar[x] = ar[ar.length - 1];//6 5 4 2 2
            ar[ar.length - 1] = min;//6 5 4 3 2
        }
        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + "\t");
    }
}


//            int num =0;
//            int[] day = new int[]{31,28,31,30,31,30,31,31,30,31,30};
//            Scanner input=new Scanner(System.in);
//            System.out.println("请输入月：");
//            int yue=input.nextInt();
//            System.out.println("请输入日：");
//            int ri = input.nextInt();
//            for(int i=1;i<=12;i++) {
//                if (yue  == i)
//                    break;
//                else {
//                    num += day[i-1] ;
//                }
//            }
//
//            System.out.println(num+ri);
//            }
//        }

//*----------------------------------------------

//                Scanner input=new Scanner(System.in);
//                System.out.println("请输入身高：");
//                int tall=input.nextInt();
//                System.out.println("请输入财产：");
//                int wealth=input.nextInt();
//                System.out.println("请问是否帅气：");
//                boolean handsome=input.nextBoolean();
//
//                if(tall>=180 && wealth>=10000000 && handsome==true){
//                    System.out.print("我一定要嫁给他!");
//                }else if(tall>=180 || wealth>=10000000 || handsome==true ){
//                    System.out.print("嫁吧，比上不足比下有余");
//                }else
//                    System.out.print("不嫁！");
//                }
//            }
//------------------------------------------------
//
//        String cool = "帅" ;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("目前身高(cm):");
//        int sg = scan.nextInt();
//        System.out.println("今年身价(万):");
//        int sj = scan.nextInt();
//        System.out.println("自以为长得帅不帅");
//        String co = scan.next();
//        if (cool.equals(co)&&sg>=180&&sj>=1000)
//            System.out.println("我一定要嫁给他!!!");
//        else if(cool.equals(co)||sg>=180||sj>=1000)
//            System.out.println("嫁吧，比上不足，比下有余");
//        else
//            System.out.println("不嫁！");
//    }
//
//}
//------------------------------------------------
