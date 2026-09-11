package task3;

public class Report implements Printable, Savable, Exportable {
    @Override
    public void print() {
        System.out.println("Печать отчёта");
    }

    @Override
    public void save() {
        System.out.println("Сохранение отчёта");
    }

    @Override
    public void export() {
        System.out.println("Экспорт отчёта");
    }
}
