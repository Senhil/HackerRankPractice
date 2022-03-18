package com.hackerrank.practice;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.close();
        if(n%2!=0 || n>5&& n<=20){
            System.out.println("Weird");
        }
        else if (n%2==0 && n>=2 || n<=5 || n>20){
            System.out.println("Not Weird");
        }

    }
}
