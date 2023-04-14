public class Practical_4 {
    public static void main(String[] args) {       
        System.out.println("216090307039");
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(System.console().readLine("Enter a number: "));
            }
        }
        int[][] matrix_2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_2[i][j] = Integer.parseInt(System.console().readLine("Enter a number: "));
            }
        }
        int[][] matrix_3 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix_3[i][j] = matrix[i][j] + matrix_2[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix_3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
