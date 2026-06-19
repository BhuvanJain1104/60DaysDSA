import java.util.Scanner;

public class P18 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");

            }
            for (int j = n-i; j>=0 ; j--) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
