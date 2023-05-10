package day6.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection<Integer> nums = new ArrayList<Integer>();

		List<Integer> nums = new ArrayList<>();
		nums.add(7);
		nums.add(5);
		nums.add(4);
		nums.add(9);
		nums.add(5);
//nums.add("3");

//System.out.println(nums.indexOf(5));

//System.out.println(nums.get(2));
//
		for (int n : nums) {
			System.out.println(n);
		}
System.out.println(nums);
	}

}
