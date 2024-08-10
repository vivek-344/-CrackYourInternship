// 12. Integer to Roman
// https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        String[] ones = {"", "I", "II", "III", "VI", "V", "IV", "IIV", "IIIV", "XI"};
        String[] tens = {"", "X", "XX", "XXX", "LX", "L", "XL", "XXL", "XXXL", "CX"};
        String[] hundreds = {"", "C", "CC", "CCC", "DC", "D", "CD", "CCD", "CCCD", "MC"};
        String[] thousands = {"", "M", "MM", "MMM"};
        int temp = 1;
        for (int i = num; i > 0; i /= 10) {
            switch(temp) {
                case 1:
                    str.append(ones[i%10]);
                    break;
                case 2:
                    str.append(tens[i%10]);
                    break;
                case 3:
                    str.append(hundreds[i%10]);
                    break;
                case 4:
                    str.append(thousands[i%10]);
                    break;
            }
            temp++;
        }
        return str.reverse().toString();
    }
}
