import java.util.ArrayList;
import java.io.*;

public class Trent_Russell_Q3 {

	public static void main(String agrs[]) {

		try {
			// read in text file
			BufferedReader br = new BufferedReader(new FileReader("dataQ3.txt"));

			ArrayList<Integer> arr = new ArrayList<Integer>();

			String str;
			int product = 1, temp = 0, marker = 0, index = 0, counter = 0;

			while ((str = br.readLine()) != null) {

				if (counter > 1000) {
					throw new Exception("Data set is too large.");
				}
				temp = Integer.parseInt(str);
				if (temp == 0) {
					marker++;
					index = counter;
					temp = 1;
				}
				arr.add(temp); // fill an array of ints
				product = product * temp; // get the total product
				counter++; // keep track of the count to know the zero index
			}
			br.close();

			if (counter < 2) {
				throw new Exception("Data set is too small.");
			}

			if (marker == 1) { // arr contains one zero
				for (int i = 0; i < arr.size(); i++) {
					if (index == i) {
						System.out.println(product / arr.get(i));
					} else {
						System.out.println(0);
					}
				}
			} else if (marker > 1) { // arr contains two zeros
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(0);
				}
			} else { // arr contains no zeros
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(product / arr.get(i));
				}
			}
		} catch (Exception e) {

			System.out.println("Exception: " + e);
		}

	}// end main

}// end class