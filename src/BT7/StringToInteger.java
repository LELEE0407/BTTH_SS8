package BT7;

public class StringToInteger {
    public static void main(String[] args) {
        String input = "a1b2c3";
        int result = convertStringToInteger(input);
        System.out.println("Converted number: " + result);
    }

    public static int convertStringToInteger(String str) {
        StringBuilder numericString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                numericString.append(c);
            } else {
                numericString.append('0');
            }
        }

        return Integer.parseInt(numericString.toString());
    }
}
