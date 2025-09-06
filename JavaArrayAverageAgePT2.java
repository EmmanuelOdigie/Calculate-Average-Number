package JavaFindArrayAverage; // project made in eclipse

public class JavaArrayAverageAgePT2 {// public class 'JavaArrayAverageAgePT2' made

	public static void main(String[] args) {//reads,runs & executes
		float avg, sum = 0; // float avg declared, float sum initialized
		
		int[] ages = {28,32,26,64,59,75}; // int variable 'ages' array made 
		
		for (int age:ages) { // the array in ages is passed down to int variable 'age'
			sum+=age; // adds all the number in the array together
		}
		
		//int length = ages.length; // created an int length to count the amount of numbers 
		// in the array
		
		 //avg = sum/length; // gets the sum of the array and it divides by the amount of numbers
		//in the array using the length variable
		
		avg = sum/ages.length; // quicker way of doing it 
		
		System.out.println("Average: " + avg); // display the average
		
	}

}

// Result:
// Average: 47.333332 