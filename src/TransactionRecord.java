import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class TransactionRecord {
    private final LocalDateTime dateTime;
    private final double amount;
    private final String fromCurrency;
    private final String toCurrency;
    private final double result;

    public TransactionRecord(double amount, String fromCurrency, String toCurrency, double result) {
        this.dateTime = LocalDateTime.now();
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Результат операции(й): " +
                "[ Время: " + dateTime +
                ", Сумма: " + amount +
                ", Исходная валюта: '" + fromCurrency + '\'' +
                ", Конечная валюта: '" + toCurrency + '\'' +
                ", Итого: " + result +
                ']';
    }
}
