import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] LA = {1,3,5,7,8};
        int targetNumber = 7;
        int n = 5;

        System.out.println("The original array elements:");

        for (int i = 0; i < n; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        for (int i = 0; i < n; i++) {
            if (LA[i] == targetNumber){
                System.out.println("Element " + targetNumber + " found at index " + i);
                break;
            }
            continue;
        }

        

       

        

        



        

        

    }
}