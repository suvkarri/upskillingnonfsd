
package day6.comparatorrr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10)
					return 1;
				else
					return -1;
			}
		};

		List<Integer> nums = new ArrayList<>();
		nums.add(21);
		nums.add(19);
		nums.add(43);
		nums.add(31);

		Collections.sort(nums, com);

		System.out.println(nums);

	}

}
