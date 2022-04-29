import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.lang.Character;

public class PhoneNumber {
     static String userInput;
     static String userPhoneNumber = "";
     static String formattedNumber = "(";

     public static void validateUserInput(String userInput) {
          //convert user input to array of characters
          char [] userInputAsArray = userInput.toCharArray();
          //check if char at index is a digit, add to userPhoneNumber if it is
          for (int i = 0; i < userInputAsArray.length; i++) {
               if (Character.isDigit(userInputAsArray[i])) {
                    userPhoneNumber = userPhoneNumber + userInputAsArray[i];
               }
          }
          //check if userPhoneNumber is 11 digits long for 1-800 numbers
          if (userPhoneNumber.length() == 11) {
               char [] phoneNumberAsArray = userPhoneNumber.toCharArray();
               //check if first 4 numbers match 1800
               if (phoneNumberAsArray[0] == '1' && phoneNumberAsArray[1] == '8' && phoneNumberAsArray[2] == '0' & phoneNumberAsArray[3] == '0') {
                    //add 800 to formattedNumber
                    for (int i = 1; i < 4; i++) {
                         formattedNumber += phoneNumberAsArray[i];
                    }
                    //add closing parenthesis for area code
                    formattedNumber += ")";
                    //add next 3 digits of phone number to formattedNumber
                    for (int i = 4; i < 7; i++) {
                         formattedNumber += phoneNumberAsArray[i];
                    }
                    //add dash to formattedNumber
                    formattedNumber += "-";
                    //add final 4 digits to formattedNumber
                    for (int i = 6; i < userPhoneNumber.length(); i++) {
                         formattedNumber += phoneNumberAsArray[i];
                    }
                    //ask user if formattedNumber is correct
                    System.out.println("Is " + formattedNumber + " valid? y/n");
               }
          }  //check for all other numbers in next line
          else if (userPhoneNumber.length() == 10) {
               //add first 3 numbers for area code to formattedNumber
               char [] phoneNumberAsArray = userPhoneNumber.toCharArray();
               for (int i = 0; i < 3; i++) {
                    formattedNumber += phoneNumberAsArray[i];
               }
               //add closing parenthesis for area code
               formattedNumber += ")";
               //add next 3 digits of phone number to formattedNumber
               for (int i = 3; i < 6; i++) {
                    formattedNumber += phoneNumberAsArray[i];
               }
               //add dash to formattedNumber
               formattedNumber += "-";
               //add final 4 digits to formattedNumber
               for (int i = 6; i < userPhoneNumber.length(); i++) {
                    formattedNumber += phoneNumberAsArray[i];
               }
               //ask user if formattedNumber is correct
               System.out.println("Is " + formattedNumber + " valid? y/n");
          } else {
               //if userPhoneNumber is not 10 digits long
               System.out.println("Invalid Number");
          }
     }

     public static void main (String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Please enter your phone number:");
          userInput = sc.nextLine();
          validateUserInput(userInput);
          if (formattedNumber.length() > 1) {
               String validateNumber = sc.nextLine();
               //convert answer to lower case
               sc.close();
               validateNumber = validateNumber.toLowerCase();
               if (validateNumber.equals("y") || validateNumber.equals("yes")) {
                    //if number is valid
                    System.out.println(formattedNumber);
               } else {
                    //if number is not valid
                    System.out.println("Invalid Number");
               }
          }
        
     }
}