package day6.comparatorrr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> com = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() > o2.length())
					return 1;
				else
					return -1;
			}
		};
		List<String> str = new ArrayList<>();
		str.add("Priya");
		str.add("Neha");
		str.add("Anjali");
		Collections.sort(str, com);
		System.out.println(str);
	}

}
