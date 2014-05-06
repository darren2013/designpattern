package synAsset;

public class SynCustomerCommand implements ICommand {
	private Customer customer;
	
	public SynCustomerCommand(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void execute() {
		System.out.println("syn customer command..,customername:"+customer.getName());
	}

}
