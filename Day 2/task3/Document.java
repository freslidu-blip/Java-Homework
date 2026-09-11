package task3;

public class Document implements Printable, Savable {
    @Override
    public void print() {
        System.out.println("Печать документа");
    }

    @Override
    public void save() {
        System.out.println("Сохранение документа");
    }
}
