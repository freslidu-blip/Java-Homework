package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Развёрнутая строка: " + reversed);
        System.out.println("Палиндром: " + text.equalsIgnoreCase(reversed));
        scanner.close();
    }
}
