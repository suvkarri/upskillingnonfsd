package day6.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(41);
		nums.add(22);
		nums.add(30);
		nums.add(79);
        nums.add(22);

		Iterator<Integer> values = nums.iterator();

		while (values.hasNext())
			System.out.println(values.next());

//for(int n :nums) {
//	System.out.println(n);
//}
	}

}
