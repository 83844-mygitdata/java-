package assign6;

public class ExceptionLineTooLong extends Exception {

	private String message;

	public ExceptionLineTooLong() {
		message = "";
	}

	public ExceptionLineTooLong(String message) {
		super();
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("Error : " + message);
	}

}
