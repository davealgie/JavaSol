package testPractice;

public class Animal {

	private String name;
	private int age;
	private String species;
	private String foodIntake;
	
	
	public Animal() {
		this("",0,"","");
	}

	public Animal(String name, int age, String species, String foodIntake) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
		this.foodIntake = foodIntake;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getFoodIntake() {
		return foodIntake;
	}
	public void setFoodIntake(String foodIntake) {
		this.foodIntake = foodIntake;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((foodIntake == null) ? 0 : foodIntake.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (foodIntake == null) {
			if (other.foodIntake != null)
				return false;
		} else if (!foodIntake.equals(other.foodIntake))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [Name= " + name + ", Age= " + age + ", Species= " + species + ", FoodIntake= " + foodIntake + "]";
	}
	

}
