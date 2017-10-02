package practice;

public class TwelveInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numberToDisplay = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int x = 0; x < numberToDisplay.length; ++ x)
			System.out.println(numberToDisplay[x]);
		for(int y = numberToDisplay.length -1; y >= 0; -- y)
			System.out.println(numberToDisplay[y]);
	}

}
