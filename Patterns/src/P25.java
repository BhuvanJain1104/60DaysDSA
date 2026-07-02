import java.util.Scanner;

public class P25 { public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the size : ");
    int n=sc.nextInt();

    char ch = 'a';

    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {

            if ((ch - 'a') % 2 == 0) {
                System.out.print(ch + " ");
            } else {
                System.out.print(Character.toUpperCase(ch) + " ");
            }

            ch++;
        }

        System.out.println();
    }

    sc.close();
}
}
