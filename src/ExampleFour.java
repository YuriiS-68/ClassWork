/**
 * Created by Skorodielov on 20.05.2017.
 */
public class ExampleFour {
    public static void main(String[] args) {
        String inputStr = "1234";
        String invertStr = " ";

        for (int i = inputStr.length()-1; i >= 0 ; i--) {
            invertStr += inputStr.charAt(i);
        }
        System.out.println(invertStr);
    }
}
