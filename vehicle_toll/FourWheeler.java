package vehicle_toll;

	class FourWheeler extends Vehicle {
	    public FourWheeler() {
	        super(40);
	        extraCharge = 40;
	    }

	    public int calculateToll(int noPersons) {
	        return basicToll + (noPersons > 4 ? (noPersons - 4) * extraCharge : 0);
	    }
	}

