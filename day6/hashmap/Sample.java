package day6.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> nums = new HashMap<>();
		nums.put("Suvarna", 20);
		nums.put("Sai", 21);
		nums.put("Priya", 21);
		nums.put("Anjali", 21);
//System.out.println(nums);

//System.out.println(nums.get("Sai"));

//System.out.println(nums.remove("Priya"));
		System.out.println(nums.remove("Priya", 21));
//System.out.println(nums.values());
//System.out.println(nums.keySet());

		for (String key : nums.keySet()) {
			System.out.println(key + " : " + nums.get(key));
		}
	}

}
