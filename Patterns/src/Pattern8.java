import java.util.Scanner;

public class Pattern8 {
    void main(String[] args) {
        int num=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
