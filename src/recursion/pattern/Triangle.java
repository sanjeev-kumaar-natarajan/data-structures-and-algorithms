package recursion.pattern;

public class Triangle {
    public static void triangle(int n) {
        triangleHelper(n, 0);
    }

    public static void triangleHelper(int rows, int columns) {
        if (rows == 0)
            return;
        if (columns == rows) {
            System.out.println();
            triangleHelper(--rows, 0);
        } else {
            System.out.print('*');
            triangleHelper(rows, ++columns);
        }
    }

    public static void normalTriangle(int n) {
        normalTriangleHelper(n, 0);
    }

    public static void normalTriangleHelper(int rows, int columns) {
        if (rows == 0)
            return;
        if (columns == rows) {
            normalTriangleHelper(--rows, 0);
            System.out.println();
        } else {
            normalTriangleHelper(rows, ++columns);
            System.out.print('*');
        }
    }
}
