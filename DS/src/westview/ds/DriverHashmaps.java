package westview.ds;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class DriverHashmaps {
	public static void main(String[]args) {
		HashMap m = new HashMap<String, String>();
		
		HashMap StateMap = new HashMap<String, ArrayList<String>>();
		HashMap CityMap = new HashMap<String, ArrayList<String>>();
		
		try {
			Scanner scanner = new Scanner(new File("covid417.csv"));
			scanner.nextLine();
			while(scanner.hasNext()) {
				String[] Line = scanner.nextLine().split(",");
				
				String city = Line[0];
				//.System.out.println(city);
				String state = Line[1];
				//System.out.println(state);
								
				int confirmed = Integer.parseInt(Line[2]);
				int active = Integer.parseInt(Line[5]);
//				System.out.println(confirmed);
				if(StateMap.containsKey(state)) {
					int total = confirmed;
					StateMap.replace(state, total);
				}
				else {
					StateMap.put(state, 0);
				}
				
				//System.out.println(StateMap);
				CityMap.put(city +" "+ state, confirmed);
			}
			
			while(true) {
				Scanner inputScannerState = new Scanner(System.in);
		        System.out.println("Enter State Name: ");
		        String inputState = inputScannerState.nextLine().toLowerCase();
		        inputState = inputState.substring(0, 1).toUpperCase() + inputState.substring(1);
		        if(StateMap.get(inputState) != null) {
			        System.out.println("Retrieving Data for " + inputState + "...");
					inputScannerState.close();
					System.out.println("Confirmed Cases for " + inputState + ": " + StateMap.get(inputState));
			        break;
		        }
		        else {
		        	continue;
		        }     
			}
			System.out.println();

			while(true) {
				Scanner inputScannerCity = new Scanner(System.in);
		        System.out.println("Enter City Name: ");
		        String inputCity = inputScannerCity.nextLine().toLowerCase();
		        inputCity = inputCity.substring(0, 1).toUpperCase() + inputCity.substring(1);
		        if(StateMap.get(inputCity) != null) {
			        System.out.println("Retrieving Data for " + inputCity + "...");
			        inputScannerCity.close();
					System.out.println("Confirmed Cases for " + inputCity + ": " + StateMap.get(inputCity));
			        break;
		        }
		        else {
		        	continue;
		        }     
			}
			
			scanner.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
