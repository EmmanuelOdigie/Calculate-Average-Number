package JavaFindArrayAverage;// project made in eclipse

public class JavaArrayAverageAge {// public class 'JavaArrayAverageAge' made

	public static void main(String[] args) {// reads, runs & executes code
		int[] ages = {34,23,42,66,37,102}; // integer array variable 'ages' created, with a list
		// of numbers in the array
		
		float avg, sum =0; // float avg declared, float sum initiated
		
		int length = ages.length; // created an int variable 'length', ages.length counts the amount
		// of numbers in the int array 'ages'
		
		for (int age: ages) { // the array is passed down to new int variable age
			sum+=age;// add number, stores the number and the stored number is used to add the next 
			// number on the array and stores the value and continues on until the end
		}
		avg = sum/length; // equation to get the average
		System.out.println("Average: " + avg); // display the average number
	}

}

// Result: Average: 50.666668
