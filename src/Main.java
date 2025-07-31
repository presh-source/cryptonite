class StrongPasswordV1 {
    private final String password;
    private final int minimumLength;

    public StrongPasswordV1(String password, int minimumLength) {
        this.password = password;
        this.minimumLength = minimumLength;
    }

    public boolean hasMinimumLength() {
        return password.length() >= minimumLength;
    }

    public boolean containsSpace() {
        return password.indexOf(' ') >= 0;
    }

    public boolean containsUpperCase() {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    public boolean containsLowerCase() {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) return true;
        }
        return false;
    }

    public boolean containsDigit() {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    public boolean containsSpecialCharacter() {
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean isStrong() {
        return hasMinimumLength()
                && !containsSpace()
                && containsUpperCase()
                && containsLowerCase()
                && containsDigit()
                && containsSpecialCharacter();
    }

    // Added main() so you can run this class directly
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