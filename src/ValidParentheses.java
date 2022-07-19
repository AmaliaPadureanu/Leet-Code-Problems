public class ValidParentheses {
    public static boolean isValid(String s) {

        int temp;

        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        } else if (s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '[' || s.charAt(s.length()-1) == '{') {
            return false;
        }else temp = 0;


        for (int k = 1; k < s.length(); k++) {
            if (s.charAt(temp) == '(' && s.charAt(k) == ')') {
                temp++;
            } else if (s.charAt(temp) == '[' && s.charAt(k) == ']') {
                temp++;
            } else if (s.charAt(temp) == '{'&& s.charAt(k) == '}') {
                temp++;
            } else if (s.charAt(temp) == ')' && s.charAt(k) == '(' || s.charAt(temp) == ')' && s.charAt(k) == '[' || s.charAt(temp) == ')' && s.charAt(k) == '{'  ) {
                temp++;
            } else if (s.charAt(temp) == ']' && s.charAt(k) == '[' || s.charAt(temp) == ']' && s.charAt(k) == '(' || s.charAt(temp) == ']' && s.charAt(k) == '{'  ) {
                temp++;
            }else if (s.charAt(temp) == '}' && s.charAt(k) == '{' || s.charAt(temp) == '}' && s.charAt(k) == '[' || s.charAt(temp) == '}' && s.charAt(k) == '('  ) {
                temp++;
            } else return false;

        }


        return true;


    }

    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValid(s));
    }


}
