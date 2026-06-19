import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();   // number of rows

        // Outer loop → controls rows
        for (int i = 1; i <= n; i++) {

            // Inner loop 1 → prints spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print("   ");
            }

            // Inner loop 2 → prints stars
            for (int star = 1; star <= n; star++) {
                System.out.print(" "+num+" ");
                num++;
            }

            // Move to next line after each row
            System.out.println();
        }
    }


}

