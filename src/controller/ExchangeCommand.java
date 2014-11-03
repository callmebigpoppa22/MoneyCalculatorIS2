package controller;

import model.Exchange;
import view.persistence.ExchangeRateLoader;
import view.ui.ExchangeDialog;
import view.ui.MoneyDisplay;

/**
 *
 * @author callmebigpoppa22
 */
public class ExchangeCommand {

    public ExchangeCommand() {

    }

    public void execute() {
        Exchange exchange = createExchange();
        ExchangeDialog exchangeDialog = createExchangeDialog();
        ExchangeRateLoader exchangeRateLoader = createExchangeRateLoader();
        MoneyDisplay moneyDisplay = createMoneyDisplay();
    }

    private Exchange createExchange() {
        return new Exchange();
    }

    private ExchangeDialog createExchangeDialog() {
        return new ExchangeDialog(createExchange());
    }

    private ExchangeRateLoader createExchangeRateLoader() {
        return new ExchangeRateLoader();
    }

    private MoneyDisplay createMoneyDisplay() {
        return new MoneyDisplay();

    }
}
