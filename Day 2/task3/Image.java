package task3;

public class Image implements Printable, Exportable {
    @Override
    public void print() {
        System.out.println("Печать изображения");
    }

    @Override
    public void export() {
        System.out.println("Экспорт изображения");
    }
}
