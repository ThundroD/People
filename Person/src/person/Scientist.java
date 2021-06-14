package person;

public class Scientist extends Person {
    //Scientist Only Attributes 
	String coatColor;
    String scientistType;
    //Constructor
    public Scientist(int height, String hair, boolean eighteen, String coatColor) {
        super(height, hair, eighteen);
        this.coatColor = getScientistType(coatColor);
        this.coatColor = coatColor;
        }

    //Method- Get scientist type via the coat color
        public String getScientistType(String coatColor) {
        	//if statements to determine what type of scientist by coat color
            if("green".equals(coatColor)) {
                scientistType = "Biologist";
            }
            else if ("purple".equals(coatColor)) {
                scientistType = "Physicist";
            }
            else if ("white".equals(coatColor)) {
                scientistType = "Pharmacist";
            }
            else if ("blue".equals(coatColor)) {
                scientistType = "Climatologist";
            }
            else if ("yellow".equals(coatColor)) {
                scientistType = "Pharmacist";
            }
            else if ("red".equals(coatColor)) {
                scientistType = "Pharmacist";
            }
            return scientistType;
        }
        
        //Method to Display new Scientist
        public void scientistSays() {
    		System.out.println("Hello, it is " + this.eighteen + " that I am over 18 year old. My hair is " + this.hair + "\n"
    			+ "and I am " + this.height + "cm tall. I am a " + this.scientistType + " with a " + this.coatColor + " lab coat." );
    	}
}