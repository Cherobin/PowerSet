package powerset;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args)  {

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double startTime = System.currentTimeMillis();
		
		PowerSet ps = new PowerSet();

		Set<HashSet<Integer>> powerSet = ps.getPowerSet(input);
		
		System.out.println(powerSet);

		double endTime = System.currentTimeMillis();
		double TotalTime = endTime - startTime;
		
		System.out.println("");
		System.out.println("The total time " + TotalTime + " ms.");
	} 
}
 