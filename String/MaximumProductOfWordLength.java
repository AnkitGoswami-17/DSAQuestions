package String;

public class MaximumProductOfWordLength {
    public static void main(String[] args) {
        String[] arr = { "abcw", "baz", "foo", "bar", "xtfn", "abcdef" };
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(String[] words) {
        int[] check = new int[words.length];
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            int num = 0;
            for (int j = 0; j < words[i].length(); j++) {
                int x = words[i].charAt(j) - 'a';
                num |= 1 << x;
            }
            check[i] = num;
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int num1 = check[i];
                int num2 = check[j];
                if ((num1 & num2) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}
