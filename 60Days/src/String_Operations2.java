public class String_Operations2 {
    public static  char processStr(String s, long k) {
        if(s.length()==0)
            return '.';
        StringBuilder result= new StringBuilder();
        char[] ch= s.toCharArray();
        for(char c : ch){
            switch (c){
                case '*':
                    if (!result.isEmpty())
                        result.deleteCharAt(result.length()-1);
                    break;
                case '#':
                    if (!result.isEmpty())
                        result.append(result);
                    break;
                case '%':
                    if (!result.isEmpty())
                        result.reverse();
                    break;
                default:
                    result.append(c);
            }
        }
       if(result.length()-1<k){
           return '.';
       }
       return result.charAt((int) k);
    }
    static void main(String[] args) {
        System.out.println(processStr("a#b%*",2));
    }
}
