package synAsset;

import java.util.ArrayList;
import java.util.List;

public class SynCommandSuit implements ICommand {
	private List<ICommand> commands = new ArrayList<ICommand>();
	
	
	
	@Override
	public void execute() {
		for(ICommand command : commands){
			command.execute();
		}
	}



	public List<ICommand> getCommands() {
		return commands;
	}



	public void setCommands(List<ICommand> commands) {
		this.commands = commands;
	}
	
	
	
	
	

}
