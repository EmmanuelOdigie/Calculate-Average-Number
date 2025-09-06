package JavaFindArrayAverage;// project created in eclipse

public class JavaArrayAverage {// public class 'JavaArrayAverage' is made
	
	public static void main(String[] args) {// reads, runs & executes
		int[] num = {34,23,42,66,37,102}; // integer 'sum' array created
		int sum = 0; // set sum as 0;
		
	// for loop set to go through the numbers in the array
	// set int sum = 0;
	// used 'for' loop, created int variable 'i' to do the loop from 0 to the '.length' (Amount)
	// - of numbers that are in the array
		for(int i = 0; i<num.length; i=i+1 ) {
			sum += num[i]; // sum = 0, 0+34 = 34, sum = 34, 34+23 = 57, sum = 57 and so on
//num[i] - 'i' is the variable that is going to pass through every number and pass the number to 'num'
		}
		
		double avgAmount = sum; // convert the value inside int variable sum to double
		
		avgAmount = sum/num.length; // equation set, to divide the number in sum by the amount of 
		//numbers in the array
		
		System.out.println("Average number from set = " + avgAmount); // display the average
		
		

	}

}

// result:
// Average number from set = 50.0