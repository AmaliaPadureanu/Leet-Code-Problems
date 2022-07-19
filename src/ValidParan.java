public class ValidParan {
    public static boolean isValid(String s) {
        int i = 0;
        int j = s.length() - 1;


        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') {
            return false;
        } else if (s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '[' || s.charAt(s.length()-1) == '{') {
            return false;
        }

        for (int k = 1; k < s.length(); k++) {

        }

        while (i < j) {
            if (s.charAt(i) == '(' && s.charAt(j) == ')') {
                i++;
                j--;
            } else if (s.charAt(i) == '[') {
                i++;
                j--;
            } else if (s.charAt(i) == '{' && s.charAt(j) == '}') {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "{[]}";

        System.out.println(isValid(s));
    }
}
