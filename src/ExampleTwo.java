/**
 * Created by Skorodielov on 20.05.2017.
 */
public class ExampleTwo {
    public static void main(String[] args) {
        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {6, 7, 8, 9, 10};
        int [] resultMultiplay = new int[5];

        for (int i = 0; i < array1.length; i++) {
            resultMultiplay [i] = array1[i] * array2[i];
        }

        int sumMassive = 0;
        for (int value : resultMultiplay) {
            sumMassive += value;
        }
        System.out.println(Math.sqrt(sumMassive));
    }
}
