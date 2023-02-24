import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

interface Filler {
    int fill(int x, int y);
}

public class Matrix {
    int columns;
    int rows;
    private int[][] matrixValues;


    public Matrix(int rows, int columns, Filler filler) {
        this(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrixValues[i][j] = filler.fill(i, j);
            }
        }
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrixValues = new int[rows][columns];
    }

    public Matrix(int rows, int columns, int defaultValue) {
        this(rows, columns);
        fill(defaultValue);
    }

    public void fill(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixValues[i][j] = value;
            }
        }
    }

    public void clear() {
        fill(0);
    }

    public int[] getRowsArray(int row) {
        int[] rowArr = new int[row];
        for (int i = 0; i < rows; i++) {
            rowArr[i] = matrixValues[i][row];
        }
        return rowArr;
    }

    public int[] getColumnsArray(int column) {
        int[] columnArr = new int[columns];
        for (int i = 0; i < rows; i++) {
            columnArr[i] = matrixValues[i][column];
        }
        return columnArr;
    }

    void set(int x, int y, int value) {
        matrixValues[x][y] = value;
    }

    int get(int x, int y) {
        return matrixValues[x][y];
    }

    Matrix subMatrix(Range columns, Range rows) {
        Matrix matrix = new Matrix(columns.end - columns.start + 1, rows.end - rows.start + 1);
        int cIndex = 0;
        for (int i = columns.start; i <= columns.end; i++) {

            int rIndex = 0;
            for (int j = rows.start; j <= rows.end; j++) {
                int aa = this.matrixValues[i][j];
                matrix.set(rIndex, cIndex, aa);
                rIndex++;
            }
            cIndex++;
        }
        return matrix;
    }
    public Matrix multiply (Matrix matrix2){
        Matrix resultMatrix = new Matrix(this.columns, matrix2.rows);
        return null;
    }
    int max() {
        int max = matrixValues[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                max = Math.max(max, matrixValues[i][j]);
            }
        }

        return max;
    }

    int min() {
        int min = matrixValues[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                min = Math.min(min, matrixValues[i][j]);
            }
        }

        return min;
    }

    private String generateSpaces(int spaces) {
        StringBuilder spacesBuilder = new StringBuilder(spaces);
        for (int i = 0; i < spaces; i++) {
            spacesBuilder.append(" ");
        }

        return spacesBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int max = (int) (Math.log10(max()));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int currentNumber = matrixValues[i][j];
                String spaces = "";
                if (currentNumber != 0) {
                    spaces = generateSpaces(max - (int) (Math.log10(currentNumber)) + 1);
                } else {
                    spaces = generateSpaces(max + 1);
                }
                if (currentNumber < 0) {
                    spaces = spaces.substring(0, spaces.length()-1);
                }

                stringBuilder.append(spaces + currentNumber);
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Matrix mx = new Matrix(3,1);
        Matrix mx2 = new Matrix(3,4);
        mx.multiply(mx2);
    }
}


