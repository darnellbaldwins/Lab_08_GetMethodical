public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit");
        System.out.println("---------------------");
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit;
            fahrenheit = CtoF(celsius);
            System.out.println(celsius + "      " + fahrenheit);
        }
    }
    public static double CtoF(double Celsius) {
        return (Celsius * 9/5) + 32;
    }
}

