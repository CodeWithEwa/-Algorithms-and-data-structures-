class Vowels {

    public static int countVowels(String str) {
        char[] vowelsList = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (char letter : str.toLowerCase().toCharArray()) {
            for (char vowel : vowelsList) {
                if (letter == vowel) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {

        int result = countVowels("Why do you ask?");
        System.out.println("Number of vowels: " + result);
    }
}