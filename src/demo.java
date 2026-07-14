public class demo {
    static void  printNtoOne(int n)
    {
        if (n<1)
            return;;
        System.out.print(n +" ");
        printNtoOne(n-1);
    }
    static void  printoOnetoN(int n)
    {
        if (n<1)
            return;;
        printoOnetoN(n-1);

        System.out.print(n +" ");

    }
    static int  productNtoOne(int n)
    {
        if (n<1)
            return 1;
        return n*productNtoOne(n-1);
    }
    static int  SumNtoOne(int n)
    {
        if (n<1)
            return 0;
        return n+SumNtoOne(n-1);
    }
    static int sumofDigits(int n){
        if (n == 0) {
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }
    static int productofDigits(int n){
        if (n == 0) {
            return 1;
        }
        return n%10 * productofDigits(n/10);
    }
    static String removeCharacter(String input, String output) {

        if (input.isEmpty()) {
            return output;
        }

        char ch = input.charAt(0);

        if (ch != 'a') {
            output += ch;
        }

        return removeCharacter(input.substring(1), output);
    }
    static String skipString(String input) {

        if (input.isEmpty()) {
            return "";
        }

        if (input.startsWith("apple")) {
            return skipString(input.substring(5));
        }

        return input.charAt(0) + skipString(input.substring(1));
    }


    static void main(String[] args) {
        printNtoOne(5);
        System.out.println("");
        printoOnetoN(5);
        System.out.println("");
        System.out.println(productNtoOne(5));
        System.out.println(SumNtoOne(5));
        System.out.println(sumofDigits(1234567));
        System.out.println(productofDigits(234));
    }
}
