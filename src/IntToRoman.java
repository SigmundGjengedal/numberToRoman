public class IntToRoman {

    public static String converter(int num){

        String[] tens = {"","X", "XX","XXX","XL","l", "LX","LXX","LXXX","XC"};

        String[] units = {"","I", "II","III","IV","V","VI","VII","VIII","IX"};

        return tens[(num % 100) / 10] +
        units[ num % 10];
    }
}
