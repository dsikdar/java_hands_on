package stringtest;

/**
 * 
 * @author DEBAJYOTI deb_sik@yahoo.com
 */
public class StringExamples {

	public static void main(String[] args) {

		// building a String in different ways
		String a = "Hello Debajyoti";

		String b = new String("Hello Debajyoti");

		char[] cArr = { 'H', 'e', 'l', 'l', 'o' };

		String c = new String(cArr);

		System.out.println("Strings : " + a + " " + b + " " + c);
///
		System.out.println("Printing an object , a wrappder class and a String");

		Employee debajyoti = new Employee();

		System.out.println("Object :(prints the memory location) " + debajyoti);

		System.out.println("Object hash code : " + debajyoti.hashCode());

		System.out.println("Wrapper class :(prints value) " + new Integer(10));

		System.out.println("String :(prints value) " + b);
///

		System.out.println("Comparison of Strings and Objects ");

		String x = "Hi there";

		String y = "Hi there";

		String z= new String("Hi there");	
		
		System.out.println("equals on Strings  : " + x.equals(y));

		System.out.println("== on Strings  : " + (x == y));

		System.out.println("== on Strings revisit : " + (x == z));
		
		Employee e1 = new Employee();

		Employee e2 = new Employee();

		System.out.println("equals on Objects  : " + e1.equals(e2));

		System.out.println("== on Objects  : " + (e1 == e2));
///
		System.out.println("String methods");
		
		String example1="My name is anonymous1";
		
		String example2="My name is anonymous2";

		System.out.println("concat() : " + example1.concat(example2));
		
		System.out.println("length() : "+example1.length());
		
		System.out.println("indexOf() : "+example1.indexOf('y'));
		
		System.out.println("lastIndexOf() : "+example1.lastIndexOf('y'));
		
		System.out.println("charAt() : "+example1.charAt(1));
		
		System.out.println("subString() : "+example1.substring(7));
		
		System.out.println("subString(beginIndex,endIndex) : "+example1.substring(0,1));

		String[] values=example1.split("\\s+");
		
		System.out.println("split() : ");
		
		for(String i: values)
			System.out.println(i);
		
		System.out.println("replace : "+example1.replace('n','k'));

		System.out.println("toUpperCase() : "+example1.toUpperCase());
		
		String s1="aa";
		
		String s2="ab";
		
		System.out.println("compareTo() : "+(s1.compareTo((s2))));
		
		System.out.println("String builder ");
		
		StringBuilder b1=new StringBuilder("Hello");
		
		System.out.println("Reverse a String Builder :"+b1.reverse());

		System.out.println("insert() on StringBuilder "+ b1.insert(0,'M'));
		
		System.out.println("delete() on StringBuilder "+ b1.delete(0,2));


	}

}

class Employee {

	private int age = 10;
}