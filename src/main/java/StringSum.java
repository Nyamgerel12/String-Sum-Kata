public class StringSum {
    public String sum(String num1, String num2) {
       return String.valueOf(parseNumber(num1) + parseNumber(num2));
    }
    private int parseNumber(String s) {
        try {
            int value = Integer.parseInt(s);
            return value >= 0 ? value : 0;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}