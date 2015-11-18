
public class MyString {

    public  static  int countNumberOfSpecifiedCharacterInString(String str, char symbol) {

        if (str == null || str == "")
            return -1;

        int countSymbols = 0;

        for (int i = 0; i < str.length(); ++i) {

            if (str.charAt(i) == symbol) {
                ++countSymbols;
            }
        }

        return  countSymbols;
    }

    public static boolean searchSameElems(String str, String pattern) {

        if (str == null || pattern == null) {
            return false;
        }

        if (str.length() < pattern.length()) {
            return false;
        }

        int indexMatches = 0;

        boolean flagCoincidence = false;

        for (int i = 0; i < str.length() - pattern.length(); ++i) {

            flagCoincidence = true;

            for (int j = i; j < pattern.length(); ++j) {

                if (str.charAt(j) != pattern.charAt(j)) {
                    flagCoincidence = false;
                    break;
                }
            }

            if (flagCoincidence) {
                ++indexMatches;
            }
        }

        if (indexMatches > 1) {
            return true;
        }

        else {
            return false;
        }
    }
}
