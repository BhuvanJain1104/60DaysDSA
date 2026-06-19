import java.util.Scanner;

public class Pattern14 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = n-i; j>=1 ; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            for (int j = i; j >1 ; j--) {
                System.out.print(j-1+" ");
            }


            System.out.println();
        }
    }
}
