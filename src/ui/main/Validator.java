package ui.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Validator {

    private Validator() {

    }

    public static boolean validateName(JPanel obj, String name) {
        if (name != null && name.matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public static boolean validatePassword(JPanel obj, String password) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#$%^&+=~|?])(?=\\S+$).{8,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean validateUserName(JPanel obj, String username) {
        if (username != null && username.length() > 1) {
            return true;
        }
        JOptionPane.showMessageDialog(obj, "Invalid input : username should contain 2 or more characters");
        return false;
    }

}
