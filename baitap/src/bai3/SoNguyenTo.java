package bai3;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int a;
        int sum=0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number:");
        a= scanner.nextInt();
          SoNguyenTo snt=new SoNguyenTo();
          if(snt.CheckSNT(a)==true){
              System.out.println("day la so nguyen to");
              sum+= a;
          } else {System.out.println("day khong phai la so nguyen to");}
    }
    public boolean CheckSNT(int n){
        if(n<13){
            return false;
        } else{
            for (int i = 2; i <Math.sqrt(n) ; i++) {
                if(n%i==0)
                    return false;

            }
        }

return true;
    }
//    static int sum(int sum){
//
//
//
//    }
}
