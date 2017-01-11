package MekiciSolver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MekiciSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			
		     System.out.println(solve(sc));
			
		}
		sc.close(); 

	}

	private static int solve(Scanner sc) {
	
		int mekiciCount = sc.nextInt();
		int kotloniCount =  sc.nextInt();
		
		ArrayList<Integer> korloni = new ArrayList<>();
		for (int i = 0; i < kotloniCount; i++) {
			korloni.add(sc.nextInt());
		}
		
		int minimumTime = calculateMinimumTime(mekiciCount, kotloniCount, korloni);
		return minimumTime;
	}

	private static int calculateMinimumTime(int mekiciCount, int kotloniCount, ArrayList<Integer> korloni) {
		int low = 0;
		int high = Collections.max(korloni) * mekiciCount;
		
		while (low < high) {
			
			int mid = low + (high - low)/2;
			
			if(canCookMekici(mekiciCount, kotloniCount, korloni, mid)){
				
				high = mid;
			}else{
				low = mid+ 1;
			}
		}
		
		
		return low;
	}

	private static boolean canCookMekici(int mekiciCount, int kotloniCount, ArrayList<Integer> korloni, int availableTime) {
		
		int cookedMekici = 0;
		for(Integer kotlon : korloni){
			
			cookedMekici+=availableTime/kotlon;
		}
		
		
		return cookedMekici >= mekiciCount;
	}
	
	

}
