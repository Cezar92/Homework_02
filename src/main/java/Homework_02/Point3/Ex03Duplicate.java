package Homework_02.Point3;

public class Ex03Duplicate {
    public static void main(String[] args) {
        String str = "Scoala Informala";
        int c = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");

        duplicate(str, c, inp);
    }

    private static void duplicate(String str, int c, char[] inp) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    c++;
                    break;
                }
            }
        }
    }
}
