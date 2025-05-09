package CoffeeMachineSystemDesign;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ " + with Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+20.0;
    }
    
}
