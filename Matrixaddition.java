package Assignment;

public class Matrixaddition {

    public static int[][] addMatrix(int a[][], int b[][]) {
        int result[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }

        }
        return result;
    }

    public static void printMatrix(int a[][]) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = new int[3][2];
        int b[][] = new int[3][2];
        // matrix initialize;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
                b[i][j] = i * j;
            }
        }

        printMatrix(addMatrix(a, b));
    }
}
