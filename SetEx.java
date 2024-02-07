package Java_Ex;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		Set<String> s=new HashSet<>();
		s.add("Paritosh");
		s.add("Murnmai");
		s.add("Nasrin");
		s.add("Amrish");
		s.add("Nasrin");
		s.add("Praveen");
		System.out.println(s);
	SortedSet<String> s1=new TreeSet<>();
		s1.add("Paritosh");
		s1.add("Murnmai");
		s1.add("Nasrin");
		s1.add("Amrish");
		s1.add("Nasrin");
		s1.add("Praveen");
		System.out.println(s1);
		
	}

}
