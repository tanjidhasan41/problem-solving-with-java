import java.util.Scanner;

public class CheckCGPAUsingBinarySearch {

    public static void main(String[] args) {

        double[] cgpa = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA: ");
        double target = scanner.nextDouble();

        int result = binarySearch(cgpa, target);

        if (result != -1)
        {
            System.out.println("CGPA " + target + " found in the array");
        }
        else
        {
            System.out.println("CGPA " + target + " not found in the array");
        }

        scanner.close();
    }

    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

}
