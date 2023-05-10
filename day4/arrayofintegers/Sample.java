package day4.arrayofintegers;

import java.util.Arrays;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(2,5,8,6,9);
list.stream().filter(n->n%2==0).sorted().forEach(n->System.out.println(n));
	}

}
