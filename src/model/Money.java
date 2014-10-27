package model;

/**
 *
 * @author usuario
 */
public class Money {

    final Number amount;
    final Currency currency;

    public Money(Number amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

}
