

public class numberToRoman
{
    // This function returns
    // value of a Roman symbol
    char value(int r)
    {
        if (r == 1)
            return 'I';
        if (r == 5)
            return 'V';
        if (r == 10)
            return 'X';
        if (r == 50)
            return 'L';
        if (r == 100 )
            return 'C';
        if (r == 500)
            return 'D';
        if (r == 1000)
            return 'M';
        return 'æ';
    }

    // Finds decimal value of a
    // given romal numeral
    int romanToDecimal(int number)
    {
        // Initialize result
        int res = 0;

        int numDigits = String.valueOf(number).length();

        for (int i = 0; i < numDigits; i++)
        {
            // Getting value of symbol s[i]
            int s1 = value(str.charAt(i));

            // Getting value of symbol s[i+1]
            if (i + 1 < str.length())
            {
                int s2 = value(str.charAt(i + 1));

                // Comparing both values
                if (s1 >= s2)
                {
                    // Value of current symbol
                    // is greater or equalto
                    // the next symbol
                    res = res + s1;
                }
                else
                {
                    // Value of current symbol is
                    // less than the next symbol
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }

        return res;
    }

    // Driver Code
    public static void main(String args[])
    {
        numberToRoman ob = new numberToRoman();

        // Considering inputs given are valid
        int number = 1500;
        System.out.println("Integer form of Roman Numeral"
                + " is "
                + ob.romanToDecimal(number);
    }
}


