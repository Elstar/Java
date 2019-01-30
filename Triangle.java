import java.util.Arrays;

/**
 * Triangle
 */
public class Triangle extends Shape {
        private Point[] points = new Point[3];
        private double a;
        private double b;
        private double c;

        public Triangle(Point[] points) {
                this.points = points;
                setSides();
        }

        public Triangle() {
                super();
        }

        private void setSides() {
                c = Math.sqrt(Math.pow(points[1].getX() - points[0].getX(), 2)
                        + Math.pow(points[1].getY() - points[0].getY(), 2));
                a = Math.sqrt(Math.pow(points[2].getX() - points[1].getX(), 2)
                        + Math.pow(points[2].getY() - points[1].getY(), 2));
                b = Math.sqrt(Math.pow(points[2].getX() - points[0].getX(), 2)
                        + Math.pow(points[2].getY() - points[0].getY(), 2));
        }

        public double getA() {
                return a;
        }

        public double getB() {
                return b;
        }

        public double getC() {
                return c;
        }

        @Override
        public boolean isShapeValid() {
                boolean valid = true;
                if ((points[0].getX() == points[1].getX()
                        && points[1].getX() == points[2].getX())
                || (points[0].getY() == points[1].getY()
                        && points[1].getY() == points[2].getY()))
                        valid = false;
                return valid;
        }

        @Override
        public double getPerimetr() {
                return a + b + c;
        }

        @Override
        public double getArea() {
                double area;
                double halfPerimetr = getPerimetr() / 2;

                area = Math.sqrt(
                        halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b)
                                * (halfPerimetr - c)
                );

                return area;
        }

        @Override
        public String toString() {
                return "Triangle{" +
                        "points=" + Arrays.toString(points) +
                        ", a=" + a +
                        ", b=" + b +
                        ", c=" + c +
                        '}';
        }
}
