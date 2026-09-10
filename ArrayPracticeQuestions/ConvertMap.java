package com.ArrayPracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMap {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("name");
		list.add("Age");
		list.add("City");

		System.out.println(list);

		List list1 = new ArrayList();
		list1.add("Arjun");
		list1.add(23);
		list1.add("Pune");

		System.out.println(list1);

		Map map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), list1.get(i));
		}
		System.out.println(map);

	}
}
