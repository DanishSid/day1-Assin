public class Main {

    public static void main(String[] args) {
        System.out.println(isNameValid("Danish"));  // true
        System.out.println(isNameValid("Zeeshan")); // false (contains 'i' more than once)
        System.out.println(isNameValid("Musharaf")); // false (contains 'S' and 'T' in incorrect order)
        System.out.println(isNameValid("Ashu")); // false (contains 'T' between two 'S's)
        System.out.println(isNameValid("Siddiqui")); // true
    }

    public static boolean isNameValid(String name) {
        // Check if any vowel appears more than once
        if (containsDuplicateVowels(name))
            return false;

        // Check if there's 'S' followed by 'T' between two 'S's
        if (containsSTInBetween(name))
            return false;

        // If all conditions are met, the name is valid
        return true;
    }

    private static boolean containsDuplicateVowels(String name) {
        // Convert the name to lowercase for case-insensitive comparison
        String lowerCaseName = name.toLowerCase();

        // Count occurrences of each vowel
        int[] vowelCount = new int[5]; // a, e, i, o, u

        for (char ch : lowerCaseName.toCharArray()) {
            switch (ch) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }

        // If any vowel occurs more than once, return true
        for (int count : vowelCount) {
            if (count > 1)
                return true;
        }

        return false;
    }

    private static boolean containsSTInBetween(String name) {
        // Convert the name to uppercase for case-insensitive comparison
        String upperCaseName = name.toUpperCase();

        // Find the first occurrence of 'S' in the name
        int firstSIndex = upperCaseName.indexOf('S');

        // If 'S' is not found or it's the last character, return false
        if (firstSIndex == -1 || firstSIndex == name.length() - 1)
            return false;

        // Find the next occurrence of 'S' after the first one
        int secondSIndex = upperCaseName.indexOf('S', firstSIndex + 1);

        // If 'S' is not found again, return false
        if (secondSIndex == -1)
            return false;

        // Check if 'T' appears between the two 'S's
        for (int i = firstSIndex + 1; i < secondSIndex; i++) {
            if (upperCaseName.charAt(i) == 'T')
                return true;
        }

        return false;
    }
}
