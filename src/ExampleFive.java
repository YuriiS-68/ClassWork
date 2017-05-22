/**
 * Created by Skorodielov on 20.05.2017.
 */
public class ExampleFive {
    public static void main(String[] args) {
        int size = 3;
        int [][] matrix = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        //int indexLr = 1;
        //int indexRl = size - 1;
        int resultLr = matrix[0][0];
        int resultRl = matrix[0][size - 1];

        for (int i = 1; i < matrix.length; i++) {
            resultLr *= matrix[i][i];
            resultRl *= matrix[i][size - i - 1];
        }
        System.out.println(resultLr);
        System.out.println(resultRl);
    }
}
