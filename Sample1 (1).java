// Complete and execute java Program for Narrow/Explicit Type-casting

class Sample1 {
	public static void main(String args[])
	{
		// Initialize a variable to store your marks of Computer Science subject- out of 50
		float cs=40.5f;
		// Calculate the percentage of marks and store it in a float variable
		float f=cs/50.0f;
		// Cast the percentage to int(whole number, decimal points removed)
		int newf=(int)f;
		// Print the casted percentage
		System.out.println("Percentage of marks in CS = "+newf) ;
	}

}
