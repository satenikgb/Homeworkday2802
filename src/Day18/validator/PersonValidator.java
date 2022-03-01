package Day18.validator;

public final class PersonValidator {
    private PersonValidator() {
        super();
    }

    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isValidFirstName(String firstname) {
        if (firstname == null || firstname.length() == 00) {
            return false;
        }
        int len = firstname.length();
        return (len >= 3 && len <= 15);
    }

    public static boolean isValidLastName(String lastname) {
        if (lastname == null || lastname.length() == 00) {
            return false;
        }
        int len = lastname.length();
        return (len >= 6 && len <= 20);
    }

    public static boolean isValidGender(String gender) {
        if (gender.compareToIgnoreCase("male") != 0 || gender.compareToIgnoreCase("female") != 0) {
            return false;
        }
        return (gender.compareToIgnoreCase("male") == 0 || gender.compareToIgnoreCase("female") == 0);
    }

    public static boolean isValidPassportId(String passportId) {
        boolean b = true;
        for (int i = 2; i < passportId.length(); i++) {
            char ch = passportId.charAt(i);
            b = b && Character.isDigit(ch);

            if (!b) {
                return false;
            }

        }
        return passportId.length() == 8 && passportId.startsWith("AN") && b;
    }


}

