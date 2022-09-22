package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import powerset.PowerSet;

public class PowerSetTest {

	@Test
    public void testSize() {
		
        PowerSet ps = new PowerSet();
         
        int input[] = { 1, 2, 3};
        
        Set<HashSet<Integer>> powerSet = ps.getPowerSet(input);
        
        assertEquals(powerSet.size(),  Math.pow(2, input.length));
    }
	
	@Test
    public void testResult() {
		
        PowerSet ps = new PowerSet();
         
        int input[] = { 1, 2, 3};
        
        Set<HashSet<Integer>> powerSet = ps.getPowerSet(input);
        
        String powerSetOff3 = "[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]";
        
        assertEquals(powerSet.toString(),  powerSetOff3);
    }
}
