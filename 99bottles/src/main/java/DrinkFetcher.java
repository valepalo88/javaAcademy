import domain.Drink;
import domain.LastDrink;
import domain.SingleDrink;

public class DrinkFetcher {
    public static Drink createDrink(int number) {
        final Drink drink;
        if (number == 0)
            drink = new LastDrink();
        else if (number == 1)
            drink = new SingleDrink();
        else
            drink = new Drink(number);
        return drink;
    }
}
