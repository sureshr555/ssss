package example1;

public class Reverse {

	public static void main(String[] args) {
		
	// 	String name="(((((())))"; count the left bracket and right bracket
		
String name="(((((())))";
	
int countleftbracket =0;
int countrightbracket =0;
	for (int i = 0; i < name.length(); i++) {
		
		if(name.charAt(i)=='(')
		{
			countleftbracket++;
		}else if(name.charAt(i)==')')
			countrightbracket++;
			
			
	}
	System.out.println("left bracket = "+ countleftbracket);
	System.out.println("right bracket  = "+ countrightbracket);
	}
	}
