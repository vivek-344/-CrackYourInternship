// 168. Excel Sheet Column Title
// https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {
    public String convertToTitle(int num) {
        char[] ref = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder str = new StringBuilder();
        for (int i = num - 1; i >= 0; i = i / 26 - 1) {
            str.append(ref[i % 26]);
        }
        return str.reverse().toString();
    }
}
