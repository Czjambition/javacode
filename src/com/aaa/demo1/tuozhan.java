package com.aaa.demo1;

import java.util.Random;
import java.util.Scanner;

//　Java中Scanner类中的方法next()和nextLine()都是吸取输入台输入的字符，区别：
//
//　next()不会吸取字符前/后的空格/Tab键，只吸取字符，开始吸取字符（字符前后不算）直到遇到空格/Tab键/回车截止吸取；
//　nextLine()吸取字符前后的空格/Tab键，回车键截止。

public class tuozhan {
    static int cout = 1;  //增删改查最后的编号
    static  int bianhao =0; //删除的编号
    static String[][] arr = new String[50][4];
    static int userx  = 0; //会员登录的编号信息

    public static void main(String[] args) {
        System.out.println("------------欢迎进入购物管理系统------------\n");
        adm();

    }

    public static void adm() {

        System.out.println("1.管理员登录");
        System.out.println("2.会员登陆");
        System.out.println("3.退出\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("请选择登录界面：");
        int x = scan.nextInt();
        if (x == 1)
            admin();
        else if (x == 2)
            user();
        else if (x == 3)
            quit();
        else
            System.out.println("输入错误！！！！！！！！");
    }

    public static void admin() {//管理员
        Scanner scan = new Scanner(System.in);
        String yh = "admin";
        int mm = 520;
        for (int i = 0; i < 3; i++) {
            System.out.print("\n请输入管理员用户名：");
            String name = scan.next();
            System.out.print("请输入管理员密码：");
            int passwd = scan.nextInt();
            if (yh.equals(name) && passwd == mm) {
                System.out.println("\n登陆成功\n");
                a();
                break;
            } else if (i != 2) {
                System.out.println("输入错误，请重新输入!");
            }
            if (i == 2) {
                System.out.println("连接失败，请重新登陆");
            }
        }

    }

    public static void a() {//登录成功
        System.out.println("\n1.查询会员信息");
        System.out.println("2.增加会员信息");
        System.out.println("3.删除会员信息");
        System.out.println("4.修改会员信息");
        System.out.println("5.返回主菜单\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("请选择：");
        int x = scan.nextInt();
        if (x == 1)
            showVipInfos();//查询
        else if (x == 2)
            add();//增加
        else if (x == 3)
            del();//删除
        else if (x == 4)
            ins();//修改
        else if(x == 5)
            adm();
        else
            System.out.println("输入错误！！！！！！！！");
    }


    public static void showVipInfos() {//查询
        System.out.println("其中第一行管理员，不可进行修改！！！！！");
        int i = 0;
        arr[0][0] = "张三";
        arr[0][1] = "zhangsan";
        arr[0][2] = "男";
        arr[0][3] = "18";
        System.out.printf("编号\t\t\t");
        System.out.printf("%-15s", "姓名");
        System.out.printf("%-15s", "密码");
        System.out.printf("%-15s", "性别");
        System.out.printf("%-15s", "年龄");
        System.out.println();
        for (i = 0; i < cout; i++) {//cout = 3
            if (bianhao - 1 == i)//第二行  i = 1
            {
                for(int j = i;j < cout+1 ;j++)
                    for(int k = 0;k < 4; k++)
                    {
                        arr[j][k] = arr[j+1][k]  ;
                    }
                cout = cout - 1; //cout = 2
            }
            System.out.print((i + 1) + "\t\t\t\t");
            System.out.printf("%-15s", arr[i][0]);
            System.out.printf("%-17s", arr[i][1]);
            System.out.printf("%-15s", arr[i][2]);
            System.out.printf("%-17s", arr[i][3]);
            System.out.println();

        }
        a();

    }

    public static void add() {//增加
        cout = cout + 1;
        Scanner scan = new Scanner(System.in);
        String[] x = new String[4];
        System.out.print("是否增添用户：");
        String w = scan.next();
        if (w.equals("否"))
            showVipInfos();
        else if(w.equals("是")) {
            x[0] = "会员名";
            x[1] = "密码";
            x[2] = "性别";
            x[3] = "年龄";
            for (int i = 0; i < 4; i++) {
                System.out.print("请输入" + x[i] + ":");
                arr[cout - 1][i] = scan.next();
            }
            a();
        }
        else{
            System.out.println("输入错误！重新输入");
            add();
        }
    }

    public static void del() {//删除
        Scanner scan = new Scanner(System.in);
        System.out.print("是否删除用户：");
        String w = scan.next();
        if (w.equals("否"))
            showVipInfos();
        else if (w.equals("是")) {
            System.out.print("请输入要删除的行编号:");
            int bh = scan.nextInt();
            if (bh > cout || bh < 2) {
                System.out.println("\n输入错误请重新输入!");
                del();
            } else {
                bianhao = bh;
            }
            a();
        }
        else{
            System.out.println("输入错误！重新输入");
            del();
        }
    }

    public static void ins() {//修改
        Scanner scan = new Scanner(System.in);
        System.out.print("是否修改用户：");
        String w = scan.next();
        if (w.equals("否"))
            showVipInfos();
        else if (w.equals("是")) {
            System.out.print("请输入要修改的行编号:");
            int bh = scan.nextInt();
            if (bh > cout || bh < 2) {
                System.out.println("\n输入错误请重新输入!");
                ins();
            } else {
                String[] x = new String[4];
                x[0] = "会员名";
                x[1] = "密码";
                x[2] = "性别";
                x[3] = "年龄";
                for (int i = 0; i < 4; i++) {
                    System.out.println("您要修改的" + x[i] + "为：" + arr[bh - 1][i]);
                }
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    System.out.print("请输入修改后的" + x[i] + ":");
                    arr[bh - 1][i] = scan.next();
                }
                a();
            }
        }
        else{
            System.out.println("输入错误！重新输入");
            ins();
        }
    }

    public static void user() { //会员
        System.out.print("请输入进入的编号系统:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        userx = x ;
        String NAME =  arr[userx-1][0];
        String PASSWD = arr[userx-1][1];
        for (int i = 0; i < 3; i++) {
            System.out.print("\n请输会员姓名:");
            String name = scan.next();
            System.out.print("请输入会员密码：");
            String passWd = scan.next();
            if (name.equals(NAME) && passWd.equals(PASSWD)) {
                System.out.println("登录成功~~~~\n\n");
                hui();

            } else if (userx != 2) {
                System.out.println("输入错误，请重新输入!");
            }
            if (i == 2) {
                System.out.println("连接失败，请重新登陆");
                return;
            }


        }
    }

    public static void quit() { //退出

        return;
    }

    public static void   hui(){ //会员界面
        System.out.println("1.查看个人信息");
        System.out.println("2.客户真情回馈");
        System.out.println("3.退出\n");
        System.out.print("请选择:");
        Scanner scan = new Scanner(System.in);
        int bh = scan.nextInt();
        if(bh==1)
        {
            String[] x = new String[4];
            x[0] = "会员名";
            x[1] = "密码";
            x[2] = "性别";
            x[3] = "年龄";
            System.out.println();
            for(int i = 0; i < 4; i++) {
                System.out.println("本用户的" + x[i] + "为："+arr[userx - 1][i]);
            }
            System.out.println();
            hui();
        }
        else if(bh == 2)
            rdm();
        else if(bh == 3)
            quit();
        else{
            System.out.println("\n输入错误!\n");
            hui();
        }
    }
    public static void   rdm(){//抽奖页面
        System.out.print("\n为感谢顾客本商城退出小型玩耍，欢迎各位用户前来！！！！ 现在开始抽奖，按1开始0结束：");
        Scanner  scan = new  Scanner(System.in);
        int  id = scan.nextInt();
        if(id ==1)
        {
           Random  r = new Random();
           int  a = r.nextInt(4);
           if(a==0){
               System.out.println("一等奖");
               hui();
           }
           else if(a==1){
               System.out.println("二等奖");
               hui();
           }
           else if (a==2){
               System.out.println("三等奖");
               hui();
           }
           else{
               System.out.println("慰问奖");
               hui();
           }
    }
        else{
            System.out.println("退出抽奖页面");
            hui();
        }
    }
}
