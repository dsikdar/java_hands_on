package collectiontest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author DEBAJYOTI deb_sik@yahoo.com
 */
public class CollectionsExampleBasic {

	public static void main(String[] args) {

		System.out.println("Lists ");

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee e1 = new Employee();

		Employee e2 = new Employee();

		e1.age = 15;

		e2.age = 16;

		employeeList.add(e1);

		employeeList.add(e2);

		for (Employee e : employeeList) {
			System.out.println(e.age);
		}

		System.out.println("First employee : " + employeeList.get(0).age);

		Integer a = 10;

		Integer b = 12;

		Integer c = 13;

		List<Integer> intList = new LinkedList<Integer>();

		intList.add(c);
		intList.add(b);
		intList.add(a);

		System.out.println(intList);

		System.out.println(intList.get(0));

		intList.add(3, 100);

		System.out.println(intList.get(3));

		System.out.println(intList.contains(100));

		System.out.println(intList.indexOf(100));

		intList.remove(3);

		intList.remove(new Integer(13));

		System.out.println(intList);

		Set<Integer> intSet = new HashSet<Integer>();

		intSet.add(1);
		intSet.add(2);
		intSet.add(1);

		System.out.println(intSet.isEmpty());

		intSet.add(3);

		System.out.println(intSet);

		System.out.println(intSet.size());

		Set<Integer> intSortedSet = new TreeSet<Integer>();

		intSortedSet.add(10);
		intSortedSet.add(2);
		intSortedSet.add(2);

		System.out.println(intSortedSet.isEmpty());

		intSortedSet.add(3);

		System.out.println(intSortedSet);

		System.out.println(intSortedSet.size());
		
		Map<Integer,String> records=new HashMap<Integer,String>();
		
		records.put(1,"Debajyoti");
		
		records.put(2,"Arindam");
		
		records.put(1,null);
		
		records.put(null,"sikdar");
		
		for(Integer i: records.keySet()) {
			
			System.out.println(i+ " " + records.get(i));
		}
		
		System.out.println(records.containsValue("Arindam"));
		
		System.out.println(records.containsKey(2));
		
	}

}

class Employee {

	public int age = 10;
}