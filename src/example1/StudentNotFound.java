package example1;

public class StudentNotFound extends Exception {

	
	StudentNotFound(String err)
	{
		System.out.println(err);
	}
	
	StudentNotFound()
	{
		getMessage();
	}
}
