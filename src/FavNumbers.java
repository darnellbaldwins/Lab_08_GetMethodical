import java.util.Scanner;
public class FavNumbers {
    public static int getInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("That is not a interger, try entering it in again.");
                scanner.next();
            }
        }
    }
    public static double getDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("That's not a double number, try entering it in again.");
                scanner.next();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whats your favorite int: ");
        int favInt;
        favInt = getInt(scanner);
        System.out.print("Whats your favorite double: ");
        double favDouble;
        favDouble = getDouble(scanner);
        System.out.println("Your favorite integer is: " + favDouble);
        System.out.println("Your favorite double is: " + favDouble);
        scanner.close();
    }
}
