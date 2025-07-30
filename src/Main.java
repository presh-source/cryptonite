class StrongPasswordV1 {
    private String password;

    public static void main(String password) {
        boolean noSpace = false;
        boolean minimumLength = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean number = false;
        boolean special = false;
        char[] passwordChars = password.toCharArray();

        noSpace = password.isBlank();
        minimumLength = password.length() >= 8;

        upperCase = containsUpperCase(password);
        lowerCase = containsLowerCase(password);

    }

    private static boolean containsUpperCase(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    private static boolean containsLowerCase(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}