package com.metacube.Inheritance;
import com.metacube.Inheritance.Models.*;
import com.metacube.Inheritance.utility.*;
public class ZooManagement {
	public static void main(String[] args) {

		Lion lion1 = new Lion("lion01", "MC Sher", 10, false, 35, Category.MAMAL, "ROAR");
		Lion lion2 = new Lion("lion02", "Sheru", 9, false, 40, Category.MAMAL, "ROAR");
		Lion lion3 = new Lion("lion03", "Fake name", 13, false, 25, Category.MAMAL, "ROAR");
		
		Elephant elephant01 = new Elephant("elephant01", "APE", 7, false, 105, Category.MAMAL, "AUHAUA");

		Crow Crow = new Crow("Crow01", "ABC", 8, false, 15, Category.BIRD, "QUA QUA");
		
		System.out.println(lion1);
		System.out.println(lion2);
		System.out.println(Crow);
		System.out.println(elephant01);
		
		Zoo zoo = new Zoo();
		
		int maxNumOfCages = 2;
		int maxNumOfMammalsInCage = 1;
		int maxNumOfBirdsInCage = 3;
		Zone zoneForMammal = new Zone(Category.MAMAL, maxNumOfCages, maxNumOfMammalsInCage, false, false);
		
		Zone zoneForBird = new Zone(Category.BIRD, maxNumOfCages, maxNumOfBirdsInCage, false, false);
		
		zoo.addZone(zoneForMammal);
		
		zoo.addAnimal(lion1, zoneForMammal);
		System.out.println(zoo);
		
		zoo.addAnimal(lion2, zoneForMammal);
		System.out.println(zoo);
		
		zoneForMammal.addCage(Category.MAMAL, maxNumOfMammalsInCage);
		zoo.addAnimal(lion3, zoneForMammal);
		System.out.println(zoo);

		zoo.addZone(zoneForBird);
		zoo.addAnimal(Crow, zoneForBird);
		System.out.println(zoo);
		
		zoo.removeAnimal(lion3);
		System.out.println(zoo);
	}

}
