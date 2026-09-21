public class StringSum {
    public String sum(String num1, String num2) {
        if ("".equals(num1) && "".equals(num2)) {
        return "0"; 
        }
        if (!"".equals(num1)) {
            return num1;
        }
        return num2;
    }
}