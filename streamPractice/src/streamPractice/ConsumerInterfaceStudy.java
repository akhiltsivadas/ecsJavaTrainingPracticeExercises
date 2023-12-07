package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.omg.DynamicAny._DynValueStub;

public class ConsumerInterfaceStudy
{
	public void cunsumerInterface()
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6,7,8);
		
		Consumer<Integer> obj= new Consumer<Integer>() // CONSUMER IS AN INTERFACE WE ARE USING ANOYMOUS CLASS TO DEFINE IT OR YOU CAN CREATE 
				// A CLASS WHICH IMPLMENTS Consumer Interface
				{
			      public void accept(Integer i)
			      {
			    	  System.out.print(i);
			      }
				};
		
		values.forEach(obj);
		
	}
}
