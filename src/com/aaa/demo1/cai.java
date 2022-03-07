//------------------------------------------------
package com.aaa.demo1;

        import java.util.Scanner;

public class cai {
   public static void main(String[] args) {

       char  user = '蔡';
       int  cipher = 5201314;
       Scanner scan = new Scanner(System.in);
       System.out.println("请输入用户名:");
       char yh = scan.next().charAt(0);
       System.out.println("请输入密码:");
       int mm = scan.nextInt();
       if(user==yh&&mm==cipher)
           System.out.println("登录成功！");
       else
           System.out.println("错误");

   }


   }
//        Scanner scan=new Scanner(System.in);
//        int[] a = new int[10];
//        for(int w=0;w<10;w++)
//        {
//            System.out.println("请输入第"+(w+1)+"个数字:");
//            int X=scan.nextInt();
//            a[w]=X;
//        }
//        int tmp = 0;
//        for (int i = a.length-1; i >= 0; i--)
//            for (int j = 0; j < i; j++) {
//                if (a[i] > a[j]) {
//                    tmp = a[j];
//                    a[j] = a[i];
//                    a[i] = tmp;
//
//                }
//
//            }
//        for(int i=0;i<a.length;i++)
//            System.out.println(a[i]);
//    }
//}




//
//        }
//
//    }

//
//        int[] a = {1,2,3,4,52215,11,1,613,5};
//        int max =a[0];
//        int min =a[0];
//        int i;
//        int w=0,y=0;
//        for(i=0;i<a.length;i++)
//        {
//            if(a[i]>=max){
//                max=a[i];
//                w=i+1;
//            }
//            if(a[i]<=min)
//            {
//                min=a[i];
//            }
//            if(a[i]==min)
//            {
//                System.out.println("最小数为："+min+"\n"+"他是数组的第"+(i+1)+"个数字！");
//            }
//        }
//        System.out.println("最大数为："+max+"\n"+"他是数组的第"+w+"个数字！");
//
//

//        int[] arrA = new int[5];
//        double[] arrB = new double[5];
//       String[] arrC = new String[5];
//        System.out.println(arrA[0]);//0
//        System.out.println(arrA[1]);//0
//        System.out.println(arrB[0]);//false
//        System.out.println(arrC[0]);//null


//        int num=0;
//        int i = 0;
//        for(int a=1;a<=5;a++)
//        {
//            Scanner scan=new Scanner(System.in);
//            System.out.println("请输入第"+a+"个数字：");
//            int b=scan.nextInt();
//            num=b+num;
//            System.out.println(num);
//            i++;
//            System.out.println(i);
//        }
//        int w=num/i;
//        System.out.println(w);
//
//    }
//}
//-----------------------------------------------