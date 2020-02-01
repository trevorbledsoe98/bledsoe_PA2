package bledsoe_p2;

//import scanner
import java.util.Scanner;

//make methods
class BMICalculator{
	Scanner sc = new Scanner(System.in);
	//variables list
		private double weight;
		private double height;
		private double BMI;
		private int selection;
		
		//method
		public void readUserData() {
			System.out.println("Select 1 for Imperial or 2 for Metric");
			
			   selection = sc.nextInt();
			   //loop for imperial or metric
	           if (selection == 1) {
	               System.out.print("Enter Weight (in Pounds):");
	               weight = sc.nextDouble();

	               System.out.print("Enter Height (in inches):");
	               height = sc.nextDouble();

	               
	           } else if (selection == 2) {
	               System.out.print("Enter Weight (in Kilograms):");
	               weight = sc.nextDouble();

	               System.out.print("Enter Height (in meters):");
	               height = sc.nextDouble();
	               
	           } else {
	               System.out.println("** Inavlid Choice **");
	               
	           }
	       }

		
			//method
	public void calculateBmi() {
		
		BMI = (703 * weight) / Math.pow(height, 2);
		
	}
			//method
	public void displayBmi() {
		System.out.println("Your BMI is :" + BMI);
	}
			
		//main function as copied from assignment
	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
}
		}
	
