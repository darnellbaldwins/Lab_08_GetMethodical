import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";

        do {

            System.out.print("\n" + prompt + ": ");

            retString = pipe.nextLine();

        } while (retString.length() == 0);


        return retString;


    }
}

