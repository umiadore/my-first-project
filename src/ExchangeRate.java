import java.util.HashMap;
import java.util.Map;


// Класс, который хранит фиксированные курсы обмена валют
// и предоставляет их по запросу

public class ExchangeRate {

    // создаем список, где храним пары
        private final Map<String, Double> exchangeRates;

        public ExchangeRate() {
            exchangeRates = new HashMap<>();

            // 6 значений курсовых пар
            exchangeRates.put("USD_EUR", 0.85);
            exchangeRates.put("EUR_USD", 1.18);
            exchangeRates.put("USD_GBP", 0.75);
            exchangeRates.put("GBP_USD", 1.33);
            exchangeRates.put("EUR_GBP", 0.88);
            exchangeRates.put("GBP_EUR", 1.14);
        }

        // метод для получения курса
        public double getExchangeRate(String fromCurrency, String toCurrency) {
            // если валюты совпадают (что бред) то курс 1
            if (fromCurrency.equals(toCurrency)) {
                return 1.0;
            }
            return exchangeRates.getOrDefault(fromCurrency + "_" + toCurrency, 1.0);
        }
    }

