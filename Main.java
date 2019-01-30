import java.util.Random;

public class Main {



    public static void main(String[] args) {
        Triangle triangle = new Triangle(setRandomPoints(3));
        Rectangle rectangle = new Rectangle(setRandomPoints(4));
        Board board = new Board();
        board.addShape(0, triangle);
        board.addShape(1, rectangle);
        System.out.println(board);
        System.out.println("All sum of boards shape = " + board.getAreaSum());
    }

    static Point[] setRandomPoints(int countPoints) {
        Random random = new Random();
        Point[] points = new Point[countPoints];
        for (int i=0; i < countPoints; i++) {
            points[i] = new Point(random.nextInt(10), random.nextInt(10));
        }
        return points;
    }
}
