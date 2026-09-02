import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<inputDevice> deviceList = new ArrayList<>();

    while(true){
        System.out.println("Give device name: ");
        String deviceName = scanner.nextLine();

        if (deviceName.isEmpty()){
            break;
        }

        System.out.println("Give IP Address: ");
        int ipAddress = Integer.valueOf(scanner.nextLine());

        System.out.println("Give device type: ");
        String deviceType = scanner.nextLine();

    }
        

    }
}