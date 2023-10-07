import java.util.Scanner;

class MatrixAddSub {
    Scanner input = new Scanner(System.in);
    public int[][] matrixRetrieve() {
        
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the value: ");
                int num = input.nextInt();
                matrix[i][j] = num;
            }
        }
        // input.close();
        return matrix;
    }

    public int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] sums = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sums;
    }

    public int[][] subMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] subs = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subs[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        return subs;
    }

    public static void main(String[] args) {
        MatrixAddSub matrix = new MatrixAddSub();
        int[][] matrix1 = matrix.matrixRetrieve();
        int[][] matrix2 = matrix.matrixRetrieve();
        int[][] sum = matrix.addMatrices(matrix1, matrix2);
        int[][] sub = matrix.subMatrices(matrix1, matrix2);

        System.out.println("The sum of both the matrices:");
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("The difference between both the matrices:");
        for (int[] row : sub) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        
        }
    }
}
