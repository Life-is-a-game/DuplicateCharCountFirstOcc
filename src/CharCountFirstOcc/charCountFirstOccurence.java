/**
 * 
 */
package CharCountFirstOcc;

/**
 * @author natha
 *
 */

import java.util.HashMap;
import java.util.Scanner;

public class charCountFirstOccurence {

	/**
	 * @param args
	 */
	public static boolean flag = true;
	private static int x = 0;

	public static void main(String[] args) {
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		charCount(occurences);
	}
	
	public static void charCount(HashMap<Character, Integer> occurs) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string that you wish to test.");
		
		if(s.hasNextLine()) {		
			String test = s.nextLine();
			test = test.toLowerCase();
			test = test.replaceAll("\\s", "");
			
			for(char c : test.toCharArray()) {
				//System.out.println(c);
				if(!occurs.containsKey(c)) {
					occurs.put(c, 1);
				}
				else {
					int a = occurs.get(c);
					a++;
					occurs.replace(c, a);
					System.out.println(c + " is the first duplicate character that appears in the given sentence");
					break;
				}
			}
			
			for(int a : occurs.values()) {
				
				if((a > 1)) {
					flag = false;
				}
				else {
					
				}
			}
			if(flag == true) {
				x = 0;
			}
			else {
				x = 1;
			}
			switch(x) {
				default:
					break;
				case 1:
					break;
				case 0:
					System.out.println("There are no duplicate characters in this sentence");
					break;
			}
			s.close();
		}
	}

}
