
// Класс, который выполняет операции обмена валют, используя предоставленные
// курсы обмена
// и сохраняет историю обменов после каждой транзакции (в идеале)

public class CurrencyConverter {

    private final ExchangeRate rateProvider;
    private final TransactionsHistory transactionsHistory;

    // конструктор
    public CurrencyConverter() {
        this.rateProvider = new ExchangeRate();
        this.transactionsHistory = new TransactionsHistory();
    }

    // метод для обмена валюты (вводим сумму и пару откуда и куда)
    public double exchange(double amount, String fromCurrency, String toCurrency) {
        double rate = rateProvider.getExchangeRate(fromCurrency, toCurrency);
        double result = amount * rate;

        transactionsHistory.addRecord(new TransactionRecord(amount, fromCurrency, toCurrency, result));
        return result;
    }

    public void printTransactionHistory () {
        transactionsHistory.printHistory();
    }

}
