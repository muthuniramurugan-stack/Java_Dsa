// Print Numbers From 1 to n 
/*
1
2
3
4
5
*/
package Recursion;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = scan.nextInt();
        Numbers(a);
    }

    static void Numbers(int n) {
        if (n == 0) {
            return;
        }
        Numbers(n - 1);
        System.out.println(n);
    }
}
