import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        System.out.println("введите х и у");
        System.out.println("X:");
         int x = System.in.read();
        System.out.println("Y:");
         int y = System.in.read();

        Point point = new Point(x,y);
        point.printPoint();
        Point point2 = point.scale();
        point2.printPoint();

    }
}
