import javax.swing.JOptionPane;

public class ComputeBMI {

	//begin main
	public static void main(String[] args) {
		
		String inputString;					//used to convert to integer
		double weightInPounds;				//weight entered by user
		double weightInKilograms;			//converted weight
		double heightInInches;				//height entered by user
		double heightInMeters;				//converted height
		double BMI;							//body mass index
		
		//get user's weight and convert to integer
		inputString = JOptionPane.showInputDialog("Enter your weight" + " in pounds.");
		weightInPounds = Double.parseDouble(inputString);
		
		//get user's height and convert to integer
		inputString = JOptionPane.showInputDialog("Enter your height" + " in inches.");
		heightInInches = Double.parseDouble(inputString);
		
		//conversion equations
		weightInKilograms = (weightInPounds * 0.45359237);
		heightInMeters = (heightInInches *  0.0254);
		
		//calculate BMI and display
		BMI = (weightInKilograms / (heightInMeters * heightInMeters));
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + BMI);
		
	} //end main

}
