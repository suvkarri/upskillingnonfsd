package day6.treeset;

import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
	public static void main(String args[]) {
		Set<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(2);
		nums.add(7);
		nums.add(7);

		Iterator<Integer> itr = nums.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

//	for(int n :nums) {
//		System.out.println(n);
//	}
	}
}
