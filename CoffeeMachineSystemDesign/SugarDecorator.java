package CoffeeMachineSystemDesign;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " + with Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+5.0;
    }
}
