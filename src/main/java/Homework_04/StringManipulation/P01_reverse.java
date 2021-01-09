package Homework_04.StringManipulation;

import java.util.*;

public class P01_reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string: ");
        String st = sc.next();
//        String st = reverse(sc.next());

//        System.out.println("Reverse " + st);
//
//        countDuplicateCharacters(st);
//
//        String st1 = "abca";
//        String st2 = "aabc";
//        System.out.println(isanagram(st1, st2));
//
//        String s = "adc";
//        int m = s.length();
//        P04_Permutations permutations = new P04_Permutations();
//        permutations.calculate(s, 0, m - 1);
//
//        int l = st.length();
//        System.out.println(onlyDigits(st, l));
//
//        int count;
//        char string[] = st.toCharArray();
//
//        System.out.println("Duplicate characters in a given string: ");
//        fDuplicate(string);
//
//        countVowelsAndConsonant(st);
//        occurencce(st);
//        firstUnique(st);
//        reverseWordInMyString(st);
//
//        String str1 = "AACD";
//        String str2 = "ACDA";
//
//        if (areRotations(str1, str2))
//            System.out.println("Strings are rotations of each other");
//        else
//            System.out.printf("Strings are not rotations of each other");
//        palindrom(st);
//        System.out.println("The longest substring is: " + longestSubstring(st));
//        System.out.println(longestSubstring(st));
//        char str[] = "hello world".toCharArray();
//        int n = str.length;
//        removeDuplicates(str, n);
//        System.out.println(removeElem(st, 3));
        String arr [] = {"hello","world", "from ", "the ", "other ", "side", "of", "world" };
        System.out.println("the most frequent word is: " + (findWord(arr)).toString());

    }


    private static String reverse(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }

    private static void countDuplicateCharacters(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                        + " : "
                        + entry.getValue());
            }
        }
    }

    private static boolean isanagram(String st1, String st2) {
        char[] charArrSt1 = st1.toCharArray();
        char[] charArrSt2 = st2.toCharArray();
        Arrays.sort(charArrSt1);
        Arrays.sort(charArrSt2);
        return Arrays.equals(charArrSt1, charArrSt2);
    }

    private void calculate(String st, int left, int right) {
        if (left == right) {
            System.out.println(st);
        } else {
            for (int i = left; i <= right; i++) {
                String swapped = this.swap(st, left, i);
                this.calculate(swapped, left + 1, right);
            }
        }
    }

    private String swap(String st, int i, int j) {
        char temp;
        char[] charArray = st.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
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

    private static void fDuplicate(char[] string) {
        int count;
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }

    private static void countVowelsAndConsonant(String st) {
        int v = 0;
        int c = 0;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
                v++;
            } else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
                c++;
            }
        }
        System.out.println("vowls = " + v);
        System.out.println("consonant = " + c);
    }

    private static void occurencce(String st) {
        int o = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose a character: ");
        String c = sc.next();

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == c.charAt(0)) {
                o++;
            }
        }
        System.out.println(o);
    }

    private static void firstUnique(String st) {
        for (int i = 0; i < st.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < st.length(); j++) {
                if (i != j & st.charAt(i) == st.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("The first non repeated character in String is:" + st.charAt(i));
                break;
            }
        }
    }

    private static void reverseWordInMyString(String st) {
        String[] words = st.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(st);
        System.out.println(reversedString);
    }

    private static boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);
    }

    private static void palindrom(String st) {
        String reverse = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reverse += st.charAt(i);
        }
        boolean palindrom = true;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != reverse.charAt(i)) {
                palindrom = false;
            }
        }
        if (palindrom) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }

    private static int longestSubstring(String st) {
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

    private static int expandFromMiddle(String st, int left, int right) {
        if (st == null || left > right) return 0;

        while (left >= 0 && right < st.length() && st.charAt(left) == st.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    private String longestPalindrom(String st) {
        if (st == null || st.length() < 1) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < st.length(); i++) {
            int len1 = expandFromMiddle(st, i, i);
            int len2 = expandFromMiddle(st, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return st.substring(start, end + 1);
    }

    private static String removeDuplicates(char st[], int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {

            int j;
            for (j = 0; j < i; j++) {
                if (st[i] == st[j]) {
                    break;
                }
            }
            if (j == i) {
                st[index++] = st[i];
            }
        }
        return String.valueOf(Arrays.copyOf(st, index));
    }

    private static String removeElem (String st, int p) {
        return st.substring(0,p) + st.substring(p+1);

    }

   private static String findWord(String[] arr)
    {

        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            }
            else {
                hs.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer> > set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        return key;
    }


}



