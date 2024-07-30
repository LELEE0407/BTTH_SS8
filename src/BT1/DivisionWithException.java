package BT1;

import java.util.Scanner;

public class DivisionWithException{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số bị chia: ");
            int dividend = scanner.nextInt();
            System.out.print("Nhập số chia: ");
            int divisor = scanner.nextInt();
            int result = dividend / divisor;
            System.out.println("Kết quả của phép chia là: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0.");
        } finally {
            scanner.close();
        }
    }
}

