import java.util.Scanner;

public class Pattern7 {
    void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" "+(n-j+1)+" ");
            }
            System.out.println("");
        }
    }
}
