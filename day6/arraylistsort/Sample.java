package day6.arraylistsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(7);
		nums.add(5);
		nums.add(4);
		nums.add(9);

		Collections.sort(nums);
		System.out.println(nums);
	}

}
