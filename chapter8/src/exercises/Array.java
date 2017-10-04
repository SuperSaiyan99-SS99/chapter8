package exercises;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {23, 6, 47, 35, 2, 14};
		int average, total = 0, highest = 0;
		System.out.println("Odd numbers:");
		for (int x = 0; x < array.length; x ++)
		{
			total += array[x];
			if (array[x] > highest)
			{
				highest = array[x];
			}
			if (array[x] % 2 == 0)
			{
				System.out.println(array[x])
			}
		}
		average = total / array.length;
		System.out.println("Average:\n" + average + "\nHighest:\n" + highest);
	}

}
