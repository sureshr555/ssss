package example1;

public class StudentDetails {

	
	
	public static void main(String[] args) throws StudentNotFound {
		
		String name="fgf";
		
		
		
		if(name.equals("suresh"))
		{
			System.out.println("student present");
		}else{
			throw new StudentNotFound(" not found");
		}
	}
}
