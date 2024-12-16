public class RemoveVowels {

    public static void main(String[] args) {

        String input = "I am a SQA Engineer";
        String lowercase = input.toLowerCase();
        String output = "";

        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                output = output + c;
            }
        }

        String finalOutput = output.replaceAll(" +", " ").trim();

        System.out.println("Output: " + finalOutput);

    }
}
