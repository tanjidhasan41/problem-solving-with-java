import java.util.Arrays;

public class SortingScore {

    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        orderOfHighestCGPA(cgpa);
        System.out.println(Arrays.toString(cgpa));

    }

    public static void orderOfHighestCGPA(double cgpa[]) {

        double temp;

        for (int i = 0; i < cgpa.length; i++) {
            for (int j = i + 1; j < cgpa.length; j++)
            {
                if (cgpa[j] > cgpa[i])
                {
                    temp = cgpa[i];
                    cgpa[i] = cgpa[j];
                    cgpa[j] = temp;
                }
            }
        }

    }

}
