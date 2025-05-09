package CoffeeMachineSystemDesign;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " + with Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+10.0;
    }
}
