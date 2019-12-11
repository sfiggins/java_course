package chapter8;

import java.util.Scanner;

/*
 * Validate complexity of a proposed password by assuring it meets these rules:
 * at least 8 characters long
 * contain an uppercase letter
 * contain a special character
 * does not contain the username
 * is not the same as the old password.
 */
public class PasswordValidator {

    private static String username="stephen";
    private static String password="!9M5nlNq0H8I0ost";
    private static final int MINIMUMSIZE = 8;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        var valid = false;

        while(!valid){
            System.out.println("Enter a new password: ");
            String proposedPassword = scanner.next();
            valid = validatePassword(proposedPassword);
        }
        scanner.close();
    }

    /**
     * Validates if a password meets all of our validation criteria
     * @param proposedPassword The password string to validate
     * @return whether the password is valid or not.
     */
    private static boolean validatePassword(String proposedPassword){

        // Test length is long enough
        if(proposedPassword.length() < MINIMUMSIZE){
            System.out.println(String.format("Your password must be at least %d characters", MINIMUMSIZE));
            return false;
        }

        if(proposedPassword.equals(password)) {
            System.out.println("Your password must be different than your current password.");
            return false;
        }

        if(proposedPassword.toLowerCase().contains(username.toLowerCase())) {
            System.out.println("Your password cannot contain your username.");
            return false;
        }

        // look for an upper case letter
        boolean hasUppercase = !proposedPassword.equals(proposedPassword.toLowerCase());
        boolean hasSpecial = !proposedPassword.matches("[A-Za-z ]*");

        if(!hasUppercase){
            System.out.println("Your character must contain at least one upper case character.");
            return false;
        }

        if(!hasSpecial){
            System.out.println("Your character must contain at least one special character.");
            return false;
        }

        System.out.println("Your password is accepted.");
        return true;
    }
}
