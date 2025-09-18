/**
 * A utility class for checking if a password meets a set of strength requirements.
 * This includes checks for minimum length, presence of uppercase and lowercase
 * letters, digits, and special characters, and the absence of spaces.
 */
class StrongPasswordV1 {
    private final String password;
    private final int minimumLength;

    /**
     * Constructs a new StrongPasswordV1 checker.
     *
     * @param password The password to be checked.
     * @param minimumLength The minimum required length for the password.
     */
    public StrongPasswordV1(String password, int minimumLength) {
        this.password = password;
        this.minimumLength = minimumLength;
    }

    /**
     * Checks if the password meets the minimum length requirement.
     *
     * @return {@code true} if the password's length is greater than or equal to
     *         the minimum length, {@code false} otherwise.
     */
    public boolean hasMinimumLength() {
        return password.length() >= minimumLength;
    }

    /**
     * Checks if the password contains any whitespace characters.
     *
     * @return {@code true} if a space is found, {@code false} otherwise.
     */
    public boolean containsSpace() {
        return password.indexOf(' ') >= 0;
    }

    /**
     * Checks if the password contains at least one uppercase letter.
     *
     * @return {@code true} if an uppercase letter is found, {@code false} otherwise.
     */
    public boolean containsUpperCase() {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    /**
     * Checks if the password contains at least one lowercase letter.
     *
     * @return {@code true} if a lowercase letter is found, {@code false} otherwise.
     */
    public boolean containsLowerCase() {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    /**
     * Checks if the password contains at least one digit.
     *
     * @return {@code true} if a digit is found, {@code false} otherwise.
     */
    public boolean containsDigit() {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    /**
     * Checks if the password contains at least one special character.
     * A special character is defined as any character that is not a letter, digit, or whitespace.
     *
     * @return {@code true} if a special character is found, {@code false} otherwise.
     */
    public boolean containsSpecialCharacter() {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Performs a comprehensive check to determine if the password is "strong".
     * A strong password must meet all the following criteria:
     * <ul>
     *     <li>Meets the minimum length.</li>
     *     <li>Does not contain spaces.</li>
     *     <li>Contains at least one uppercase letter.</li>
     *     <li>Contains at least one lowercase letter.</li>
     *     <li>Contains at least one digit.</li>
     *     <li>Contains at least one special character.</li>
     * </ul>
     *
     * @return {@code true} if the password meets all strength criteria, {@code false} otherwise.
     */
    public boolean isStrong() {
        return hasMinimumLength()
                && !containsSpace()
                && containsUpperCase()
                && containsLowerCase()
                && containsDigit()
                && containsSpecialCharacter();
    }

    /**
     * The main entry point for the password checker application.
     * It takes a password and an optional minimum length from the command line,
     * checks the password's strength, and prints the results of each check to the console.
     *
     * @param args Command-line arguments. Expects an optional password as the first
     *             argument and an optional minimum length as the second. Defaults are
     *             provided if arguments are not supplied.
     */
    public static void main(String[] args) {
        String password = args.length > 0 ? args[0] : "MyPassword1";
        int minimumLength = args.length > 1 ? Integer.parseInt(args[1]) : 8;

        StrongPasswordV1 checker = new StrongPasswordV1(password, minimumLength);

        System.out.println("Has minimum length: " + checker.hasMinimumLength());
        System.out.println("Contains space: " + checker.containsSpace());
        System.out.println("Has upper case: " + checker.containsUpperCase());
        System.out.println("Has lower case: " + checker.containsLowerCase());
        System.out.println("Has digit: " + checker.containsDigit());
        System.out.println("Has special character: " + checker.containsSpecialCharacter());
        System.out.println("Is overall strong: " + checker.isStrong());
    }
}