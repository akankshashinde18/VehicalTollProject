package vehicle_toll;


	class HeavyVehicle extends Vehicle {
	    public HeavyVehicle() {
	        super(60);
	        extraCharge = 60;
	    }

	    public int calculateToll(int noPersons) {
	        return basicToll + (noPersons > 6 ? (noPersons - 6) * extraCharge : 0);
	    }
	}