package DogPackage;

public class DogMain {

	public static void main(String[] args) {
		String[] dogArray = new String[4];
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		System.out.println("Welcome to Doggy Daycare, let's meet our graduating dogs!");
		System.out.println("");
		//Our first dog, lets set its values, use our Dog class to put them in an array, and display the results printing to console.
		dog1.setName("Annie");
		dog1.setSize(8);
		dog1.setBreedType("Doberman Pincher");
		dog1.setBarkType("Woof Woof");
		dog1.setDogArray();
		dogArray = dog1.getDogArray();
		System.out.print("Our first dog is: ");
		for(int i = 0; i < dogArray.length; i++) {
			System.out.print(dogArray[i]);
			if(i < 3) {
				System.out.print(", ");
			}
		}
		System.out.println("");
		
		//Our second dog, lets set its values, use our Dog class to put them in an array, and display the results printing to console.
		dog2.setName("Rose");
		dog2.setSize(5);
		dog2.setBreedType("Mutt");
		dog2.setBarkType("Ruff Ruff");
		dog2.setDogArray();
		dogArray = dog2.getDogArray();
		System.out.print("Our second dog is: ");
		for(int i = 0; i < dogArray.length; i++) {
			System.out.print(dogArray[i]);
			if(i < 3) {
				System.out.print(", ");
			}
		}
		System.out.println("");
		
		//Our third dog, lets set its values, use our Dog class to put them in an array, and display the results printing to console.
		dog3.setName("Flo");
		dog3.setSize(9);
		dog3.setBreedType("Alaskan Husky");
		dog3.setBarkType("Rrrrrrrrrrrrrr");
		dog3.setDogArray();
		dogArray = dog3.getDogArray();
		System.out.print("Our third dog is: ");
		for(int i = 0; i < dogArray.length; i++) {
			System.out.print(dogArray[i]);
			if(i < 3) {
				System.out.print(", ");
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("Congratulations to our canine graduates!");
	}
}
