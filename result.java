import java.util.List;
import java.util.Scanner;

public class result {
    class Result {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            // Write your code here
            Scanner in = new Scanner(System.in);

            int diagonal1 = 0;
            int diagonal2 = 0;


            for(int i = 0; i < arr.size(); i++){
                List<Integer> row = arr.get(i);
                diagonal1 += row.get(i);
                diagonal2 += row.get(arr.size() - i - 1);
            }


            return Math.abs(diagonal1-diagonal2);

        }
    }
}
