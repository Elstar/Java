import java.util.Arrays;

public class Board {
        private Shape[] board = new Shape[4];

        public Board() {
        }
        
        public void addShape(int index, Shape shape) {
                board[index] = shape;
        }

        public void delShape(int index) {
                board[index] = null;
        }
        
        public double getAreaSum() {
                double area = 0;
                for (Shape figure:board
                     ) {
                        if (figure != null)
                        area += figure.getArea();
                }
                return area;
        }

        @Override
        public String toString() {
                return "Board{" +
                        "board=" + Arrays.toString(board) +
                        '}';
        }
}
