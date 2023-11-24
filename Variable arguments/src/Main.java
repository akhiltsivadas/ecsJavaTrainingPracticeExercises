
class Operations {
	public void display(int... a) // HERE WE IF WE DONT KNOW HOW MANY DATAS ARE WE RECEIVING WE CAN USE VARIABLE
									// ARGUMENTS FOR THIS USE THREE DOTS
	{
		for (int i : a) {
			System.out.println(i);
		}

	}

}

public class Main {
	public static void main(String[] args) {

		Operations obj = new Operations();
		obj.display(2, 3, 5, 6, 7, 8, 8, 5, 8, 9); // FROM HERE WE CAN PASS SO MANY VALUES OF SAME KIND AS REQUIRED

	}

}
