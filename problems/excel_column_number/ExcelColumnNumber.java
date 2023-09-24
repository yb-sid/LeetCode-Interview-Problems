package problems.excel_column_number;

public class ExcelColumnNumber {
    public int titleToNumber(String columnTitle) {
        int powerIndex = 0;
        int columnNumber = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            columnNumber += charValue * (int) Math.pow(26, powerIndex);
            powerIndex += 1;
        }
        return columnNumber;
    }
}
