public class CountNumOfWordsCharsVowelsConsonant {

    public static void main(String[] args) {

        String string = "I am a SQA Engineer";
        String vowels = "aeiou";

        String[] str1 = string.split(" ");
        System.out.println("Words: " + str1.length);

        String chars = string.replace(" ", "");
        System.out.println("Characters: " + chars.length());

        String lowerCase = chars.toLowerCase();

        int countVowels = 0;
        int countConsonants = 0;
        char[] charArray = lowerCase.toCharArray();

        for (char c : charArray) {
            if (c >= 'a' && c <= 'z') {
                if (vowels.indexOf(c) != -1) {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }

        }
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);

    }

}
