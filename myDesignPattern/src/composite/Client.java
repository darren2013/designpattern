package composite;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Component component = new Leaf();
		
		Component composite = new Composite();
		composite.addChildComponent(component);
		
		composite.dosomeOperation();
	}

}
