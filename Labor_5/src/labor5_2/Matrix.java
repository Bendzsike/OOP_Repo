package labor5_2;

import java.util.Random;

public class Matrix {
    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }

    public Matrix(double[][] data) {
        this.data = data;
    }

    public Matrix(Matrix matrix) {
        this.rows = matrix.rows;
        this.columns = matrix.columns;
        this.data = matrix.data;
    }

    public void fillRandom(double first, double last) {
        Random rand = new Random();
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                data[i][j] = rand.nextDouble() * (last - first);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void printMatrix() {
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                System.out.printf("%7.2f", data[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        if(matrix1.rows != matrix2.rows || matrix1.columns != matrix2.columns) {
            System.out.println("Rows and/or columns are not equal!\n");
            System.exit(1);
        }
        Matrix result = new Matrix(matrix1.rows, matrix2.columns);
        for(int i = 0; i < result.rows; ++i) {
            for(int j = 0; j < result.columns; ++j) {
                result.data[i][j] = matrix1.data[i][j] + matrix2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        if(matrix1.columns != matrix2.rows) {
            System.out.println("First matrix's columns aren't equal with second matrix's rows!\n");
            System.exit(2);
        }

        Matrix result = new Matrix(matrix1.rows, matrix2.columns);
        for(int i = 0; i < result.rows; ++i) {
            for(int j = 0; j < result.columns; ++j) {

                for(int k = 0; k < matrix1.columns; ++k) {
                    result.data[i][j] += matrix1.data[i][k] * matrix2.data[k][j];
                }
            }
        }

        return result;
    }
}
