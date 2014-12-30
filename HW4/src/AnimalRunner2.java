
public class AnimalRunner2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d1 = new Dog("Fred");
		d1.speak();
		Object obj = new Dog("Connie");
		//Object obj2 = new Cat("Kathy");
		Dog d2 = (Dog) obj;
		//Dog d3 = (Dog) obj2;
		d2.speak();
		//d3.speak();
		// It doesn't work to cast a cat as a dog object

	}

}
