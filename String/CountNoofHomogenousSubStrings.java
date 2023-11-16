package String;

public class CountNoofHomogenousSubStrings {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(count(s));
    }

    static int count(String s) {
        int mod = (int) Math.pow(10, 9) + 7;
        int ans = 0;
        int i = 0;
        int len = 0;

        while (i < s.length()) {
            if (i == 0 || s.charAt(i) == s.charAt(i - 1)) {
                len += 1;
            } else {
                ans += len * (len + 1) / 2;
                len = 1;
            }
            i++;
        }
        ans += len * (len + 1) / 2;
        return ans % mod;
    }
}
