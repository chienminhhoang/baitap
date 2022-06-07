package bai2;

import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        java.lang.String[] arr= new java.lang.String[5];
        System.out.println("enter string");
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= scanner.nextLine();


        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf(arr[i]);

        }
    }
}
