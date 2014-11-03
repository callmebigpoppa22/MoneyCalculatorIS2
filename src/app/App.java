package app;

import controller.ExchangeCommand;
import view.persistence.CurrencySetLoader;

/**
 *
 * @author callmebigpoppa22
 */
public class App {

    public static void main(String[] args) {
        CurrencySetLoader loader = new CurrencySetLoader();
        loader.load();
        ExchangeCommand command = new ExchangeCommand();
        command.execute();
    }

}
