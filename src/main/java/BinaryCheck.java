import java.util.Scanner;

public class BinaryCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to determine if it's binary: ");
        String string = scanner.next();
        boolean status = true;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c != '0' && c != '1') {
                status = false;
                break;
            }
        }
        System.out.println(status);

        scanner.close();
    }

}
