import java.util.*;

class MaxCharFreq{
	public static void main(String[] args){
		int[] arr = new int[128];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String input = scan.nextLine();
		
		int max = -1;

		for(int i = 0; i < input.length() ; i++ ){
			char ch = input.charAt(i);
			if(ch != ' '){
				arr[ch]++;
			}
			if ( ch > max ) {
				max = (int) ch;
			}
		}
		
		System.out.println("Charchaeter : " + (char) max + "Frequency : " + arr[max]);	

	}
}
