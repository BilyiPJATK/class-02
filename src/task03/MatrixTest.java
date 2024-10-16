package task03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrixTest {

    private Matrix matrix;


    @BeforeEach
    public void setup() {
        int[][] arr = {
                {1,3,0},
                {0,1,0},
                {0,9,1}
        };

        matrix = new Matrix(arr);
    }

    @Test
    public void TestIsSquare(){
        assertTrue(matrix.isSquare());
    }

    @Test
    public void TestTranspose(){
        int[][] matrixT = {
                {1,0,0},
                {3,1,9},
                {0,0,1}
        };

        assertArrayEquals(matrixT, matrix.transpose().getData());
    }

    @Test
    public void testAdditionDimensionalMismatch() {
        int[][] incompatibleArray = {
                {1, 2},
                {3, 4}
        };
        Matrix incompatibleMatrix = new Matrix(incompatibleArray);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            matrix.multiply(incompatibleMatrix);
        });

        String expectedMessage = "Niepoprawne wymiary macierzy do mnożenia!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testAddition(){
        int[][] arrMatrixTwo = {
                {1,0,0},
                {3,1,9},
                {5,0,1}
        };

        int[][] arrCorrectMatrix = {
                {2,3,0},
                {3,2,9},
                {5,9,2}
        };

        Matrix matrixTwo = new Matrix(arrMatrixTwo);
        Matrix matrixCorrect = new Matrix(arrCorrectMatrix);


        assertArrayEquals(matrixCorrect.getData(), matrix.add(matrixTwo).getData());
    }

    @Test
    public void testMultiplication(){
        int[][] arrMatrixTwo = {
                {1,0},
                {3,1},
                {5,0}
        };

        int[][] arrCorrectMatrix = {
                {10,3},
                {3,1},
                {32,9}
        };

        Matrix matrixTwo = new Matrix(arrMatrixTwo);
        Matrix matrixCorrect = new Matrix(arrCorrectMatrix);


        assertArrayEquals(matrixCorrect.getData(), matrix.multiply(matrixTwo).getData());
    }
}
