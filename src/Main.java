import java.util.Scanner;

public class Main {


    // здесь будет пользовательский интерфейс консольный

    // введите сумму
    // введите валюту
    // введите конечную валюту
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите сумму для обмена: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введите валюту, которую хотите обменять: ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.println("Введите валюту, на которую хотите обменять: ");
            String toCurrency = scanner.nextLine().toUpperCase();

            double result = currencyConverter.exchange(amount, fromCurrency, toCurrency);

            System.out.println("Конечная сумма: " + result + " " + toCurrency);
            System.out.println("------");

            System.out.println("Хотите ливы посмотреть историю обмена?");

            String reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("да")) {
                currencyConverter.printTransactionHistory();
            }
            System.out.println("Хотите ли вы продолжить обмен?");
            reply = scanner.nextLine();
            if (reply.equalsIgnoreCase("нет")){
                break;
            }
        }

    }
}
