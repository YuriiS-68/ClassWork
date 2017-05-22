/**
 * Created by Skorodielov on 20.05.2017.
 */
public class ExampleThree {
    public static void main(String[] args) {
        String input = "1233214";
        boolean isPolidrom = true;

        for (int i = 0, k = input.length()-1; i <= k ; i++, k--) {
            if (input.charAt(i) != input.charAt(k)){
                isPolidrom = false;
                break;
            }
        }
        System.out.println(isPolidrom ? "Palindrom" : "Ne Palindrom");
    }
}
