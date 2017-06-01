
public class Animal {
	private String animalFamily;
	private String commonName;
	public Animal(){
		//System.out.println("This is Animal constractor");
	}
	
	/*public String getName(){
		return commonName;
	}
	
	public void setName(String newName){
		
		commonName = newName;
		
	}*/
	public String sleep() {
	return "A "+ commonName + " sleeps...";
	}
	public String getAnimalFamily() {
		return animalFamily;
	}

	public void setAnimalFamily(String animalType) {
		this.animalFamily = animalType;
	}

	public String getName() {
		return commonName;
	}

	public void setName(String commonName) {
		this.commonName = commonName;
	}

	public String eat() {
		return "A "+ commonName+ " eats...";
	}
	public String breath(){
		return "A "+ commonName+ " breaths...";
	}

}
