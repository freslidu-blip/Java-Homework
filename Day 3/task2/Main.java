package task2;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
}
