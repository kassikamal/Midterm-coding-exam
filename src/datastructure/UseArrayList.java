package datastructure;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add(1, "String One");
		alist.add(2, "String Two");
		alist.add(3, "String Three");
		alist.add(4, "String Four");
		alist.add(5, "String FIve");
		System.out.println("Our initial string list is as follows: ");
		System.out.println(alist);
		alist.remove(3);
		System.out.println("Minus our third string: ");
		System.out.println(alist);

		System.out.println("The fifth string is: " + alist.get(5));



		for (String str:alist) {
			System.out.println(str);
		}

	}
}

	

	}

}
