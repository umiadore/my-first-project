
// Класс, который выполняет операции обмена валют, используя предоставленные
// курсы обмена
// и сохраняет историю обменов после каждой транзакции (в идеале)

public class CurrencyConverter {

        private final ExchangeRate rateProvider;

        // конструктор
        public CurrencyConverter() {
            this.rateProvider = new ExchangeRate();
        }

        // метод для обмена валюты (вводим сумму и пару откуда и куда)
        public double exchange(double amount, String fromCurrency, String toCurrency) {
            double rate = rateProvider.getExchangeRate(fromCurrency, toCurrency);
            // double result = amount * rate;
            return (double) amount * rate;


            // еще тут нужно хранить историю где-то транзакции на будущее
        }

}
