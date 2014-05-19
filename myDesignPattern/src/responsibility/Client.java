package responsibility;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Handler handler = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler2();
		handler.setSuccessor(handler2);
		handler.handleRequest();
	}

}
