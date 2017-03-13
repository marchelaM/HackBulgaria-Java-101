package DroneDeliverySystem;

import java.util.*;

import DroneDeliverySystem.request.Request;
import DroneDeliverySystem.supply.Supply;
import DroneDeliverySystem.request.*;

public class Main {

	public static void main(String[] args) {
		/**
		Queue<Request> requests = Request.readRequest();
		
		RequestManager reqM = Initializer.initRequestManager();
		
		Iterator<Request> iterator = requests.iterator();
		while (iterator.hasNext()) {
			reqM.processRequest(iterator.next());
		}
		
		int availableDronesNum = reqM.getDroneManager().getAvailableDrones().get(1).getQuantity();
		int unavalableDronesNum = reqM.getDroneManager().getUnavailableDrones().get(1).getQuantity();
		
		System.out.printf("Available drones number: %d%n", availableDronesNum);
		System.out.printf("Unavailable drones number: %d", unavalableDronesNum);
		**/
		
		Queue<Supply> supplies = Supply.readSupply();
		System.out.println(supplies.size());
	}
	
	public static Object readInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What would you like to do? Request or supply?%n"
				+ "for request type /'request/' for supply type /'supply/'");
		
		String keyWord = input.nextLine();
		
		if (keyWord.equals("request")) {
			return Request.readRequest();
			
		} else if (keyWord.equals("supply")) {
			return Supply.readSupply();
			
		} else {
			System.out.println("Please type /'request/' or /'supply/'");
		}
		
		return null;
	}
	
}
