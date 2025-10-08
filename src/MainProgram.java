import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(new Point(1, 2), 4, 6));
        shapes.add(new Square(new Point(5, 5), 3));
        shapes.add(new Circle(new Point(0, 0), 2.5));

        System.out.println("Số lượng hình đã khởi tạo: " + shapes.size());

        System.out.println("Danh sách chi tiết các hình đã khởi tạo:");
        for (Shape s : shapes) {
            System.out.println("  " + s);
        }

        System.out.println("Danh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println("  " + s.getCenterPoint());
        }
    }
}
