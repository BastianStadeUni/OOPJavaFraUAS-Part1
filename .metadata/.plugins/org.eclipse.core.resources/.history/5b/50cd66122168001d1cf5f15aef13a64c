
class Bicycle {        
    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }   
}

class MountainBike extends Bicycle {
    
    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   

}

public class Task_2 {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle(5, 0, 1);
		System.out.println("Bicycle b1 created with cadence: " + b1.cadence + " speed: " + b1.speed + " gear: " + b1.gear);
		b1.setCadence(10);
		b1.setGear(2);
		System.out.println("Bicycle b1 changed to cadence: " + b1.cadence + " speed: " + b1.speed + " gear: " + b1.gear);
		b1.speedUp(5);
		System.out.println("b1 speed increased to: " + b1.speed);
		b1.applyBrake(3);
		System.out.println("b1 speed decreased to: " + b1.speed);
		MountainBike m1 = new MountainBike(5, 4, 0, 1);
		System.out.println("MountainBike m1 created with seat heigth: " + m1.seatHeight + " cadence: " + m1.cadence + " speed: " + m1.speed + " gear: " + m1.gear);
		m1.setHeight(7);
		System.out.println("m1 seat heigth changed to: " + m1.seatHeight);

	}

}
