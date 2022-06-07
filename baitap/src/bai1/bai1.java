package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner= new  Scanner(System.in);
        System.out.println("enter a:");
        a = scanner.nextInt();
        System.out.println("enter b:");
        b= scanner.nextInt();
        System.out.println("enter c");
        c= scanner.nextInt();
        if(a+b>c&&b+c>a&&a+c>b){
            System.out.println(" day la tam giac");
        } else if (a<=0|| b<=0||c<=0){
            System.out.println("day khong phai tam giac");
        } else System.out.println("day khong phai la tam giac");

    }

}
