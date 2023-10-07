import java.util.Scanner;

public class MatrixOperations extends Matrices{
    private static final Exception IndexOutOfBoundsException = null;
    Matrices matrixOne;
    Matrices matrixTwo;
    public MatrixOperations(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows = scanner.nextInt();scanner.nextLine();

        System.out.println("Enter the number of columns for the first matrix: ");
        int columns = scanner.nextInt();scanner.nextLine();
        matrixOne = new Matrices(rows, columns);

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();scanner.nextLine();

        System.out.println("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();scanner.nextLine();

        matrixTwo = new Matrices(rows2, columns2);
        System.out.println("Add values into matrix one: ");
        matrixOne.addValuesIntoMatrix();
        
        System.out.println("Add values into matrix two: ");
        matrixTwo.addValuesIntoMatrix();
        scanner.close();
    }
    public MatrixOperations(Matrices matrixOne, Matrices matrixTwo){
        this.matrixOne = matrixOne;
        this.matrixTwo = matrixTwo;
    }
    public boolean hasEqualRowsAndColumns(){
        if (this.matrixOne.rows==this.matrixTwo.rows && this.matrixOne.columns== this.matrixTwo.columns){
            return true;
        }
        return false;
    }
    public Matrices add() throws Exception{
        if (!hasEqualRowsAndColumns()) throw IndexOutOfBoundsException ;
        Matrices sumMatrix = new Matrices(matrixOne.rows, matrixTwo.columns);
        for (int i = 0; i < matrixOne.rows; i++){
            for (int j = 0; j < matrixOne.columns; j++){
                sumMatrix.appendIntoMatrix(i,j,(matrixOne.getElement(i, j)+matrixTwo.getElement(i, j)));
            }
        }
        return sumMatrix;
    }
    public Matrices subtract() throws Exception{
        if (!hasEqualRowsAndColumns()) throw IndexOutOfBoundsException ;
        Matrices subMatrix = new Matrices(matrixOne.rows, matrixTwo.columns);
        for (int i = 0; i < matrixOne.rows; i++){
            for (int j = 0; j < matrixOne.columns; j++){
                subMatrix.appendIntoMatrix(i,j,(matrixOne.getElement(i, j)-matrixTwo.getElement(i, j)));
            }
        }
        return subMatrix;
    }
    public boolean multiplicable(){
        if (this.matrixOne.rows==this.matrixTwo.columns) return true;
        else if (this.matrixOne.columns== this.matrixTwo.rows) return true;
        else return false;
    }
    public Matrices primaryMatrix(){
        if (this.matrixOne.rows==this.matrixTwo.columns) return matrixTwo;
        else return matrixOne;
    }
    public Matrices secondaryMatrix(){
        if (this.matrixOne.rows==this.matrixTwo.columns) return matrixOne;
        else return matrixTwo;
    }
    public Matrices multiply() throws Exception{
        if(!multiplicable()) throw IndexOutOfBoundsException;
        Matrices productMatrix = new Matrices(primaryMatrix().rows, secondaryMatrix().columns);
        Matrices primaryMatrix = primaryMatrix();
        Matrices secondaryMatrix = secondaryMatrix();
        int[] rowElements = new int[primaryMatrix.rows];
        return productMatrix;
    }

}
