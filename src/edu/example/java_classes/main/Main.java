package edu.example.java_classes.main;

public class Main {
	public static void main(String[] args) {
		Shelter catsShelter = new Shelter();
		boolean isNotCatInShelter;

		isNotCatInShelter = catsShelter.add(new Cat("Tom", 7, 5));
		if (isNotCatInShelter == false) {
			System.out.println("Извините, мест нет.");
		}

		isNotCatInShelter = catsShelter.add(new Cat("Tim", 6, 4));
		isNotCatInShelter = catsShelter.add(new Cat("Tam", 3, 1));
		isNotCatInShelter = catsShelter.add(new Cat("Tisha", 5, 3));
		isNotCatInShelter = catsShelter.add(new Cat("Loci", 4, 2));

		isNotCatInShelter = catsShelter.add(new Cat("Belish", 4, 2));
		if (isNotCatInShelter == false) {
			System.out.println("Извините, мест нет.");
		}

		catsShelter.printCat();

		int numberOfMostHeavyCat = catsShelter.mostHeavyCat();

		catsShelter.printMostHeavyCat(numberOfMostHeavyCat);
		}
}