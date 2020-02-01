package lv.kristina;

import lv.kristina.polymorphism.Animal;
import lv.kristina.polymorphism.Cat;
import lv.kristina.polymorphism.Dog;

public class TestPolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
	
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
		
	}

}
