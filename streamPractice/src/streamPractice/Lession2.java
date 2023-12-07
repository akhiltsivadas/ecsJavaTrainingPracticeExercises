package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lession2 {
	
	public void l2()
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8);
		
		Consumer<Integer> obj= (i)-> System.out.print(i);
		
		values.forEach(obj);
		
	}
}
