public class FindHeightOfBabies {

    public static void main(String[] args) {

        int heights[] = {64, 49, 60, 53, 62, 51, 57, 52, 65, 59};
        int lowest = findLowest(heights);
        int secondLowest = findSecondLowest(heights);

        System.out.println("Lowest height: " + lowest);
        System.out.println("Second lowest height: " + secondLowest);

    }

    public static int findLowest(int heights[]) {
        int lowest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < lowest) {
                lowest = heights[i];
            }
        }
        return lowest;

    }

    public static int findSecondLowest(int heights[]) {

        int lowest = heights[0];
        int secondLowest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < lowest) {
                secondLowest = lowest;
                lowest = heights[i];
            } else if (heights[i] > lowest && heights[i] < secondLowest) {
                secondLowest = heights[i];
            }
        }
        return secondLowest;

    }

}
