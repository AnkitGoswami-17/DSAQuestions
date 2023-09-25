package String;

class Solution {
    public String interpret(String command) {
        // String str=command.replace("()","o").replace("(al)","al");
        // return str;
        return change(command);
    }

    static String change(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'G')
                str.append(c);
            else if (c == '(' && s.charAt(i + 1) == ')') {
                str.append('o');
                i += 1;
            } else {
                str.append('a').append('l');
                i += 3;
            }
        }
        return str.toString();
    }
}
