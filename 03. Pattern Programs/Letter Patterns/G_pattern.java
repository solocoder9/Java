/*

    *****
    *
    * ***
    *   *
    *****
    
 */

import java.util.Scanner;

public class G_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j == 1 || i == 1 || i == n || (j == n && i != (n/2))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    } 
}
