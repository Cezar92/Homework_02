package Point1.Ex03;

public class Ex_03Function {
    public static int getMax(String st, int max) {
        for (int i = 0; i < st.length(); i++){
            if (Character.getNumericValue(st.charAt(i)) > max){
                max = Character.getNumericValue(st.charAt(i));
            }
        }
        return max;
    }
}
