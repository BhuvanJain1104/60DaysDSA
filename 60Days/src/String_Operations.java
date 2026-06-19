public class String_Operations {
    public static  String processStr(String s) {
        if(s.length()==0)
            return "";
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
    return result.toString();
    }

    static void main(String[] args) {
        System.out.println(processStr("a#b%*"));
    }
}
