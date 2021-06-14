package person;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructors for new Doctors and Scientists
		Doctor Julian = new Doctor(185, "strawberry-blond", true, 16);
		Scientist Jackson = new Scientist(177, "blond", true, "green");
		//Print new Doctors and Scientists
		Julian.doctorSays();
		Jackson.scientistSays();
	}

}
