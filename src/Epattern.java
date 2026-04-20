import java.util.Scanner;

public class Epattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        /*  ******
         *
         *
         ******
         *
         *
         ******
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n+1 || i == (n/2)+1) {
                    if (j == n) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
            }
        }
    }


