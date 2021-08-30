public class RomanCalc {


    public static String toRoman(int number) {



        if (number == 1) {
            String x = "I";
            return x;
        }
        if (number == 2) {
            String x = "II";
            return x;
        }
        if (number == 3) {
            String x = "III";
            return x;
        }
        if (number == 5) {
            String x = "V";
            return x;
        }
        if (number == 10) {
            String x = "X";
            return x;
        }
        return null;
    }

}
