package edu.example.java_classes.main;

public class Shelter {

	private Cat[] cats = new Cat[5];

	public Shelter() {
	}

	private int currentFreeIndex = 0;

	public boolean add(Cat cat) {
		if (currentFreeIndex >= cats.length) {
			return false;
		}

		cats[currentFreeIndex] = cat;
		currentFreeIndex++;
		return true;
	}

	public void printCat() {
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i].getName() + "   " + cats[i].getAge() + "   " + cats[i].getWeight());
		}
	}

	public int mostHeavyCat() {
		int maxWeight = cats[0].getWeight();
		int numberOfHeavyCat = 0;
		for (int i = 1; i < cats.length; i++) {
			if (cats[i].getWeight() > maxWeight) {
				maxWeight = cats[i].getWeight();
				numberOfHeavyCat = i;
			}
		}
		return numberOfHeavyCat;
	}

	public void printMostHeavyCat(int numberOfMostHeavyCat) {
		System.out.println("Самый толстенький кот - " + cats[numberOfMostHeavyCat].getName() + " с весом  " + cats[numberOfMostHeavyCat].getWeight());
	}

}
