class BasicsDemo 
{
	static void print()
	{
		System.out.println("\n\n Inside print method...");
		System.out.println("Hello World!!!"); //move cursor to new line
		System.out.println(); //print empty line
		System.out.print("How are you today?"); // cursor is not moved to next line
		System.out.println("I'm great,");
		System.out.print(" "); // print a space
		System.out.print("Thank you!");
	}
	
	public static void main(String[] args)
	{
		//call the print method
		print();
	}
	
}