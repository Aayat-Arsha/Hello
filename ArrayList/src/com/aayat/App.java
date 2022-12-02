package com.aayat;

import java.util.ArrayList;

public class App {
	static ArrayList<String> listNames = new ArrayList<>();

	public static void main(String[] args) {
		listNames.add("Aayat");
		listNames.add("John");
		listNames.add("Arsha");
		listNames.add("Doe");
		listNames.add("Ali");
		listNames.add("Azmat");
		listNames.add("Vikash");
		listNames.add("Parul");
		App app=new App();
		app.displayList(listNames);
//		app.removeNameByPosition(0);
//		System.out.println("***************");
//		app.displayList(listNames);
//		System.out.println("***************");
//		//System.out.println(listNames.get(0));
//		//System.out.println(listNames.get(1));
//		app.removeNameByString("Vikash");
//		app.displayList(listNames);
		
//		app.modifyName(0, "Ali");
//		System.out.println("***************");
//		app.displayList(listNames);
		System.out.println("***************");
		int position=app.search("Parul");
		if(position!=-1) {
			app.modifyName(position, "Rishika");
			app.displayList(listNames);

		}else {
			System.out.println("Invalid Entry");
		}

	}

	void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}

	void removeNameByString(String name) {
		listNames.remove(name);
	}
	void modifyName(int position,String name) {
		listNames.set(position, name);
	}
	int search(String name) {
		return listNames.indexOf(name);
	}
}
