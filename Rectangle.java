import java.util.Arrays;

public class Rectangle extends Shape {
        private Point[] points = new Point[4];
        private double a;
        private double b;

        public Rectangle(Point[] points) {
                this.points = points;
                setSides();
        }

        public Rectangle() {
                super();
        }

        private void setSides() {
                a = points[1].getX() - points[0].getX();
                b = points[2].getY() - points[1].getY();
        }

        @Override
        public boolean isShapeValid() {
                boolean valid = false;
                if (points[0].getX() == points[1].getX()
                        && points[2].getX() == points[3].getX()
                        && points[0].getY() == points[3].getY()
                        && points[1].getY() == points[2].getY())
                        valid = true;
                return valid;
        }

        @Override
        public double getPerimetr() {
                return (a + b) * 2;
        }

        @Override
        public double getArea() {
                double area = a * b;

                return area;
        }

        @Override
        public String toString() {
                return "Rectangle{" +
                        "points=" + Arrays.toString(points) +
                        ", a=" + a +
                        ", b=" + b +
                        '}';
        }
}
