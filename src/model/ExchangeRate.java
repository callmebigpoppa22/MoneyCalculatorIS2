package model;

/**
 *
 * @author usuario
 */
public class ExchangeRate {

    final Currency fromCurrency;
    final Currency toCurrency;
    final Number rate;

    public ExchangeRate(Currency fromCurrency, Currency toCurrency, Number rate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
    }

}
