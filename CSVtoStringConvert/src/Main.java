
public class Main {

	public static void main(String[] args) 
	{
	String data= "akhil,Dijo,manu,midhun,Basil";
	String dataArray[]=data.split(",");
	System.out.println(dataArray);
	
	for(String tempData:dataArray)
	{
		System.out.println(tempData);
	}

	}

}
