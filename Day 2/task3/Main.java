package task3;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Image image = new Image();
        Report report = new Report();

        document.print();
        document.save();

        image.print();
        image.export();

        report.print();
        report.save();
        report.export();
    }
}
