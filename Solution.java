import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 
 */
public class Solution {

	/*
	 * Complete the breakingRecords function below.
	 * records[0] = highest records
	 * records[1] = lowest records
	 */
    static int[] breakingRecords(int[] scores) {

    	// **** to trac number of high and low records ****
    	int[] records = new int[2];

    	// **** check if there are no scores ****
    	if (scores.length == 0)
    		return records;
    	
    	// **** initialize the lowest and highest scores ****
    	int lowestScore  = scores[0];
    	int highestScore = scores[0];
    	
    	// **** loop through the scores ****
    	for (int i = 1; i < scores.length; i++) {
    		
			// **** check highest score ****
			if (scores[i] > highestScore) {
				highestScore = scores[i];
				records[0]++;
			}

 			// **** check lowest score ****
			if (scores[i] < lowestScore) {
				lowestScore = scores[i];
				records[1]++;
			}
    	}
    	
    	// **** return the records ****
    	return records;
    }

    
    // **** ****
    private static final Scanner scanner = new Scanner(System.in);

	
	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) throws IOException {

		// **** ****
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		// **** ****
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		// **** ****
		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		// ???? ????
		bufferedWriter.write("main <<< scores: ");
		for (int i = 0; i < scores.length; i++) {
			bufferedWriter.write(String.valueOf(scores[i]) + " ");
		}
		bufferedWriter.newLine();
		
		// **** ****
		int[] result = breakingRecords(scores);

		// **** ****
		for (int i = 0; i < result.length; i++) {
			
			bufferedWriter.write(String.valueOf(result[i]));
	
			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		// **** ****
		bufferedWriter.newLine();

		// **** ****
		bufferedWriter.close();

		// **** close the scanner ****
		scanner.close();
	}

}
