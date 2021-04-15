package com.pp.info;

import java.util.ArrayList;
import java.util.List;

public class Info {
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("sunpatidar@gmail.com");
		list.add("sunpatidar");
		
		for (String email : list) {
			System.out.println(email);
			
			
			if (email.contains("@")) {
				list.remove(email);
			}
			
			
				}
		System.out.println(list);
		}


	}
	
	
}
