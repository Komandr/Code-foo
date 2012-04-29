
/*
 * Author: Astrid Unger
 * 
 * Contains: Methodes actually calculating the required Plates
 */

public class CalcPlates
{	
	double population;
	int position=0, counter=0;
	int[] results = new int[100];

	public CalcPlates(double pop)
	{
		population = pop;
	}
	
	//calculates how many names and numbers are required
	public void calculate(int number, int letter)
	{
		double value = Math.pow(10, number) * Math.pow(26, letter);
		
		if(value >= population)
		{	
			//if the array is too short -> double the length
			if(results.length <= counter)
			{
				int[] tmp = new int[results.length*2];
				System.arraycopy(results, 0, tmp, 0, results.length);
				results = new int[results.length*2];
				System.arraycopy(tmp, 0, results, 0, tmp.length);
			}
			
			//write in the results-array the calculated number or numbers and letters
			results[counter] = number;
			results[counter+1] = letter;
			
			counter+=2;
		}
		
		//call calculate again, but with an increased number of numbers and letters
		else
		{
			calculate(number+1, letter);
			calculate(number, letter+1);
		}
	}
	
	//prints the right result
	public void getResult()
	{
		for(int i=0; i<counter; i+=2)
		{
			double firstVal = Math.pow(10, results[i]) * Math.pow(26, results[i+1]);
			double secondVal = Math.pow(10, results[position]) * Math.pow(26, results[position+1]);
			
			if(firstVal < secondVal)
			{
				position = i;
			}
		}
		
		double finalVal = Math.pow(10, results[position]) * Math.pow(26, results[position+1]);
		
		System.out.println("\n\n\nPopulation: \t" + Math.round(population) + "\nPattern: \t" + results[position] + " number \t " + results[position+1] + " letter" + "\nTotal Plates: \t" + Math.round(finalVal) + "\nExcess Plates: \t" + Math.round(finalVal - population));
	}
}
