import java.util.Scanner;

public class Matrices {
    int rows;
    int columns;
    int[][] matrix;

    public Matrices() {
        matrix = new int[rows][columns];
    }

    public Matrices(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }

    public void addValuesIntoMatrix() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print("Enter the value to be inserted at" + i + ", " + j + ": ");
                this.matrix[i][j] = scanner.nextInt();
                scanner.nextLine();

            }
        }
    }

    public void appendIntoMatrix(int row, int col, int element) {
        this.matrix[row][col] = element;
    }

    public boolean isIdentityMatrix() {
        boolean isIdentity = false;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (i != j) {
                    if (this.matrix[i][j] == 0) {
                        isIdentity = true;
                    }
                    ;
                } else {
                    if (this.matrix[i][j] == 1) {
                        isIdentity = true;
                    }
                }

            }
        }
        return isIdentity;
    }

    public boolean isUpperTriangular() {
        boolean isUpperTriangular = false;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (j > i) {
                    if (matrix[i][j] == 0) {
                        isUpperTriangular = true;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        isUpperTriangular = true;
                    } else {
                        return false;
                    }
                }

            }
        }
        return isUpperTriangular;
    }

    public boolean isLowerTriangular() {
        boolean isLowerTriangular = false;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (j < i) {
                    if (matrix[i][j] == 0) {
                        isLowerTriangular = true;
                    }
                } else {
                    if (matrix[i][j] != 0) {
                        isLowerTriangular = true;
                    } else {
                        return false;
                    }
                }

            }
        }
        return isLowerTriangular;
    }

    public boolean isSquareMatrix() {
        if (this.rows == this.columns) {
            return true;
        }
        return false;
    }

    public boolean isColumnMatrix() {
        if (this.columns == 1 && this.rows > 0) {
            return true;
        }
        return false;
    }

    public boolean isRowMatrix() {
        if (this.rows == 1 && this.columns > 0) {
            return true;
        }
        return false;
    }

    public boolean isSymmetric() {
        boolean isSymmetric = false;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    isSymmetric = true;

                }
            }
        }
        return isSymmetric;
    }

    public boolean isSkewSymmetric() {
        boolean isSkewSymmetric = false;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; i < this.columns; j++) {
                if (matrix[i][j] == matrix[j][i]) {
                    if (i == j) {
                        isSkewSymmetric = true;
                    } else {
                        return false;
                    }
                } else if (matrix[i][j] == -matrix[j][i]) {
                    isSkewSymmetric = true;
                } else {
                    return false;
                }
            }
        }
        return isSkewSymmetric;

    }

    public boolean isTranspose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (this.matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getElement(int row, int column) {
        return this.matrix[row][column];
    }

    public boolean hasEqualDimensionsWith(Matrices matrix) {
        if (this.rows == matrix.rows && this.columns == matrix.columns) {
            return true;
        }
        return false;
    }

    public boolean isEqual(Matrices matrix) {
        if (hasEqualDimensionsWith(matrix)) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; i < this.columns; j++) {
                    if (this.matrix[i][j] != matrix.getElement(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdditiveInverse(Matrices matrix) {
        if (hasEqualDimensionsWith(matrix)) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    if (this.matrix[i][j] != -matrix.getElement(i, j)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isZeroMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isDiagonalMatrix() {
        if (isSquareMatrix()) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    if (i != j) {
                        if (this.matrix[i][j] != 0) {
                            return false;
                        }
                    } else {
                        if (this.matrix[i][j] == 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean isScalar() {
        int n = this.matrix[0][0];
        if (isDiagonalMatrix()) {
            for (int i = 1; i < rows; i++) {
                if (this.matrix[i][i] != n) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public String toString() {
        String matrixString = "";
        for (int i = 0; i < this.rows - 1; i++) {
            matrixString += this.matrix[i];
            matrixString += "\n";
        }
        return matrixString;
    }

    public static void main(String[] args) {
        Matrices matrix = new Matrices(3, 3);
        matrix.addValuesIntoMatrix();
        // System.out.println(matrix.isAdditiveInverse(matrix));
        System.out.println(matrix.isColumnMatrix());
        System.out.println(matrix.isDiagonalMatrix());
        System.out.println(matrix.isIdentityMatrix());
        System.out.println(matrix.isLowerTriangular());
        System.out.println(matrix.isRowMatrix());
        System.out.println(matrix.isScalar());
        System.out.println(matrix.isSkewSymmetric());
        System.out.println(matrix.isSquareMatrix());
        System.out.println(matrix.isSymmetric());
        System.out.println(matrix.isUpperTriangular());
        System.out.println(matrix.isZeroMatrix());
        // System.out.println(matrix);
    }

}
