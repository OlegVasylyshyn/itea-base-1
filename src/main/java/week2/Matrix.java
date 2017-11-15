package week2;

public class Matrix {

    public static void main(String[] args) {
        String[][][] matrix = new String[10][10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = "" + i + j + k;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    System.out.print(matrix[i][j][k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
