package vehicle_toll;

	abstract class Vehicle {
	    protected int basicToll;
	    protected int extraCharge;

	    public Vehicle(int basicToll) {
	        this.basicToll = basicToll;
	    }

	    public abstract int calculateToll(int noPersons);
	}


