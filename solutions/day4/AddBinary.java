package solutions.day4;

// 67. Add Binary
// https://leetcode.com/problems/add-binary/
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        boolean carry = false;
        int n = a.length() - 1;
        int m = b.length() - 1;
        while (n >= 0 || m >= 0 || carry) {
            char ch1 = '0', ch2 = '0', ch3 = '0';
            if (n >= 0) ch1 = a.charAt(n);
            if (m >= 0) ch2 = b.charAt(m);
            if (carry) ch3 = '1';

            if(ch1 == '1' && ch2 == '1' && ch3 == '1') {
                str.append('1');
                carry = true;
            } else if (ch1 == '1' && ch2 == '1' || ch1 == '1' && ch3 == '1' || ch2 == '1' && ch3 == '1') {
                str.append('0');
                carry = true;
            } else if (ch1 == '1' || ch2 == '1' || ch3 == '1') {
                str.append('1');
                carry = false;
            } else {
                str.append('0');
                carry = false;
            }

            n--;
            m--;
        }

        return str.reverse().toString();
    }
}
