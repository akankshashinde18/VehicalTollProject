package vehicle_toll;
import java.util.Scanner;

		public class Main {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int choice;
		        int noPersons;

		        do {
		            System.out.println("Toll Calculator");
		            System.out.println("1. Two Wheeler");
		            System.out.println("2. Three Wheeler");
		            System.out.println("3. Four Wheeler");
		            System.out.println("4. Heavy Vehicle");
		            System.out.println("0. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();

		            if (choice != 0) {
		                System.out.print("Enter the number of persons: ");
		                noPersons = scanner.nextInt();
		                int toll = 0;

		                switch (choice) {
		                    case 1:
		                        TwoWheeler twoWheeler = new TwoWheeler();
		                        toll = twoWheeler.calculateToll(noPersons);
		                        break;
		                    case 2:
		                        ThreeWheeler threeWheeler = new ThreeWheeler();
		                        toll = threeWheeler.calculateToll(noPersons);
		                        break;
		                    case 3:
		                        FourWheeler fourWheeler = new FourWheeler();
		                        toll = fourWheeler.calculateToll(noPersons);
		                        break;
		                    case 4:
		                        HeavyVehicle heavyVehicle = new HeavyVehicle();
		                        toll = heavyVehicle.calculateToll(noPersons);
		                        break;
		                    default:
		                        System.out.println("Invalid option.");
		                }

		                System.out.println("Toll Amount: Rs " + toll);
		                System.out.println();
		            }
		        } while (choice != 0);

		       
		    }
		


	}


