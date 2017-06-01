
public class AnimalApp {
	public static void main(String[] args) {

		//Animal a = new Animal();
		//print("What is the animal");
		//print(a.whatAmI());
		//print(a.eat());
		//print(a.sleep());
	
		
		/*Scanner Input = new Scanner(System.in);
		userInput = Input.next();
		animalType = userInput;
	
		Cat c = new Cat();
		print(c.whatAmI());
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.whatAmI());
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		Cow o = new Cow();
		print(o.whatAmI());
		print(o.eat());
		print(o.sleep());
		print(o.drink());
		print(o.breath());
				*/
			
		Chimpanzee chimp = new Chimpanzee();
		chimp.setAnimalFamily("Primate");
		chimp.setName("Chimpanzee");
		print(chimp.breath());
		print(chimp.getName()+" belongs to "+chimp.getAnimalFamily());
		

	}
	private static void print(String s){
		System.out.println(s);
	}

}
