package command;

public class ConcrentCommand implements Command {
	private Receiver receiver;
	
	public ConcrentCommand(Receiver receiver) {
		this.receiver = receiver;
	}




	@Override
	public void execute() {
		System.out.println("command is executed......");
	}

}
