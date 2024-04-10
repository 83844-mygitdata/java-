package assign6;

public class StringTester {

	public static void main(String[] args) {
		
		StringLength s = new StringLength();
		try
		{
		s.AcceptString();
		s.DisplayString();
		//s.Stringlen();
		}catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
	}

}
