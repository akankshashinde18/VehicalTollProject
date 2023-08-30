package vehicle_toll;

	class TwoWheeler extends Vehicle {
	    public TwoWheeler() {
	        super(20);
	        extraCharge = 10;
	    }

	    public int calculateToll(int noPersons) {
	        return basicToll + (noPersons > 2 ? (noPersons - 2) * extraCharge : 0);
	    }
	}

