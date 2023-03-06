import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputString = sc.nextLine();

        // extracting numbers
        String []arrayString = inputString.split(",");
        byte []array = new byte[arrayString.length];

        for(int i = 0; i < arrayString.length; i++) {
            array[i] = Byte.parseByte(arrayString[i]);
        }

        // printing segregated array
        System.out.println(Arrays.toString(Segregate.segregateArray(array)));

        // closing resource
        sc.close();
    }
}