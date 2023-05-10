package day4.arrayofstrings;

import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> arr= Arrays.asList("A","C","B","E","B");
arr.stream().sorted().forEach(s -> System.out.println(s));
	}

}
