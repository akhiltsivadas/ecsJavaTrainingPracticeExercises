package streamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
				
		 // THIS IS THE ACTUAL WAY OF USING FPREACH BUT WE WILL SEE HOW IT COMES IN LESSION 1 AND 2
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		values.forEach(i -> {
			System.out.print(i);
		});
		
		System.out.println("");
		
		//LESSION  Consumer interface
		ConsumerInterfaceStudy obj1=new ConsumerInterfaceStudy();				
		obj1.cunsumerInterface();
		
		System.out.println("");
		
		//LESSION2
		
		Lession2 obj3=new Lession2();
		obj3.l2();
		
		System.out.println("");
		
		//LESSION3 WE CAN FURTHUR SIMPLEY LIKE THIS
		
		Lession3 obj4=new Lession3();
		obj4.l3();   
		//THIS IS SAME AS FIRST LESSON RIGHT? ...THIS IS HOW WE OBTAIN THIS
		System.out.println("");
		
		//Lesson 4 Stream API
				
				//IN STREAM API W ARE NOT DIRECTLY USING THE DATA WE ARE CREATING A STREAM OF TYPE INTEGER . WHILE WORING ON STREAM 
		//WE HAVE TO USE WRAPPER CLASSES ITS IMPORTANT
		//AFTER GETTING THE OBJECT OF STREAM  s there is lots of methods
		//if your using lambda expression then its very easy to implement using dot operator we can create stream from previous stream and can 
		//do operations one after another
				
		Stream<Integer> s=values.stream(); 
		
	     s.sorted().map(n->n*2).forEach(n->System.out.print(n));
			

	}

}
