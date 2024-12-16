import java.util.Scanner;

public class CheckIPAddress {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid IP address: ");
        String ipAdd = scanner.next();

        if (IPCheck(ipAdd)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
        scanner.close();

    }

    public static boolean IPCheck(String ipAdd) {

        String[] parts = ipAdd.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            int value;
            try {
                value = Integer.parseInt(part);
            } catch (NumberFormatException e) {
                return false;
            }

            if (value < 0 || value > 255) {
                return false;
            }
            if (i == 0 && (value == 0 || part.length() == 1)) {
                return false;
            }
        }
        return true;

    }

}
