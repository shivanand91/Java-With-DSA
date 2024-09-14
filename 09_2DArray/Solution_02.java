public class Solution_02 {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("foud at: " + i + ", " + j);
                    return true;
                }
            }
        }

        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 3, 5, 4},
            {2, 4, 5, 6},
            {4, 6, 8, 9}
        };

        search(matrix, 7);

    }
    
    
}
