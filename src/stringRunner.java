import java.util.Scanner;
public class stringRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string.");
        String firstString = scan.nextLine();
        System.out.println("length: " + firstString.length());
        System.out.println("first half: " + firstString.substring(0, firstString.length() / 2));
        System.out.println("second half: " + firstString.substring(firstString.length() / 2));

        System.out.println("Enter another string.");
        String secondString = scan.nextLine();

        if (firstString.length() > secondString.length())
        {
            System.out.println(firstString + " is longer than " + secondString + ".");
        } else if (firstString.length() == secondString.length()){
            System.out.println(firstString + " has the same length as " + secondString + ".");
        } else {
            System.out.println(secondString + " is longer than " + firstString + ".");
        }

        if (firstString.equals(secondString)){
            System.out.println("They have the same characters.");
        } else if (firstString.compareTo(secondString) < 0 ){
            System.out.println(firstString + " is first alphabetically.");
        } else {
            System.out.println(secondString + "is first alphabetically.");
        }

        if (firstString.indexOf(secondString) == -1){
            System.out.println(secondString + " is not found in " + firstString);
        } else {
            System.out.println(secondString + " is found in " + firstString + " at index " +firstString.indexOf(secondString) );
        }

        if (firstString.indexOf(firstString.length()) == secondString.indexOf(firstString.length())){
            System.out.println(firstString + " and " + secondString + " have the same last letter.");
        }


    }

}