package paramsByValue;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal(10);
		System.out.println("animal1:" + animal);

		schimbaVarsta(animal);
		System.out.println("animal2:" + animal);
		
		AnimalImmutable ani = new AnimalImmutable(10);
		ani = schimbaVarstaAnimalImmutable(ani);
	}
	
	static void schimbaVarsta(Animal pAnimal) {
		System.out.println("pAnimal1:" + pAnimal);

		//pAnimal = new Animal(15);
		pAnimal.setVarsta(15);
		System.out.println("pAnimal2:" + pAnimal);

	}
	
	static AnimalImmutable schimbaVarstaAnimalImmutable(AnimalImmutable pAnimal) {
		System.out.println("pAnimal1:" + pAnimal);

		pAnimal = new AnimalImmutable(15);
		//pAnimal.setVarsta(15);
		System.out.println("pAnimal2:" + pAnimal);
		return pAnimal;

	}

}
