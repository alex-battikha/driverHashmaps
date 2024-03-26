package westview.ds;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {
	
	//Updated Class
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter Capitalized State Name: ");
        String input = inputScanner.nextLine();
        inputScanner.close();
        System.out.println("Retrieving Data for " + input + "...");
		
		HashMap m = new HashMap<String, String>();
		
		//adding entries
//		m.put("nice", "mean");
//		m.put("motivated", "lazy");
//		m.put("rich", "poor");
		
		//query the map for a non-existing key
//		System.out.println(m.get("study"));
//		
//		System.out.println(m.get("rich"));
//		
//		System.out.println(m.size());
//		
//		HashMap m2 = new HashMap<String, ArrayList<String>>();
//		
//		ArrayList<String> food = new ArrayList<String>();
//		food.add("Pasta");
//		food.add("Coffee");
//		food.add("Cake");
//		food.add("Boba");
//		
//		m2.put("Mr. David", "food");
//		
//		System.out.println(m2.get("Mr. David"));
		
		try {
			System.out.println("Reading...");
			File file = new File("covid417.csv");
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				String[] fullArr = scanner.nextLine().split(",");
			}
			
			
			scanner.close();
		}
		
		catch(Exception e) {
			
		}
	}
	
}
