//It is a sparse matrix if number of 0s is greater than size / 2
class qs1 {
    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 1} , {0, 4, 0} , {5, 0, 0}}; // we must not declare array say while intiializing
        int count = 0;
        for (int i = 0; i < matrix.length; i++) { //a.length used to calculate number of rows
            for (int j = 0; j < matrix[0].length; j++) { //a[0].length used to calculate number of columns
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }
        int elements = matrix.length * matrix[0].length;
        if (count > elements / 2) {
            System.out.println("It is a sparse matrix");
        }
        else {
            System.out.println("It is not a sparse matrix");
        }
    }
}