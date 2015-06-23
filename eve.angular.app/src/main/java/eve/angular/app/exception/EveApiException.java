package eve.angular.app.exception;

public class EveApiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4002647197590658366L;
	public EveApiException() {super();}
	public EveApiException(String message) { super(message); }
	public EveApiException(String message, Throwable cause) { super(message, cause); }
	public EveApiException(Throwable cause) { super(cause); }
}
