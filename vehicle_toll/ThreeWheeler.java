package vehicle_toll;

	class ThreeWheeler extends Vehicle {
	    public ThreeWheeler() {
	        super(30);
	        extraCharge = 30;
	    }

	    public int calculateToll(int noPersons) {
	        return basicToll + (noPersons > 3 ? (noPersons - 3) * extraCharge : 0);
	    }
	}
