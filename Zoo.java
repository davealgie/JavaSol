package testPractice;
import java.util.ArrayList;
import java.util.List;

public class Zoo extends Animal {
	
	  private List<Animal> animals;

	  public Zoo() {
	   this.animals = new ArrayList<Animal>();
	  }

	  
	  public void addAnimal(Animal animal) {
		  animals.add(animal);
	  }

	  // Method Overloading
	  public void removeAnimal(int index) {
		  this.animals.remove(index);
	  }
	  // Different Method Signatures
	  // Method Overloading
	  public void removeAnimal(Animal animal) {
		  this.animals.remove(animal);
	  }
	  

	  public Animal getAnimal(int index) {
	    return this.animals.get(index);
	  }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((animals == null) ? 0 : animals.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zoo other = (Zoo) obj;
		if (animals == null) {
			if (other.animals != null)
				return false;
		} else if (!animals.equals(other.animals))
			return false;
		return true;
	}
	  
	  
}

