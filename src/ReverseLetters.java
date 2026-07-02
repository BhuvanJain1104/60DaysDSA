import java.util.Arrays;

public class ReverseLetters {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int start=0;
        int end =ch.length -1;
        while (start<=end){
            if(!Character.isLetter(ch[start])) {
                start++;
                continue;
            }
            if(!Character.isLetter(ch[end])) {
                end--;
                continue;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
