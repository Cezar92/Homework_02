package Homework_05;

import java.util.HashSet;

public class TestMethod_01 {

    public static int getFactorial(int n, int i, int f) {
        while (i <= n) {
            f = f * i;
            i++;
        }
        return f;
    }

    public static boolean onlyDigits(String st, int n) {
        for (int i = 0; i < n; i++) {

            if (st.charAt(i) >= '0'
                    && st.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int longS(String st) {
        int i = 0;
        int j = 0;
        int max = 0;

        HashSet<Character> has_set = new HashSet();

        while (j < st.length()) {
            if (!has_set.contains(st.charAt(j))) {
                has_set.add(st.charAt(j));
                j++;
                max = Math.max(has_set.size(), max);
            } else {
                has_set.remove(st.charAt(i));
                i++;
            }
        }
        return max;
    }
}
