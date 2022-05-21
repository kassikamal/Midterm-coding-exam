package datastructures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
public class UseMap {
	public static void main(String[] args) {

		HashMap<String, List<String>> map = new HashMap<>();
		List<String> list1 = new ArrayList<>();
		list1.add("colors_pink");
		list1.add("colors_red");
		list1.add("colors_blue");
		list1.add("colors_yellow");


		List<String> list2 = new ArrayList<>();
		list2.add("food_pizza");
		list2.add("food_hamburger");
		list2.add("food_chicken");
		list2.add("food_pasta");


		List<String> list3 = new ArrayList<>();
		list3.add("drinks_water");
		list3.add("drinks_tea");
		list3.add("drinks_soda");
		list3.add("drinks_coffee");

		map.put("1", list1);
		map.put("2", list2);
		map.put("3", list3);

		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String keyValue = entry.getKey();
			System.out.println("Key Value: " + keyValue);
			List<String> list = entry.getValue();
			Iterator<String> iterator = list.iterator();
			System.out.print("List Data: ");
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();
		}

	}

}
