package task03; /*
TODO: dana jest klasa unitTests.task03.Matrix, przygotuj dla niej klasę i zestaw testów jednostkostkowych sprawdzających:
 */


public
class Matrix {

    private int[][] data;

    // Konstruktor
    public Matrix(int[][] data) {
        this.data = data;
    }

    // Dodawanie dwóch macierzy
    public Matrix add(Matrix other) {
        if (this.data.length != other.data.length || this.data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Macierze muszą mieć te same wymiary!");
        }

        int[][] result = new int[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                result[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return new Matrix(result);
    }

    // Mnożenie dwóch macierzy
    public Matrix multiply(Matrix other) {
        if (this.data[0].length != other.data.length) {
            throw new IllegalArgumentException("Niepoprawne wymiary macierzy do mnożenia!");
        }

        int[][] result = new int[this.data.length][other.data[0].length];

        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                for (int k = 0; k < this.data[0].length; k++) {
                    result[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    // Transpozycja macierzy
    public Matrix transpose() {
        int[][] result = new int[this.data[0].length][this.data.length];

        for (int i = 0; i < this.data.length; i++) {
            for (int j = 0; j < this.data[0].length; j++) {
                result[j][i] = this.data[i][j];
            }
        }

        return new Matrix(result);
    }

    // Sprawdzanie, czy macierz jest kwadratowa
    public boolean isSquare() {
        return this.data.length == this.data[0].length;
    }

    // Zwracanie danych macierzy do testowania
    public int[][] getData() {
        return this.data;
    }
}
