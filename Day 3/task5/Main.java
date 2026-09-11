package task5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "student.ser";
        Student student = new Student("Дима", 19, "12345");

        try (ObjectOutputStream output =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {
            output.writeObject(student);
            System.out.println("Студент сериализован.");
        } catch (IOException e) {
            System.out.println("Ошибка сериализации: " + e.getMessage());
        }

        try (ObjectInputStream input =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            Student restoredStudent = (Student) input.readObject();
            System.out.println("\nПосле десериализации:");
            restoredStudent.printInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка десериализации: " + e.getMessage());
        }
    }
}
