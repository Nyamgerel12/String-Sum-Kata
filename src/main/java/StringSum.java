public class StringSum {
    public String sum(String num1, String num2) {
       int n1 = num1.isEmpty() ? 0 : Integer.parseInt(num1);
       int n2 = num2.isEmpty() ? 0 : Integer.parseInt(num2);
       return String.valueOf(n1 + n2);
    }
}