package CoffeeMachineSystemDesign;

public class Main {
    public static void main(String[] args) {
        Coffee c1 = new SugarDecorator(new MilkDecorator(new CreamDecorator(new BasicCoffee())));
        System.out.println(c1.getDescription());
        System.out.println(c1.getCost());
        Coffee c2 = new MilkDecorator(new CreamDecorator(new BasicCoffee()));
        System.out.println(c2.getDescription());
        System.out.println(c2.getCost());
    }
}   
