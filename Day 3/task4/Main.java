package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/task4/text.txt";
        int lines = 0, words = 0, symbols = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                symbols += line.length();
                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }

            System.out.println("Строк: " + lines);
            System.out.println("Слов: " + words);
            System.out.println("Символов: " + symbols);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
