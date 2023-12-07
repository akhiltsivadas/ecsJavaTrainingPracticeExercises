package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lession3 {

	public void l3() {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);	

		values.forEach((i) -> System.out.print(i));
	}

}
