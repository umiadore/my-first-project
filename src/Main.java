import java.util.Scanner;

public class Main {


    // здесь будет пользовательский интерфейс консольный

    // введите сумма
    // введите валюту
    // введите конечную валюту
    public static void main(String[] args) {
        CurrencyConverter  currencyConverter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите сумму для обмена: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введите валюту, которую хотите обменять: ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Введите валюту, на которую хотите обменять: ");
            String toCurrency = scanner.nextLine().toUpperCase();

            double result = currencyConverter.exchange(amount, fromCurrency,toCurrency);

            System.out.println("Конечная сумма: " + result + " " +  toCurrency);
        }
    }
}
