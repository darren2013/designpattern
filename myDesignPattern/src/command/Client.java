package command;

public class Client {

	public void assemble(){
		Command command = new ConcrentCommand(new Receiver());
		
	}
}
