package powerset;

import java.util.HashSet;
import java.util.Set;

public class PowerSet {

	public Set<HashSet<Integer>> getPowerSet(int[] count) {
		
		Set<HashSet<Integer>> powerset = new HashSet<HashSet<Integer>>();
		
		generatePowerSet(count, powerset, new HashSet<Integer>(), count.length, 0);
		
		powerset.add(new HashSet<Integer>()); // Add the empty set
		
		return powerset;
	}

	private void generatePowerSet(int[] input, Set<HashSet<Integer>> set, Set<Integer> subset, int n, int start) {
		
		for (int i = start; i < n; i++) {
			
			int number = input[i];
			
			subset.add(number);
			
			set.add(new HashSet<Integer>(subset));
			
			if (i < n - 1) {
				generatePowerSet(input, set, subset, n, i + 1);
			}
			
			subset.remove(number);
		}
	}
}
