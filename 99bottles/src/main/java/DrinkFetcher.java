import domain.Drink;
import domain.LastDrink;
import domain.SingleDrink;

public class DrinkFetcher {
    public static Drink createDrink(int number) {
        if (number == 0)
            return new LastDrink();
        else if (number == 1)
            return new SingleDrink();
        else
            return new Drink(number);
    }
}
