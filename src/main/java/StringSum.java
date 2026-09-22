public class StringSum {
    public String sum(String num1, String num2) {
       return String.valueOf(parseNumber(num1) + parseNumber(num2));
    }
    private int parseNumber(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(s); 
    }
}