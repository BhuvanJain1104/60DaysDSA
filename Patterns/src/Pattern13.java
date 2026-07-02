import java.util.Scanner;

public class Pattern13 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j>=1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
