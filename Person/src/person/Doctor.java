package person;

public class Doctor extends Person{
	//Attributes for Doctor Only
	int years;
	String rank;
	//Constructor
	public Doctor(int height, String hair, boolean eighteen, int years) {
        super(height, hair, eighteen);
        this.rank = getRank(years);
        this.years = years;
        }
	
	//Method- Get doctor rank via the # years
	public String getRank(int years) {
		//if statements to find rank depending on number of years
		if(0 <= years && years <= 6) {
			rank = "Medical student";
		}
		else if(7 <= years && years <= 8) {
			rank = "Intern";
		}
		else if(9 <= years && years <= 16) {
			rank = "Resident";
		}
		else if(17 <= years && years <= 20) {
			rank = "Fellow";
		}
		else if(21 <= years) {
			rank = "Attending";
		}
		return rank;
	}
	//Method to Display Doctor Description
	public void doctorSays() {
		System.out.println("Hello, it is " + this.eighteen + " that I'm over 18 year old. My hair is "+ this.hair + "\n"
				+ "and I am " + this.height + " cm tall. I am a " + this.rank + " at John Hopkins Hospital \n"
				+ "and I have " + this.years + " experience in the medical field. \n" );
	}
}
