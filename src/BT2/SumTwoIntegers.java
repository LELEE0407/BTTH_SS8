package BT2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Nhập số nguyên thứ nhất: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không phải là số nguyên. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Nhập số nguyên thứ hai: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không phải là số nguyên. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        int sum = num2 + num1;
        System.out.println("Tổng của hai số nguyên là: " + sum);

        scanner.close();
    }
}
