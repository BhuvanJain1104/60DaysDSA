import java.util.Scanner;

public class Pattern6 {
    void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
