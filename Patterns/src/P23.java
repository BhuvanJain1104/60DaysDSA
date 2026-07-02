import java.util.Scanner;

public class P23 {    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size : ");
    int n=sc.nextInt();
    for (int i = 1; i <= n; i++) {

        // leading spaces
        for (int j = 1; j <= n - i; j++)
            System.out.print(" ");

        // stars and spaces
        for (int j = 1; j <= 2 * i - 1; j++) {

            if (j == 1 || j == 2 * i - 1 )
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
    for (int i = n; i >= 0; i--) {

        // leading spaces
        for (int j = 1; j <= n - i; j++)
            System.out.print(" ");

        // stars and spaces
        for (int j = 1; j <= 2 * i - 1; j++) {

            if (j == 1 || j == 2 * i - 1 )
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }

}
}
