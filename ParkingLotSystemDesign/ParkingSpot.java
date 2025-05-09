package ParkingLotSystemDesign;

public class ParkingSpot {
    private int id;
    private int price;
    private boolean available;
    private Vehicle vehicle;
    public ParkingSpot(int id, int price) {
        this.id = id;
        this.price = price;
        this.available = true;
        this.vehicle = null;
    }
    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
        this.available = false;
    }
    public void unpark(Vehicle vehicle){
        if(this.vehicle == vehicle){
            this.vehicle = null;
            this.available = true;
        }
        else{
            System.out.println("Wrong vehicle to unpark!!!");
        }
    }
}
