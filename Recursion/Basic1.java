// Print Numbers From 1 to n 
/*
5
4
3
2
1
*/
package Recursion;

import java.util.Scanner;

public class Basic1 {
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
        System.out.println(n);
        Numbers(n - 1);
    }

}
