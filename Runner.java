package testPractice;
public class Runner {
	public static void main(String[] args) {
		
		Animal lion = new Animal("Bob", 15, "Lion", "Carnivore");
		Animal penguin = new Animal("Jim", 11, "Bird", "Omnivore");
		Animal snake = new Animal("Boi", 5, "Snake", "Carnivore");
		Animal whale = new Animal("huan", 24, "Whale", "Omnivore");
		
		
		lion.setName("Bill");

		Zoo zoo = new Zoo();
		zoo.addAnimal(lion);
		zoo.addAnimal(penguin);
		zoo.addAnimal(snake);
		zoo.addAnimal(whale);
		zoo.getAnimal(0);
		
		System.out.println(zoo.getAnimal(3));
		System.out.println(lion);
		System.out.println(penguin);
		System.out.println(penguin.getName());
		
		
	}
}
