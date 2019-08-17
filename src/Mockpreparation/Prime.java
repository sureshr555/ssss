package Mockpreparation;

public class Prime {

	
	public static void main(String[] args) {
		
		int n=17;
		
	int count=0;
		for (int i = 1; i <= 17; i++) {
			
			if(n%i==0)
			{
				count ++;
			}
				
		}
		if(count==0){
			System.out.println("prinme");
		}else{
			System.out.println("ot prinme");
		}
	}
}
