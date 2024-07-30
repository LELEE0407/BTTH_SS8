package BT5;

public class ReverseString {
    public static void main(String[] args) {
        String input = "I'm fine, thanks";
        String reversedString = reverseString(input);
        if (reversedString != null) {
            System.out.println("Chuỗi đảo ngược: " + reversedString);
        }
    }
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Lỗi: Chuỗi không hợp lệ.");
            return null;
        }
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}

