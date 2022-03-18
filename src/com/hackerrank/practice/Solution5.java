package com.hackerrank.practice;


import java.util.Scanner;

class Solution5{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of queries and Value for that Queries");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int calc = a;

            for(int j=0;j<=n-1;j++){
                calc+=(Math.pow(2,j)*b);
                System.out.print(calc+" ");

            }
            System.out.println();

        }
        in.close();

    }
}
