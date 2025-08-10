package basicjava;
import java.util.Arrays;
public class diagonal {
  public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] b = {
            {3, 2, 1},
            {6, 5, 4},
            {9, 8, 7}
        };
        int[][] res = new int[a.length][a[0].length]; 
       for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[0].length; c++) {
                res[r][c] = a[r][c] + b[r][c];
            }
        }
        System.out.println("Sum of matrices:");
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Main diagonal of the result:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i][i] + " ");
        }
    }
}
