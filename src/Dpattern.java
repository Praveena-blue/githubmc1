import java.util.Scanner;

public class Dpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        /* *****
         *
         *
         *
         *
         *******
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 2 || j == n || i == 1||i==n) {
                    if ((i == 1 && j==7 )|| (i==7 && j==7)) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

