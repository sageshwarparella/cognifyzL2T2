import java.util.Scanner;

public class TempConvertor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();

        System.out.println("Choose conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        double convertedTemp;

        if (choice == 1) {
            convertedTemp = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f°C = %.2f°F\n", temperature, convertedTemp);
        } else if (choice == 2) {
            convertedTemp = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f°F = %.2f°C\n", temperature, convertedTemp);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
