package com.nareshgediya.java;

public class loop {
    public static void main(String[] args) {
        for (int i = 1; i<=10;i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 10; i>=0;i--){
            for (int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //  *  for this pattern
//         **
//        ***


        int n = 10;
        for (int i = 1; i<=n;i++){
            for (int j = i; j<=n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i>=1;i--){
            for (int j = i; j<=n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
