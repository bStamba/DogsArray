package DogPackage;

public class Dog {

	int dogSize;
	String dogName;
	String breedType;
	String barkType;
	String[] dog = new String[4];
	
	public void setName(String name) {
		dogName = name;
	}
	
	public String getName() {
		return dogName;
	}
	
	public void setSize(int size) {
		dogSize = size;
	}
	
	public int getSize() {
		return dogSize;
	}
	
	public void setBreedType(String breed) {
		breedType = breed;		
	}
	
	public String getBreedType() {
		return breedType;
	}
	
	public void setBarkType(String bark) {
		barkType = bark;
	}
	
	public String getBarkType() {
		return barkType;
	}
	
	public void setDogArray() {
		dog[0] = dogName;
		dog[1] = Integer.toString(dogSize);
		dog[2] = breedType;
		dog[3] = barkType;
	}
	public String[] getDogArray() {
		return dog;
	}
}
