package BasicChallenges02.J_ValidateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        System.out.println(validateEmail("john@gmail.com"));
        System.out.println(validateEmail("john@gmail"));
    }

    public static boolean validateEmail(String email) {
        // use regex101.com to create these
        String regex = "^[a-z]{3}.*@[a-z]{3}[a-z]*\\.[a-z]{2}[a-z]$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
