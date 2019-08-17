package example;

public class CountAplh {

	
	public static void main(String[] args) {
		int count=0;

		/*7)123adhh467
		Count of alpha bits
		*/
		String name="123adhh467";
		System.out.println("INPUT :"+name);
		for(int i=0;i<name.length();i++)
		{

		if(name.charAt(i) >='a' && name.charAt(i) <='z' )
		{
		count++;
		}else if (name.charAt(i) >='A' && name.charAt(i) <='Z' ){
		count++;
		}
		}

		System.out.println("Total aphabhat :"+count);}}
