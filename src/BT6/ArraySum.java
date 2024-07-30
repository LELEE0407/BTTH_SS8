package BT6;

import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args) {
        Object[] array = {1, 2, "three", 4, 5, "six", 7};

        int sum = calculateSum(array);
        System.out.println("Tổng của các phần tử hợp lệ trong mảng là: " + sum);
    }

    public static int calculateSum(Object[] array) {
        int sum = 0;
        for (Object element : array) {
            try {
                if (element instanceof Integer) {
                    sum += (Integer) element;
                } else {
                    throw new IllegalArgumentException("Phần tử không phải là số nguyên: " + element);
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
        return sum;
    }
}

