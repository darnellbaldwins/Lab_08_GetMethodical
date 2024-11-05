import java.util.Scanner;
public class CheckOut {
    public static double getRangedDouble(Scanner scanner, double min, double max) {
        double input;
        while (true) {
            input = scanner.nextDouble();
            if (input >= min && input <= max) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a price between $" + min + " and $" + max + ".");
            }
        }
        return input;
    }
    public static boolean getYNConfirm(Scanner scanner) {
        while (true) {
            System.out.print("Any other idems to checkout? (Y/N): ");
            String response = scanner.next().toUpperCase();
            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.println("That isnt a valid input, you must enter Y or N");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        do {
            System.out.print("Enter item price (between .50 and 10): ");
            double itemPrice;
            itemPrice = getRangedDouble(scanner, .50, 10);
            totalCost += itemPrice;
        } while (getYNConfirm(scanner));
        System.out.println("The total cost is: $" + Math.round(totalCost * 100.0) / 100.0);
        scanner.close();
    }
}
